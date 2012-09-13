package bch.hb.mappings;

import java.io.Serializable;
import javax.persistence.*;

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
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="work_experience_id")
	private int workExperienceId;

	@Column(name="active")
	private boolean active;

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

	@Column(name="flag")
	private boolean flag;

	@Column(name="industry_id")
	private int industryId;

	@Column(name="industry_sector_id")
	private String industrySectorId;

	@Column(name="job_description")
	private String jobDescription;

	@Column(name="job_title")
	private String jobTitle;

	@Column(name="others_industry")
	private String othersIndustry;

	@Column(name="others_specialization")
	private String othersSpecialization;

	@Column(name="position_level_code")
	private int positionLevelCode;

	@Column(name="present_employment")
	private boolean presentEmployment;

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

	public int getWorkExperienceId() {
		return workExperienceId;
	}

	public void setWorkExperienceId(int workExperienceId) {
		this.workExperienceId = workExperienceId;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateEmploymentFrom() {
		return dateEmploymentFrom;
	}

	public void setDateEmploymentFrom(Date dateEmploymentFrom) {
		this.dateEmploymentFrom = dateEmploymentFrom;
	}

	public Date getDateEmploymentTo() {
		return dateEmploymentTo;
	}

	public void setDateEmploymentTo(Date dateEmploymentTo) {
		this.dateEmploymentTo = dateEmploymentTo;
	}

	public Date getDateModified() {
		return dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public int getIndustryId() {
		return industryId;
	}

	public void setIndustryId(int industryId) {
		this.industryId = industryId;
	}

	public String getIndustrySectorId() {
		return industrySectorId;
	}

	public void setIndustrySectorId(String industrySectorId) {
		this.industrySectorId = industrySectorId;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getOthersIndustry() {
		return othersIndustry;
	}

	public void setOthersIndustry(String othersIndustry) {
		this.othersIndustry = othersIndustry;
	}

	public String getOthersSpecialization() {
		return othersSpecialization;
	}

	public void setOthersSpecialization(String othersSpecialization) {
		this.othersSpecialization = othersSpecialization;
	}

	public int getPositionLevelCode() {
		return positionLevelCode;
	}

	public void setPositionLevelCode(int positionLevelCode) {
		this.positionLevelCode = positionLevelCode;
	}

	public boolean isPresentEmployment() {
		return presentEmployment;
	}

	public void setPresentEmployment(boolean presentEmployment) {
		this.presentEmployment = presentEmployment;
	}

	public String getReasonForLeaving() {
		return reasonForLeaving;
	}

	public void setReasonForLeaving(String reasonForLeaving) {
		this.reasonForLeaving = reasonForLeaving;
	}

	public String getSalaryCode() {
		return salaryCode;
	}

	public void setSalaryCode(String salaryCode) {
		this.salaryCode = salaryCode;
	}

	public String getSpecializationCode() {
		return specializationCode;
	}

	public void setSpecializationCode(String specializationCode) {
		this.specializationCode = specializationCode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}