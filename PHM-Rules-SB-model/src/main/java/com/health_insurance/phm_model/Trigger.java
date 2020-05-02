package com.health_insurance.phm_model;

import java.io.Serializable;

/**
 * Properties of a trigger
 */
public class Trigger implements Serializable {

    private static final long serialVersionUID = 4180386790618507854L;

    private Integer triggerId;
    private String memberId;

    /**
     * The trigger
     */
    public Trigger() {
    }

    /**
     * Return the code identifying the trigger.
     *
     * @return the trigger id
     */
    public Integer getTriggerId() {
        return this.triggerId;
    }

    /**
     * Set the code identifying the trigger.
     *
     * @param triggerId
     */
    public void setTriggerId(Integer triggerId) {
        this.triggerId = triggerId;
    }

    /**
     * Return the insurance member id.
     *
     * @return the member id
     */
    public String getMemberId() {
        return this.memberId;
    }

    /**
     * Set the insurance member id.
     *
     * @param memberId
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * Properties of a trigger.
     *
     * @param triggerId
     * @param memberId
     */
    public Trigger(Integer triggerId, String memberId) {
        this.triggerId = triggerId;
        this.memberId = memberId;
    }

}