package bch.hb.mappings;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the career_posts database table.
 * 
 */
@Entity
@Table(name="career_posts")
public class CareerPost implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="career_id")
	private int careerId;

	@Column(name="academic_code")
	private String academicCode;

	@Column(name="active")
	private boolean active;

	@Column(name="career_description")
	private String careerDescription;

	@Column(name="career_post_status_id")
	private int careerPostStatusId;

	@Column(name="career_title")
	private String careerTitle;

	@Column(name="client_id")
	private int clientId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created")
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_expire")
	private Date dateExpire;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_post")
	private Date datePost;

	@Column(name="employment_type_id")
	private int employmentTypeId;

	@Column(name="flag")
	private boolean flag;

	@Column(name="fresh_graduate")
	private boolean freshGraduate;

	@Column(name="hide_company_details")
	private boolean hideCompanyDetails;

	@Column(name="industry_id")
	private int industryId;

	@Column(name="industry_sector_id")
	private int industrySectorId;

	@Column(name="keywords")
	private String keywords;

	@Column(name="max_repost")
	private int maxRepost;

	@Column(name="negotiable")
	private boolean negotiable;

	@Column(name="parent_career_id")
	private int parentCareerId;

	@Column(name="position_level_id")
	private int positionLevelId;

	@Column(name="region_city_code")
	private String regionCityCode;

	@Column(name="repost")
	private boolean repost;

	@Column(name="repost_interval_days")
	private int repostIntervalDays;

	@Column(name="require_assessment_id")
	private int requireAssessmentId;

	@Column(name="require_question")
	private String requireQuestion;

	@Column(name="salary_code")
	private String salaryCode;

	@Column(name="specialization_id")
	private String specializationId;

	@Column(name="year_of_experience_code")
	private String yearOfExperienceCode;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="posted_by_user_id")
	private User user;

	public CareerPost() {
	}

	public int getCareerId() {
		return careerId;
	}

	public void setCareerId(int careerId) {
		this.careerId = careerId;
	}

	public String getAcademicCode() {
		return academicCode;
	}

	public void setAcademicCode(String academicCode) {
		this.academicCode = academicCode;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getCareerDescription() {
		return careerDescription;
	}

	public void setCareerDescription(String careerDescription) {
		this.careerDescription = careerDescription;
	}

	public int getCareerPostStatusId() {
		return careerPostStatusId;
	}

	public void setCareerPostStatusId(int careerPostStatusId) {
		this.careerPostStatusId = careerPostStatusId;
	}

	public String getCareerTitle() {
		return careerTitle;
	}

	public void setCareerTitle(String careerTitle) {
		this.careerTitle = careerTitle;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateExpire() {
		return dateExpire;
	}

	public void setDateExpire(Date dateExpire) {
		this.dateExpire = dateExpire;
	}

	public Date getDatePost() {
		return datePost;
	}

	public void setDatePost(Date datePost) {
		this.datePost = datePost;
	}

	public int getEmploymentTypeId() {
		return employmentTypeId;
	}

	public void setEmploymentTypeId(int employmentTypeId) {
		this.employmentTypeId = employmentTypeId;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public boolean isFreshGraduate() {
		return freshGraduate;
	}

	public void setFreshGraduate(boolean freshGraduate) {
		this.freshGraduate = freshGraduate;
	}

	public boolean isHideCompanyDetails() {
		return hideCompanyDetails;
	}

	public void setHideCompanyDetails(boolean hideCompanyDetails) {
		this.hideCompanyDetails = hideCompanyDetails;
	}

	public int getIndustryId() {
		return industryId;
	}

	public void setIndustryId(int industryId) {
		this.industryId = industryId;
	}

	public int getIndustrySectorId() {
		return industrySectorId;
	}

	public void setIndustrySectorId(int industrySectorId) {
		this.industrySectorId = industrySectorId;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public int getMaxRepost() {
		return maxRepost;
	}

	public void setMaxRepost(int maxRepost) {
		this.maxRepost = maxRepost;
	}

	public boolean isNegotiable() {
		return negotiable;
	}

	public void setNegotiable(boolean negotiable) {
		this.negotiable = negotiable;
	}

	public int getParentCareerId() {
		return parentCareerId;
	}

	public void setParentCareerId(int parentCareerId) {
		this.parentCareerId = parentCareerId;
	}

	public int getPositionLevelId() {
		return positionLevelId;
	}

	public void setPositionLevelId(int positionLevelId) {
		this.positionLevelId = positionLevelId;
	}

	public String getRegionCityCode() {
		return regionCityCode;
	}

	public void setRegionCityCode(String regionCityCode) {
		this.regionCityCode = regionCityCode;
	}

	public boolean isRepost() {
		return repost;
	}

	public void setRepost(boolean repost) {
		this.repost = repost;
	}

	public int getRepostIntervalDays() {
		return repostIntervalDays;
	}

	public void setRepostIntervalDays(int repostIntervalDays) {
		this.repostIntervalDays = repostIntervalDays;
	}

	public int getRequireAssessmentId() {
		return requireAssessmentId;
	}

	public void setRequireAssessmentId(int requireAssessmentId) {
		this.requireAssessmentId = requireAssessmentId;
	}

	public String getRequireQuestion() {
		return requireQuestion;
	}

	public void setRequireQuestion(String requireQuestion) {
		this.requireQuestion = requireQuestion;
	}

	public String getSalaryCode() {
		return salaryCode;
	}

	public void setSalaryCode(String salaryCode) {
		this.salaryCode = salaryCode;
	}

	public String getSpecializationId() {
		return specializationId;
	}

	public void setSpecializationId(String specializationId) {
		this.specializationId = specializationId;
	}

	public String getYearOfExperienceCode() {
		return yearOfExperienceCode;
	}

	public void setYearOfExperienceCode(String yearOfExperienceCode) {
		this.yearOfExperienceCode = yearOfExperienceCode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}