package bch.ws.beans;

import java.util.Date;

public class UserReferences {
	private long reference_id;
	private long user_id;
	private String firstname,lastname,position_title,company_name,relationship,email,phone_number,mobile_number,skype_id;
	private Date date_created,date_modified;
	private int active,flag;
	
	
	public UserReferences() {
	}
	
	public UserReferences(long reference_id, long user_id, String firstname,
			String lastname, String position_title, String company_name,
			String relationship, String email, String phone_number,
			String mobile_number, String skype_id, Date date_created,
			Date date_modified, int active, int flag) {
		this.reference_id = reference_id;
		this.user_id = user_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.position_title = position_title;
		this.company_name = company_name;
		this.relationship = relationship;
		this.email = email;
		this.phone_number = phone_number;
		this.mobile_number = mobile_number;
		this.skype_id = skype_id;
		this.date_created = date_created;
		this.date_modified = date_modified;
		this.active = active;
		this.flag = flag;
	}

	public long getReference_id() {
		return reference_id;
	}
	public void setReference_id(long reference_id) {
		this.reference_id = reference_id;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPosition_title() {
		return position_title;
	}
	public void setPosition_title(String position_title) {
		this.position_title = position_title;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getSkype_id() {
		return skype_id;
	}
	public void setSkype_id(String skype_id) {
		this.skype_id = skype_id;
	}
	public Date getDate_created() {
		return date_created;
	}
	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}
	public Date getDate_modified() {
		return date_modified;
	}
	public void setDate_modified(Date date_modified) {
		this.date_modified = date_modified;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (reference_id ^ (reference_id >>> 32));
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
		UserReferences other = (UserReferences) obj;
		if (reference_id != other.reference_id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "UserReferences [reference_id=" + reference_id + ", user_id="
				+ user_id + ", firstname=" + firstname + ", lastname="
				+ lastname + ", position_title=" + position_title
				+ ", company_name=" + company_name + ", relationship="
				+ relationship + ", email=" + email + ", phone_number="
				+ phone_number + ", mobile_number=" + mobile_number
				+ ", skype_id=" + skype_id + ", date_created=" + date_created
				+ ", date_modified=" + date_modified + ", active=" + active
				+ ", flag=" + flag + "]";
	}
}
