package Collections;
import java.util.*;
public class Vectordemo {

	public static void main(String[] args) {
		
		Vector<Integer>v=new Vector<Integer>();
		System.out.println("IS empty :"+v.isEmpty());
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		v.add(500);
		v.add(400);
		System.out.println("After adding elemnts status IS :"+v.isEmpty());
		System.out.println("Total size:"+v.size());
		System.out.println(v);
		System.out.println(v.contains(100));
		System.out.println(v.contains(0));
		v.remove(1);
		System.out.println(v);
	}
}
