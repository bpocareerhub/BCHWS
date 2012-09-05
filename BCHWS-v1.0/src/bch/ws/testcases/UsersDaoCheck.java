package bch.ws.testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import bch.ws.beans.Users;
import bch.ws.dao.UsersDao;

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
		assertNotNull(uDao.retrieveById(69));
	}
	
	@Test
	public void testRetrieveByIdNull() {
		assertNull(uDao.retrieveById(28));
	}
	
	@Test
	public void testRecordUpdated() {
		Users user = new Users();
		user.setUser_id(35);
		user.setEmail("ryan.bartolay@bpocareerhub.com");
		user.setPassword("hello");
		user.setGroup_id(5);
		assertTrue(uDao.updateRecord(user));
	}
	@Test
	public void testRecordNotUpdated() {
		Users user = new Users();
		user.setUser_id(1);
		user.setEmail("ryan.bartolay@bpocareerhub.com");
		user.setPassword("hello");
		user.setGroup_id(5);
		assertFalse(uDao.updateRecord(user));
	}
}
