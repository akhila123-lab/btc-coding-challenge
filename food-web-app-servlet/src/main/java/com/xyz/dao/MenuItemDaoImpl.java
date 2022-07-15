package com.xyz.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.xyz.model.MenuItem;
import com.xyz.util.DbConnectionUtil;

public class MenuItemDaoImpl implements IMenuItemDao{
	private Connection conn = null;
	private PreparedStatement psmt=null;
	private ResultSet queryResult=null;

	@Override
	public MenuItem addItem(MenuItem item) throws SQLException {
		conn = DbConnectionUtil.getConnection();
		psmt = conn.prepareStatement("insert into menu_db values(?,?,?,?,?)");
		psmt.setLong(1, item.getMenuItem());
		psmt.setString(2, item.getItemName());
		psmt.setString(3, item.getStatus());
		psmt.setDouble(4, item.getPrice());
		psmt.setString(5, item.getCateogery());
		int rowCount = psmt.executeUpdate();
		DbConnectionUtil.closeDbConnection();
		if(rowCount!=0) {
			return item;
		}
		return null;
	}

	@Override
	public boolean deleteItemById(int menuItemId) throws SQLException {
		conn = DbConnectionUtil.getConnection();
		psmt = conn.prepareStatement("delete from menu_db where menuItemId=?");
		psmt.setInt(1, menuItemId);
		boolean rowDeleted=false;
		  rowDeleted = psmt.executeUpdate() > 0;
		//int rowCount = psmt.executeUpdate();
		DbConnectionUtil.closeDbConnection();
			
			return rowDeleted;
//			conn = DbConnectionUtil.getConnection();
//			boolean rowDeleted=false;
//			try {
//				psmt = conn.prepareStatement("delete from emp_db where id=?");
//				psmt.setInt(1,employeeId);
//				  rowDeleted = psmt.executeUpdate() > 0;
//			
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			return rowDeleted;
	
	}

	@Override
	public MenuItem searchItemByName(String itemName) throws SQLException {
		conn = DbConnectionUtil.getConnection();
		psmt = conn.prepareStatement("select * from menu_db where itemName=?");
		psmt.setString(1, itemName);
		System.out.println("----------");
		queryResult = psmt.executeQuery();
//		MenuItem item=null;
		if(queryResult.next()) {
			MenuItem item=null;
//			 String title = resultSet.getString("title");
//	            String author = resultSet.getString("author");
//	            float price = resultSet.getFloat("price");
//	             
//	            book = new Book(id, title, author, price);
			
			//item.setMenuItem(queryResult.getLong(menuItemId));
//			item.setMenuItem(queryResult.getLong(1));
//			item.setItemName(queryResult.getString(itemName));
//			item.setStatus(queryResult.getString(3));
//			item.setPrice(queryResult.getDouble(4));
//			item.setCateogery(queryResult.getString(5));
//			System.out.println(item);
			long id=queryResult.getLong("menuItemId");
			String name=queryResult.getString("itemName");
			String status=queryResult.getString("status");
			double price=queryResult.getDouble("price");
			String cateogery=queryResult.getString("cateogery");
			item= new MenuItem(id, itemName, status, price, cateogery);
			System.out.println("dao items : "+item);
			
			return item;
		}
		return null;
	}

	@Override
	public List<MenuItem> getAllItems() throws SQLException {

		List<MenuItem> listMenu=new ArrayList<>();
		String sql = "select * from menu_db";
		conn = DbConnectionUtil.getConnection();
		Statement statement = conn.createStatement();
		 ResultSet resultSet = statement.executeQuery(sql);
		 while (resultSet.next()) {
	            int id = resultSet.getInt("menuItemId");
	            String name = resultSet.getString("itemName");         
	            String status = resultSet.getString("status");
	            double price =  resultSet.getDouble("price");
	            String cateogery = resultSet.getString("cateogery");
	             
	            MenuItem menuItem = new MenuItem(id, name, status, price,cateogery);
	            listMenu.add(menuItem);
	        }
		 return listMenu;
		
	}

}
