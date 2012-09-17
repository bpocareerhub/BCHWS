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
	@Column(name="career_id")
	private int careerId;

	@Column(name="academic_code")
	private String academicCode;

	private byte active;

	@Lob
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

	private byte flag;

	@Column(name="fresh_graduate")
	private byte freshGraduate;

	@Column(name="hide_company_details")
	private byte hideCompanyDetails;

	@Column(name="industry_id")
	private int industryId;

	@Column(name="industry_sector_id")
	private int industrySectorId;

	private String keywords;

	@Column(name="max_repost")
	private int maxRepost;

	private byte negotiable;

	@Column(name="parent_career_id")
	private int parentCareerId;

	@Column(name="position_level_id")
	private int positionLevelId;

	@Column(name="region_city_code")
	private String regionCityCode;

	private byte repost;

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
		return this.careerId;
	}

	public void setCareerId(int careerId) {
		this.careerId = careerId;
	}

	public String getAcademicCode() {
		return this.academicCode;
	}

	public void setAcademicCode(String academicCode) {
		this.academicCode = academicCode;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public String getCareerDescription() {
		return this.careerDescription;
	}

	public void setCareerDescription(String careerDescription) {
		this.careerDescription = careerDescription;
	}

	public int getCareerPostStatusId() {
		return this.careerPostStatusId;
	}

	public void setCareerPostStatusId(int careerPostStatusId) {
		this.careerPostStatusId = careerPostStatusId;
	}

	public String getCareerTitle() {
		return this.careerTitle;
	}

	public void setCareerTitle(String careerTitle) {
		this.careerTitle = careerTitle;
	}

	public int getClientId() {
		return this.clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateExpire() {
		return this.dateExpire;
	}

	public void setDateExpire(Date dateExpire) {
		this.dateExpire = dateExpire;
	}

	public Date getDatePost() {
		return this.datePost;
	}

	public void setDatePost(Date datePost) {
		this.datePost = datePost;
	}

	public int getEmploymentTypeId() {
		return this.employmentTypeId;
	}

	public void setEmploymentTypeId(int employmentTypeId) {
		this.employmentTypeId = employmentTypeId;
	}

	public byte getFlag() {
		return this.flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}

	public byte getFreshGraduate() {
		return this.freshGraduate;
	}

	public void setFreshGraduate(byte freshGraduate) {
		this.freshGraduate = freshGraduate;
	}

	public byte getHideCompanyDetails() {
		return this.hideCompanyDetails;
	}

	public void setHideCompanyDetails(byte hideCompanyDetails) {
		this.hideCompanyDetails = hideCompanyDetails;
	}

	public int getIndustryId() {
		return this.industryId;
	}

	public void setIndustryId(int industryId) {
		this.industryId = industryId;
	}

	public int getIndustrySectorId() {
		return this.industrySectorId;
	}

	public void setIndustrySectorId(int industrySectorId) {
		this.industrySectorId = industrySectorId;
	}

	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public int getMaxRepost() {
		return this.maxRepost;
	}

	public void setMaxRepost(int maxRepost) {
		this.maxRepost = maxRepost;
	}

	public byte getNegotiable() {
		return this.negotiable;
	}

	public void setNegotiable(byte negotiable) {
		this.negotiable = negotiable;
	}

	public int getParentCareerId() {
		return this.parentCareerId;
	}

	public void setParentCareerId(int parentCareerId) {
		this.parentCareerId = parentCareerId;
	}

	public int getPositionLevelId() {
		return this.positionLevelId;
	}

	public void setPositionLevelId(int positionLevelId) {
		this.positionLevelId = positionLevelId;
	}

	public String getRegionCityCode() {
		return this.regionCityCode;
	}

	public void setRegionCityCode(String regionCityCode) {
		this.regionCityCode = regionCityCode;
	}

	public byte getRepost() {
		return this.repost;
	}

	public void setRepost(byte repost) {
		this.repost = repost;
	}

	public int getRepostIntervalDays() {
		return this.repostIntervalDays;
	}

	public void setRepostIntervalDays(int repostIntervalDays) {
		this.repostIntervalDays = repostIntervalDays;
	}

	public int getRequireAssessmentId() {
		return this.requireAssessmentId;
	}

	public void setRequireAssessmentId(int requireAssessmentId) {
		this.requireAssessmentId = requireAssessmentId;
	}

	public String getRequireQuestion() {
		return this.requireQuestion;
	}

	public void setRequireQuestion(String requireQuestion) {
		this.requireQuestion = requireQuestion;
	}

	public String getSalaryCode() {
		return this.salaryCode;
	}

	public void setSalaryCode(String salaryCode) {
		this.salaryCode = salaryCode;
	}

	public String getSpecializationId() {
		return this.specializationId;
	}

	public void setSpecializationId(String specializationId) {
		this.specializationId = specializationId;
	}

	public String getYearOfExperienceCode() {
		return this.yearOfExperienceCode;
	}

	public void setYearOfExperienceCode(String yearOfExperienceCode) {
		this.yearOfExperienceCode = yearOfExperienceCode;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}