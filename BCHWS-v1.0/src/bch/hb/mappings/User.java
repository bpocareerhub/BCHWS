package bch.hb.mappings;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Table(name="users")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	private int userId;

	@Column(name="activated")
	private boolean activated;

	@Column(name="activation_code")
	private String activationCode;

	@Column(name="active")
	private boolean active;

	@Column(name="address_city_code")
	private String addressCityCode;

	@Column(name="address_country_code")
	private String addressCountryCode;

	@Column(name="address_details")
	private String addressDetails;

	@Column(name="address_region_code")
	private String addressRegionCode;

	@Column(name="alternate_email")
	private String alternateEmail;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_activated")
	private Date dateActivated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created")
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_last_login")
	private Date dateLastLogin;

	@Temporal(TemporalType.DATE)
	@Column(name="date_of_birth")
	private Date dateOfBirth;

	@Column(name="email")
	private String email;

	@Column(name="firstname")
	private String firstname;

	@Column(name="flag")
	private boolean flag;

	@Column(name="gender_code")
	private String genderCode;

	@Column(name="lastname")
	private String lastname;

	@Column(name="marital_status_code")
	private String maritalStatusCode;

	@Column(name="middlename")
	private String middlename;

	@Column(name="mobile_number")
	private String mobileNumber;

	@Column(name="nationality_code")
	private String nationalityCode;

	@Column(name="password")
	private String password;

	@Column(name="phone_number")
	private String phoneNumber;

	@Column(name="profile_picture")
	private String profilePicture;

	@Column(name="registration_id")
	private int registrationId;

	@Column(name="source_id")
	private int sourceId;

	//bi-directional many-to-one association to AssessmentExam
	@OneToMany(mappedBy="user")
	private List<AssessmentExam> assessmentExams;

	//bi-directional many-to-one association to AssessmentExamsQa
	@OneToMany(mappedBy="user")
	private List<AssessmentExamsQa> assessmentExamsQas;

	//bi-directional many-to-one association to AssessmentUserAnswer
	@OneToMany(mappedBy="user")
	private List<AssessmentUserAnswer> assessmentUserAnswers;

	//bi-directional many-to-one association to Assessment
	@OneToMany(mappedBy="user")
	private List<Assessment> assessments;

	//bi-directional many-to-one association to Banner
	@OneToMany(mappedBy="user")
	private List<Banner> banners;

	//bi-directional many-to-one association to CareerPost
	@OneToMany(mappedBy="user")
	private List<CareerPost> careerPosts;

	//bi-directional many-to-one association to UserEducationalBackground
	@OneToMany(mappedBy="user")
	private List<UserEducationalBackground> userEducationalBackgrounds;

	//bi-directional many-to-one association to UserReference
	@OneToMany(mappedBy="user")
	private List<UserReference> userReferences;

	//bi-directional many-to-one association to UserTechnicalSkill
	@OneToMany(mappedBy="user")
	private List<UserTechnicalSkill> userTechnicalSkills;

	//bi-directional many-to-one association to UserWorkExperience
	@OneToMany(mappedBy="user")
	private List<UserWorkExperience> userWorkExperiences;

	//bi-directional many-to-one association to AccountType
	@ManyToOne
	@JoinColumn(name="account_type_id")
	private AccountType accountType;

	//bi-directional many-to-one association to Client
	@ManyToOne
	@JoinColumn(name="client_id")
	private Client client;

	//bi-directional many-to-one association to Group
	@ManyToOne
	@JoinColumn(name="group_id")
	private Group group;

	//bi-directional one-to-one association to UserDetail
	@OneToOne
	@JoinColumn(name="user_id", referencedColumnName="user_id")
	private UserDetail userDetail;

	public User() {
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public boolean isActivated() {
		return activated;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}

	public String getActivationCode() {
		return activationCode;
	}

	public void setActivationCode(String activationCode) {
		this.activationCode = activationCode;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getAddressCityCode() {
		return addressCityCode;
	}

	public void setAddressCityCode(String addressCityCode) {
		this.addressCityCode = addressCityCode;
	}

	public String getAddressCountryCode() {
		return addressCountryCode;
	}

	public void setAddressCountryCode(String addressCountryCode) {
		this.addressCountryCode = addressCountryCode;
	}

	public String getAddressDetails() {
		return addressDetails;
	}

	public void setAddressDetails(String addressDetails) {
		this.addressDetails = addressDetails;
	}

	public String getAddressRegionCode() {
		return addressRegionCode;
	}

	public void setAddressRegionCode(String addressRegionCode) {
		this.addressRegionCode = addressRegionCode;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}

	public Date getDateActivated() {
		return dateActivated;
	}

	public void setDateActivated(Date dateActivated) {
		this.dateActivated = dateActivated;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateLastLogin() {
		return dateLastLogin;
	}

	public void setDateLastLogin(Date dateLastLogin) {
		this.dateLastLogin = dateLastLogin;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getGenderCode() {
		return genderCode;
	}

	public void setGenderCode(String genderCode) {
		this.genderCode = genderCode;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMaritalStatusCode() {
		return maritalStatusCode;
	}

	public void setMaritalStatusCode(String maritalStatusCode) {
		this.maritalStatusCode = maritalStatusCode;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getNationalityCode() {
		return nationalityCode;
	}

	public void setNationalityCode(String nationalityCode) {
		this.nationalityCode = nationalityCode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public int getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}

	public int getSourceId() {
		return sourceId;
	}

	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}

	public List<AssessmentExam> getAssessmentExams() {
		return assessmentExams;
	}

	public void setAssessmentExams(List<AssessmentExam> assessmentExams) {
		this.assessmentExams = assessmentExams;
	}

	public List<AssessmentExamsQa> getAssessmentExamsQas() {
		return assessmentExamsQas;
	}

	public void setAssessmentExamsQas(List<AssessmentExamsQa> assessmentExamsQas) {
		this.assessmentExamsQas = assessmentExamsQas;
	}

	public List<AssessmentUserAnswer> getAssessmentUserAnswers() {
		return assessmentUserAnswers;
	}

	public void setAssessmentUserAnswers(
			List<AssessmentUserAnswer> assessmentUserAnswers) {
		this.assessmentUserAnswers = assessmentUserAnswers;
	}

	public List<Assessment> getAssessments() {
		return assessments;
	}

	public void setAssessments(List<Assessment> assessments) {
		this.assessments = assessments;
	}

	public List<Banner> getBanners() {
		return banners;
	}

	public void setBanners(List<Banner> banners) {
		this.banners = banners;
	}

	public List<CareerPost> getCareerPosts() {
		return careerPosts;
	}

	public void setCareerPosts(List<CareerPost> careerPosts) {
		this.careerPosts = careerPosts;
	}

	public List<UserEducationalBackground> getUserEducationalBackgrounds() {
		return userEducationalBackgrounds;
	}

	public void setUserEducationalBackgrounds(
			List<UserEducationalBackground> userEducationalBackgrounds) {
		this.userEducationalBackgrounds = userEducationalBackgrounds;
	}

	public List<UserReference> getUserReferences() {
		return userReferences;
	}

	public void setUserReferences(List<UserReference> userReferences) {
		this.userReferences = userReferences;
	}

	public List<UserTechnicalSkill> getUserTechnicalSkills() {
		return userTechnicalSkills;
	}

	public void setUserTechnicalSkills(List<UserTechnicalSkill> userTechnicalSkills) {
		this.userTechnicalSkills = userTechnicalSkills;
	}

	public List<UserWorkExperience> getUserWorkExperiences() {
		return userWorkExperiences;
	}

	public void setUserWorkExperiences(List<UserWorkExperience> userWorkExperiences) {
		this.userWorkExperiences = userWorkExperiences;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public UserDetail getUserDetail() {
		return userDetail;
	}

	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}

}