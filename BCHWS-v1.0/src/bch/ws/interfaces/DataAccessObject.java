package bch.ws.interfaces;

import bch.ws.models.Database;

public abstract class DataAccessObject {

	private Database database;
	
	public DataAccessObject() {
		this.setDatabase(Database.getInstance());
	}

	public Database getDatabase() {
		return database;
	}

	public void setDatabase(Database database) {
		this.database = database;
	}
}
