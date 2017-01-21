package miscellaneousProblems;

public class EmailAddressMasking {

	public static void main(String[] args) {
		String s = "apoorvanand@gmail.com";
		// char b=s.charAt(0);
		String uname = "";
		String email = "";
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == '@') {
				uname = s.substring(0, 1) + "*****" + s.substring(i - 1, i);
				email = s.substring(i, s.length());
				break;
			}
		}
		System.out.println(uname + email);

		String phone = "(333)444 5678";
		String output = "";
		if (phone.charAt(0) == '+')
			output = "+";
		for (int i = 0; i < phone.length() - 4; i++) {
			if(Character.isWhitespace(phone.charAt(i))){
				output +="-";
				continue;
			}
			if(phone.charAt(i)=='(' || phone.charAt(i)==')' ){
				continue;			
			}
			if (Character.isDigit(phone.charAt(i))){
				output += "*";
				continue;
			}
			if(phone.charAt(i)=='-')
				output +="-";
		}
		output += phone.substring(phone.length() - 4, phone.length());
		System.out.println(output);
	}

}
