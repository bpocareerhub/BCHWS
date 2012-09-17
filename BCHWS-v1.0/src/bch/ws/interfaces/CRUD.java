package bch.ws.interfaces;

import java.util.List;

import bch.hb.mappings.User;

public interface CRUD {
	public List<?> retrieveAll();
	public Object retrieveById(long id);
	public boolean updateRecord(Object obj);
	public boolean createRecord(Object obj);
	
}
