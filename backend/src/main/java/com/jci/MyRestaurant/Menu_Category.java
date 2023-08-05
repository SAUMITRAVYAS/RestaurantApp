package com.jci.MyRestaurant;

public class Menu_Category {
	int menuId,categoryId,displayOrder;

	@Override
	public String toString() {
		return "Menu_Category [menuId=" + menuId + ", categoryId=" + categoryId + ", displayOrder=" + displayOrder
				+ "]";
	}

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(int displayOrder) {
		this.displayOrder = displayOrder;
	}
	
	
}
