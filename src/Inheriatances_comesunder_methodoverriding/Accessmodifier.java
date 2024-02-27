package Inheriatances_comesunder_methodoverriding;

public class Accessmodifier {

	int id=101;//default
	public String name="Rakesh";
	private long phoneno=9553438345l;
	protected int accountno=658575;
	
	public static void main(String[] args) {

		//same class i.e public,private,protected,default we can access
		Accessmodifier a=new Accessmodifier();
		System.out.println(a.id);
		System.out.println(a.name);
		System.out.println(a.phoneno);
		System.out.println(a.accountno);
	}

}
