package com.xyz.service;

import java.sql.SQLException;
import java.util.List;

import com.xyz.model.MenuItem;

 public interface IMenuItemService {
	 

	public MenuItem addItem(MenuItem item)throws SQLException;
	public boolean deleteItemById(int menuItemId) throws SQLException ;
	public MenuItem searchItemByName(String itemName)throws SQLException ;
	public List<MenuItem> getAllItems() throws SQLException ;
//   public Employee saveEmployee(Employee employee) throws SQLException ;
//	
//	public Employee findEmployee(int employeeId) throws SQLException ;
//	
//	public List<Employee> getAllEmployees() throws SQLException ;
//	
//	public boolean deleteEmployeeById(int employeeId) throws SQLException ;
}
