package finalkeyword;

 class demo//class
   
   //final class demo//final class
{
	 /*int id=101;//variable
	   or */
	   final int id=101;//final variable
	
	   //public void color()//method
	   public final void  color()//final method
	{
		System.out.println("red");
	}
}

//the type finalkeyword cannot subclass the final class demo 
public class Finalkeyword extends demo
{
	//cannot override the final method from demo class
	/*@Override
	public void color()
	{
		System.out.println("blue");
	}*/
	public static void main(String[] args) {
		
		Finalkeyword f=new Finalkeyword();
		//f.id=1000;/*update result if you want or if it is final we dont update/final demo.id cannot be assigned
		System.out.println(f.id);
		f.color();
		
	}
}


 