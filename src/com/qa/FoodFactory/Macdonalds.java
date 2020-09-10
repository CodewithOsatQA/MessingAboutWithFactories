package com.qa.FoodFactory;

public class Macdonalds implements Food {
	
	private String name = "Macdonalds";

	@Override
	public String cookedFood() {
		return "None of our food is cooked on site";
		
	}

	@Override
	public String prePreparedFood() {
		return"All of our food is freshly prepared in a factory and delivered";
		
	}
	@Override
	public String toString() {
		return name +"\n" + cookedFood() + "\n" + prePreparedFood();
	}
	
	

}
