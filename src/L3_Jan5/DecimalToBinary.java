package L3_Jan5;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 05-Jan-2020
 *
 */

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int multiplier = 1 ; // 10^0		
		int ans = 0 ;
				
		while (n != 0) {

			int rem = n % 2;

			ans = ans + rem * multiplier ;
			
			n = n / 2;
			multiplier = multiplier * 10 ;

		}
		
		System.out.println(ans);

	}
}




