package priyankasession;

public class Amstrongnumber {

	public static void main(String[] args) {
//amstrong means original and calculated number both are same
		int num=153, r, res=0;
		int temp=num;
		while(num>0)
		{
			r=num%10;
			num=num/10;
			res=res+(r*r*r);
			
		}//System.out.println(sum); or
		if(temp==res)
		{
			System.out.println(temp+ " is Amstrong number" );
		}else 
		{
			System.out.println(temp+ " is not Amstrong number");
		}
	}

}
