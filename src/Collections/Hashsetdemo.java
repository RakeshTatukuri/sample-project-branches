package Collections;
import java.util.*;
public class Hashsetdemo {
public static void main(String[] args) {
	
	HashSet<Integer>h=new HashSet<Integer>();
	System.out.println("hash set is empty:"+h.isEmpty());
	h.add(10);
	h.add(20);
	h.add(30);
	h.add(40);
	System.out.println("After adding elements status is:"+h);
	h.add(null);//0
	System.out.println(h);
	System.out.println(h.size());
	System.out.println(h.contains(null));
	System.out.println(h.remove(null));
	System.out.println(h);
	
	
	System.out.println("for each loop");
	for(int i:h)
	{
		System.out.println(i);
	}
	
	System.out.println("iterator()");
	Iterator<Integer>ir=h.iterator();
	while(ir.hasNext())
	{
		System.out.println(ir.next());
	}

}
}
