package OOPS_Encapsulation_Concept;

public class Loginpage {

	//data+function is encapsulation
	//data
	private String username;
	private String password;
	
	//public methods/functions 
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//Business logic
	public void dologin(String un,String pw)
	{
	 System.out.println("Hello you are login with username: "+un);
	 System.out.println("Hello you are login with password: "+pw);
	}
	
}
