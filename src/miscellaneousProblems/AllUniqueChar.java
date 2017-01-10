package miscellaneousProblems;

import java.util.HashSet;

//Purpose: Check if a String is composed of all unique characters

public class AllUniqueChar {

	public static void main(String[] args) {
		String str = "Aporv";
		HashSet <Character> s =  new HashSet<Character>();
		
		for(int i=0; i<str.length();i++){
			s.add(str.charAt(i));
		}
		if(s.size() == str.length()){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	}

}
