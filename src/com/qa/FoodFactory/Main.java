package com.qa.FoodFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FoodFactory test = new FoodFactory();
		Food KFC = test.getFood("KFC");
		System.out.println(KFC);

	}

}
