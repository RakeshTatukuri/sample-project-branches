package Scenariobasedquestions;

public class reverseastringwithoutmethod {

	public static void main(String[] args) {

		String s="HelloAll";
		String result="";
		System.out.println(s);
		
		for(int i=s.length()-1;i>=0;i--)//i=3 i.e length-1=8-1=7 index starts from 0
		{
		  result=result+ s.charAt(i);
		}
		System.out.println("Reverse of string "+ s+ " is "+ result);
	}

}
