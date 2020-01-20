package L7_Jan19;

import java.util.ArrayList;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 19-Jan-2020
 *
 */

public class ArrayListOps {

	public static void main(String[] args) {

//		int[] one = { 10, 20, 20, 30, 35, 40, 40, 50 };
//		int[] two = { 5, 7, 9, 10, 10, 10, 20, 25, 37, 40, 40, 40 };

//		System.out.println(intersection(one, two));

		 int[] one = {8,9,8,9} ;
		 int[] two = {7,6} ;
		 
		System.out.println(sumOfTwoArray(one, two));

	}

	public static ArrayList<Integer> intersection(int[] one, int[] two) {

		ArrayList<Integer> ans = new ArrayList<>();

		int i = 0;
		int j = 0;

		while (i < one.length && j < two.length) {

			if (one[i] < two[j]) {
				i++;
			} else if (one[i] > two[j]) {
				j++;
			} else {

				ans.add(one[i]);
				i++;
				j++;
			}
		}

		return ans;
	}

	public static ArrayList<Integer> sumOfTwoArray(int[] one, int[] two) {

		ArrayList<Integer> ans = new ArrayList<>();

		int i = one.length - 1;
		int j = two.length - 1;

		int carry = 0;

		while (i >= 0 || j >= 0) {

			int sum = carry;

			if (i >= 0) {
				sum += one[i];
			}

			if (j >= 0) {
				sum += two[j];
			}

			int rem = sum % 10;
			ans.add(0, rem);
			carry = sum / 10;

			i--;
			j--;

		}

		if (carry > 0) {
			ans.add(0, carry);
		}
		return ans;

	}

}




