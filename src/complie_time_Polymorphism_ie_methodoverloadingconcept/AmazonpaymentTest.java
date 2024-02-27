package complie_time_Polymorphism_ie_methodoverloadingconcept;

public class AmazonpaymentTest {

	public static void main(String[] args) {

		Amazonpayment obj=new Amazonpayment();
		obj.payment(10000);
		obj.payment("debit ", 29000);
		obj.payment(12000, 25000);
	}

}
