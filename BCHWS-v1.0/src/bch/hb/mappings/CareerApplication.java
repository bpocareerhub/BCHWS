package bch.hb.mappings;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the career_applications database table.
 * 
 */
@Entity
@Table(name="career_applications")
public class CareerApplication implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="application_id")
	private int applicationId;

	@Column(name="career_id")
	private int careerId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="job_id")
	private int jobId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="modified_date")
	private Date modifiedDate;

	@Column(name="process_status_id")
	private int processStatusId;

	@Column(name="require_question_answer")
	private int requireQuestionAnswer;

	@Column(name="requirement_status_id")
	private int requirementStatusId;

	private int status;

	@Column(name="user_id")
	private int userId;

	public CareerApplication() {
	}

	public int getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public int getCareerId() {
		return this.careerId;
	}

	public void setCareerId(int careerId) {
		this.careerId = careerId;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public int getJobId() {
		return this.jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public int getProcessStatusId() {
		return this.processStatusId;
	}

	public void setProcessStatusId(int processStatusId) {
		this.processStatusId = processStatusId;
	}

	public int getRequireQuestionAnswer() {
		return this.requireQuestionAnswer;
	}

	public void setRequireQuestionAnswer(int requireQuestionAnswer) {
		this.requireQuestionAnswer = requireQuestionAnswer;
	}

	public int getRequirementStatusId() {
		return this.requirementStatusId;
	}

	public void setRequirementStatusId(int requirementStatusId) {
		this.requirementStatusId = requirementStatusId;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}