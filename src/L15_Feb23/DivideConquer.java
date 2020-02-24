package L15_Feb23;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 23-Feb-2020
 *
 */

public class DivideConquer {

	public static void main(String[] args) {

		int[] arr = { 90, 50, 30, 80, 60, 20, 45, 10, 70, 25 };

		// int[] ans = mergeSort(arr, 0, arr.length - 1);
		quickSort(arr, 0, arr.length - 1);

		for (int val : arr) {
			System.out.print(val + " ");
		}
	}

	public static int[] mergeTwoSortedArrays(int[] one, int[] two) {

		int[] res = new int[one.length + two.length];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < one.length && j < two.length) {

			if (one[i] < two[j]) {
				res[k] = one[i];
				k++;
				i++;
			} else {
				res[k] = two[j];
				k++;
				j++;
			}

		}

		if (i == one.length) {
			while (j < two.length) {
				res[k] = two[j];
				k++;
				j++;
			}

		}

		if (j == two.length) {
			while (i < one.length) {
				res[k] = one[i];
				k++;
				i++;
			}

		}

		return res;

	}

	public static int[] mergeSort(int[] arr, int lo, int hi) {

		if (lo == hi) {
			int[] br = new int[1];
			br[0] = arr[lo];
			return br;
		}
		int mid = (lo + hi) / 2;

		int[] fh = mergeSort(arr, lo, mid);
		int[] sh = mergeSort(arr, mid + 1, hi);

		int[] merged = mergeTwoSortedArrays(fh, sh);

		return merged;
	}

	public static void quickSort(int[] arr, int lo, int hi) {

		if (lo >= hi) {
			return;
		}

		int mid = (lo + hi) / 2;

		int pivot = arr[mid];

		// partitioning
		int left = lo;
		int right = hi;

		while (left <= right) {

			// move left to a problem
			while (arr[left] < pivot) {
				left++;
			}

			// move right to a problem
			while (arr[right] > pivot) {
				right--;
			}

			// problem solve : swap
			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}

		}

		// smaller problems
		quickSort(arr, lo, right);
		quickSort(arr, left, hi);

	}
}





