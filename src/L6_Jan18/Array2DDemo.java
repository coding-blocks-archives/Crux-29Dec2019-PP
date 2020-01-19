package L6_Jan18;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 18-Jan-2020
 *
 */

public class Array2DDemo {

	public static void main(String[] args) {

		int[][] arr = new int[3][4];
		System.out.println(arr);

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		// rows
		System.out.println(arr.length);

		// cols
		System.out.println(arr[0].length);

		// index value get
		System.out.println(arr[1][2]);
		arr[1][2] = 100;
		System.out.println(arr[1][2]);

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();

		}

		int i = 0;
		for (int[] val : arr) {

			// System.out.println(val);

			for (int val1 : arr[i]) {
				System.out.print(val1 + " ");
			}

			i++;
			System.out.println();

		}

		System.out.println(" -- JAGGED ARRAY --");

		int[][] jarr = new int[3][];
		System.out.println(jarr);

		System.out.println(jarr[0]);
		System.out.println(jarr[1]);
		System.out.println(jarr[2]);

		jarr[0] = new int[5];
		jarr[1] = new int[2];
		jarr[2] = new int[4];

		System.out.println(jarr[0]);
		System.out.println(jarr[1]);
		System.out.println(jarr[2]);

		System.out.println(jarr[0].length);
		System.out.println(jarr[1].length);
		System.out.println(jarr[2].length);

	}
}
