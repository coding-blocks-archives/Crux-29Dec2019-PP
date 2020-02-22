package L14_Feb22;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 22-Feb-2020
 *
 */

public class Test {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		String str = scn.next();
		String str1 = scn.next();
		String str2 = scn.next();

		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("hello");

	}
	
	public static int coinToss(int n) {

		if (n == 0) {
			return 1;
		}

		int c1 = coinToss(n - 1);
		int c2 = coinToss(n - 1);
		
		return c1 + c2 ;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

