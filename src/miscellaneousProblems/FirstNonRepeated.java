package miscellaneousProblems;

import java.util.*;
import java.util.Map.Entry;

public class FirstNonRepeated {

	public static void main(String[] args) {
		String str = "abcbdaacd,fghhge";
		int count = 0;

		LinkedHashMap<Character, Integer> word = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			if (word.containsKey(str.charAt(i))) {
				word.put(str.charAt(i), word.get(str.charAt(i)) + 1);
			} else {
				word.put(str.charAt(i), count);
			}
		}

		int min = Collections.min(word.values());

		for (Entry<Character, Integer> i : word.entrySet()) {
			if (i.getValue() == min) {
				System.out.println("First non repeated characters is :" + i.getKey());
				break;
			}
		}
	}

}
