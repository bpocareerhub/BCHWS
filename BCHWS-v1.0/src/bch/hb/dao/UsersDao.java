package bch.hb.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;

import bch.hb.mappings.User;
import bch.ws.interfaces.CRUD;
import bch.ws.interfaces.HBDataAccessObject;

public class UsersDao extends HBDataAccessObject implements CRUD {

	@Override
	public List<User> retrieveAll() {
		
		String sql = "from User users";
		Query query = this.getSession().createQuery(sql);
		
		for(Iterator it = query.iterate(); it.hasNext();) {
			User user = (User) it.next();
			System.out.println(user.toString());
		}
		
		return null;
	}

	@Override
	public User retrieveById(int id) {
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
