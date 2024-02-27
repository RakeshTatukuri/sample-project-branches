package priyankasession;

public class factorialnumber {

	public static void main(String[] args) {

		int fact=1,number=5;
		for( int i=1;i<=number;i++)
			//or
			//for(int i=5;i>=1;i--)
		{
			fact=fact*i;
		}System.out.println("factorial of "+ number +" is "+ fact);
	}

}
