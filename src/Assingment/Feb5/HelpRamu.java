package Assingment.Feb5;

import java.util.Scanner;

public class HelpRamu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int c1 = scn.nextInt();
		int c2 = scn.nextInt();
		int c3 = scn.nextInt();
		int c4 = scn.nextInt();

		int nor = scn.nextInt();
		int noc = scn.nextInt();

		int[] rick = new int[nor];
		int[] cabs = new int[noc];

		for (int i = 0; i < nor; i++) {
			rick[i] = scn.nextInt();
		}

		for (int i = 0; i < noc; i++) {
			cabs[i] = scn.nextInt();
		}

		int minFareCabs = minFarec1c2c3(cabs, c1, c2, c3);
		int minFareRick = minFarec1c2c3(rick, c1, c2, c3);

		int total_fare = minFareCabs + minFareRick;

		System.out.println(Math.min(total_fare, c4));

	}

	public static int minFarec1c2c3(int[] vehicle, int c1, int c2, int c3) {

		int fare = 0;

		for (int i = 0; i < vehicle.length; i++) {

			fare += Math.min(vehicle[i] * c1, c2);
		}

		return Math.min(fare, c3);

	}

}
