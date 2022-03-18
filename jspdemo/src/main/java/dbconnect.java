

	
	 import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	public class dbconnect {
		protected static Connection initializeDatabase() throws SQLException,ClassNotFoundException {
			String dbDriver="com.mysql.cj.jdbc.Driver";
			String dbURL="jdbc:mySql:://127.0.0.1:3306/";
			String dbName="m9_mumbai";
			String dbUserName="root";
			String dbPassword="Amit@001";
			Class.forName(dbDriver);
			Connection obj=DriverManager.getConnection(dbURL+dbDriver+dbName+dbUserName+dbPassword);
			
			return obj;
		}

	}


