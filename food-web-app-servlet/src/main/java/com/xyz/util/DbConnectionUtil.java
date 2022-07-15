package com.xyz.util;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectionUtil {

	static Connection conn;
	
	public static Connection getConnection() {
		
		String url = "jdbc:mysql://localhost:3306/btc";
		String user = "root";
		String password = "rootAdmin";
		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			System.out.println("class is loaded");
		conn = DriverManager.getConnection(url, user, password);
		System.out.println("Connection Successful");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void closeDbConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}