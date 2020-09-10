package com.qa;

public class ShapeFactoryDemonstration {
	
	static ShapeFactory shapeFactory = new ShapeFactory();
	
	public static void main (String [] args) {
		
		Shape Shape1 = shapeFactory.getShape("circle");
		Shape Shape2 = shapeFactory.getShape("Rectangle");
		Shape Shape3 = shapeFactory.getShape("Square");
		Shape1.draw();
		Shape2.draw();
		Shape3.draw();
		
		/*
		 * Shape Shape4 = new Rectangle(); Shape4.draw();
		 */
		
	}

}
