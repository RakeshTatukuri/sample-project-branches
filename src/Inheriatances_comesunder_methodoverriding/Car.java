package Inheriatances_comesunder_methodoverriding;

public class Car extends Vehicle {

	public void price()//method overriding 
	{
		System.out.println("car...price:1L");
	}
	//*******************
	public void start()
	{
		System.out.println("car..start()");
	}
	public void refule()
	{
		System.out.println("car..refule()");
	}
	public void stop()
	{
		System.out.println("car..stop()");
	}
}
