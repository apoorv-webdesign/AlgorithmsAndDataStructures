package miscellaneousProblems;

/*String Matching problem with s set of rules
i. Count 1 if an Upper case letter is followed by any Upper case letter
ii. Count 1 if an Upper case letter is followed by its same Lower case letter and dissolve the pair.
iii. if two lower case letters are present without a match stop and return count
Example: ABba will return 3 as A match with B, B matches with b and gets dissolved and then A matches with a and gets dissolved  */

public class ScoreString {

	public static void main(String[] args) {
		String s = "ABbaBBCCdd";
		String s1 = "", s2 = "";
		int count = 0;
		int i = 0;
		while (s.length() != 0 && i < s.length() - 1) {
			if ((s.charAt(i) >= 65 && s.charAt(i) <= 90) && (s.charAt(i + 1) >= 65 && s.charAt(i + 1) <= 90)) {
				count++;
				i++;
			} else if (s.charAt(i) == Character.toUpperCase(s.charAt(i + 1))) {
				count++;
				s1 = s.substring(0, i);
				s2 = s.substring(i + 2, s.length());
				s = s1 + s2;
				if (i == 0)
					continue;
				else
					i--;
			}/*else if (s.charAt(i) == s.charAt(i + 1)) {
				System.out.println(i);
				System.out.println("cond3");
				count++;
				i++;
			}*/ else {
				break;
			}
		}
		System.out.println(count);
	}

}
