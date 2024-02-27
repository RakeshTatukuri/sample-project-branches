package Scenariobasedquestions;

public class removewhitespacefromgivenstring {

	public static void main(String[] args) {

		String data="Selenium is unit  testing  framework ";
		System.out.println(data);
		String res=data.replaceAll(" ","");
		System.out.println(res);
	}

}
