package com.mycompany.myweb.dto;

public class Food {
	private String image;
	private String foodMain;
	private String title;
	private String price;
	private String content;
	
	public Food(String image, String foodMain, String title, String price, String content) {
		this.image = image;
		this.foodMain = foodMain;
		this.title = title;
		this.price = price;
		this.content = content;
	}
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getFoodMain() {
		return foodMain;
	}
	public void setFoodMain(String foodMain) {
		this.foodMain = foodMain;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
}
