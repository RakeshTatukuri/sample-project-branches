package priyankasessionArray;

public class multidimensionalarrayusingnewkeyword {

	public static void main(String[] args) {

		//declaring
		String array[][]=new String[4][2];
		//initializing
		array[0][0]="Rakesh";
		array[0][1]="R@kesh123";
		array[1][0]="Rajesh";
		array[1][1]="R@jesh123";
		array[2][0]="radha";
		array[2][1]="r@dha123";
		array[3][0]="ganesh";
		array[3][1]="g@nesh123";
		
		
		System.out.println("number of rows :"+array.length);
		System.out.println("number of columns :"+array[0].length);
	
		//using nested loop
		/*for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[0].length;j++)
			{
				System.out.print(array[i][j]+"\t");
			}System.out.println();
		}*/
		//using for each loop
		for(String i[]:array)
		{
			for(String j:i)
			{
				System.out.print(j+"\t");
			}System.out.println();
		}
	}

}
