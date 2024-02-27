package ExceptionHandling;

public class FinallyblockDemo {

	public static void main(String[] args) {
		System.out.println("program started..");
		try {
			System.out.println(9/0);
		}catch(Exception e) {
			System.out.println("0 is invalid number");
		}
		finally{
			System.out.println("stable or to execute any special code with or without exception");
		}
	}
}
