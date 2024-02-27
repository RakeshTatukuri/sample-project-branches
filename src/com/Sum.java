package com;

public class Sum {
    //By changing the number of parameters
	private int sum(int x,int y) {
	  int sum=x+y;
		return sum;
		}
	//changing data type of the arguments
	public double sub(double x, float y, long z) {
		double sub=x-y-z;
		return sub;
	}
	//changing the order of the parameters of methods
	protected void Studentid(String name, int rollno) {
		System.out.println("name is:" +name + " "+ "rollno is :" + rollno );
	}
	public static void main(String[] args) {

		Sum s=new Sum();
		int sum=s.sum(1,2);
		double sub=s.sub(11.f, 25.f, 25);
		s.Studentid("Rakesh",541);
		System.out.println("The sum of two numbers    " + sum);
		System.out.println("The sub of three numbers  " + sub);
		
	}

}
	
	
	
