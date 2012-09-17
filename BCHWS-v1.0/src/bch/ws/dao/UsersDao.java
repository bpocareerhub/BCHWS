
package bch.ws.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bch.ws.beans.Users;
import bch.ws.interfaces.CRUD;
import bch.ws.interfaces.DataAccessObject;

public class UsersDao extends DataAccessObject implements CRUD {

	@Override
	public List<?> retrieveAll() {
		ArrayList<Users> users = new ArrayList<Users>();
		
			String sql = "select * from users";
			ResultSet rs = this.getResultSet(sql);
			
			try {
				while(rs.next()) {
					Users user = new Users();
					user.setUser_id(rs.getLong("user_id"));
					user.setGroup_id(rs.getInt("group_id"));
					user.setEmail(rs.getString("email"));
					user.setPassword(rs.getString("password"));
					users.add(user);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return users;
	}

	@Override
	public Users retrieveById(long id) {
		Users user = null;
		
		try {
			String sql = "select * from users where user_id = " + id;
			Statement statement = this.getDatabase().getConnection().createStatement();
			ResultSet rs = statement.executeQuery(sql);
			
			if(rs.next()) {
				user = new Users();
				user.setUser_id(rs.getLong("user_id"));
				user.setGroup_id(rs.getInt("group_id"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
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
			String sql = "update users set group_id = ?, email = ?, password = ? where user_id = ?";
			PreparedStatement ps = (PreparedStatement) this.getDatabase().getConnection().prepareStatement(sql);
			ps.setInt(1, user.getGroup_id());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPassword());
			ps.setLong(4, user.getUser_id());
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
}
