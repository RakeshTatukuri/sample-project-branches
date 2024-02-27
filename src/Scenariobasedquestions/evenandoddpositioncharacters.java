package Scenariobasedquestions;

public class evenandoddpositioncharacters {

	public static void main(String[] args) {

		String s="abcdefgh";
		System.out.println(s);
		String result="";
		for(int i=0;i<s.length();i++)
		{
			if(i%2==0)
			{
				//result=result+s.toUpperCase();
				//result.toUpperCase();
				result=result+s.toUpperCase().charAt(i);
			}else
			{
				//result=result+s.toLowerCase();
				//result.toLowerCase();
				result=result+s.toLowerCase().charAt(i);
			}
		}System.out.println(result);
	}

}
