package L3_Jan5;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 05-Jan-2020
 *
 */

public class Temp {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int minT = scn.nextInt();
		int maxT = scn.nextInt();
		int step = scn.nextInt();

		for (int temp = minT; temp <= maxT; temp = temp + step) {

			int c = (int) (5.0/9 * (temp-32)) ;
			
			System.out.println(temp + "\t" + c);
		}

	}
}






