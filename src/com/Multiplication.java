package com;

import java.util.*;

public class Multiplication {

	public static void main(String[] args) {

		int a, b, multiplication;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter first number: ");
		a = sc.nextInt();
		System.out.print("enter second value: ");
		b = sc.nextInt();
		multiplication = a * b;
		System.out.println("multiplication of two int numbers are: " + multiplication);
	}

}
