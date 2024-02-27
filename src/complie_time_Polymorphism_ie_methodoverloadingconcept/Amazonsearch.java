package complie_time_Polymorphism_ie_methodoverloadingconcept;

public class Amazonsearch {

	public void search(String pname)
	{
		System.out.println("search product by product name "+ pname);
	}
	public void search(int price)
	{
		System.out.println("search product by product price "+ price);
	}
	public void search(String pname,int price)
	{
		System.out.println("search product by product name "+ pname+" & price "+ price);
	}
	public void search(String pname, String bname)
	{
		System.out.println("search product by product name "+ pname+" & bname "+ bname);
	}

}
