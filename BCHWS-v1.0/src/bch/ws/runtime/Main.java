package bch.ws.runtime;

import bch.hb.dao.UsersDao;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UsersDao uDao = new UsersDao();
		uDao.retrieveAll();
	}

}
