package Collections;
import java.util.*;
public class Linkedhashsetdemo {
public static void main(String[] args) {
	
	LinkedHashSet<Integer>lh=new LinkedHashSet<Integer>();
	System.out.println("Linkedhashset is empty:"+lh.isEmpty());
	lh.add(10);
	lh.add(20);
	lh.add(30);
	lh.add(35);
	lh.add(40);
	lh.add(50);
	lh.add(10);
	System.out.println(lh);
	System.out.println(lh.size());
	System.out.println(lh.contains(10));
	System.out.println(lh.remove(20));
	System.out.println(lh);
	
	//remove duplicate element 
	String s="aabbccdd";
	System.out.println(s);
	LinkedHashSet<Character>lc=new LinkedHashSet<Character>();
	for(int i=0;i<s.length();i++)
	{
		lc.add(s.charAt(i));
	}
	System.out.println(lc);
	
}
}
