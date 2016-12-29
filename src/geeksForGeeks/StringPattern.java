package geeksForGeeks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StringPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str, ptr;
		HashMap<Integer, Character> pat = new HashMap<Integer, Character>();
		Scanner reader = new Scanner(System.in);
		System.out.println("enter the string");
		str = reader.nextLine();
		System.out.println("enter the pattern");
		ptr = reader.nextLine();
		System.out.println(str + "  " + ptr);
		
		StringBuilder sb = new StringBuilder();
		//delete extra characters
		for(int i = 0; i<str.length();i++){
			for(int j=0;j<ptr.length();j++){
				if(ptr.charAt(j) == str.charAt(i)){
					sb.append(str.charAt(i));
				}
			}
		}
		String result = sb.toString();
		System.out.println("Matching characters with duplicates are "+result);
		
		char [] chararray = result.toCharArray();
		Set<Character> s = new LinkedHashSet<Character>();
		for (char c: chararray){
			s.add(c);
		}
		
		StringBuilder newString = new StringBuilder();
		for(char c: s){
			newString.append(c);
		}

		System.out.println("Matching characters without duplicates "+newString.toString());
		
		if(newString.toString().equals(ptr)){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		
		/*StringBuilder finalresult = new StringBuilder();		
		for(int i=0; i<result.length();i++){
			for(int j=i+1;j<result.length();j++){
				if(sb.charAt(i)!=sb.charAt(j)){
					finalresult.append(sb.charAt(i));
					break;
				}
			}
		}
		System.out.println(finalresult.toString());*/

		/*for (int j = 0; j < ptr.length(); j++) {
			pat.put(j, ptr.charAt(j));
		}
		Iterator it =pat.entrySet().iterator();
		int k=0;
		while(k<str.length()){
             while(it.hasNext()){
            	 Map.Entry map = (Map.Entry)it.next();
            	 if (map.getValue().equals(str.charAt(k))){
            		 
            	 }
             }
		}
		reader.close();*/
	}

}
