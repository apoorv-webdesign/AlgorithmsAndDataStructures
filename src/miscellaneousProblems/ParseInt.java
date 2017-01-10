package miscellaneousProblems;
// Purpose:Implement the parseInt method
public class ParseInt {

	int parseInteger(String str) {
		int neg = 1;
		switch (str.charAt(0)) {
		case '+':
			str = str.substring(1);
			break;
		case '-':
			neg = -1;
			str = str.substring(1);
			break;
		}
		return parseString(str, neg);
	}
	
	int parseString(String str, int neg){
		int a = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)>=48 && str.charAt(i)<=57){
				a = a * 10 + (str.charAt(i) - 48);
			}
			else{
				a=0;
				break;
			}
		}
		return a * neg;
	}

	public static void main(String[] args) {
		String str = "-13890";
		ParseInt pi = new ParseInt();
		System.out.println(pi.parseInteger(str));
	}

}
