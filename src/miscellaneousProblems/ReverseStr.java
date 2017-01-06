package miscellaneousProblems;

public class ReverseStr {
	// Purpose: Reverse a String using iteration
	public String reverseIteration(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		return reverse;
	}
	// Purpose: Reverse a String using recursion	
	public String reverseRecursion(String str) {
		if(str==null || str.length()<=1){
			return str;
		}
		return (reverseRecursion(str.substring(1))+str.charAt(0)) ;
	}	

	public static void main(String[] args) {

		String str = "Apoorv";
		ReverseStr rs = new ReverseStr();

		System.out.println(rs.reverseIteration(str));
		System.out.println(rs.reverseRecursion(str));
	}

}
