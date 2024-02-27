package com;

import java.util.*;

public class Subtraction {

	public static void main(String[] args) {

		int a, b, subtract;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter first number: ");
		a = sc.nextInt();
		System.out.print("enter second number: ");
		b = sc.nextInt();
		subtract = a - b;
		System.out.println("subtraction of two int numbers are: " + subtract );

	}

}
