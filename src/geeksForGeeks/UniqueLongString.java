package geeksForGeeks;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueLongString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String s = in.next();
		System.out.println(s);

		int k = in.nextInt();
		int length1 = 0;
		int length2 = 0;
		char[] ch = s.toCharArray();
		int count = 0;

		Set<Character> cSet = new HashSet<Character>();
		Set<Character> cSet2 = new HashSet<Character>();

		for (char c : ch) {
			cSet2.add(c);
		}
		if (k > cSet2.size()) {
			System.out.println("k is not plausible");
		} else {
			for (int i = 0; i < ch.length; i++) {
				cSet.add(ch[i]);
				if (cSet.size() > k && i==ch.length-1) {
					break;
				}
				else if(cSet.remove(ch[count])){
					length2 = length1;
				}
				else{
					length1++;
				}
			}
			System.out.println(length);
		}
	}
}
/*
 * if(ch[i]==ch[i+1]){ length++; } else{ cSet.add(ch[i]); length++; }
 */
