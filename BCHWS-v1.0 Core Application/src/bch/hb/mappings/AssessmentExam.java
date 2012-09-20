package bch.hb.mappings;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the assessment_exams database table.
 * 
 */
@Entity
@Table(name="assessment_exams")
public class AssessmentExam implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="exam_id")
	private int examId;

	private byte active;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created")
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_updated")
	private Date dateUpdated;

	@Column(name="exam_title")
	private String examTitle;

	@Column(name="exam_type_id")
	private int examTypeId;

	private byte flag;

	@Lob
	private String instruction;

	@Column(name="maximum_question")
	private int maximumQuestion;

	@Column(name="random_question")
	private byte randomQuestion;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="created_by_user_id")
	private User user;

	//bi-directional many-to-one association to AssessmentUserAnswer
	@OneToMany(mappedBy="assessmentExam")
	private List<AssessmentUserAnswer> assessmentUserAnswers;

	public AssessmentExam() {
	}

	public int getExamId() {
		return this.examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
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

	public String getExamTitle() {
		return this.examTitle;
	}

	public void setExamTitle(String examTitle) {
		this.examTitle = examTitle;
	}

	public int getExamTypeId() {
		return this.examTypeId;
	}

	public void setExamTypeId(int examTypeId) {
		this.examTypeId = examTypeId;
	}

	public byte getFlag() {
		return this.flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}

	public String getInstruction() {
		return this.instruction;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}

	public int getMaximumQuestion() {
		return this.maximumQuestion;
	}

	public void setMaximumQuestion(int maximumQuestion) {
		this.maximumQuestion = maximumQuestion;
	}

	public byte getRandomQuestion() {
		return this.randomQuestion;
	}

	public void setRandomQuestion(byte randomQuestion) {
		this.randomQuestion = randomQuestion;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<AssessmentUserAnswer> getAssessmentUserAnswers() {
		return this.assessmentUserAnswers;
	}

	public void setAssessmentUserAnswers(List<AssessmentUserAnswer> assessmentUserAnswers) {
		this.assessmentUserAnswers = assessmentUserAnswers;
	}

}