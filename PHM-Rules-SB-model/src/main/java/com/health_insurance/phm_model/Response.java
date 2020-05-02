package com.health_insurance.phm_model;

import java.io.Serializable;

/**
 * Response from a REST API Call.
 */
public class Response implements Serializable {

	private static final long serialVersionUID = -4988395103979953808L;

	private Task task;
	private TaskActorAssignment assignment;
	private Reminder reminder;

	/**
	 * Response from a REST API Call.
	 */
	public Response() {
	}

	public Task getTask() {
		return this.task;
	}

	public void setTask(
			Task task) {
		this.task = task;
	}

	public TaskActorAssignment getAssignment() {
		return this.assignment;
	}

	public void setAssignment(
			TaskActorAssignment assignment) {
		this.assignment = assignment;
	}

	public Reminder getReminder() {
		return this.reminder;
	}

	public void setReminder(Reminder reminder) {
		this.reminder = reminder;
	}

	/**
	 * Response from a REST API Call.
	 *
	 * @param task
	 * @param assignment
	 * @param reminder
	 */
    public Response(
    		Task task,
			TaskActorAssignment assignment,
			Reminder reminder) {
		this.task = task;
		this.assignment = assignment;
		this.reminder = reminder;
	}

}