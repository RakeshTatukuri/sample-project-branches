package com;

public class Constructor {
	
	//default constructor
	/*Constructor(){
		System.out.println("default constructor");
	}*/
	
	//parameterized constructor
	/*String name;
	int age;
	Constructor(String name,int age){
		this.name=name;
		this.age=age;
	}*/
	
	//constructor overloading by number of parameters, type of parameters, order of  parameters
	/*Constructor(String name, int age){
		System.out.println("constructor with two arguments name is:" + name +" and age is "+ age);
	}
	Constructor(long id, String name, int age){
		System.out.println("constructor with three arguments: " + "id is "+id+ " name is:" + name +" and age is "+ age);
	}*/
	
	//------copy constructor
/*copy constructor is passed with another object which copies the data available from the passed object 
	to the newly created object*/
	String name;
	int age;
	//parametrized constructor
	Constructor(String name,int age){
		this.name=name;
		this.age=age;
	}//copy constructor
	Constructor(Constructor obj2){
		this.name=obj2.name;
		this.age=obj2.age;
	}
	
	
public static  void main(String[] args) {
	
	/*Constructor c=new Constructor("Rakesh",11);
	Constructor c1=new Constructor(123456,"OM namah shivya",25);*/
	//System.out.println("constructor name is :"+ c.name + " and age is :"+ c.age);
	System.out.println("First object");
	Constructor obj1=new Constructor("Rakesh",11);
	System.out.println("constructor name is :"+ obj1.name + " and age is :"+ obj1.age);
System.out.println();

System.out.println("copy constructor used on Second object");
Constructor obj2=new Constructor(obj1);
System.out.println("constructor name is :"+ obj2.name + " and age is :"+ obj2.age);

	
	
}
}
