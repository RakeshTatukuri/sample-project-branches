package com;
//invoking overriden method from sub class
class grandparent// base class
{
	void show() {
		System.out.println("grandparent show()");
	}
}

class parent extends grandparent// inherited class
{
	@Override
	void show() {
		super.show();//when we call the parent class method in the overriding method using the super keyword
		System.out.println("parent show()");
	}
}


public class Overriddenmethod {

	public static void main(String[] args) {

		grandparent obj = new parent();
		obj.show();
	}

}
