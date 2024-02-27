package dataabstraction_using_abstractclass;


public abstract class Abstractclassdemo {

	/**
	 * abstract class contains implemented and abstract method
	 * needs child class to implement abstract method
	 * for abstract class we cant create object
	 * using abstract class partial abstraction is possible
	 *
	 */

	//implemented method
	public void accept()
	{
		System.out.println("accept() implemented method ");
	}
	//non-implemented (abstract)
	public abstract void show();
	
	public static void main(String[] args) {
		//cannot instantiante the type abstract class demo
		//Abstractclassdemo a=new Abstractclassdemo();
		
	}
	
}
