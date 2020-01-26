package Assingment.Jan24;

import java.util.Scanner;

public class RainWaterTrapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();

		while (t-- > 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			
			for(int i = 0;i < n;i++)
				arr[i] = scn.nextInt();

			System.out.println(maxWater(arr));
		}
	}

	public static int maxWater(int[] arr) {

		int[] leftMax = new int[arr.length];
		int[] rightMax = new int[arr.length];

		// Left Array
		leftMax[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
		}

		// Right Max
		rightMax[rightMax.length - 1] = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--) {
			rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
		}

		int water = 0;
		for (int i = 0; i < arr.length; i++) {
			water += Math.min(leftMax[i], rightMax[i]) - arr[i];
		}

		return water;

	}

}
