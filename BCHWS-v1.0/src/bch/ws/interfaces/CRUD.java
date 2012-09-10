package bch.ws.interfaces;

import java.util.ArrayList;

public interface CRUD {
	public ArrayList<?> retrieveAll();
	public Object retrieveById(int id);
	public boolean updateRecord(Object obj);
	public boolean createRecord(Object obj);
}
