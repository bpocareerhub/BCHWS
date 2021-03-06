package bch.ws.interfaces;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
	
	public ResultSet getResultSet(String sql) {
		try {
			ResultSet rs = this.createStatement().executeQuery(sql);
			if(rs.next()) {
				return rs;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public Statement prepareStatement(String sql) throws SQLException {
		return this.getDatabase().getConnection().prepareStatement(sql);
	}

	private Statement createStatement() throws SQLException {
		return this.getDatabase().getConnection().createStatement();
	}
	
}
