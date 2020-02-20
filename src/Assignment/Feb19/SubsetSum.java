package Assignment.Feb19;

public class SubsetSum {

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3 };
		subsets(arr, 0, 0, 3, "");
	}

	public static void subsets(int[] arr, int vidx, int ssf, int target, String ans) {

		if (vidx == arr.length) {

			if (ssf == target)
				System.out.println(ans);
			return;
		}
		subsets(arr, vidx + 1, ssf, target, ans);
		subsets(arr, vidx + 1, ssf + arr[vidx], target, ans + arr[vidx] + " ");

	}

}
