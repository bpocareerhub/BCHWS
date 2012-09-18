package bch.ws.test.cases;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

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
		User user = new User();
		assertTrue(csDao.createRecord(user));
	}

	@Override
	@Test
	public void testUpdateRecordNotSuccess() {
		assertFalse(csDao.createRecord(null));
	}

	@Test
	public void testCreateWorkExperienceSuccess() {
		User user = (User) this.csDao.getSession().get(User.class, new Long(1));
		System.out.println(user.toString());
		List<UserWorkExperience> uwes = new ArrayList<UserWorkExperience>();
		UserWorkExperience uwe = new UserWorkExperience();
		
		uwes.add(uwe);
		user.setUserWorkExperiences(uwes);
		assertTrue(csDao.createWorkExperience(user));
	}
	
	@Test
	public void testCreateWorkExperienceNotSuccess() {
		User user = new User();
		user.setUserId(1);
		user.setUserWorkExperiences(null);
		assertFalse(csDao.createWorkExperience(user));
	}
}
