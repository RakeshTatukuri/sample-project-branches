package priyankasession;

public class swapingoftwonumbers {
	
	public static void main(String[] args) {
		
		int a = 100,b = 0;
		System.out.println("before swaping a=" + a + "b=" + b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swaping a="+ a + "b=" + b);
	}
}
