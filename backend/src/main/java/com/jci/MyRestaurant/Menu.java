package com.jci.MyRestaurant;

public class Menu {
	int menuId;
	String menuName;
	String menuDesc;
	String menuImage;
	
	public Menu() {}
	
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getMenuDesc() {
		return menuDesc;
	}
	public void setMenuDesc(String menuDesc) {
		this.menuDesc = menuDesc;
	}
	public String getMenuImage() {
		return menuImage;
	}
	public void setMenuImage(String menuImage) {
		this.menuImage = menuImage;
	}
	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", menuName=" + menuName + ", menuDesc=" + menuDesc + ", menuImage="
				+ menuImage + "]";
	}
	
	public Menu(int menuId, String menuName, String menuDesc, String menuImage) {
		super();
		this.menuId = menuId;
		this.menuName = menuName;
		this.menuDesc = menuDesc;
		this.menuImage = menuImage;
	}
	
	
}
