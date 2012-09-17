package bch.hb.mappings;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the assessments database table.
 * 
 */
@Entity
@Table(name="assessments")
public class Assessment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="assessment_id")
	private int assessmentId;

	private byte active;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created")
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_updated")
	private Date dateUpdated;

	@Lob
	private String description;

	@Column(name="exam_ids")
	private String examIds;

	private byte flag;

	@Column(name="random_exam")
	private byte randomExam;

	@Column(name="retake_interval_days")
	private int retakeIntervalDays;

	private byte standard;

	@Column(name="time_limit")
	private int timeLimit;

	private String title;

	//bi-directional many-to-one association to AssessmentUserAnswer
	@OneToMany(mappedBy="assessment")
	private List<AssessmentUserAnswer> assessmentUserAnswers;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="created_by_user_id")
	private User user;

	public Assessment() {
	}

	public int getAssessmentId() {
		return this.assessmentId;
	}

	public void setAssessmentId(int assessmentId) {
		this.assessmentId = assessmentId;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateUpdated() {
		return this.dateUpdated;
	}

	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getExamIds() {
		return this.examIds;
	}

	public void setExamIds(String examIds) {
		this.examIds = examIds;
	}

	public byte getFlag() {
		return this.flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}

	public byte getRandomExam() {
		return this.randomExam;
	}

	public void setRandomExam(byte randomExam) {
		this.randomExam = randomExam;
	}

	public int getRetakeIntervalDays() {
		return this.retakeIntervalDays;
	}

	public void setRetakeIntervalDays(int retakeIntervalDays) {
		this.retakeIntervalDays = retakeIntervalDays;
	}

	public byte getStandard() {
		return this.standard;
	}

	public void setStandard(byte standard) {
		this.standard = standard;
	}

	public int getTimeLimit() {
		return this.timeLimit;
	}

	public void setTimeLimit(int timeLimit) {
		this.timeLimit = timeLimit;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<AssessmentUserAnswer> getAssessmentUserAnswers() {
		return this.assessmentUserAnswers;
	}

	public void setAssessmentUserAnswers(List<AssessmentUserAnswer> assessmentUserAnswers) {
		this.assessmentUserAnswers = assessmentUserAnswers;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}