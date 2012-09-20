package bch.ws.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

	private static Database database = null;
	private Connection connection; 
	
	private Database() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.setConnection(DriverManager.getConnection("jdbc:mysql://localhost:3306/bchv2", "root", ""));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Database getInstance() {
		if(database == null) {
			database = new Database();
		}
		return database;
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
}
