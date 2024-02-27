package Inheriatances_comesunder_methodoverriding;

//Inheritance is accquiring the properties of one class to another class is class is called inheritance
/*main purpose
 * 1.code reusability
 * 2.avoid code duplication
 * 3.to achieve run time polymorphism
 * 
 */
	class parent {
		public void m1()
		{
			System.out.println("This is m1() calling ");

		}
	}

	class child extends parent{
		public void m2() 
		{
			System.out.println("This is m2() calling ");
		}

	}
	public class singlelevelinheritance {

	public static void main(String[] args) {

	   //scenario 1: child class reference(L.H.S values) & child class object(R.H.S values)
	   child c=new child();
	   c.m1();//m1 is a method and return type is void which is coming from class a
	   c.m2();//m2 is a method and return type is void which is coming from class b
	   
	   //scenario 2: parent class reference & parent class object
	   parent p=new parent();
	   p.m1();
	   
	   //scenario 3: parent class reference & child class object
	   parent p1=new child();
	   p1.m1();
	   
	   //scenario 4: invalid=>child class reference & parent class object
	  // B b1=new A();//Type mismatch cannot convert from A to B
	   
	}
}