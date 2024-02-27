package com;
//refer to java T point website
import java.util.Arrays;
import java.util.StringJoiner;

public class Strings {

	public static void main(String[] args) {
		/*String s1 = "java programming ";
		
		char ch[] = { 'R', 'a', 'k', 'e', 's', 'h' };
		String s2 = new String(ch);
		String s3 = new String("and Java Script");

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		s1=s1.concat(s3);//concatenation
		System.out.println(s1);*/
		
		//-----java string comparison ------
		//1.by using equal() method
		/*String s1="RAKESH";
		String s2="RAKESH";
		String s3=new String("rakesh");
		String s4="shivya";
		System.out.println(s1.equals(s2));//true
		System.out.println(s2.equalsIgnoreCase(s3));//true
		System.out.println(s3.equals(s4));//false*/
		
		//2.by using == operator
		/*String s1="RAKESH";
		String s2="RAKESH";
		String s3=new String("rakesh");
		String s4="shivya";
		System.out.println(s1==s2);//true
		System.out.println(s2==s3);//false
		System.out.println(s3==s4);//false*/
		
		//3.by using compareTo() method
		/*String s1="RAKESH";
		String s2="RAKESH";
		String s3=new String("rakesh");
		String s4="shivya";
		System.out.println(s1.compareTo(s2));//0
		System.out.println(s2.compareTo(s3));//-32
		System.out.println(s3.compareTo(s4));//-1*/
		
		//string concatenation of integers and string values
		/*String s=50+30+"Rakesh"+40+50;
		System.out.println(s);*/
		
		//Stringbuilderclass
		/*StringBuilder s1=new StringBuilder("hello ");
		StringBuilder s2=new StringBuilder("world");
		StringBuilder s=s1.append(s2);//string3 to store the result
		System.out.println(s.toString());//display result*/
		
		//String format specifiers %s
		/*String s1=new String("rakesh ");
		String s2=new String("tatukuri");
		//String s=String.format("%s%s",s1,s2);//format specifiers like %s
		String s=String.join("",s1,s2);//string join
		System.out.println(s.toString());//display result*/

		//String joiner
		/*StringJoiner s=new StringJoiner(",");//string joiner object
		s.add("Rakesh");
		s.add(" Tatukuri");
		System.out.println(s.toString());*/
		
		//java substring() method
		/*String s="Rakesh Tatukuri";
		System.out.println("original String :"+s);
		System.out.println("Substring starting from index 6: "+s.substring(7));
		System.out.println("Substring starting from index 0 to 6: "+s.substring(0,7));
		System.out.println("sunstring starting from index :"+s.length());*/
		
		//using string.split() method
		/*String text=new String("Hello my name is Rakesh...");
		String[] sentences=text.split("\\.");
		System.out.println(Arrays.toString(sentences));*/
		
		//toUpperCase() and toLowerCase() method
		/*String s="Rakesh";
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s);*/
		
		//String trim() method eliminates white spaces before and after string
		/*String s="  Rakesh  ";
		System.out.println(s);
		System.out.println(s.trim());*/
		
		//String startwith() and endwith() method
		/*String s="Rakesh";
		System.out.println(s.startsWith("Ra"));
		System.out.println(s.endsWith("sh"));*/
		
		//string replace() method
		String s="Java is programming language.java script is a platform";
		String replaceString=s.replace("Java","Javascript");
		System.out.println(replaceString);
		
		
		

		
		
	}

}
