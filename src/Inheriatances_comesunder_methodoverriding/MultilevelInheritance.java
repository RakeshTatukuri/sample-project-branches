package Inheriatances_comesunder_methodoverriding;

class X {
	public void m1()
	{
		System.out.println("This is m1() calling ");

	}
}

class Y extends X{
	public void m2() 
	{
		System.out.println("This is m2() calling ");

	}
}
class Z extends Y{
	public void m3() 
	{
		System.out.println("This is m3() calling ");

	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {

		 //scenario 1: child class reference(L.H.S values) & child class object(R.H.S values)
		   Z z=new Z();
		   z.m1();//m1 is a method and return type is void which is coming from class x
		   z.m2();//m2 is a method and return type is void which is coming from class y
		   z.m3();//m3 is a method and return type is void which is coming from class z
		  
		   //scenario 2: parent class reference & parent class object
		   //for z  parent is y
		   Y y=new Y();
		   y.m1();
		   y.m2();
		   
		   //scenario 3: parent class reference & child class object
		   Y y1=new Z();
		   y1.m1();
		   y1.m2();
		   
		   //scenario 4: invalid=>child class reference & parent class object
		  // Z z=new Y();//Type mismatch cannot convert from A to B
		   
	}

}
