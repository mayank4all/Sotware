package com.mayank.item;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;


public class DAO {

	private Connection createConnection() throws ClassNotFoundException, SQLException {
		ResourceBundle rb = ResourceBundle.getBundle("dbconfig");
		Class.forName(rb.getString("drivername"));
		Connection connection = DriverManager.getConnection(rb.getString("dburl"),rb.getString("userid"),rb.getString("password"));
		return connection;
	}
	
	public boolean isAdded(ItemDTO itemDTO) {
		Connection con = null;
		PreparedStatement pstmt =null;
		Integer change;
		String sql = "insert into item (S_NO,Item_Name,Item_Price,CGST,SGST,Manufacturer,HSN_No)"
				+ "values(?,?,?,?,?,?,?)";
		
		try {
			con =createConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, String.valueOf(itemDTO.getsNo()));
			pstmt.setString(2, itemDTO.getItemName());
			pstmt.setString(3, itemDTO.getItemPrice());
			pstmt.setString(4, String.valueOf(itemDTO.getCGST()));
			pstmt.setString(5, String.valueOf(itemDTO.getSGST()));
			pstmt.setString(6, itemDTO.getManufacturer());
			pstmt.setString(7, String.valueOf(itemDTO.gethsnNo()));
			
			change = pstmt.executeUpdate();
			while(change != 0) {
				return true;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}
}