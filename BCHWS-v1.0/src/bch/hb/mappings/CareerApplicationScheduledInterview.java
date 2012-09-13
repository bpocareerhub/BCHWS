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
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="interview_id")
	private int interviewId;

	@Column(name="active")
	private boolean active;

	@Column(name="application_id")
	private int applicationId;

	@Column(name="cancelled")
	private boolean cancelled;

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

	@Column(name="flag")
	private boolean flag;

	@Column(name="inviting_user_id")
	private int invitingUserId;

	@Column(name="note")
	private String note;

	@Column(name="rescheduled")
	private boolean rescheduled;

	public CareerApplicationScheduledInterview() {
	}

	public int getInterviewId() {
		return interviewId;
	}

	public void setInterviewId(int interviewId) {
		this.interviewId = interviewId;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public boolean isCancelled() {
		return cancelled;
	}

	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public int getCreatedByUserId() {
		return createdByUserId;
	}

	public void setCreatedByUserId(int createdByUserId) {
		this.createdByUserId = createdByUserId;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateInvitation() {
		return dateInvitation;
	}

	public void setDateInvitation(Date dateInvitation) {
		this.dateInvitation = dateInvitation;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public int getInvitingUserId() {
		return invitingUserId;
	}

	public void setInvitingUserId(int invitingUserId) {
		this.invitingUserId = invitingUserId;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public boolean isRescheduled() {
		return rescheduled;
	}

	public void setRescheduled(boolean rescheduled) {
		this.rescheduled = rescheduled;
	}
}