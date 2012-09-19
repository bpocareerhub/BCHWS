package bch.hb.mappings;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the user_work_experiences database table.
 * 
 */
@Entity
@Table(name="user_work_experiences")
public class UserWorkExperience implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="work_experience_id")
	private int workExperienceId;

	private byte active;

	@Column(name="company_name")
	private String companyName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created")
	private Date dateCreated;

	@Temporal(TemporalType.DATE)
	@Column(name="date_employment_from")
	private Date dateEmploymentFrom;

	@Temporal(TemporalType.DATE)
	@Column(name="date_employment_to")
	private Date dateEmploymentTo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_modified")
	private Date dateModified;

	private byte flag;

	@Column(name="industry_id")
	private int industryId;

	@Column(name="industry_sector_id")
	private String industrySectorId;

	@Lob
	@Column(name="job_description")
	private String jobDescription;

	@Lob
	@Column(name="job_title")
	private String jobTitle;

	@Column(name="others_industry", nullable=true)
	private String othersIndustry;

	@Column(name="others_specialization", nullable=true)
	private String othersSpecialization;

	@Column(name="position_level_code")
	private int positionLevelCode;

	@Column(name="present_employment")
	private byte presentEmployment;

	@Lob
	@Column(name="reason_for_leaving")
	private String reasonForLeaving;

	@Column(name="salary_code")
	private String salaryCode;

	@Column(name="specialization_code")
	private String specializationCode;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

	public UserWorkExperience() {
	}

	@PrePersist
	protected void beforePersist() {
		dateCreated = new Date();
	}
	
	@PreUpdate
	protected void beforeUpdate() {
		dateModified = new Date();
	}
	
	public int getWorkExperienceId() {
		return this.workExperienceId;
	}

	public void setWorkExperienceId(int workExperienceId) {
		this.workExperienceId = workExperienceId;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateEmploymentFrom() {
		return this.dateEmploymentFrom;
	}

	public void setDateEmploymentFrom(Date dateEmploymentFrom) {
		this.dateEmploymentFrom = dateEmploymentFrom;
	}

	public Date getDateEmploymentTo() {
		return this.dateEmploymentTo;
	}

	public void setDateEmploymentTo(Date dateEmploymentTo) {
		this.dateEmploymentTo = dateEmploymentTo;
	}

	public Date getDateModified() {
		return this.dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public byte getFlag() {
		return this.flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}

	public int getIndustryId() {
		return this.industryId;
	}

	public void setIndustryId(int industryId) {
		this.industryId = industryId;
	}

	public String getIndustrySectorId() {
		return this.industrySectorId;
	}

	public void setIndustrySectorId(String industrySectorId) {
		this.industrySectorId = industrySectorId;
	}

	public String getJobDescription() {
		return this.jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public String getJobTitle() {
		return this.jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getOthersIndustry() {
		return this.othersIndustry;
	}

	public void setOthersIndustry(String othersIndustry) {
		this.othersIndustry = othersIndustry;
	}

	public String getOthersSpecialization() {
		return this.othersSpecialization;
	}

	public void setOthersSpecialization(String othersSpecialization) {
		this.othersSpecialization = othersSpecialization;
	}

	public int getPositionLevelCode() {
		return this.positionLevelCode;
	}

	public void setPositionLevelCode(int positionLevelCode) {
		this.positionLevelCode = positionLevelCode;
	}

	public byte getPresentEmployment() {
		return this.presentEmployment;
	}

	public void setPresentEmployment(byte presentEmployment) {
		this.presentEmployment = presentEmployment;
	}

	public String getReasonForLeaving() {
		return this.reasonForLeaving;
	}

	public void setReasonForLeaving(String reasonForLeaving) {
		this.reasonForLeaving = reasonForLeaving;
	}

	public String getSalaryCode() {
		return this.salaryCode;
	}

	public void setSalaryCode(String salaryCode) {
		this.salaryCode = salaryCode;
	}

	public String getSpecializationCode() {
		return this.specializationCode;
	}

	public void setSpecializationCode(String specializationCode) {
		this.specializationCode = specializationCode;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}