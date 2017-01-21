package miscellaneousProblems;

import java.util.Arrays;

// Purpose: Given an array having arrival and departure time, find the minimum number of platforms required
public class ArrivalDeparture {
	// Solution with time complexity n^2
	int noOfPlatformsn2(int[] arr, int[] dep) {
		int platform = 1;
		int totdep = 0;

		for (int i = 0; i < arr.length; i++) {
			totdep = 0;
			for (int j = 0; j < dep.length; j++) {
				if (arr[i] > dep[j]) {
					totdep++;
				}
			}
			if (platform < i + 1 - totdep)
				platform = i + 1 - totdep;
		}
		return platform;
	}

	// solution with complexity nlogn
	int noOfPlatformsnlogn(int[] arr, int[] dep) {
		int platform = 1;
		int totdep = 0;
		int j = 0;
		Arrays.sort(arr);
		Arrays.sort(dep);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > dep[j]) {
				totdep++;
				j++;
			}
			if (platform < i + 1 - totdep)
				platform = i + 1 - totdep;
		}
		return platform;
	}

	public static void main(String[] args) {
		int[] arr = { 900, 940, 950, 1110, 1500, 1800 };
		int[] dep = { 910, 1200, 1120, 1130, 1900, 2000 };

		ArrivalDeparture ad = new ArrivalDeparture();
		System.out.println(ad.noOfPlatformsn2(arr, dep));
		System.out.println(ad.noOfPlatformsnlogn(arr, dep));
	}

}
