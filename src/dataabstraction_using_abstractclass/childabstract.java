package dataabstraction_using_abstractclass;

public class childabstract extends Abstractclassdemo {

	public void sample()
	{
		System.out.println("this is child class method");
	}

	//when parent and child both class contain same name method then child method always override parent class method
	@Override
	public void show() //show method is inherited abstract method
	{
		System.out.println("show() implemented by child class ");
		
	}
	public static void main(String[] args) {
		//child class reference and child class object
		childabstract c=new childabstract();
		c.sample();//individual method
		c.accept();//inherited
		c.show();//inhereted abstract
		
		System.out.println();
		//parent class reference and parent class object is invalid scenario here in abstraction
		//Abstractclassdemo a1=new Abstractclassdemo();
		
		//parent class reference and child class object
		Abstractclassdemo a1=new childabstract();
		a1.accept();
		a1.show();
		
		//child class reference and parent class object is invalid in java
		
	}

}
