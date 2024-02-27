package Inheriatances_comesunder_methodoverriding;

//single level inheritance
public class BMW extends Car{

	@Override
	public void price()//method overriding
	{
		System.out.println("BMW....price:50L");
	}
   //**********************	

	public void autoengine()
	{
		System.out.println("bmw..autoengine()");
	}
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