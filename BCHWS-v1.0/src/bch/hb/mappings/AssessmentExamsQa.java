package bch.hb.mappings;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the assessment_exams_qa database table.
 * 
 */
@Entity
@Table(name="assessment_exams_qa")
public class AssessmentExamsQa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="qa_id")
	private int qaId;

	private int answers;

	private String choices;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created")
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_updated")
	private Date dateUpdated;

	private boolean flag;

	private String question;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="created_by_user_id")
	private User user;

	public AssessmentExamsQa() {
	}

	public int getQaId() {
		return this.qaId;
	}

	public void setQaId(int qaId) {
		this.qaId = qaId;
	}

	public int getAnswers() {
		return this.answers;
	}

	public void setAnswers(int answers) {
		this.answers = answers;
	}

	public String getChoices() {
		return this.choices;
	}

	public void setChoices(String choices) {
		this.choices = choices;
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

	public boolean isFlag() {
		return this.flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}