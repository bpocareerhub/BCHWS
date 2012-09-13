package bch.hb.mappings;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the user_educational_backgrounds database table.
 * 
 */
@Entity
@Table(name="user_educational_backgrounds")
public class UserEducationalBackground implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="educational_background_id")
	private int educationalBackgroundId;

	@Column(name="academic_id")
	private int academicId;

	@Column(name="active")
	private boolean active;

	@Column(name="course")
	private String course;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created")
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_modified")
	private Date dateModified;

	@Column(name="field_of_study_code")
	private String fieldOfStudyCode;

	@Column(name="flag")
	private boolean flag;

	@Column(name="institution_name")
	private String institutionName;

	@Temporal(TemporalType.DATE)
	@Column(name="period_from")
	private Date periodFrom;

	@Temporal(TemporalType.DATE)
	@Column(name="period_to")
	private Date periodTo;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

	public UserEducationalBackground() {
	}

	public int getEducationalBackgroundId() {
		return educationalBackgroundId;
	}

	public void setEducationalBackgroundId(int educationalBackgroundId) {
		this.educationalBackgroundId = educationalBackgroundId;
	}

	public int getAcademicId() {
		return academicId;
	}

	public void setAcademicId(int academicId) {
		this.academicId = academicId;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateModified() {
		return dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public String getFieldOfStudyCode() {
		return fieldOfStudyCode;
	}

	public void setFieldOfStudyCode(String fieldOfStudyCode) {
		this.fieldOfStudyCode = fieldOfStudyCode;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getInstitutionName() {
		return institutionName;
	}

	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

	public Date getPeriodFrom() {
		return periodFrom;
	}

	public void setPeriodFrom(Date periodFrom) {
		this.periodFrom = periodFrom;
	}

	public Date getPeriodTo() {
		return periodTo;
	}

	public void setPeriodTo(Date periodTo) {
		this.periodTo = periodTo;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}