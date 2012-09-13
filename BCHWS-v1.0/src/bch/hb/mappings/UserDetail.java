package bch.hb.mappings;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the user_details database table.
 * 
 */
@Entity
@Table(name="user_details")
public class UserDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_detail_id")
	private int userDetailId;

	@Column(name="achievements")
	private String achievements;

	@Column(name="availability_id")
	private int availabilityId;

	@Column(name="background_check")
	private boolean backgroundCheck;

	@Column(name="current_employment_status_id")
	private int currentEmploymentStatusId;

	@Column(name="expected_salary")
	private int expectedSalary;

	@Column(name="expected_salary_currency_id")
	private int expectedSalaryCurrencyId;

	@Column(name="highest_academic_id")
	private int highestAcademicId;

	@Column(name="lang_spoken")
	private String langSpoken;

	@Column(name="lang_written")
	private String langWritten;

	@Column(name="languages")
	private String languages;

	@Column(name="other_language")
	private String otherLanguage;

	@Column(name="possess_passport")
	private boolean possessPassport;

	@Column(name="preferred_employment_type_id")
	private int preferredEmploymentTypeId;

	@Column(name="preferred_industry_id")
	private int preferredIndustryId;

	@Column(name="preferred_industry_sector_id")
	private int preferredIndustrySectorId;

	@Column(name="preferred_secondary_industry_id")
	private int preferredSecondaryIndustryId;

	@Column(name="preferred_secondary_industry_sector_id")
	private int preferredSecondaryIndustrySectorId;

	@Column(name="preferred_work_location_region_city_id")
	private String preferredWorkLocationRegionCityId;

	@Column(name="preferred_work_location_region_city_ids")
	private String preferredWorkLocationRegionCityIds;

	@Column(name="recent_position_level_id")
	private int recentPositionLevelId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="resume_date_modified")
	private Date resumeDateModified;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="resume_date_upload")
	private Date resumeDateUpload;

	@Column(name="resume_filename")
	private String resumeFilename;

	@Column(name="second_preferred_employment_type_id")
	private int secondPreferredEmploymentTypeId;

	@Column(name="skills")
	private String skills;

	@Column(name="trainings")
	private String trainings;

	@Column(name="willing_to_holidays_weekends")
	private boolean willingToHolidaysWeekends;

	@Column(name="willing_to_relocate")
	private boolean willingToRelocate;

	@Column(name="willing_to_shift_schedules")
	private boolean willingToShiftSchedules;

	@Column(name="willing_to_work_overseas")
	private boolean willingToWorkOverseas;

	@Column(name="years_of_experience_id")
	private int yearsOfExperienceId;

	//bi-directional one-to-one association to User
	@OneToOne(mappedBy="userDetail")
	private User user;

	public UserDetail() {
	}

	public int getUserDetailId() {
		return userDetailId;
	}

	public void setUserDetailId(int userDetailId) {
		this.userDetailId = userDetailId;
	}

	public String getAchievements() {
		return achievements;
	}

	public void setAchievements(String achievements) {
		this.achievements = achievements;
	}

	public int getAvailabilityId() {
		return availabilityId;
	}

	public void setAvailabilityId(int availabilityId) {
		this.availabilityId = availabilityId;
	}

	public boolean isBackgroundCheck() {
		return backgroundCheck;
	}

	public void setBackgroundCheck(boolean backgroundCheck) {
		this.backgroundCheck = backgroundCheck;
	}

	public int getCurrentEmploymentStatusId() {
		return currentEmploymentStatusId;
	}

	public void setCurrentEmploymentStatusId(int currentEmploymentStatusId) {
		this.currentEmploymentStatusId = currentEmploymentStatusId;
	}

	public int getExpectedSalary() {
		return expectedSalary;
	}

	public void setExpectedSalary(int expectedSalary) {
		this.expectedSalary = expectedSalary;
	}

	public int getExpectedSalaryCurrencyId() {
		return expectedSalaryCurrencyId;
	}

	public void setExpectedSalaryCurrencyId(int expectedSalaryCurrencyId) {
		this.expectedSalaryCurrencyId = expectedSalaryCurrencyId;
	}

	public int getHighestAcademicId() {
		return highestAcademicId;
	}

	public void setHighestAcademicId(int highestAcademicId) {
		this.highestAcademicId = highestAcademicId;
	}

	public String getLangSpoken() {
		return langSpoken;
	}

	public void setLangSpoken(String langSpoken) {
		this.langSpoken = langSpoken;
	}

	public String getLangWritten() {
		return langWritten;
	}

	public void setLangWritten(String langWritten) {
		this.langWritten = langWritten;
	}

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String languages) {
		this.languages = languages;
	}

	public String getOtherLanguage() {
		return otherLanguage;
	}

	public void setOtherLanguage(String otherLanguage) {
		this.otherLanguage = otherLanguage;
	}

	public boolean isPossessPassport() {
		return possessPassport;
	}

	public void setPossessPassport(boolean possessPassport) {
		this.possessPassport = possessPassport;
	}

	public int getPreferredEmploymentTypeId() {
		return preferredEmploymentTypeId;
	}

	public void setPreferredEmploymentTypeId(int preferredEmploymentTypeId) {
		this.preferredEmploymentTypeId = preferredEmploymentTypeId;
	}

	public int getPreferredIndustryId() {
		return preferredIndustryId;
	}

	public void setPreferredIndustryId(int preferredIndustryId) {
		this.preferredIndustryId = preferredIndustryId;
	}

	public int getPreferredIndustrySectorId() {
		return preferredIndustrySectorId;
	}

	public void setPreferredIndustrySectorId(int preferredIndustrySectorId) {
		this.preferredIndustrySectorId = preferredIndustrySectorId;
	}

	public int getPreferredSecondaryIndustryId() {
		return preferredSecondaryIndustryId;
	}

	public void setPreferredSecondaryIndustryId(int preferredSecondaryIndustryId) {
		this.preferredSecondaryIndustryId = preferredSecondaryIndustryId;
	}

	public int getPreferredSecondaryIndustrySectorId() {
		return preferredSecondaryIndustrySectorId;
	}

	public void setPreferredSecondaryIndustrySectorId(
			int preferredSecondaryIndustrySectorId) {
		this.preferredSecondaryIndustrySectorId = preferredSecondaryIndustrySectorId;
	}

	public String getPreferredWorkLocationRegionCityId() {
		return preferredWorkLocationRegionCityId;
	}

	public void setPreferredWorkLocationRegionCityId(
			String preferredWorkLocationRegionCityId) {
		this.preferredWorkLocationRegionCityId = preferredWorkLocationRegionCityId;
	}

	public String getPreferredWorkLocationRegionCityIds() {
		return preferredWorkLocationRegionCityIds;
	}

	public void setPreferredWorkLocationRegionCityIds(
			String preferredWorkLocationRegionCityIds) {
		this.preferredWorkLocationRegionCityIds = preferredWorkLocationRegionCityIds;
	}

	public int getRecentPositionLevelId() {
		return recentPositionLevelId;
	}

	public void setRecentPositionLevelId(int recentPositionLevelId) {
		this.recentPositionLevelId = recentPositionLevelId;
	}

	public Date getResumeDateModified() {
		return resumeDateModified;
	}

	public void setResumeDateModified(Date resumeDateModified) {
		this.resumeDateModified = resumeDateModified;
	}

	public Date getResumeDateUpload() {
		return resumeDateUpload;
	}

	public void setResumeDateUpload(Date resumeDateUpload) {
		this.resumeDateUpload = resumeDateUpload;
	}

	public String getResumeFilename() {
		return resumeFilename;
	}

	public void setResumeFilename(String resumeFilename) {
		this.resumeFilename = resumeFilename;
	}

	public int getSecondPreferredEmploymentTypeId() {
		return secondPreferredEmploymentTypeId;
	}

	public void setSecondPreferredEmploymentTypeId(
			int secondPreferredEmploymentTypeId) {
		this.secondPreferredEmploymentTypeId = secondPreferredEmploymentTypeId;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getTrainings() {
		return trainings;
	}

	public void setTrainings(String trainings) {
		this.trainings = trainings;
	}

	public boolean isWillingToHolidaysWeekends() {
		return willingToHolidaysWeekends;
	}

	public void setWillingToHolidaysWeekends(boolean willingToHolidaysWeekends) {
		this.willingToHolidaysWeekends = willingToHolidaysWeekends;
	}

	public boolean isWillingToRelocate() {
		return willingToRelocate;
	}

	public void setWillingToRelocate(boolean willingToRelocate) {
		this.willingToRelocate = willingToRelocate;
	}

	public boolean isWillingToShiftSchedules() {
		return willingToShiftSchedules;
	}

	public void setWillingToShiftSchedules(boolean willingToShiftSchedules) {
		this.willingToShiftSchedules = willingToShiftSchedules;
	}

	public boolean isWillingToWorkOverseas() {
		return willingToWorkOverseas;
	}

	public void setWillingToWorkOverseas(boolean willingToWorkOverseas) {
		this.willingToWorkOverseas = willingToWorkOverseas;
	}

	public int getYearsOfExperienceId() {
		return yearsOfExperienceId;
	}

	public void setYearsOfExperienceId(int yearsOfExperienceId) {
		this.yearsOfExperienceId = yearsOfExperienceId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}