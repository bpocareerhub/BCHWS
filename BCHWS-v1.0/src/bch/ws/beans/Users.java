package bch.ws.beans;

public class Users {
	private long user_id;
	private int group_id,parent_user_id,account_type_id,source_id;
	private String email, password,alternate_email,firstname,middlename,lastname,address_details;
	private String date_of_birth,profile_picture,phone_number,mobile_number;
	private char gender_code,nationality_code,address_city_code,address_region_code,address_country_code,marital_status_code;
	
	
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
	
	public Users(long user_id, int group_id, int parent_user_id,
			int account_type_id, int source_id, String email, String password,
			String alternate_email, String firstname, String middlename,
			String lastname, String address_details, String date_of_birth,
			String profile_picture, String phone_number, String mobile_number,
			char gender_code, char nationality_code, char address_city_code,
			char address_region_code, char address_country_code,
			char marital_status_code) {
		this.user_id = user_id;
		this.group_id = group_id;
		this.parent_user_id = parent_user_id;
		this.account_type_id = account_type_id;
		this.source_id = source_id;
		this.email = email;
		this.password = password;
		this.alternate_email = alternate_email;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.address_details = address_details;
		this.date_of_birth = date_of_birth;
		this.profile_picture = profile_picture;
		this.phone_number = phone_number;
		this.mobile_number = mobile_number;
		this.gender_code = gender_code;
		this.nationality_code = nationality_code;
		this.address_city_code = address_city_code;
		this.address_region_code = address_region_code;
		this.address_country_code = address_country_code;
		this.marital_status_code = marital_status_code;
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
	public int getParent_user_id() {
		return parent_user_id;
	}
	public void setParent_user_id(int parent_user_id) {
		this.parent_user_id = parent_user_id;
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
	public String getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth) {
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
				+ ", email=" + email + ", password=" + password + "]";
	}
}
