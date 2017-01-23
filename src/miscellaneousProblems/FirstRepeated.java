package miscellaneousProblems;

import java.util.Arrays;

public class FirstRepeated {

	public static void main(String[] args) {
		String s = "bcdbefagha";
		int[] array = new int[256];
		int c = 0;
		for (int i = 0; i < s.length(); i++) {
			c = array[(int) s.charAt(i)];
			array[(int) s.charAt(i)] = c+1;
		}
		for (int i = 0; i < s.length(); i++) {
			if (array[(int)s.charAt(i)] > 1) {
				System.out.println(s.charAt(i));
				break;
			}
		}
	}

}
