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
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="assessment_id")
	private int assessmentId;

	@Column(name="active")
	private boolean active;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created")
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_updated")
	private Date dateUpdated;

	@Column(name="description")
	private String description;

	@Column(name="exam_ids")
	private String examIds;

	@Column(name="flag")
	private boolean flag;

	@Column(name="random_exam")
	private boolean randomExam;

	@Column(name="retake_interval_days")
	private int retakeIntervalDays;

	private boolean standard;

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
		return assessmentId;
	}

	public void setAssessmentId(int assessmentId) {
		this.assessmentId = assessmentId;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getExamIds() {
		return examIds;
	}

	public void setExamIds(String examIds) {
		this.examIds = examIds;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public boolean isRandomExam() {
		return randomExam;
	}

	public void setRandomExam(boolean randomExam) {
		this.randomExam = randomExam;
	}

	public int getRetakeIntervalDays() {
		return retakeIntervalDays;
	}

	public void setRetakeIntervalDays(int retakeIntervalDays) {
		this.retakeIntervalDays = retakeIntervalDays;
	}

	public boolean isStandard() {
		return standard;
	}

	public void setStandard(boolean standard) {
		this.standard = standard;
	}

	public int getTimeLimit() {
		return timeLimit;
	}

	public void setTimeLimit(int timeLimit) {
		this.timeLimit = timeLimit;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<AssessmentUserAnswer> getAssessmentUserAnswers() {
		return assessmentUserAnswers;
	}

	public void setAssessmentUserAnswers(
			List<AssessmentUserAnswer> assessmentUserAnswers) {
		this.assessmentUserAnswers = assessmentUserAnswers;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
}