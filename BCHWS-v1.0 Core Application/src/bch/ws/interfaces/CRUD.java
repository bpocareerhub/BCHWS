package bch.ws.interfaces;

import java.util.List;

public interface CRUD {
	public List<?> retrieveAll();
	public Object retrieveById(long id);
	public boolean updateRecord(Object obj);
	public boolean createRecord(Object obj);
	
}
