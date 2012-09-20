package bch.ws.beans;

import java.util.Date;

public class UserProfileDetails {
	private long user_id;
	private int willing_to_shifting_schedules,willing_to_relocate,possess_passport,willing_to_work_overseas,willing_to_holidays_weekends,background_check;
	private String resume_filename,languages,other_language;
	private Date resume_date_upload,resume_date_modified;
	private String lang_spoken,lang_written,skills,trainings,achievements;
	
	
	public UserProfileDetails() {
	}
	
	public UserProfileDetails(long user_id, int willing_to_shifting_schedules,
			int willing_to_relocate, int possess_passport,
			int willing_to_work_overseas, int willing_to_holidays_weekends,
			int background_check, String resume_filename, String languages,
			String other_language, Date resume_date_upload,
			Date resume_date_modified, String lang_spoken, String lang_written,
			String skills, String trainings, String achievements) {
		this.user_id = user_id;
		this.willing_to_shifting_schedules = willing_to_shifting_schedules;
		this.willing_to_relocate = willing_to_relocate;
		this.possess_passport = possess_passport;
		this.willing_to_work_overseas = willing_to_work_overseas;
		this.willing_to_holidays_weekends = willing_to_holidays_weekends;
		this.background_check = background_check;
		this.resume_filename = resume_filename;
		this.languages = languages;
		this.other_language = other_language;
		this.resume_date_upload = resume_date_upload;
		this.resume_date_modified = resume_date_modified;
		this.lang_spoken = lang_spoken;
		this.lang_written = lang_written;
		this.skills = skills;
		this.trainings = trainings;
		this.achievements = achievements;
	}

	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public int getWilling_to_shifting_schedules() {
		return willing_to_shifting_schedules;
	}
	public void setWilling_to_shifting_schedules(int willing_to_shifting_schedules) {
		this.willing_to_shifting_schedules = willing_to_shifting_schedules;
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
		UserProfileDetails other = (UserProfileDetails) obj;
		if (user_id != other.user_id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserProfileDetails [user_id=" + user_id
				+ ", willing_to_shifting_schedules="
				+ willing_to_shifting_schedules + ", willing_to_relocate="
				+ willing_to_relocate + ", possess_passport="
				+ possess_passport + ", willing_to_work_overseas="
				+ willing_to_work_overseas + ", willing_to_holidays_weekends="
				+ willing_to_holidays_weekends + ", background_check="
				+ background_check + ", resume_filename=" + resume_filename
				+ ", languages=" + languages + ", other_language="
				+ other_language + ", resume_date_upload=" + resume_date_upload
				+ ", resume_date_modified=" + resume_date_modified
				+ ", lang_spoken=" + lang_spoken + ", lang_written="
				+ lang_written + ", skills=" + skills + ", trainings="
				+ trainings + ", achievements=" + achievements + "]";
	}
}
