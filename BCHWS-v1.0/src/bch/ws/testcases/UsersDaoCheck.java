package bch.ws.testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import bch.hb.dao.UsersDao;
import bch.hb.mappings.User;

public class UsersDaoCheck {
	private UsersDao uDao;

	public UsersDaoCheck() {
		uDao = new UsersDao();
	}
	@Test
	public void testRetrieveAllNotNull() {
		assertNotNull(uDao.retrieveAll());
	}

	@Test
	public void testRetrieveByIdNotNull() {
		assertNotNull(uDao.retrieveById(1));
	}

	@Test
	public void testRetrieveByIdNull() {
		assertNull(uDao.retrieveById(28));
	}

	@Test
	public void testRecordUpdated() {		
		User user = (User) this.uDao.getSession().get(User.class, new Long(1));
		user.setEmail("ryan.bartolay@bpocareerhub.com");
		user.setPassword("hello");
		user.setGroupId(5);
		assertTrue(uDao.updateRecord(user));
	}
	@Test
	public void testRecordNotUpdated() {
		User user = (User) this.uDao.getSession().get(User.class, new Long(11));
		if(user != null) {
			user.setEmail("ryan.bartolay@bpocareerhub.com");
			user.setPassword("hello");
			user.setGroupId(5);
		}
		assertFalse(uDao.updateRecord(user));
	}
}
