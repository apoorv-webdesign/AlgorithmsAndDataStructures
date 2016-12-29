package geeksForGeeks;

import java.util.Arrays;
import java.util.Scanner;

public class RecurringString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();
		System.out.println("String is :" + s);
		char[] c = s.toCharArray();
		int count = 0;
		char[] newChar = new char[c.length];
		newChar[0] = c[0];

		for (int i = 1; i < c.length; i++) {
			if (i < (c.length - 1) && c[i] == c[i + 1]) {
				continue;
			} else {
				if (c[i] != c[i - 1]) {
					if (c[i] != newChar[count]) {
						newChar[++count] = c[i];
					} else {
						//newChar= new char[c.length];
						newChar = Arrays.copyOfRange(newChar, 0, count);
						//count--;
					}
				}
			}
		}
		System.out.println(newChar);
	}
}
