package Dataabstraction_using_interface;

public class HDFC implements RBI 
{
	public  void  customerdetails() 
	{
		System.out.println("HDFC......customer details()");
	}

	@Override
	public void withdraw() {
		System.out.println("HDFC....withdraw()");
	}

	@Override
	public void deposite() {
		System.out.println("HDFC.....deposite()");
	}

	@Override
	public void rateofinterest() {
		System.out.println("HDFC....rate of interest 8% ");
	}
}
