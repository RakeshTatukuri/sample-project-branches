package Collections;
import java.util.*;
public class Treesetdemo {

	public static void main(String[] args) {
		TreeSet<Integer>t=new TreeSet<Integer>();
		System.out.println("treeset is empty:"+t.isEmpty());
		t.add(10);
		t.add(3);
		t.add(11);
		t.add(4);
		t.add(9);
		t.add(2);
		t.add(1);
		t.add(13);
		t.add(8);
		System.out.println(t);//we get ascending order
		System.out.println(t.size());
		System.out.println(t.descendingSet());
		System.out.println("headset returns you less than element:"+t.headSet(10));
		System.out.println("tailset returns you greater than element:"+t.tailSet(4));
		System.out.println("subset between and including from numbers:"+t.subSet(4, 10));
		System.out.println(t.first());
		System.out.println(t.last());
		
	}
}
