package bch.ws.test.cases;

import static org.junit.Assert.*;

import org.junit.Test;

import bch.hb.dao.UsersDao;

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

}
