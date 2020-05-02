package com.health_insurance.phm_model;

import java.io.Serializable;

/**
 * Properties of a task actor assignment.
 */
public class TaskActorAssignment implements Serializable {

	private static final long serialVersionUID = 1975085207982318263L;

	private String actor;
	private String channel;
	private String escalationActor;
	private String escalationChannel;

	/**
	 * Properties of a task actor assignment.
	 */
	public TaskActorAssignment() {
	}

	/**
	 * Return the actor of the task.
	 *
	 * @return the task actor
	 */
	public String getActor() {
		return this.actor;
	}

	/**
	 * Set the actor of the task.
	 *
	 * @param actor
	 */
	public void setActor(String actor) {
		this.actor = actor;
	}

	/**
	 * Return the name of the application where the task is performed.
	 *
	 * @return the task application name
	 */
	public String getChannel() {
		return this.channel;
	}

	/**
	 * Set the name of the application where the task is performed.
	 *
	 * @param channel
	 */
	public void setChannel(String channel) {
		this.channel = channel;
	}

	/**
	 * Return the actor of the escalation.
	 *
	 * @return the escalation actor
	 */
	public String getEscalationActor() {
		return this.escalationActor;
	}

	/**
	 * Set the actor of the escalation.
	 *
	 * @param escalationActor
	 */
	public void setEscalationActor(String escalationActor) {
		this.escalationActor = escalationActor;
	}

	/**
	 * Return the name of the application where the escalation is performed.
	 *
	 * @return the escalation application name
	 */
	public String getEscalationChannel() {
		return this.escalationChannel;
	}

	/**
	 * Set the name of the application where the escalation is performed.
	 *
	 * @param escalationChannel
	 */
	public void setEscalationChannel(String escalationChannel) {
		this.escalationChannel = escalationChannel;
	}

	/**
	 * Properties of a task actor assignment.
	 *
	 * @param actor
	 * @param channel
	 * @param escalationActor
	 * @param escalationChannel
	 */
	public TaskActorAssignment(String actor,
			String channel, String escalationActor,
			String escalationChannel) {
		this.actor = actor;
		this.channel = channel;
		this.escalationActor = escalationActor;
		this.escalationChannel = escalationChannel;
	}

}