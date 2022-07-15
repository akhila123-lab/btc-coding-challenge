package com.xyz.model;

public class MenuItem {
	private long menuItem;
	private String itemName;
	private String status;
	private double price;
	private String cateogery;
	public MenuItem()
	{
		
	}
	public MenuItem(long menuItem, String itemName, String status, double price, String cateogery) {
		super();
		this.menuItem = menuItem;
		this.itemName = itemName;
		this.status = status;
		this.price = price;
		this.cateogery = cateogery;
	}
	public long getMenuItem() {
		return menuItem;
	}
	public void setMenuItem(long menuItem) {
		this.menuItem = menuItem;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCateogery() {
		return cateogery;
	}
	public void setCateogery(String cateogery) {
		this.cateogery = cateogery;
	}
	@Override
	public String toString() {
		return "MenuItem [menuItem=" + menuItem + ", itemName=" + itemName + ", status=" + status + ", price=" + price
				+ ", cateogery=" + cateogery + "]";
	}
	
	

}
