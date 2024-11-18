package tema.helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBHelper {
	public static Connection conn;
	public static Connection getConnection() throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		if(conn==null || conn.isClosed())
		{
			Properties connectionProps = new Properties();
			connectionProps.put("user", "root");
			connectionProps.put("password", "");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java",connectionProps);
		}
		return conn;
	}
	public static void closeConnection() throws SQLException
	{
		if(conn!=null && !conn.isClosed())
		{
			conn.close();
		}
	}
}
