package miscellaneousProblems;

public class ReverseAnArray {

	public static void main(String[] args) {
		// Purpose: Reverse an Array/String without affecting the special characters
		//Challenge: how to do it without extra space in Java?
		String str = "Ap%^oo*rv";
		char [] newCh = str.toCharArray();//new char[str.length()];
		char ch;
		int length= (str.length()-1), index=0;
		
		while(index<length){
			if(! Character.isLetterOrDigit(str.charAt(length))){
				length--;
			}
			else if(! Character.isLetterOrDigit(str.charAt(index))){			
				index++;
			}
			else{
				ch=str.charAt(length);
				newCh[length]= str.charAt(index);
				newCh[index]=ch;
				length--;
				index++;
			}
		}
		str = String.copyValueOf(newCh);
		System.out.println(str);
	}
}
