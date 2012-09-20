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
	@Column(name="educational_background_id")
	private int educationalBackgroundId;

	@Column(name="academic_id")
	private int academicId;

	private byte active;

	private String course;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created")
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_modified")
	private Date dateModified;

	@Column(name="field_of_study_code")
	private String fieldOfStudyCode;

	private byte flag;

	@Lob
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
		return this.educationalBackgroundId;
	}

	public void setEducationalBackgroundId(int educationalBackgroundId) {
		this.educationalBackgroundId = educationalBackgroundId;
	}

	public int getAcademicId() {
		return this.academicId;
	}

	public void setAcademicId(int academicId) {
		this.academicId = academicId;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public String getCourse() {
		return this.course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateModified() {
		return this.dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public String getFieldOfStudyCode() {
		return this.fieldOfStudyCode;
	}

	public void setFieldOfStudyCode(String fieldOfStudyCode) {
		this.fieldOfStudyCode = fieldOfStudyCode;
	}

	public byte getFlag() {
		return this.flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}

	public String getInstitutionName() {
		return this.institutionName;
	}

	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

	public Date getPeriodFrom() {
		return this.periodFrom;
	}

	public void setPeriodFrom(Date periodFrom) {
		this.periodFrom = periodFrom;
	}

	public Date getPeriodTo() {
		return this.periodTo;
	}

	public void setPeriodTo(Date periodTo) {
		this.periodTo = periodTo;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}