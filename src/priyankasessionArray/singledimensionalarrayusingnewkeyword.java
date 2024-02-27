package priyankasessionArray;

public class singledimensionalarrayusingnewkeyword {

	public static void main(String[] args) {

		//single dimensional array using new keyword
		//declaring
		int sid[]=new int[5];
		
		//initializing the values
		sid[0]=101;
		sid[1]=102;
		sid[2]=103;
		sid[3]=104;
		sid[4]=105;
		
		//length variable
		System.out.println(sid.length);
		
		//index
		//System.out.println(sid[4]);
		//System.out.println(sid[-1]);//ArrayIndexOutOfBoundsException error we get
		
		for(int i=0;i<5;i++)
		{
			System.out.println(sid[i]);
		}
		/*for(int i:sid)
		{
			System.out.println(i);
		}*/
	}

}
