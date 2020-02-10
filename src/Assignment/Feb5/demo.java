package Assignment.Feb5;

public class demo {

	public static void main(String[] args) {
		
		sum(1,2,3);
	}

	public static void sum(int a) {

		System.out.println("Inside normal method");
	}
	

	public static void sum(int... a) {

		
		for(int val : a) {
			System.out.println(val);
		}
		
		System.out.println("Inside special method");
	}

}
