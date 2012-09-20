package bch.hb.mappings;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the career_application_scheduled_interviews database table.
 * 
 */
@Entity
@Table(name="career_application_scheduled_interviews")
public class CareerApplicationScheduledInterview implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="interview_id")
	private int interviewId;

	private byte active;

	@Column(name="application_id")
	private int applicationId;

	private int cancelled;

	@Column(name="client_id")
	private int clientId;

	@Column(name="created_by_user_id")
	private int createdByUserId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created")
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_invitation")
	private Date dateInvitation;

	private byte flag;

	@Column(name="inviting_user_id")
	private int invitingUserId;

	@Lob
	private String note;

	private int rescheduled;

	public CareerApplicationScheduledInterview() {
	}

	public int getInterviewId() {
		return this.interviewId;
	}

	public void setInterviewId(int interviewId) {
		this.interviewId = interviewId;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public int getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public int getCancelled() {
		return this.cancelled;
	}

	public void setCancelled(int cancelled) {
		this.cancelled = cancelled;
	}

	public int getClientId() {
		return this.clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public int getCreatedByUserId() {
		return this.createdByUserId;
	}

	public void setCreatedByUserId(int createdByUserId) {
		this.createdByUserId = createdByUserId;
	}

	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateInvitation() {
		return this.dateInvitation;
	}

	public void setDateInvitation(Date dateInvitation) {
		this.dateInvitation = dateInvitation;
	}

	public byte getFlag() {
		return this.flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}

	public int getInvitingUserId() {
		return this.invitingUserId;
	}

	public void setInvitingUserId(int invitingUserId) {
		this.invitingUserId = invitingUserId;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public int getRescheduled() {
		return this.rescheduled;
	}

	public void setRescheduled(int rescheduled) {
		this.rescheduled = rescheduled;
	}

}