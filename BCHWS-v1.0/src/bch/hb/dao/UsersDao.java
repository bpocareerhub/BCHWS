package bch.hb.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Transaction;

import bch.hb.mappings.User;
import bch.ws.interfaces.CRUD;
import bch.ws.interfaces.HBDataAccessObject;

public class UsersDao extends HBDataAccessObject implements CRUD {

	@Override
	public List<User> retrieveAll() {

		List<User> users = new ArrayList<User>();
		String hql = "from User users";
		Query query = this.getSession().createQuery(hql);
		query.setComment("All Users + " + hql);

		for(Iterator<?> it = query.iterate(); it.hasNext();) {
			User user = (User) it.next();
			users.add(user);			
		}

		return users;
	}

	@Override
	public User retrieveById(long id) {
		String hql = "from User users where user_id = " + id;
		Query query = this.getSession().createQuery(hql);
		query.setMaxResults(1);

		return (User) query.uniqueResult();
	}

	@Override
	public boolean updateRecord(Object obj) {
		boolean success = false;
		User u = (User) obj;
		
		if(u != null) {
			try {
				Transaction transaction = this.getSession().beginTransaction();
				this.getSession().update(u);
				transaction.commit();
				success = true;
			} catch (Exception ex) {
				ex.printStackTrace();			
			}
		}
		return success;
	}

	@Override
	public boolean createRecord(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

}
