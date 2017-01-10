package miscellaneousProblems;
//Purpose: check if the string is palindrome
public class Palindrome {
	//String -> Boolean
	//Purpose: Check if the String is Palindrome
	boolean checkPalindrome(String str){
		int start=0, end=str.length()-1;
		
		while(start<end){
			if(str.charAt(start)==str.charAt(end)){
				start++;
				end--;
			}
			else{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Palindrome p =new Palindrome();
		System.out.println(p.checkPalindrome("apbaba"));
	}

}
