package com.xyz.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xyz.model.MenuItem;
import com.xyz.service.IMenuItemService;
import com.xyz.service.MenuItemServiceImpl;


@WebServlet("/")
public class MenuController extends HttpServlet{
	private IMenuItemService service;

	public void init(ServletConfig config) throws ServletException {
		service=new MenuItemServiceImpl();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
//				long id = Long.parseLong(request.getParameter("menuid"));
//		String name = request.getParameter("itemName");
//		String status =request.getParameter("items");
//		double price=Double.parseDouble(request.getParameter("price"));
//		String cateogery=request.getParameter("cateogery");
//		
//		
//		MenuItem item = new MenuItem(id, name, status, price, cateogery);
//		
//		MenuItem menu=null;
//		try {
//			System.out.println(item);
//			menu = service.addItem(item);
////			System.out.println("items are:"+menu);
//			request.setAttribute("menuItems", menu);
//			System.out.println(menu);
//			request.getRequestDispatcher("show-menu.jsp").forward(request, response);
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		}
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		switch (action) {
		case "/new":
			showNewForm(request, response);
			break;
		case "/delete":
			deleteUser(request, response);
			break;
		case "/list":
			try {
				listUser(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case "/name":
			try {
				searchByName(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				break;
		}
}
	private void searchByName(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		String name=request.getParameter("itemName");
		MenuItem item=service.searchItemByName(name);
		
		request.setAttribute("menuItemsName", item);
		RequestDispatcher dispatcher = request.getRequestDispatcher("show-list.jsp");
		dispatcher.forward(request, response);
		
	}
	private void listUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
//		List<User> listUser = userDAO.selectAllUsers();
//		request.setAttribute("listUser", listUser);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("user-list.jsp");
//		dispatcher.forward(request, response);
		List<MenuItem> menuItems = service.getAllItems();
		
		request.setAttribute("listItems", menuItems);
		RequestDispatcher dispatcher = request.getRequestDispatcher("show-list.jsp");
		dispatcher.forward(request, response);
	}
	private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		long id = Long.parseLong(request.getParameter("menuid"));
String name = request.getParameter("itemName");
String status =request.getParameter("items");
double price=Double.parseDouble(request.getParameter("price"));
String cateogery=request.getParameter("cateogery");


MenuItem item = new MenuItem(id, name, status, price, cateogery);

MenuItem menu=null;
try {
	System.out.println(item);
	menu = service.addItem(item);
//	System.out.println("items are:"+menu);
	request.setAttribute("menuItems", menu);
	System.out.println(menu);
	request.getRequestDispatcher("show-menu.jsp").forward(request, response);
} catch (SQLException e) {
	throw new RuntimeException(e);
}
		
		
	}
	private void deleteUser(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("menuid"));
	    boolean menu=false;
	try {
		menu = service.deleteItemById(id);
		System.out.println("");
		System.out.println("row deleted");
	} catch (SQLException e) {
		System.err.println(e.getMessage());
		
	}
	}
}
	
