package bch.hb.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;

import bch.hb.mappings.User;
import bch.ws.interfaces.HBDataAccessObject;

public class UsersDao extends HBDataAccessObject {
	
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
	
	public User retrieveById(long id) {
		String hql = "from User users where user_id = " + id;
		Query query = this.getSession().createQuery(hql);
		query.setMaxResults(1);

		return (User) query.uniqueResult();
	}
}
