package priyankasessionArray;

public class Multidimensionalarrayusingliterals {

	public static void main(String[] args) {

		Object realdata[][]= {{"username","password"},{"Rakesh","R@kesh123"},{"Ram","R@m123"},{"Jai","J@i123"},{"shyam","shy@m123"},{"Raja","R@ja123"}};
		
		System.out.println("number of rows:"+(realdata.length-1));
		System.out.println("number of columns:"+realdata[0].length);
		
		//using nested loop
		for(int i=0;i<realdata.length;i++)
		{
			for(int j=0;j<realdata[i].length;j++)
			{
				System.out.print(realdata[i][j] +"\t");
			}System.out.println();
		}
		System.out.println("**********headings are skiped**************");
		for(int i=1;i<realdata.length;i++)
		{
			for(int j=0;j<realdata[i].length;j++)
			{
				System.out.print(realdata[i][j]+"\t");
			}System.out.println();
		}
		//or
		//using for each loop
		for(Object i[]:realdata)
		{
			for(Object j:i)
			{
			System.out.print(j+"\t");	
			}System.out.println();
		}
		
	}

}
