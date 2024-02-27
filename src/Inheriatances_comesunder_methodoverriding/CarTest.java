package Inheriatances_comesunder_methodoverriding;

public class CarTest {

	public static void main(String[] args) {
		//single level inheritance
		BMW b=new BMW();
		b.autoengine();//individual method
		b.start();//inherited method
		b.refule();//inherited
		b.stop();//inherited
		b.breakfeature();//inherited
		//method overriding
		b.price();//price50L
		
		Car c=new Car();
		c.start();//individual
		c.refule();//individual
		c.stop();//individual
		c.breakfeature();//inherited
		
		c.price();//price1L
		
		Car c2=new BMW();
		c2.start();//individual
		c2.refule();//individual
		c2.stop();//individual
		
		c2.breakfeature();//inherited
		
		c2.price();//updated result that is 50L
		System.out.println("*************************");
		
		//hierarchial inheritance
		Audi a=new Audi();
		a.autoengine();//individual
		a.start();//inherited
		a.refule();//inherited
	    a.stop();//inherited
	    a.breakfeature();//inherited
	
	    Car car=new Car();
	    car.start();//individual
	    car.refule();//individual
	    car.stop();//individual
	    car.breakfeature();//inherited
	    
	    Car car1=new Audi();
	    car1.start();//individual
	    car1.refule();//individual
	    car1.stop();//individual
	    car1.breakfeature();//inherited
	    System.out.println("*********************");

	   
	    
	    
	}
}
