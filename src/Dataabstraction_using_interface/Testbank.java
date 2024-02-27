package Dataabstraction_using_interface;

public class Testbank {

	public static void main(String[] args) {
		//child class reference & child class object
		HDFC h=new HDFC();
		h.customerdetails();//individual 
		h.deposite();//inherited abstract 
		h.withdraw();//inherited abstract 
		h.rateofinterest();//inherited abstract 
		//System.out.println(h.x);
		//h.x=250; we can call it above static method but cant update the  it below
		System.out.println("***********");
		//parent class reference & child class object
		RBI r=new HDFC();
		r.deposite();
		r.withdraw();
		r.rateofinterest();
		
		System.out.println("*********");
		
		AXIS a=new AXIS();
		a.deposite();
		a.withdraw();
		a.rateofinterest();
	}
}
