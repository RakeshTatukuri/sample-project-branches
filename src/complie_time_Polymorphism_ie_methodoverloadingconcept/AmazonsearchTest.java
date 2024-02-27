package complie_time_Polymorphism_ie_methodoverloadingconcept;

public class AmazonsearchTest {

	public static void main(String[] args) {

		Amazonsearch sc= new Amazonsearch();
			sc.search("soap");
			sc.search(111);
			sc.search("apple", 110000);
			sc.search("watch", "titan");
		
		
	}

}
