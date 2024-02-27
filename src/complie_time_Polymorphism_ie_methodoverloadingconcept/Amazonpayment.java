package complie_time_Polymorphism_ie_methodoverloadingconcept;

public class Amazonpayment {

	public void payment(double amount)
	{
		System.out.println("cash payment "+amount);
	}
	public void payment(String cardname ,double amount)
	{
		System.out.println("card payment is "+cardname+"& cash payment "+amount);
	}
	public void payment(int pin,double amount)
	{
		System.out.println("upi pin is "+pin+"& payment "+amount);
	}
}
