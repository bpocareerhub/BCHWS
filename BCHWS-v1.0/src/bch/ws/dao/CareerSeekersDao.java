package bch.ws.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import bch.ws.beans.UserDetails;
import bch.ws.interfaces.CRUD;
import bch.ws.interfaces.DataAccessObject;

public class CareerSeekersDao extends DataAccessObject implements CRUD {

	@Override
	public ArrayList<?> retrieveAll() {
		return null;
	}

	@Override
	public UserDetails retrieveById(int id) {
		UserDetails userDetail = new UserDetails();
		
		try {
			String sql = "select * from user_details where user_id = " +  id;
			Statement statement = this.getDatabase().getConnection().createStatement();
			ResultSet rs = statement.executeQuery(sql);
			
			if(rs.next()) {
				userDetail.setUser_id(rs.getLong("user_id"));
				userDetail.setWilling_to_shift_schedules(rs.getInt("willing_to_shift_schedules"));
				userDetail.setWilling_to_relocate(rs.getInt("willing_to_relocate"));
				userDetail.setPossess_passport(rs.getInt("possess_passport"));
				userDetail.setWilling_to_work_overseas(rs.getInt("willing_to_work_overseas"));
				userDetail.setWilling_to_holidays_weekends(rs.getInt("willing_to_holidays_weekends"));
				userDetail.setBackground_check(rs.getInt("background_check"));
				userDetail.setResume_filename(rs.getString("resume_filename"));
				userDetail.setResume_date_upload(rs.getDate("resume_date_upload"));
				userDetail.setResume_date_modified(rs.getDate("resume_date_modified"));
				userDetail.setLanguages(rs.getString("languages"));
				userDetail.setOther_language(rs.getString("other_language"));
				userDetail.setLang_spoken(rs.getString("lang_spoken"));
				userDetail.setLang_written(rs.getString("lang_written"));
				userDetail.setSkills(rs.getString("skills"));
				userDetail.setTrainings(rs.getString("trainings"));
				userDetail.setAchievements(rs.getString("achievements"));
				userDetail.setCurrent_employment_status_id(rs.getInt("current_employment_status_id"));
				userDetail.setExpected_salary_currency_id(rs.getInt("expected_salary_currency_id"));
				userDetail.setExpected_salary(rs.getInt("expected_salary"));
				userDetail.setPreferred_employment_type_id(rs.getInt("preferred_employment_type_id"));
				userDetail.setSecond_preferred_employment_type_id(rs.getInt("second_preferred_employment_type_id"));
				userDetail.setPreferred_work_location_region_city_id(rs.getString("preferred_work_location_region_city_id"));
				userDetail.setPreferred_work_location_region_city_ids(rs.getString("preferred_work_location_region_city_ids"));
				userDetail.setPreferred_industry_id(rs.getInt("preferred_industry_id"));
				userDetail.setPreferred_industry_sector_id(rs.getInt("preferred_industry_sector_id"));
				userDetail.setPreferred_secondary_industry_id(rs.getInt("preferred_secondary_industry_id"));
				userDetail.setPreferred_secondary_industry_sector_id(rs.getInt("preferred_secondary_industry_sector_id"));
				userDetail.setAvailability_id(rs.getInt("availability_id"));
				userDetail.setYears_of_experience_id(rs.getInt("years_of_experience_id"));
				userDetail.setRecent_position_level_id(rs.getInt("recent_position_level_id"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return userDetail;
	}

	@Override
	public boolean updateRecord(Object obj) {
		
		return false;
	}

	@Override
	public boolean createRecord(Object obj) {
		
		return false;
	}
	
}
