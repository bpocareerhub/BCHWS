package bch.ws.runtime;

import java.io.IOException;
import java.io.InputStreamReader;

import bch.ws.beans.Users;
import bch.ws.dao.UsersDao;
import bch.ws.models.Database;

public class Main {
	public static void main(String[] args) throws IOException {
		UsersDao uDao = new UsersDao();
		
		Users user = new Users();
		user.setUser_id(35);
		user.setEmail("ryan.bartolay@bpocareerhub.com");
		user.setPassword("hello");
		user.setGroup_id(5);
		System.out.println(uDao.updateRecord(user));
	}
}
