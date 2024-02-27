package Runtimepolymorphism_ie_methodoverriding;

public class child extends parent{

	@Override 
	//1.if the same name method available in parent and child then we use override method
	//2.child method override by parent class method
	public void color()
	{
		System.out.println("yellow");
	}

public static void main(String[] args) {
	//child class reference & child class object
	child c=new child();
	c.color();//yellow
	
	//parent class reference and parent class object
	parent p=new parent();
	p.color();//red
	
	//parent class reference and child class object
	parent p1=new child();
	p1.color();//yellow
}
}

