package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylistusing_asList {

	public static void main(String[] args) {

		//Arrays class contains aslist()
		List<Integer>l1=Arrays.asList(10,20,25,30);
		System.out.println(l1);
		
		List<Integer>l2=Arrays.asList(40,50,55,60);
		System.out.println(l2);
		
		//to create new list
		ArrayList<Integer>l3=new ArrayList<Integer>();
		l3.addAll(l1);
		l3.addAll(l2);
		System.out.println(l3);
		//or using constructor passing
		ArrayList<Integer>l4=new ArrayList<Integer>(l1);
		l4.addAll(l2);
		System.out.println(l4);
	}

}
