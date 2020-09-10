package com.qa.FoodFactory;

public class KFC implements Food {
	private String name = "KFC";
	@Override
	public String cookedFood() {
		return "We cook all our food on premises";
		
	}

	@Override
	public String prePreparedFood() {
		return "We do not sell pre-prepared food";
		
	}
	@Override
	public String toString(){
		return name +"\n" + cookedFood() + "\n" + prePreparedFood();
	}

}
