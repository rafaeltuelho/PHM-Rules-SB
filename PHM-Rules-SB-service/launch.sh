#!/bin/bash
cd ..
MVN_ARG_LINE=()

for arg in "$@"
do
    case "$arg" in
        *)
            MVN_ARG_LINE+=("$arg")
        ;;
    esac
done

startDateTime=`date +%s`

# check that Maven args are non empty
if [ "$MVN_ARG_LINE" != "" ] ; then
    mvnBin="mvn"
    if [ -a $M3_HOME/bin/mvn ] ; then
       mvnBin="$M3_HOME/bin/mvn"
    fi
    echo
    echo "Running maven build on available projects (using Maven binary '$mvnBin')"

    "$mvnBin" -v
    echo
    #the line below doesn't resolve the wildcard and models and kjars are not built
    #projects=( "*-model" "*-kjar" "PHM-Rules-SB-service")
    projects=( "PHM-Rules-SB-model" "PHM-Rules-SB-kjar" "PHM-Rules-SB-service")

    for suffix in "${projects[@]}"; do

        for repository in $suffix;  do
        echo
            if [ -d "$repository" ]; then
                echo "==============================================================================="
                echo "$repository"
                echo "==============================================================================="

                cd $repository

                "$mvnBin" "${MVN_ARG_LINE[@]}"
                returnCode=$?

                if [ $returnCode != 0 ] ; then
                    exit $returnCode
                fi

                cd ..
                fi

        done;
    done;
    endDateTime=`date +%s`
    spentSeconds=`expr $endDateTime - $startDateTime`
    echo
    echo "Total build time: ${spentSeconds}s"

else
    echo "No Maven arguments skipping maven build"
        
fi


if [[ "$@" =~ "docker" ]]; then
    echo "Launching the application as docker container..."
    
    docker run -d -p 8090:8090 --name PHM-Rules-SB-service apps/PHM-Rules-SB-service:1.0-SNAPSHOT
elif [[ "$@" =~ "openshift" ]]; then
    echo "Launching the application on OpenShift..."
    
    oc new-app PHM-Rules-SB-service:1.0-SNAPSHOT
    oc expose svc/PHM-Rules-SB-service
else

	echo "Launching the application locally..."
	pattern="PHM-Rules-SB-service"
	files=( $pattern )
    #the line below doesn't work
    #cd ${files[0]}
    cd PHM-Rules-SB-service
	executable="$(ls  *target/*.jar | tail -n1)"
	java -jar "$executable"
fi