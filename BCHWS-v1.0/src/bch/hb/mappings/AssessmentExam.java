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
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="exam_id")
	private int examId;

	@Column(name="active")
	private boolean active;

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

	@Column(name="flag")
	private boolean flag;

	@Column(name="instruction")
	private String instruction;

	@Column(name="maximum_question")
	private int maximumQuestion;

	@Column(name="random_question")
	private boolean randomQuestion;

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
		return examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
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

	public String getExamTitle() {
		return examTitle;
	}

	public void setExamTitle(String examTitle) {
		this.examTitle = examTitle;
	}

	public int getExamTypeId() {
		return examTypeId;
	}

	public void setExamTypeId(int examTypeId) {
		this.examTypeId = examTypeId;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getInstruction() {
		return instruction;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}

	public int getMaximumQuestion() {
		return maximumQuestion;
	}

	public void setMaximumQuestion(int maximumQuestion) {
		this.maximumQuestion = maximumQuestion;
	}

	public boolean isRandomQuestion() {
		return randomQuestion;
	}

	public void setRandomQuestion(boolean randomQuestion) {
		this.randomQuestion = randomQuestion;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<AssessmentUserAnswer> getAssessmentUserAnswers() {
		return assessmentUserAnswers;
	}

	public void setAssessmentUserAnswers(
			List<AssessmentUserAnswer> assessmentUserAnswers) {
		this.assessmentUserAnswers = assessmentUserAnswers;
	}

}