package bch.ws.beans;

public class Users {
	private long user_id;
	private int group_id;
	private String email, password;
	
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
