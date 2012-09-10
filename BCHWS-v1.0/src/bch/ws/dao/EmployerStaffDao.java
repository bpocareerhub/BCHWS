package bch.ws.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bch.ws.beans.Users;
import bch.ws.interfaces.CRUD;
import bch.ws.interfaces.DataAccessObject;


public class EmployerStaffDao extends DataAccessObject implements CRUD {

	@Override
	public ArrayList<?> retrieveAll() {
		// TODO Auto-generated method stub
		ArrayList<Users> employerStaff = new ArrayList<Users>();
		
		String sql = "select * from users where groud_id=3";
		ResultSet rs = this.getResultSet(sql);
		
		try  {
			while(rs.next()) {
				Users user = new Users();
				
			}
		} catch (SQLException e) {
			
		}
		
		return employerStaff;
	}

	@Override
	public Object retrieveById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateRecord(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean createRecord(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}


}
