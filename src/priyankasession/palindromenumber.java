package priyankasession;

public class palindromenumber {

	public static void main(String[] args) {
//palindrome means reverse of number
		int num=121, r,sum=0;
		int temp=num;
		
		while(num>0)
		{
			r=num%10;
			num=num/10;
			sum=sum*10+r;	

		}System.out.println("reverse of "+temp+ " is " + sum);
		if(temp==sum)
		{
			System.out.println(temp + " palindrome number");
		}else
		{
			System.out.println(temp + " not palindrome number");
		}
	}

}
