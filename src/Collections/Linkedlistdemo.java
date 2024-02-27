package Collections;
import java.util.*;
public class Linkedlistdemo {
public static void main(String[] args) {
	
	LinkedList<Integer>l=new LinkedList<Integer>();
	if(l.isEmpty())
	{
		l.add(10);
		l.add(15);
		l.add(22);
		l.add(25);
		l.add(29);
		l.add(null);
	}
	System.out.println("Is list empty :"+l.isEmpty());
	System.out.println(l.size());
	System.out.println(l);
	l.remove(5);
	System.out.println(l);
	System.out.println(l.contains(250));
	l.addFirst(100);
	l.addLast(250);
	System.out.println(l);
	l.add(5,99);
	System.out.println(l);
	System.out.println(l.getFirst()+": "+l.getLast());
	
	//for each loop
	System.out.println();
	for(Integer i:l)
	{
		System.out.println(i);
	}
	System.out.println("using iterator");
	Iterator<Integer>ir=l.iterator();
	while(ir.hasNext())
	{
	System.out.println(ir.next());
    }
	
}
}