package com.xyz.service;

import java.sql.SQLException;

import java.util.List;

import com.xyz.dao.IMenuItemDao;
import com.xyz.dao.MenuItemDaoImpl;
import com.xyz.model.MenuItem;

public class MenuItemServiceImpl implements IMenuItemService{
	
	private IMenuItemDao dao;
	
	public MenuItemServiceImpl() {
		dao = new MenuItemDaoImpl();
	}

	@Override
	public MenuItem addItem(MenuItem item) throws SQLException {
		return dao.addItem(item);
	}

	@Override
	public boolean deleteItemById(int menuItemId) throws SQLException {
		
		return dao.deleteItemById(menuItemId);
	}

	@Override
	public MenuItem searchItemByName(String itemName) throws SQLException {
		
		return dao.searchItemByName(itemName);
	}

	@Override
	public List<MenuItem> getAllItems() throws SQLException {
		
		return dao.getAllItems();
	}




	
	
}
