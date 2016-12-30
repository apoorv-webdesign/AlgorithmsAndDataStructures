package miscellaneousProblems;

public class CamelCase {

	public static void main(String[] args) {
		//Purpose: convert camelCase to lowercase
		String word = "John,IsAGoodBoy.";
		char[] ch = word.toCharArray();
		int x = 0;
		
		for (int i = 0; i < ch.length; i++) {
			x = (int) ch[i];
			if (Character.isLetter(ch[i]) && x < 97) {
				x = x + 32;
				ch[i] = (char) x;
			}
		}
		
		word = "";
		for (char c : ch) {
			word += c;
		}
		
		System.out.println("word after removing camelCase: "+word);
	}

}
