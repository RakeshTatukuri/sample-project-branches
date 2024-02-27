package superkeyword;

public class Superchild extends Superparent {

	int cid=111;
	
	public void childincome()
	{
		System.out.println("parent id is "+super.pid);//if you want to call anything from immediate parent then we use super keyword with out calling any object
		super.parentincome();//instance method(no need to call independentely through object)
		System.out.println("child id is "+cid);//instance variable/data
		System.out.println("child income is $250000");
	}
	public  Superchild()//constructor
	{
		super();//to call everthying from parent constructor which is available
		System.out.println("This is child constructor");
	}
public static void main(String[] args) {
	
	Superchild c=new Superchild();
    c.childincome();
	
}

}


