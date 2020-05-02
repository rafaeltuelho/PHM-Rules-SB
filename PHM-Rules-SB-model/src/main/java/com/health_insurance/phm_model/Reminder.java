package com.health_insurance.phm_model;


import java.io.Serializable;

/**
 * Reminder to be sent if task not soft completed by given period of time.
 */
public class Reminder implements Serializable {

    private static final long serialVersionUID = 961063000965537414L;

    private String address;
    private String subject;
    private String body;
    private String from;

    /**
     * Reminder to be sent if task not soft completed by given period of time.
     */
    public Reminder() {
    }

    /**
     * Return the address where to send the reminder message.
     *
     * @return the address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Set the address where to send the reminder message.
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Return the subject of the reminder message.
     *
     * @return the subject of the message
     */
    public String getSubject() {
        return this.subject;
    }

    /**
     * Set the subject of the reminder message.
     *
     * @param subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * Return the text of the reminder.
     *
     * @return the body of the message
     */
    public String getBody() {
        return this.body;
    }

    /**
     * Set the text of the reminder.
     *
     * @param body
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Return the sender address of the reminder message.
     *
     * @return the sender address
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * Set the sender address of the reminder message.
     *
     * @param from
     */
    public void setFrom(String from) {
        this.from = from;
    }


    /**
     * Reminder to be sent if task not soft completed by given period of time.
     *
     * @param address
     * @param subject
     * @param body
     * @param from
     */
    public Reminder(String address, String subject,
                    String body, String from) {
        this.address = address;
        this.subject = subject;
        this.body = body;
        this.from = from;
    }

}