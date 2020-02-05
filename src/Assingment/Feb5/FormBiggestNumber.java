package Assingment.Feb5;

public class FormBiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 95, 113, 98, 9 };
		bubbleSort(arr);

		for (int val : arr) {
			System.out.print(val + " ");
		}
	}

	public static void bubbleSort(int[] arr) {

		for (int count = 0; count <= arr.length - 2; count++) {
			for (int j = 0; j <= arr.length - count - 2; j++) {
				if (compare(arr[j], arr[j + 1]) < 0) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}
	}

	public static int compare(int num1, int num2) {

		String s1 = "" + num1 + num2;
		String s2 = "" + num2 + num1;

		long res1 = Long.parseLong(s1);
		long res2 = Long.parseLong(s2);

		if (res1 >= res2) {
			return 1;
		} else {
			return -1;
		}

	}

}
