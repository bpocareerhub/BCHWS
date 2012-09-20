package bch.ws.beans;

import java.util.Date;

public class Users {
	private long user_id;
	private int group_id,client_id,account_type_id,registration_id,activated,source_id,active,flag;
	private String email,password,activation_code,alternate_email,firstname,middlename,lastname;
	private String profile_picture,phone_number,mobile_number,address_details;
	private char gender_code,nationality_code,address_city_code,address_region_code,address_country_code,marital_status_code;
	private Date date_created,date_last_login,date_activated,date_of_birth;
	
	public Users() {
		
	}
	public Users(long user_id) {
		super();
		this.user_id = user_id;
	}
	public Users(long user_id, int group_id, String email) {
		this.user_id = user_id;
		this.group_id = group_id;
		this.email = email;
	}
	public Users(long user_id, int group_id, String email, String password) {
		this.user_id = user_id;
		this.group_id = group_id;
		this.email = email;
		this.password = password;
	}
	
	public Users(long user_id, int group_id, int client_id,
			int account_type_id, int registration_id, int activated,
			int source_id, int active, int flag, String email, String password,
			String activation_code, String alternate_email, String firstname,
			String middlename, String lastname, String profile_picture,
			String phone_number, String mobile_number, String address_details,
			char gender_code, char nationality_code, char address_city_code,
			char address_region_code, char address_country_code,
			char marital_status_code, Date date_created, Date date_last_login,
			Date date_activated, Date date_of_birth) {
		this.user_id = user_id;
		this.group_id = group_id;
		this.client_id = client_id;
		this.account_type_id = account_type_id;
		this.registration_id = registration_id;
		this.activated = activated;
		this.source_id = source_id;
		this.active = active;
		this.flag = flag;
		this.email = email;
		this.password = password;
		this.activation_code = activation_code;
		this.alternate_email = alternate_email;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.profile_picture = profile_picture;
		this.phone_number = phone_number;
		this.mobile_number = mobile_number;
		this.address_details = address_details;
		this.gender_code = gender_code;
		this.nationality_code = nationality_code;
		this.address_city_code = address_city_code;
		this.address_region_code = address_region_code;
		this.address_country_code = address_country_code;
		this.marital_status_code = marital_status_code;
		this.date_created = date_created;
		this.date_last_login = date_last_login;
		this.date_activated = date_activated;
		this.date_of_birth = date_of_birth;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public int getGroup_id() {
		return group_id;
	}
	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAccount_type_id() {
		return account_type_id;
	}
	public void setAccount_type_id(int account_type_id) {
		this.account_type_id = account_type_id;
	}
	public String getAlternate_email() {
		return alternate_email;
	}
	public void setAlternate_email(String alternate_email) {
		this.alternate_email = alternate_email;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress_details() {
		return address_details;
	}
	public void setAddress_details(String address_details) {
		this.address_details = address_details;
	}
	public Date getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public String getProfile_picture() {
		return profile_picture;
	}
	public void setProfile_picture(String profile_picture) {
		this.profile_picture = profile_picture;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}
	public char getGender_code() {
		return gender_code;
	}
	public void setGender_code(char gender_code) {
		this.gender_code = gender_code;
	}
	public char getNationality_code() {
		return nationality_code;
	}
	public void setNationality_code(char nationality_code) {
		this.nationality_code = nationality_code;
	}
	public char getAddress_city_code() {
		return address_city_code;
	}
	public void setAddress_city_code(char address_city_code) {
		this.address_city_code = address_city_code;
	}
	public char getAddress_region_code() {
		return address_region_code;
	}
	public void setAddress_region_code(char address_region_code) {
		this.address_region_code = address_region_code;
	}
	public char getAddress_country_code() {
		return address_country_code;
	}
	public void setAddress_country_code(char address_country_code) {
		this.address_country_code = address_country_code;
	}
	public char getMarital_status_code() {
		return marital_status_code;
	}
	public void setMarital_status_code(char marital_status_code) {
		this.marital_status_code = marital_status_code;
	}
	public int getSource_id() {
		return source_id;
	}
	public void setSource_id(int source_id) {
		this.source_id = source_id;
	}
	public int getRegistration_id() {
		return registration_id;
	}
	public void setRegistration_id(int registration_id) {
		this.registration_id = registration_id;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public int getActivated() {
		return activated;
	}
	public int getClient_id() {
		return client_id;
	}
	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}
	public void setActivated(int activated) {
		this.activated = activated;
	}
	public String getActivation_code() {
		return activation_code;
	}
	public void setActivation_code(String activation_code) {
		this.activation_code = activation_code;
	}
	public Date getDate_created() {
		return date_created;
	}
	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}
	public Date getDate_last_login() {
		return date_last_login;
	}
	public void setDate_last_login(Date date_last_login) {
		this.date_last_login = date_last_login;
	}
	public Date getDate_activated() {
		return date_activated;
	}
	public void setDate_activated(Date date_activated) {
		this.date_activated = date_activated;
	}
	public boolean isAdministrator(int group_id) {
		return (group_id == 1) ? true : false;
	}
	public boolean isCareerSeeker(int group_id) {
		return (group_id == 2) ? true : false;
	}
	public boolean isClient(int group_id) {
		return (group_id == 3) ? true : false;
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
		Users other = (Users) obj;
		if (user_id != other.user_id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Users [user_id=" + user_id + ", group_id=" + group_id
				+ ", client_id=" + client_id + ", account_type_id="
				+ account_type_id + ", registration_id=" + registration_id
				+ ", activated=" + activated + ", source_id=" + source_id
				+ ", active=" + active + ", flag=" + flag + ", email=" + email
				+ ", password=" + password + ", activation_code="
				+ activation_code + ", alternate_email=" + alternate_email
				+ ", firstname=" + firstname + ", middlename=" + middlename
				+ ", lastname=" + lastname + ", profile_picture="
				+ profile_picture + ", phone_number=" + phone_number
				+ ", mobile_number=" + mobile_number + ", address_details="
				+ address_details + ", gender_code=" + gender_code
				+ ", nationality_code=" + nationality_code
				+ ", address_city_code=" + address_city_code
				+ ", address_region_code=" + address_region_code
				+ ", address_country_code=" + address_country_code
				+ ", marital_status_code=" + marital_status_code
				+ ", date_created=" + date_created + ", date_last_login="
				+ date_last_login + ", date_activated=" + date_activated
				+ ", date_of_birth=" + date_of_birth + "]";
	}
}
