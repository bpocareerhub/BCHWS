package bch.hb.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Transaction;

import bch.hb.mappings.User;
import bch.hb.mappings.UserWorkExperience;
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
		return super.updateRecord(obj);
	}

	@Override
	public boolean createRecord(Object obj) {
		User user = obj instanceof User ? (User) obj : null;
		return super.createRecord(user);
	}

	public boolean createRecordList(List<?> listObj) {
		return super.createRecord(listObj);
	}
	
	public boolean createWorkExperience(UserWorkExperience uwe) {
		return super.createRecord(uwe);
	}
	
	public boolean updateWorkExperience(UserWorkExperience uwe) {
		return super.updateRecord(uwe);
	}
	
	public boolean createWorkExperienceList(List<UserWorkExperience> listUwe) {
		return super.createRecord(listUwe);
	}
}
