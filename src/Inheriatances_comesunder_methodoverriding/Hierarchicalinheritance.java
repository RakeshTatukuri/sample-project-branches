package Inheriatances_comesunder_methodoverriding;

class a
{
	public void m1()
	{
		System.out.println("This is m1() calling");
	}
}
class b extends a
{
	public void m2()
	{
		System.out.println("This is m2() calling");
	}
}
class c extends b
{
	public void m3()
	{
		System.out.println("This is m3() calling");
	}
}
class d extends a //a is parent d is hierarchical inheritance
{
	public void m4()
	{
		System.out.println("This is m4() calling");
	}
}
public class Hierarchicalinheritance {

	public static void main(String[] args) {

		//scenario 1: child class reference and child class object
		d obj=new d();
		obj.m4();
		obj.m1();
		//scenario 2: parent class reference and parent class object
		a obj1=new a();
		obj1.m1();
		//scenario 3: parent class reference and child class object
		a obj2=new d();
		obj2.m1();
	}

}
