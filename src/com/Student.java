package com;
public class Student {

	  String name;
	  int rollno;
	  
	  private static String str="RAKESH TATUKURI";
	  public static  class MyNestedClass//static class
	  {
		  //non static method
		 public void display() {
			 System.out.println(str);
		 }

		}
	  
	// static variable
	static String collegename;
	//static counter to set unique rollno
    static int count=0;
	
	// constructor
	 Student(String name) {
		this.rollno = setrollno();
		this.name = name;
	}
	 //getting unique rollno through static variable (counter)
	 static int  setrollno() {
		count++;
		return count;
		
	}
	// static method
	 static void collegename(String name) {
		collegename = name;
	}
	 static void change() {
		 collegename="MIC";
	 }

	// instance method
	void getstudentdetails() {
		System.out.println("Name        :     " + this.name);
		System.out.println("Rollno      :     " + this.rollno);
		//accessing static variable
		System.out.println("Collegename :     " + collegename);
	}

	static {
		System.out.println("These is static block");
	}

	public static void main(String[] args) {
		Student.collegename("JNTUK");
		Student.change();
		Student s1 = new Student("Rakesh");
		Student s2 = new Student("Om namah shivya");
		s2.getstudentdetails();
		s1.getstudentdetails();
		
		//static class and non static method calling by  classname.methodname
		Student.MyNestedClass obj=new Student.MyNestedClass();
		obj.display();

	}
}