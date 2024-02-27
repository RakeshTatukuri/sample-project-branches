package com;
//static methods cannot be overriden(method overriding vs method hiding)
class parent1{
	//static method in base class which will be hidden in ssubclass
	static void m1() {
		System.out.println("from parent "+ " static m1()");
	}
	//non static method which will be overriden in derived class
	void m2() {
		System.out.println("from parent " + "non static(instance) m2()");
	}
}
class child extends parent1{
	static void m1() //these method hides m1() in parent
	{
		System.out.println("from child child m1()");
	}
	//this method overrides m2() in parent
	@Override public void m2() {
		System.out.println("from child "+ " non static (instance) m2() ");
	}
}
public class Methodoverridingvsmethodhiding {

	public static void main(String[] args) {
parent1 obj=new child();
obj.m1();
obj.m2();

		
	}

}
