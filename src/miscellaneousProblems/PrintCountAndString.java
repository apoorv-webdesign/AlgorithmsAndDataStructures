package miscellaneousProblems;

import java.util.Arrays;

//Purpose: print count of occurrences and the character
//Example: "111" -> "3111"
//		   "1112222" -> "311142"
public class PrintCountAndString {
	public String countOccurences(String s) {
		int[] arr = new int[256];
		String result = "";
		int c = 0;

		for (int i = 0; i < s.length(); i++) {
			c = arr[s.charAt(i)];
			arr[s.charAt(i)] = c + 1;
			c = 0;
		}
		//System.out.println(Arrays.toString(arr));
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != 0) {
				result += arr[j];
				for (int k = 0; k < arr[j]; k++) {
					result += (char) j;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String s = "11122222211";
		PrintCountAndString pcas = new PrintCountAndString();

		System.out.println(pcas.countOccurences(s));
	}

}
