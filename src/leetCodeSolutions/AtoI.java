package leetCodeSolutions;

public class AtoI {

	public static void main(String[] args) {

		String str = "010";
		str = str.trim();
		int result = 0, flag=1;

		if (str.charAt(0) == '-' || str.charAt(0) == '+') {
			if (str.charAt(0) == '-') {
				flag = -1;
			}
			str = str.substring(1);
		}
		System.out.println(str);

		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				break;
			}
			if (Character.isDigit(str.charAt(i))) {
				result = result *10 + (str.charAt(i) - '0');
			}
		}

		System.out.println(result * flag);

	}

}
