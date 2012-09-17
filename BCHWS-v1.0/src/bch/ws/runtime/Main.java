package bch.ws.runtime;

import bch.hb.dao.UsersDao;
import bch.hb.mappings.User;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double d = 2.0;
		
		UsersDao uDao = new UsersDao();
		User user = (User) uDao.getSession().get(User.class, new Long(11));
		
		System.out.println(uDao.retrieveAll());
		System.out.println(uDao.retrieveById(2));
	}

}
