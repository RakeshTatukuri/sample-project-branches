package com;

public class Statickeywords {

	//static variables
	static int a=10;
	static  int b=20;
	static String name="Rakesh";
	
	
	//static methods
	static int value() {
		return a+b;
		
	}
	 static String name() {
		
		return name ;
		
	}
	
	public static void main(String[] args) {
		System.out.println("value of a " + a );
		System.out.println("value of b "+ b);
		System.out.println( name);
		
	}
	
}
