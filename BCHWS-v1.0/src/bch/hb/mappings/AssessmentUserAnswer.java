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
	@Column(name="user_answer_id")
	private int userAnswerId;

	private byte active;

	@Column(name="correct_items")
	private int correctItems;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_end")
	private Date dateEnd;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_started")
	private Date dateStarted;

	private byte flag;

	private int score;

	private int submitted;

	@Column(name="total_items")
	private int totalItems;

	@Lob
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
		return this.userAnswerId;
	}

	public void setUserAnswerId(int userAnswerId) {
		this.userAnswerId = userAnswerId;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public int getCorrectItems() {
		return this.correctItems;
	}

	public void setCorrectItems(int correctItems) {
		this.correctItems = correctItems;
	}

	public Date getDateEnd() {
		return this.dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	public Date getDateStarted() {
		return this.dateStarted;
	}

	public void setDateStarted(Date dateStarted) {
		this.dateStarted = dateStarted;
	}

	public byte getFlag() {
		return this.flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}

	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getSubmitted() {
		return this.submitted;
	}

	public void setSubmitted(int submitted) {
		this.submitted = submitted;
	}

	public int getTotalItems() {
		return this.totalItems;
	}

	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}

	public String getUserAnswers() {
		return this.userAnswers;
	}

	public void setUserAnswers(String userAnswers) {
		this.userAnswers = userAnswers;
	}

	public AssessmentExam getAssessmentExam() {
		return this.assessmentExam;
	}

	public void setAssessmentExam(AssessmentExam assessmentExam) {
		this.assessmentExam = assessmentExam;
	}

	public Assessment getAssessment() {
		return this.assessment;
	}

	public void setAssessment(Assessment assessment) {
		this.assessment = assessment;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}