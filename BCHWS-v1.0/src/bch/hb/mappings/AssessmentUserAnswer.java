package bch.hb.mappings;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the assessment_user_answers database table.
 * 
 */
@Entity
@Table(name="assessment_user_answers")
public class AssessmentUserAnswer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_answer_id")
	private int userAnswerId;

	@Column(name="active")
	private boolean active;

	@Column(name="correct_items")
	private int correctItems;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_end")
	private Date dateEnd;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_started")
	private Date dateStarted;

	@Column(name="flag")
	private boolean flag;

	@Column(name="score")
	private int score;

	@Column(name="submitted")
	private boolean submitted;

	@Column(name="total_items")
	private int totalItems;

	@Column(name="user_answers")
	private String userAnswers;

	//bi-directional many-to-one association to AssessmentExam
	@ManyToOne
	@JoinColumn(name="exam_id")
	private AssessmentExam assessmentExam;

	//bi-directional many-to-one association to Assessment
	@ManyToOne
	@JoinColumn(name="assessment_id")
	private Assessment assessment;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

	public AssessmentUserAnswer() {
	}

	public int getUserAnswerId() {
		return userAnswerId;
	}

	public void setUserAnswerId(int userAnswerId) {
		this.userAnswerId = userAnswerId;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getCorrectItems() {
		return correctItems;
	}

	public void setCorrectItems(int correctItems) {
		this.correctItems = correctItems;
	}

	public Date getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	public Date getDateStarted() {
		return dateStarted;
	}

	public void setDateStarted(Date dateStarted) {
		this.dateStarted = dateStarted;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public boolean isSubmitted() {
		return submitted;
	}

	public void setSubmitted(boolean submitted) {
		this.submitted = submitted;
	}

	public int getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}

	public String getUserAnswers() {
		return userAnswers;
	}

	public void setUserAnswers(String userAnswers) {
		this.userAnswers = userAnswers;
	}

	public AssessmentExam getAssessmentExam() {
		return assessmentExam;
	}

	public void setAssessmentExam(AssessmentExam assessmentExam) {
		this.assessmentExam = assessmentExam;
	}

	public Assessment getAssessment() {
		return assessment;
	}

	public void setAssessment(Assessment assessment) {
		this.assessment = assessment;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}