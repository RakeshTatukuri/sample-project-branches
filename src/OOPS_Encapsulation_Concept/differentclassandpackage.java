package OOPS_Encapsulation_Concept;

import Inheriatances_comesunder_methodoverriding.*;//import packagename
public class differentclassandpackage  extends Accessmodifier {

	public static void main(String[] args) {
		
		//outside class in different package
		Accessmodifier a=new Accessmodifier();
		System.out.println(a.name);
		
		//protected can accessed only with child class with different package
		differentclassandpackage d=new differentclassandpackage();
		System.out.println(d.name);
		System.out.println(d.accountno);
	}

}
