package tema.orders.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import tema.helpers.DBHelper;
import tema.orders.pojo.Order;

public class OrderDAO {
	public static Order getById(int id) throws ClassNotFoundException, SQLException {
		Connection conn = DBHelper.getConnection();
		String query = "select * from the_order where id=?";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setInt(1,id);
		Order o = null;
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			int id1 = rs.getInt("id");
			String destinationFrom = rs.getString("destination_from");
			String destinationTo = rs.getString("destionation_to");
			int weight = rs.getInt("weight");
			o = new Order(id1,destinationFrom,destinationTo,weight);
		}
		DBHelper.closeConnection();
		return o;
	}
	public static ArrayList<Order> getAll() throws SQLException, ClassNotFoundException{
		Connection conn = DBHelper.getConnection();
		String query = "select * from the_order";
		PreparedStatement ps = conn.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		ArrayList<Order> orders = new ArrayList<>();
	        while(rs.next()) {
	        	int id1 = rs.getInt("id");
				String destinationFrom = rs.getString("destination_from");
				String destinationTo = rs.getString("destionation_to");
				int weight = rs.getInt("weight");
				Order order = new Order(id1,destinationFrom,destinationTo,weight);
	            orders.add(order);
	        }
	        DBHelper.closeConnection();
		return orders;
	}
}
