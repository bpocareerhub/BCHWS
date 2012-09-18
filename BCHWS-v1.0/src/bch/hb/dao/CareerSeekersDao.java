package bch.hb.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Transaction;

import bch.hb.mappings.User;
import bch.ws.interfaces.CRUD;

public class CareerSeekersDao extends UsersDao implements CRUD {

	@Override
	public List<User> retrieveAll() {
		List<User> users = new ArrayList<User>();
		String hql = "from User users where group_id = 2";
		Query query = this.getSession().createQuery(hql);

		for(Iterator<?> it = query.iterate(); it.hasNext();) {
			User user = (User) it.next();
			users.add(user);			
		}

		return users;
	}

	@Override
	public User retrieveById(long id) {
		return super.retrieveById(id);
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

	public boolean createWorkExperience(User user) {
		boolean success = false;
		try {
			Transaction transaction = this.getSession().beginTransaction();
			this.getSession().save(user);
			transaction.commit();
			success = true;
		} catch(HibernateException hex) {
			hex.printStackTrace();
		}
		return success;
	}
}
