package Dataabstraction_using_interface;

public class TestHosipatal {
	public static void main(String[] args) {
		//child class reference & child class object
		NobelHosipatal n=new NobelHosipatal();
		n.medicalservice();//individual
		n.physio();//inherited abstract
		n.cardio();//inherited abstract
		
		n.neuro();
		n.dental();
		
		n.covid9Test();
		System.out.println("*******");
		
		//parent class reference & child class object
		IMA i=new NobelHosipatal();
		i.physio();//updated 
		i.cardio();//updated
		
		i.covid9Test();
		System.out.println("*******");
		//parent class reference & child class object
		USMA u=new NobelHosipatal();
		u.neuro();
		u.dental();
		
		u.covid9Test();
		
	}
}
