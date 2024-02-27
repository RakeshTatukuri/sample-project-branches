package com;

//interface
interface Shape1 {
	//String name = ""; variables not mandatory

	/* constructor is not used in interface class
	 * Shape(String name) { this.name=name; }
	 */
	/* methods not mandatory
	 * public static void moveto(int x, int y) {
		
		System.out.println("The value has been moved to " + "x = " + x + "and y = " + y);

	}*/

	// abstract method
	void draw();

	double area();
}

class Rectangle1 implements Shape1 {
	int length, width;

	Rectangle1(int length, int width, String name) {
		this.length = length;
		this.width = width;

	}

	@Override
	public void draw() {
		System.out.println("Rectangle has been drawn");

	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length * width;
	}
}

class Circle1 implements Shape1 {
	double pi = 3.14;
	int radius;

	Circle1(int radius, String name) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("circle has been drawn");

	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return pi * radius * radius;
	}
}

//main method
public class INTERFACE {

	public static void main(String[] args) {
		Shape1 rectangle = new Rectangle1(10, 1, "Rectangle");
		System.out.println("Area of rectangle " + rectangle.area());
		//Shape1.moveto(1, 2);
		Shape1 circle = new Circle1(1, "Circle");
		System.out.println("Area of circle " + circle.area());
		//Shape1.moveto(2, 2);
	}

}
