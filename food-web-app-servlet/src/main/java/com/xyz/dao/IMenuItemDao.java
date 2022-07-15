package com.xyz.dao;

import java.sql.SQLException;
import java.util.List;

import com.xyz.model.MenuItem;

public interface IMenuItemDao {
	public MenuItem addItem(MenuItem item)throws SQLException;
	public boolean deleteItemById(int menuItemId) throws SQLException ;
	public MenuItem searchItemByName(String itemName)throws SQLException ;
	public List<MenuItem> getAllItems() throws SQLException ;

}
