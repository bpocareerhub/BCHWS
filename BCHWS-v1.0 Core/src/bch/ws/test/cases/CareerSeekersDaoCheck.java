package bch.ws.test.cases;

import static org.junit.Assert.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import bch.core.bom.Calendar;
import bch.hb.dao.CareerSeekersDao;
import bch.hb.mappings.User;
import bch.hb.mappings.UserWorkExperience;
import bch.ws.test.interfaces.CRUDDAOCheck;

public class CareerSeekersDaoCheck implements CRUDDAOCheck {

	private CareerSeekersDao csDao;
	
	public CareerSeekersDaoCheck() {
		csDao = new CareerSeekersDao();
	}

	@Override
	@Test
	public void testRetrieveAllNotNull() {
		assertNotNull(csDao.retrieveAll());
	}

	@Override
	@Test
	public void testRetrieveByIdNotNull() {
		assertNotNull(csDao.retrieveById(1));
	}

	@Override
	@Test
	public void testRetrieveByIdNull() {
		assertNull(csDao.retrieveById(69));
	}

	@Override
	@Test
	public void testCreateRecordSuccess() {
		User user = new User();
		user.setEmail("ryan.bartolay@bpocareerhub.com");
		user.setPassword("123456");
		user.setGroupId(1);
		user.setAccountTypeId(1);
		user.setActivationCode("abcdef");
		user.setDateCreated(new Date());
		assertTrue(csDao.createRecord(user));
	}

	@Override
	@Test
	public void testCreateRecordNotSuccess() { 
		assertFalse(csDao.createRecord(null));
	}

	@Override
	@Test
	public void testUpdateRecordSuccess() {
		User user = (User) this.csDao.getSession().get(User.class, new Long(1));
		user.setEmail("absol");
		assertTrue(csDao.updateRecord(user));
	}

	@Override
	@Test
	public void testUpdateRecordNotSuccess() {
		assertFalse(csDao.createRecord(null));
	}

	@Test
	public void testCreateWorkExperienceSuccess() {
		User user = (User) this.csDao.getSession().get(User.class, new Long(2));
		UserWorkExperience uwe = new UserWorkExperience();
		uwe.setDateCreated(new Date());
		uwe.setUser(user);
		uwe.setCompanyName("BPO CareerHub");
		assertTrue(csDao.createWorkExperience(uwe));
	}
	
	@Test
	public void testCreateWorkExperienceNotSuccess() {
		assertFalse(csDao.createWorkExperience(null));
	}
	
	@Test
	public void testUpdateWorkExperienceSuccess() {
		UserWorkExperience uwe = (UserWorkExperience) this.csDao.getSession().get(UserWorkExperience.class, 2);
		uwe.setCompanyName("TDS");
		assertTrue(this.csDao.updateRecord(uwe));
	}
	
	@Test
	public void testUpdateWorkExperieceNotSuccess() {
		assertFalse(this.csDao.updateRecord(null));
	}
}
