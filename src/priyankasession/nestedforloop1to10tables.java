package priyankasession;

public class nestedforloop1to10tables {

	public static void main(String[] args) {

		//print 1 to 10 tables
		for(int rnum=1;rnum<=10;rnum++)//row
		{
			for(int c=1;c<=10;c++)//column
			{
				System.out.print(rnum*c+"\t");
			}System.out.println();
		}
		
		//***************************************
	/* printing * like these    * * * *
		                        * * * *
		                        * * * *
		                        * * * *  
		                        */
		/*int num=4;
		for(int rnum=1;rnum<=num;rnum++)
		{
			for(int c=1;c<=num;c++)
			{
				System.out.print("*"+"\t");
			}System.out.println();
		}*/
	}

}
