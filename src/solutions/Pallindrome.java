package solutions;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A man, a plan, a canal: Panama";
		//Solution 2
		for (int i = 0, j = s.length() - 1; (i < s.length() && j > 0);) {
			if (!Character.isLetterOrDigit(s.charAt(i))) {
				i++;
				continue;
			}
			if (!Character.isLetterOrDigit(s.charAt(j))) {
				j--;
				continue;
			}
			if (Character.toLowerCase(s.charAt(j)) == Character.toLowerCase(s.charAt(i))) {
				i++;
				j--;
				continue;
			} else {
				System.out.println("i:" + i + s.charAt(i));
				System.out.println("j:" + j + s.charAt(j));
				System.out.println("false");
				break;
			}
		}
		System.out.println("true");
	}
	// Solution 1
	/*
	 * s=s.toLowerCase(); char[] ch = s.toCharArray(); StringBuilder sb1 = new
	 * StringBuilder(); StringBuilder sb2 = new StringBuilder(); for (int i = 0;
	 * i<ch.length; i++) { if (Character.isLetterOrDigit(ch[i])){
	 * sb2.append(ch[i]); } } for (int i = ch.length - 1; i >= 0; i--) { if
	 * (Character.isLetterOrDigit(ch[i])) {
	 * sb1.append(Character.toLowerCase(ch[i])); } } String newS1 =
	 * sb1.toString(); String newS2 = sb2.toString();
	 * System.out.println("newS1:" + newS1 + "  newS2" + newS2); if
	 * (newS1.equals(newS2)) { System.out.println("true"); }
	 */

}
