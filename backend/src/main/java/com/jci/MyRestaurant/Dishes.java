package com.jci.MyRestaurant;

public class Dishes {


	int dishId;
	String dishName;
	String dishDescription;
	String dishPrice;
	byte dishImage;
	String nature;

	int isDeleted=0;

	public int getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
	public Dishes(){}

	public int getDishId() {
		return dishId;
	}
	public void setDishId(int dishId) {
		this.dishId = dishId;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public String getDishDescription() {
		return dishDescription;
	}
	public void setDishDescription(String dishDescription) {
		this.dishDescription = dishDescription;
	}
	public String getDishPrice() {
		return dishPrice;
	}
	public void setDishPrice(String dishPrice) {
		this.dishPrice = dishPrice;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}

	public void setDishImage(byte dishImage) {
		this.dishImage = dishImage;
	}

	public Dishes(int dishId, String dishName, String dishDescription, String dishPrice, byte dishImage,
				  String nature, int isDeleted) {
		super();
		this.dishId = dishId;
		this.dishName = dishName;
		this.dishDescription = dishDescription;
		this.dishPrice = dishPrice;
		this.dishImage = dishImage;
		this.nature = nature;
		this.isDeleted=isDeleted;
	}

	public byte getDishImage() {
		return dishImage;
	}
}
