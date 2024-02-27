package Collections;
import java.util.*;
public class Arraylist_IterationForList {

	public static void main(String[] args) {
		ArrayList<Integer>a=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(25);
		a.add(35);
		a.add(20);
		System.out.println(a);
		
		//Iterator using for loop 
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("using for each loop");
		for(Integer i:a)
		{
			System.out.println(i);
		}
		System.out.println("using iterator()");
		Iterator<Integer>ir=a.iterator();
		while(ir.hasNext())//true or false- hasnext()-checks whether list contains any element
		{	
		 System.out.println(ir.next());//next()- get the element and it will increment the counter
	    }
}
}