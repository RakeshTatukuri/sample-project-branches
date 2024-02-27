package priyankasession;

public class nestedforlooppatterns {

	public static void main(String[] args) {

		/*
		 * printing * like these * * * * * * * * * * * * *
		 */
	/*	int num = 4;
		for (int rnum = 1; rnum <= num; rnum++) {
			for (int c = 1; c <= num; c++) {
				System.out.print("*" + " ");
			} 
			System.out.println();
		}*/
		
/*		* 
		* * 
		* * * 
		* * * *   */
		/*int num=4;
		  for(int r=1;r<=num;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("*" + " ");
			}
			System.out.println();
		}*/
		/*********************
	/*	1
		22
		333
		4444  */

	/*	for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(r);
			}System.out.println();
         }		
		*/
	
	/*	1
		12
		123
		1234 */
	/*	for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(c);
			}System.out.println();
		}
		*/
	
	/*	1 
		2 3 
		4 5 6 
		7 8 9 10 */
		int count=1;
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(count+" ");
				count++;
			}System.out.println();
		}
	}

}
