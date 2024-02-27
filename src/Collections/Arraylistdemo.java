package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Arraylistdemo {

	public static void main(String[] args) {

		ArrayList <Integer> al=new ArrayList <Integer>();
		System.out.println(al.isEmpty());
		al.add(100);
		al.add(250);
		al.add(350);
		al.add(250);
	System.out.println(al.clone());
	System.out.println(al.size());
	System.out.println(al.contains(101));
	//remove
	/*al.remove(0);
	System.out.println(al);
	//adding elements at 0 position 222
	al.add(0,222);
	System.out.println(al);
	//clear the list
	/*al.clear();
	System.out.println(al);//empty list
	System.out.println(al.size());*/
	
	//sort the elements from  list
	/*collection class contains all static methods
	 * sort()-list i.e sort the list
	 * 
	 */
	Collections.sort(al);
	System.out.println(al);
	
	
	//*****************************
	ArrayList<Double>a=new ArrayList<Double>();
	a.add(100.23);
	a.add(200.22);
	a.add(250.25);
	System.out.println(a);
	
	//********************************
	ArrayList<String>s=new ArrayList<String>();
	s.add("Rakesh");
	s.add("ram");
	s.add("rock");
	System.out.println(s);
	
	//*******************************
	ArrayList<Object>empdata=new ArrayList<Object>();
	empdata.add(156);
	empdata.add("Rakesh");
	empdata.add("Andhra");
	empdata.add("M");
	empdata.add(9553438459l);
	empdata.add(400.25);
	System.out.println(empdata);
	System.out.println(empdata.contains("Andhra"));
	
/*	for(Object i:empdata)
	{
		System.out.println(empdata);
	}
	System.out.println();
	Iterator<Object>ir=empdata.iterator();
	while(ir.hasNext())
	{
		System.out.println(ir.next());
	}
*/
	
	}
 }
