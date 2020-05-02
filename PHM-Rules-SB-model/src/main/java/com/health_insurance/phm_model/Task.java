package com.health_insurance.phm_model;

import java.io.Serializable;
import java.util.Date;

/**
 * Properties of a task.
 */
public class Task implements Serializable {

	private static final long serialVersionUID = -5237255330271679944L;

	private Integer id;
	private String origId;
	private String description;
	private String status;
	private Integer predecessor;
	private Boolean suppressed;
	private String suppressionPeriod;
	private Date expirationDate;
	private String reminderInitiation;
	private String reminderFrequency;
	private Boolean escalated;
	private String escalationTimer;
	private String close;
	private String closeSignal;

	/**
	 * The task.
	 */
	public Task() {
	}

	/**
	 * Return the numerical value identifying the task.
	 *
	 * @return the task id
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 * Set the numerical value identifying the task.
	 *
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Return the alphanumeric code of the task.
	 *
	 * @return the original task id
	 */
	public String getOrigId() {
		return this.origId;
	}

	/**
	 * Set the alphanumeric code of the task.
	 *
	 * @param origId
	 */
	public void setOrigId(String origId) {
		this.origId = origId;
	}

	/**
	 * Return the description of the task.
	 *
	 * @return description
	 */
	public String getDescription() {
		return this.description;
	}
	/**
	 * Set the description of the task.
	 *
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Return the lifecycle status of the task.
	 *
	 * @return the task status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the lifecycle status of the task.
	 *
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Return task predecessor.
	 *
	 * @return
	 */
	public Integer getPredecessor() {
		return predecessor;
	}

	/**
	 * Set task predecessor.
	 *
	 * @param predecessor
	 */
	public void setPredecessor(Integer predecessor) {
		this.predecessor = predecessor;
	}

	/**
	 * Return task inactive/suppression flag.
	 *
	 * @return task suppression flag
	 */
	public Boolean getSuppressed() {
		return suppressed;
	}

	/**
	 * Set task inactive/suppression flag.
	 *
	 * @param suppressed
	 */
	public void setSuppressed(Boolean suppressed) {
		this.suppressed = suppressed;
	}

	/**
	 * Return task inactive/suppression period.
	 *
	 * @return the task suppression period
	 */
	public String getSuppressionPeriod() {
		return suppressionPeriod;
	}

	/**
	 * Set task inactive/suppression period.
	 *
	 * @param suppressionPeriod
	 */
	public void setSuppressionPeriod(String suppressionPeriod) {
		this.suppressionPeriod = suppressionPeriod;
	}

	/**
	 * Return task expiration date.
	 *
	 * @return
	 */
	public Date getExpirationDate() {
		return expirationDate;
	}

	/**
	 * Set task expiration date.
	 *
	 * @param expirationDate
	 */
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	/**
	 * Return the type of task close.
	 *
	 * @return the close flag
	 */
	public String getClose() {
		return close;
	}

	/**
	 * Set the type of task close.
	 *
	 * @param close
	 */
	public void setClose(String close) {
		this.close = close;
	}

	/**
	 * Return the timer setting for the first reminder as an ISO 8601 value.
	 *
	 * @return the reminder initiation timer setting.
	 */
	public String getReminderInitiation() {
		return reminderInitiation;
	}

	/**
	 * Set the timer setting for the first reminder as an ISO 8601 value.
	 *
	 * @param reminderInitiation
	 */
	public void setReminderInitiation(String reminderInitiation) {
		this.reminderInitiation = reminderInitiation;
	}

	/**
	 * Return the frequency of the reminder as an ISO 8601 value.
	 *
	 * @return the reminder frequency
	 */
	public String getReminderFrequency() {
		return this.reminderFrequency;
	}

	/**
	 * Set the frequency of the reminder as an ISO 8601 value.
	 *
	 * @param reminderFrequency
	 */
	public void setReminderFrequency(String reminderFrequency) {
		this.reminderFrequency = reminderFrequency;
	}

	/**
	 * Return task escalation flag.
	 *
	 * @return
	 */
	public Boolean getEscalated() {
		return escalated;
	}

	/**
	 * Set task escalation flag.
	 *
	 * @param escalated
	 */
	public void setEscalated(Boolean escalated) {
		this.escalated = escalated;
	}

	/**
	 * Return the timer setting for escalation as an ISO 8601 value.
	 *
	 * @return the escalation timer setting
	 */
	public String getEscalationTimer() {
		return this.escalationTimer;
	}

	/**
	 * Set the timer setting for escalation as an ISO 8601 value.
	 *
	 * @param escalationTimer
	 */
	public void setEscalationTimer(String escalationTimer) {
		this.escalationTimer = escalationTimer;
	}

	/**
	 * Return the hard close signal.
	 *
	 * @return
	 */
	public String getCloseSignal() {
		return closeSignal;
	}

	/**
	 * Set the hard close signal.
	 *
	 * @param closeSignal
	 */
	public void setCloseSignal(String closeSignal) {
		this.closeSignal = closeSignal;
	}

	/**
	 * Properties of a task.
	 *
	 * @param id
	 * @param origId
	 * @param status
	 * @param description
	 * @param predecessor
	 * @param suppressed
	 * @param suppressionPeriod
	 * @param expirationDate
	 * @param close
	 * @param closeSignal
	 * @param reminderInitiation
	 * @param reminderFrequency
	 * @param escalated
	 * @param escalationTimer
	 */
	public Task(Integer id, String origId, String description, String status, Integer predecessor, Boolean suppressed, String suppressionPeriod, Date expirationDate, String close, String closeSignal, String reminderInitiation, String reminderFrequency, Boolean escalated, String escalationTimer) {
		this.id = id;
		this.origId = origId;
		this.status = status;
		this.description = description;
		this.predecessor = predecessor;
		this.suppressed = suppressed;
		this.suppressionPeriod = suppressionPeriod;
		this.expirationDate = expirationDate;
		this.close = close;
		this.closeSignal = closeSignal;
		this.reminderInitiation = reminderInitiation;
		this.reminderFrequency = reminderFrequency;
		this.escalated = escalated;
		this.escalationTimer = escalationTimer;
	}

}