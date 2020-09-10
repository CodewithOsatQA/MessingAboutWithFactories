package com.qa.FoodFactory;

public class Asda implements Food{
	
	private String name = "ASDA";

	@Override
	public String cookedFood() {
		return "We cook food on premises";
		
	}

	@Override
	public String prePreparedFood() {
		return "We have preprepared food onsale";
		
	}

	@Override
	public String toString() {
		return name +"\n" + cookedFood() + "\n" + prePreparedFood();
	}
	
	

}
