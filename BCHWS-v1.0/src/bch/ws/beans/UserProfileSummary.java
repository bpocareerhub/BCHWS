package bch.ws.beans;

public class UserProfileSummary {
	public long user_id;
	public int current_employment_status_id,expected_salary_currency_id,expected_salary,preferred_employment_type_id,secondary_preferred_employment_type_id;
	public char preferred_work_location_region_city_id;
	public String preferred_work_location_region_city_ids;
	public int industry_id,industry_sector_id,secondary_industry_id,secondary_industry_sector_id,availability_id,years_of_experience_id,recent_position_level_id,highest_academic_id;
	
	public UserProfileSummary() {
	}
	
	public UserProfileSummary(long user_id, int current_employment_status_id,
			int expected_salary_currency_id, int expected_salary,
			int preferred_employment_type_id,
			int secondary_preferred_employment_type_id,
			char preferred_work_location_region_city_id,
			String preferred_work_location_region_city_ids, int industry_id,
			int industry_sector_id, int secondary_industry_id,
			int secondary_industry_sector_id, int availability_id,
			int years_of_experience_id, int recent_position_level_id,
			int highest_academic_id) {
		this.user_id = user_id;
		this.current_employment_status_id = current_employment_status_id;
		this.expected_salary_currency_id = expected_salary_currency_id;
		this.expected_salary = expected_salary;
		this.preferred_employment_type_id = preferred_employment_type_id;
		this.secondary_preferred_employment_type_id = secondary_preferred_employment_type_id;
		this.preferred_work_location_region_city_id = preferred_work_location_region_city_id;
		this.preferred_work_location_region_city_ids = preferred_work_location_region_city_ids;
		this.industry_id = industry_id;
		this.industry_sector_id = industry_sector_id;
		this.secondary_industry_id = secondary_industry_id;
		this.secondary_industry_sector_id = secondary_industry_sector_id;
		this.availability_id = availability_id;
		this.years_of_experience_id = years_of_experience_id;
		this.recent_position_level_id = recent_position_level_id;
		this.highest_academic_id = highest_academic_id;
	}
	
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
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
	public int getSecondary_preferred_employment_type_id() {
		return secondary_preferred_employment_type_id;
	}
	public void setSecondary_preferred_employment_type_id(
			int secondary_preferred_employment_type_id) {
		this.secondary_preferred_employment_type_id = secondary_preferred_employment_type_id;
	}
	public char getPreferred_work_location_region_city_id() {
		return preferred_work_location_region_city_id;
	}
	public void setPreferred_work_location_region_city_id(
			char preferred_work_location_region_city_id) {
		this.preferred_work_location_region_city_id = preferred_work_location_region_city_id;
	}
	public String getPreferred_work_location_region_city_ids() {
		return preferred_work_location_region_city_ids;
	}
	public void setPreferred_work_location_region_city_ids(
			String preferred_work_location_region_city_ids) {
		this.preferred_work_location_region_city_ids = preferred_work_location_region_city_ids;
	}
	public int getIndustry_id() {
		return industry_id;
	}
	public void setIndustry_id(int industry_id) {
		this.industry_id = industry_id;
	}
	public int getIndustry_sector_id() {
		return industry_sector_id;
	}
	public void setIndustry_sector_id(int industry_sector_id) {
		this.industry_sector_id = industry_sector_id;
	}
	public int getSecondary_industry_id() {
		return secondary_industry_id;
	}
	public void setSecondary_industry_id(int secondary_industry_id) {
		this.secondary_industry_id = secondary_industry_id;
	}
	public int getSecondary_industry_sector_id() {
		return secondary_industry_sector_id;
	}
	public void setSecondary_industry_sector_id(int secondary_industry_sector_id) {
		this.secondary_industry_sector_id = secondary_industry_sector_id;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (user_id ^ (user_id >>> 32));
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
		UserProfileSummary other = (UserProfileSummary) obj;
		if (user_id != other.user_id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "UserProfileSummary [user_id=" + user_id
				+ ", current_employment_status_id="
				+ current_employment_status_id
				+ ", expected_salary_currency_id="
				+ expected_salary_currency_id + ", expected_salary="
				+ expected_salary + ", preferred_employment_type_id="
				+ preferred_employment_type_id
				+ ", secondary_preferred_employment_type_id="
				+ secondary_preferred_employment_type_id
				+ ", preferred_work_location_region_city_id="
				+ preferred_work_location_region_city_id
				+ ", preferred_work_location_region_city_ids="
				+ preferred_work_location_region_city_ids + ", industry_id="
				+ industry_id + ", industry_sector_id=" + industry_sector_id
				+ ", secondary_industry_id=" + secondary_industry_id
				+ ", secondary_industry_sector_id="
				+ secondary_industry_sector_id + ", availability_id="
				+ availability_id + ", years_of_experience_id="
				+ years_of_experience_id + ", recent_position_level_id="
				+ recent_position_level_id + ", highest_academic_id="
				+ highest_academic_id + "]";
	}
	
}
