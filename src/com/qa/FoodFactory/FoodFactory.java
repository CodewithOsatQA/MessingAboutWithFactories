package com.qa.FoodFactory;

public class FoodFactory {
	
	public Food getFood(String name) {
		if(name.equalsIgnoreCase("KFC")) return new KFC();
		else if (name.equalsIgnoreCase("ASDA")) return new Asda();
		else if (name.equalsIgnoreCase("MACDONALDS")) return new Macdonalds();
		return null;
		}
		
	}


