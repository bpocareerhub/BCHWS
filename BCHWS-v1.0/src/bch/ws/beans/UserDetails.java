package bch.ws.beans;

import java.util.Date;

public class UserDetails {
	private long user_detail_id,user_id;
	private int willing_to_shift_schedules,willing_to_relocate,possess_passport,willing_to_work_overseas,willing_to_holidays_weekends,background_check;
	private int current_employment_status_id,expected_salary_currency_id,expected_salary,preferred_employment_type_id,second_preferred_employment_type_id;
	private int preferred_industry_id,preferred_industry_sector_id,preferred_secondary_industry_id,preferred_secondary_industry_sector_id,availability_id,years_of_experience_id,recent_position_level_id,highest_academic_id;
	private String resume_filename,languages,other_language,lang_spoken,lang_written,skills,trainings,achievements;
	private String preferred_work_location_region_city_id,preferred_work_location_region_city_ids;
	private Date resume_date_upload,resume_date_modified;
	
	
	public UserDetails() {
	
	}
	public UserDetails(long user_detail_id, long user_id,
			int willing_to_shift_schedules, int willing_to_relocate,
			int possess_passport, int willing_to_work_overseas,
			int willing_to_holidays_weekends, int background_check,
			int current_employment_status_id, int expected_salary_currency_id,
			int expected_salary, int preferred_employment_type_id,
			int second_preferred_employment_type_id, int preferred_industry_id,
			int preferred_industry_sector_id,
			int preferred_secondary_industry_id,
			int preferred_secondary_industry_sector_id, int availability_id,
			int years_of_experience_id, int recent_position_level_id,
			int highest_academic_id, String resume_filename, String languages,
			String other_language, String lang_spoken, String lang_written,
			String skills, String trainings, String achievements,
			String preferred_work_location_region_city_id,
			String preferred_work_location_region_city_ids,
			Date resume_date_upload, Date resume_date_modified) {
		this.user_detail_id = user_detail_id;
		this.user_id = user_id;
		this.willing_to_shift_schedules = willing_to_shift_schedules;
		this.willing_to_relocate = willing_to_relocate;
		this.possess_passport = possess_passport;
		this.willing_to_work_overseas = willing_to_work_overseas;
		this.willing_to_holidays_weekends = willing_to_holidays_weekends;
		this.background_check = background_check;
		this.current_employment_status_id = current_employment_status_id;
		this.expected_salary_currency_id = expected_salary_currency_id;
		this.expected_salary = expected_salary;
		this.preferred_employment_type_id = preferred_employment_type_id;
		this.second_preferred_employment_type_id = second_preferred_employment_type_id;
		this.preferred_industry_id = preferred_industry_id;
		this.preferred_industry_sector_id = preferred_industry_sector_id;
		this.preferred_secondary_industry_id = preferred_secondary_industry_id;
		this.preferred_secondary_industry_sector_id = preferred_secondary_industry_sector_id;
		this.availability_id = availability_id;
		this.years_of_experience_id = years_of_experience_id;
		this.recent_position_level_id = recent_position_level_id;
		this.highest_academic_id = highest_academic_id;
		this.resume_filename = resume_filename;
		this.languages = languages;
		this.other_language = other_language;
		this.lang_spoken = lang_spoken;
		this.lang_written = lang_written;
		this.skills = skills;
		this.trainings = trainings;
		this.achievements = achievements;
		this.preferred_work_location_region_city_id = preferred_work_location_region_city_id;
		this.preferred_work_location_region_city_ids = preferred_work_location_region_city_ids;
		this.resume_date_upload = resume_date_upload;
		this.resume_date_modified = resume_date_modified;
	}

	public long getUser_detail_id() {
		return user_detail_id;
	}
	public void setUser_detail_id(long user_detail_id) {
		this.user_detail_id = user_detail_id;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public int getWilling_to_shift_schedules() {
		return willing_to_shift_schedules;
	}
	public void setWilling_to_shift_schedules(int willing_to_shift_schedules) {
		this.willing_to_shift_schedules = willing_to_shift_schedules;
	}
	public int getWilling_to_relocate() {
		return willing_to_relocate;
	}
	public void setWilling_to_relocate(int willing_to_relocate) {
		this.willing_to_relocate = willing_to_relocate;
	}
	public int getPossess_passport() {
		return possess_passport;
	}
	public void setPossess_passport(int possess_passport) {
		this.possess_passport = possess_passport;
	}
	public int getWilling_to_work_overseas() {
		return willing_to_work_overseas;
	}
	public void setWilling_to_work_overseas(int willing_to_work_overseas) {
		this.willing_to_work_overseas = willing_to_work_overseas;
	}
	public int getWilling_to_holidays_weekends() {
		return willing_to_holidays_weekends;
	}
	public void setWilling_to_holidays_weekends(int willing_to_holidays_weekends) {
		this.willing_to_holidays_weekends = willing_to_holidays_weekends;
	}
	public int getBackground_check() {
		return background_check;
	}
	public void setBackground_check(int background_check) {
		this.background_check = background_check;
	}
	public int getCurrent_employment_status_id() {
		return current_employment_status_id;
	}
	public void setCurrent_employment_status_id(int current_employment_status_id) {
		this.current_employment_status_id = current_employment_status_id;
	}
	public int getExpected_salary_currency_id() {
		return expected_salary_currency_id;
	}
	public void setExpected_salary_currency_id(int expected_salary_currency_id) {
		this.expected_salary_currency_id = expected_salary_currency_id;
	}
	public int getExpected_salary() {
		return expected_salary;
	}
	public void setExpected_salary(int expected_salary) {
		this.expected_salary = expected_salary;
	}
	public int getPreferred_employment_type_id() {
		return preferred_employment_type_id;
	}
	public void setPreferred_employment_type_id(int preferred_employment_type_id) {
		this.preferred_employment_type_id = preferred_employment_type_id;
	}
	public int getSecond_preferred_employment_type_id() {
		return second_preferred_employment_type_id;
	}
	public void setSecond_preferred_employment_type_id(
			int second_preferred_employment_type_id) {
		this.second_preferred_employment_type_id = second_preferred_employment_type_id;
	}
	public int getPreferred_industry_id() {
		return preferred_industry_id;
	}
	public void setPreferred_industry_id(int preferred_industry_id) {
		this.preferred_industry_id = preferred_industry_id;
	}
	public int getPreferred_industry_sector_id() {
		return preferred_industry_sector_id;
	}
	public void setPreferred_industry_sector_id(int preferred_industry_sector_id) {
		this.preferred_industry_sector_id = preferred_industry_sector_id;
	}
	public int getPreferred_secondary_industry_id() {
		return preferred_secondary_industry_id;
	}
	public void setPreferred_secondary_industry_id(
			int preferred_secondary_industry_id) {
		this.preferred_secondary_industry_id = preferred_secondary_industry_id;
	}
	public int getPreferred_secondary_industry_sector_id() {
		return preferred_secondary_industry_sector_id;
	}
	public void setPreferred_secondary_industry_sector_id(
			int preferred_secondary_industry_sector_id) {
		this.preferred_secondary_industry_sector_id = preferred_secondary_industry_sector_id;
	}
	public int getAvailability_id() {
		return availability_id;
	}
	public void setAvailability_id(int availability_id) {
		this.availability_id = availability_id;
	}
	public int getYears_of_experience_id() {
		return years_of_experience_id;
	}
	public void setYears_of_experience_id(int years_of_experience_id) {
		this.years_of_experience_id = years_of_experience_id;
	}
	public int getRecent_position_level_id() {
		return recent_position_level_id;
	}
	public void setRecent_position_level_id(int recent_position_level_id) {
		this.recent_position_level_id = recent_position_level_id;
	}
	public int getHighest_academic_id() {
		return highest_academic_id;
	}
	public void setHighest_academic_id(int highest_academic_id) {
		this.highest_academic_id = highest_academic_id;
	}
	public String getResume_filename() {
		return resume_filename;
	}
	public void setResume_filename(String resume_filename) {
		this.resume_filename = resume_filename;
	}
	public String getLanguages() {
		return languages;
	}
	public void setLanguages(String languages) {
		this.languages = languages;
	}
	public String getOther_language() {
		return other_language;
	}
	public void setOther_language(String other_language) {
		this.other_language = other_language;
	}
	public String getLang_spoken() {
		return lang_spoken;
	}
	public void setLang_spoken(String lang_spoken) {
		this.lang_spoken = lang_spoken;
	}
	public String getLang_written() {
		return lang_written;
	}
	public void setLang_written(String lang_written) {
		this.lang_written = lang_written;
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
	public String getAchievements() {
		return achievements;
	}
	public void setAchievements(String achievements) {
		this.achievements = achievements;
	}
	public String getPreferred_work_location_region_city_id() {
		return preferred_work_location_region_city_id;
	}
	public void setPreferred_work_location_region_city_id(
			String preferred_work_location_region_city_id) {
		this.preferred_work_location_region_city_id = preferred_work_location_region_city_id;
	}
	public String getPreferred_work_location_region_city_ids() {
		return preferred_work_location_region_city_ids;
	}
	public void setPreferred_work_location_region_city_ids(
			String preferred_work_location_region_city_ids) {
		this.preferred_work_location_region_city_ids = preferred_work_location_region_city_ids;
	}
	public Date getResume_date_upload() {
		return resume_date_upload;
	}
	public void setResume_date_upload(Date resume_date_upload) {
		this.resume_date_upload = resume_date_upload;
	}
	public Date getResume_date_modified() {
		return resume_date_modified;
	}
	public void setResume_date_modified(Date resume_date_modified) {
		this.resume_date_modified = resume_date_modified;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ (int) (user_detail_id ^ (user_detail_id >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDetails other = (UserDetails) obj;
		if (user_detail_id != other.user_detail_id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "UserDetails [user_detail_id=" + user_detail_id + ", user_id="
				+ user_id + ", willing_to_shift_schedules="
				+ willing_to_shift_schedules + ", willing_to_relocate="
				+ willing_to_relocate + ", possess_passport="
				+ possess_passport + ", willing_to_work_overseas="
				+ willing_to_work_overseas + ", willing_to_holidays_weekends="
				+ willing_to_holidays_weekends + ", background_check="
				+ background_check + ", current_employment_status_id="
				+ current_employment_status_id
				+ ", expected_salary_currency_id="
				+ expected_salary_currency_id + ", expected_salary="
				+ expected_salary + ", preferred_employment_type_id="
				+ preferred_employment_type_id
				+ ", second_preferred_employment_type_id="
				+ second_preferred_employment_type_id
				+ ", preferred_industry_id=" + preferred_industry_id
				+ ", preferred_industry_sector_id="
				+ preferred_industry_sector_id
				+ ", preferred_secondary_industry_id="
				+ preferred_secondary_industry_id
				+ ", preferred_secondary_industry_sector_id="
				+ preferred_secondary_industry_sector_id + ", availability_id="
				+ availability_id + ", years_of_experience_id="
				+ years_of_experience_id + ", recent_position_level_id="
				+ recent_position_level_id + ", highest_academic_id="
				+ highest_academic_id + ", resume_filename=" + resume_filename
				+ ", languages=" + languages + ", other_language="
				+ other_language + ", lang_spoken=" + lang_spoken
				+ ", lang_written=" + lang_written + ", skills=" + skills
				+ ", trainings=" + trainings + ", achievements=" + achievements
				+ ", preferred_work_location_region_city_id="
				+ preferred_work_location_region_city_id
				+ ", preferred_work_location_region_city_ids="
				+ preferred_work_location_region_city_ids
				+ ", resume_date_upload=" + resume_date_upload
				+ ", resume_date_modified=" + resume_date_modified + "]";
	}
}
