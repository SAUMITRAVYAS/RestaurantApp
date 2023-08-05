package com.jci.MyRestaurant;

public class Category_Dish {
	
	int categoryId,dishId;

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getDishId() {
		return dishId;
	}

	public void setDishId(int dishId) {
		this.dishId = dishId;
	}

	@Override
	public String toString() {
		return "Category_Dish [categoryId=" + categoryId + ", dishId=" + dishId + "]";
	}
	
	
}
