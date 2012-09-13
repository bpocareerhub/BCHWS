package bch.ws.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import bch.ws.beans.Users;
import bch.ws.interfaces.CRUD;
import bch.ws.interfaces.DataAccessObject;


public class EmployerStaffDao extends DataAccessObject implements CRUD {

	@Override
	public List<?> retrieveAll() {
		// TODO Auto-generated method stub
		ArrayList<Users> employerStaff = new ArrayList<Users>();
		
		String sql = "select * from users where group_id=3";
		ResultSet rs = this.getResultSet(sql);
		
		try  {
			while(rs.next()) {
				Users user = new Users();
				user.setUser_id(rs.getLong("user_id"));
				user.setGroup_id(rs.getInt("group_id"));
				user.setEmail(rs.getString("email"));
				employerStaff.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return employerStaff;
	}

	@Override
	public Object retrieveById(int id) {
		Users user = null;
		
		try {
			String sql = "Select u.user_id,u.group_id,u.parent_user_id,u.account_type_id,u.email,u.password,up.source_id,up.firstname, up.middlename, up.lastname, up.alternate_email, unix_timestamp(u.date_created) as date_created, up.profile_picture,";
			       sql += " unix_timestamp(up.date_of_birth) as date_of_birth, up.date_modified, up.gender_code, up.nationality_code, up.phone_number, up.mobile_number, up.address_details, up.address_city_code, up.address_region_code, up.address_country_code, up.marital_status_code";
				   sql += " FROM `user_profile` AS up";
				   sql += " INNER JOIN `users` AS u ON up.user_id = u.user_id"; 
				   sql += " WHERE u.user_id=" + id;
			ResultSet  rs = this.getResultSet(sql);
			
			if(rs != null) {
				user = new Users();
				user.setUser_id(rs.getLong("user_id"));
				user.setFirstname(rs.getString("firstname"));
				user.setMiddlename(rs.getString("middlename"));
				user.setLastname(rs.getString("lastname"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
			  
		return user;
	}

	@Override
	public boolean updateRecord(Object obj) {
		boolean success = false;
		try {
			Users user = (Users) obj;
			String sql = "Update user_profile SET firstname=?,lastname=?,phone_number=?,mobile_number=?,alternate_email=? where user_id=?";
			PreparedStatement ps = (PreparedStatement) this.getDatabase().getConnection().prepareStatement(sql);
			ps.setString(1, user.getFirstname());
			ps.setString(2, user.getLastname());
			ps.setString(3, user.getPhone_number());
			ps.setString(4, user.getMobile_number());
			ps.setString(5, user.getAlternate_email());
			ps.setLong(6, user.getUser_id());
			int updated = ps.executeUpdate();
				if(updated > 0) {
					success = true;
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return success;
	}

	@Override
	public boolean createRecord(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	public ArrayList<Users> retrieveAllPurchasedProfileByStaffId(int staffId) {
		
		ArrayList<Users> purchasedProfiles = new ArrayList<Users>();
		
		String sql = "select up.user_id, if(epp.purchase_id is not null, 1, 0) as purchased, ups.industry_sector_id, ups.years_of_experience_id,";
			sql += " up.lastname, up.firstname, up.middlename, ups.expected_salary_currency_id, ups.expected_salary,";
			sql += " unix_timestamp(up.date_of_birth) as date_of_birth, educ.academic_id, upd.resume_filename, if(cap.application_id is not null, 1, 0) as applied";
			sql += " from user_profile as up";
			sql += " inner join employer_purchased_profiles as epp on up.user_id = epp.profile_user_id";
			sql += " left join user_profile_summary as ups on up.user_id = ups.user_id";
			sql += " left join user_profile_detail upd on up.user_id = upd.user_id";
			sql += " left join career_applications as cap  on cap.career_id=up.user_id";
			sql += " left join user_educational_backgrounds as educ on educ.user_id = ups.user_id";
			sql += " WHERE epp.purchased_by_user_id=" + staffId + " AND up.user_id!=0 GROUP BY up.user_id";		
		ResultSet  rs = this.getResultSet(sql);
				
		try  {
			while(rs.next()) {
				Users user = new Users();
				user.setUser_id(rs.getLong("user_id"));
				user.setFirstname(rs.getString("firstname"));
				user.setMiddlename(rs.getString("middlename"));
				user.setLastname(rs.getString("lastname"));
				purchasedProfiles.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

		return purchasedProfiles;	
	}
	
	public boolean uploadProfilePicture(Object obj) {
		
		boolean  success = false;
		try {
			Users user = (Users) obj;
			String sql = "Update user_profile SET profile_picture=? where user_id=?";
			PreparedStatement ps = (PreparedStatement) this.getDatabase().getConnection().prepareStatement(sql);
			ps.setString(1, user.getProfile_picture());
			ps.setLong(2, user.getUser_id());
			int updated = ps.executeUpdate();
				if(updated > 0) {
					success = true;
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  success;
	}
	
}
