package tema.phones.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import tema.helpers.DBHelper;
import tema.phones.pojo.Phone;

public class PhonesDAO {
	public static Phone getById(int id) throws ClassNotFoundException, SQLException {
		Connection conn = DBHelper.getConnection();
		String query = "select * from phone where id=?";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setInt(1,id);
		Phone phone = null;
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			int id1 = rs.getInt("id");
			String name = rs.getString("name");
			int yearReleased = rs.getInt("year_released");
			String software = rs.getString("software");
			phone = new Phone(id1,name,yearReleased,software);
		}
		DBHelper.closeConnection();
		return phone;
	}
	public static ArrayList<Phone> getAll() throws ClassNotFoundException, SQLException{
		Connection conn = DBHelper.getConnection();
		String query = "Select * from phone";
		PreparedStatement ps = conn.prepareStatement(query);
		ArrayList<Phone> phones = new ArrayList<Phone>();
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			int id1 = rs.getInt("id");
			String name = rs.getString("name");
			int yearReleased = rs.getInt("year_released");
			String software = rs.getString("software");
			Phone phone = new Phone(id1,name,yearReleased,software);
			phones.add(phone);
		}
		DBHelper.closeConnection();
		return phones;
	}
}
