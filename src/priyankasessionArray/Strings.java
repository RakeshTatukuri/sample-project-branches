package priyankasessionArray;

public class Strings {

	public static void main(String[] args) {

		//using literals way
		String s1="hello";
		String s2="hello";
		
		//to compare JVM Id's for object ==
		//System.out.println(s1==s2);//true
		
		//using new keyword way
	/*	String s1=new String("hello");
		String s2=new String("hello");
		String s3=new String("hello");
		System.out.println(s1==s3);//false
		System.out.println(s2==s3);//false
		*/
		//string is immutable(which is not changed i.e it fixed)  class
		s1=s1+"all";
		System.out.println(s1);
		System.out.println(s1==s2);//false
		
		//string methods
		// 1.length()method includes char+space
		String s3="HelloAll";
		System.out.println("length of string:"+s3.length());
		
		//2.conversion=to uppercase and to lowercase
		System.out.println(s3.toUpperCase());//HELLOALL
		System.out.println(s3.toLowerCase());//helloall
		
		//3.Equality of strings 
		//equals()=exact matching but it is case sensitive
		//equalsignorecase()=exact matching but it is not case sensitive
		String actual="selenium library tool";
		String expected="selenium library tool";
		System.out.println("using equals():"+actual.equals(expected));//true
		System.out.println("using equalsignorecase():"+actual.equalsIgnoreCase(expected));//true
		
		//4.concat()  /+
		System.out.println(s3.concat(" "+expected));
		System.out.println(s3.concat(" "+expected));
		
		
		//trim()-ignore whitespace before and after string
		String ss1=" Welcome All ";
		System.out.println(ss1);
		System.out.println(ss1.trim());//Welcome All
		
		//CharAt(index)
		String ss2="WelcomeAll";
		System.out.println(ss2.charAt(0));
		
		//contains()-partial String
		String exp="testng is automation tool";
		System.out.println(exp.contains("testng"));//true
		
		//Startswith() and endswith() 
		String exp1="cucumber is a framework";
		System.out.println(exp1.startsWith("framework"));//false
		System.out.println(exp1.startsWith("cucum"));//true
		System.out.println(exp1.endsWith("work"));//true
		
		//split(regular expression)-It is used for pattern matching
		String tools="selenium,testng,cucumber,java,SQL";
		String arr[]=tools.split(",");
		// System.out.println(arr[0]);
		for(String i:arr)
		{
			System.out.println(i);
		}
		
		String obj=tools.split(",")[2];
		System.out.println(obj);//cucumber
		
		String date="15-dec-2023";
		String day=date.split("-")[0];
		String month=date.split("-")[1];
		String year=date.split("-")[2];
		System.out.println("day is "+day+"\nmonth is "+month+"\nyear is "+year);
		
	}

}
