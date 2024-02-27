package com;

import java.io.FileNotFoundException;

public class Exceptions {

	public static void main(String[] args) throws FileNotFoundException {

		try {
			int a = 10;
			int b = 0;
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
			// System.out.println(e.getStackTrace());
		}
		try {
			int[] num = { 1, 5, 9, 4, 5, 6, 8 };

			System.out.println(num[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
			// System.out.println(e.getStackTrace());

		}
		try {
			String stri = null;
			if (stri.equals("Rakesh"))
				System.out.println("same");
			else
				System.out.println("not same");
		} catch (NullPointerException e) {
			System.out.println(e.toString());
			// System.out.println(e.getStackTrace());
		}
		try {
			Object o = new Object();
			String s = (String) o;
			System.out.println(o);

		} catch (ClassCastException e) {
			System.out.println(e.toString());
			// System.out.println(e.getStackTrace());

		}
		try {
			Class.forName("No class exist");
		} catch (ClassNotFoundException e) {
			System.out.println(e.toString());
			// System.out.println(e.getStackTrace());
			// e.printStackTrace();

		}
	}

}
