package ExceptionHandling;
import java.util.Scanner;
public class RunTimeException {

	int id=100;
	public static void main(String[] args) {
		
		//Arthimetic exception
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("Addition is:"+(a+b));
		System.out.println("subtraction is:"+(a-b));	
		System.out.println("multiplication is:"+(a*b));
		try{
			System.out.println("division is:"+(a/b));
		}catch(ArithmeticException e) {
			System.out.println("provide number other than 0,0 is invalid number");
		}
		
		
		System.out.println();
		
		//Arrayindexoutofboundexception
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter valid index b/w 0 to 4");
		int index=sc.nextInt();
		int arr[]= {10,20,30,40,50};
		try{
			System.out.println(arr[index]);//arrayindexoutofboundexception
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("provide valid index only!");
		}
		
		
		System.out.println();
		
		//NumberFormatException - if the string does not contain aparsable integer.
		String s1="100AB";
		System.out.println(s1+100);//100100
		
		 //converting string object into interger type
		 // (object to primitive conversion we use i.e wrapper class)
		try {
		  int num=Integer.parseInt(s1);//numberformatexception
		System.out.println(num+100);//200
		}catch(NumberFormatException e) {
			System.out.println("object is not converatable,check the object");
		}
		System.out.println();
		
		//NullPointerException
		RunTimeException r1=new RunTimeException();
		r1=null;//1.object is null 2.whenever object reference of any class by default it is null then we dont access any other class
		try {
		System.out.println(r1.id);
		}catch(NullPointerException e) {
			System.out.println("object is null check the data");
		}System.out.println("completed..!");
		
	}
}
