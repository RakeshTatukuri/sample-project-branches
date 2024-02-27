package Collections;
import java.util.*;
import java.util.Map.Entry;
public class Hashmapdemo //hashmap-->map interface
 	{

	public static void main(String[] args) {

		HashMap<String,Integer>hm=new HashMap<String,Integer>();
		System.out.println("Hashmap is empty:"+hm.isEmpty());
		hm.put("vijayawada", 521150);
		hm.put("kanchikacherla", 521159);
		hm.put("guntur", 511234);
		hm.put("macherla", 521159);
		System.out.println(hm.size());
		System.out.println(hm);
		System.out.println("value for macherla:"+hm.get("macherla"));
		hm.put("macherla", 521189);//updated the value (key is unique and value is duplicate)
		System.out.println(hm);
		
		System.out.println("Iteration of map using Entry interface");//here we cannot use for loop or for each loop in hashmap
	/*
	 * entry is interface in map
	 *
	 *
	 * Iterate your map in 2 ways 
	 * 1.for each loop
	 *  or
	 * 2.iterator()	
	 */
		//for each loop
	System.out.println();
	for(Map.Entry<String,Integer> i:hm.entrySet())//entryset() returns set of entry(String,Integer)
	{
	 //System.out.println(i);
	
	 System.out.println(i.getKey()+" : "+i.getValue());//key ,value print seperated by : 
	}
	//iterator() --> convert your map into set
	System.out.println("**********Iterator()*********");
	Set<Entry<String,Integer>>Set=hm.entrySet();
	Iterator<Entry<String,Integer>>ir=Set.iterator();
	while(ir.hasNext())//while loop has 2 methods 1.hasNext() and 2.next()
	{
		System.out.println(ir.next() );
	}
	
	}
}
