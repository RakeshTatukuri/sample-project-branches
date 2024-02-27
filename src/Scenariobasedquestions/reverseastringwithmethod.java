package Scenariobasedquestions;

public class reverseastringwithmethod {

	public static void main(String[] args) {

		// StringBuffer br=new StringBuffer("Hello");
		 		// or
		StringBuilder br = new StringBuilder("Hello");

		//System.out.println(br);
		br.append("All");//adding i.e HelloAll
		System.out.println(br);//HelloAll
		
		//System.out.println(br.reverse());//llAolleH
		System.out.println("Reverse of string  "+ br+ " is "+ br.reverse());
	}
}
