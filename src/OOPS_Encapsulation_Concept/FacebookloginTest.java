package OOPS_Encapsulation_Concept;

public class FacebookloginTest {

	public static void main(String[] args) {

		Loginpage lp=new Loginpage();
		lp.setUsername("Rakesh");
		lp.setPassword("R@kesh123");
		lp.dologin(lp.getUsername(), lp.getPassword());
		System.out.println();
		Loginpage lp2=new Loginpage();
		lp2.setUsername("Ram");
		lp2.setPassword("R@m123");
		lp2.dologin(lp2.getUsername(), lp2.getPassword());
	}

}
