package com;

abstract class Shape {

	String objectname = "";// variables
    
	Shape(String name)// constructor
	{
		this.objectname = name;

	}

	public void moveto(int x, int y) // non abstract method
	{
		System.out.println(this.objectname + " " + " has been moved to " + "x = " + x + "and y = " + y );
	}
    //abstract methods
	public abstract double area();

	public abstract void draw();
}

class Rectangle extends Shape {

	int length, width;

	Rectangle(int length, int width, String name) // constructor
	{
		super(name);//super keyword
       
		//this keyword
		this.length = length;
		this.width = width;
	}

	 public void draw() {
		System.out.println("rectangle has been drawn");
	}

	public double area() {
		return (double) (length * width);
	}
}

class Circle extends Shape {

	double pi = 3.14;
	int radius;

	Circle(int radius, String name) {
		super(name);
		this.radius = radius;

	}

	public void draw() {
		System.out.println("circle is drawn");
	}

	public double area() {
		return (double) pi * radius * radius;
	}
}

//main class
public class ABSTRACT_METHOD {

	public static void main(String[] args) {

		// creating the object of rectangle class and using shape class reference
		Shape rect = new Rectangle(10, 10, "Rectangle");
		System.out.println("area of rectangle " + rect.area());
		rect.moveto(1, 2);
		Shape cir = new Circle(10, "Circle");
		System.out.println("area of circle " + cir.area());
		cir.moveto(2, 4);
	    

	}

}
