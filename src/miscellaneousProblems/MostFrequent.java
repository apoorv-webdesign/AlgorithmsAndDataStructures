package miscellaneousProblems;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MostFrequent {
	//find the most frequent integer in the array
	public static void main(String[] args) {

		int[] fr = { 0, 1, 2, 3, 4, 5, 6, 1,2 };
		int c = 0;
		int max=0;
		
		HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();

		for (int i = 0; i < fr.length; i++) {
			if (freq.containsKey(fr[i])) {
				freq.put(fr[i], freq.get(fr[i]) + 1);
			} else {
				freq.put(fr[i], c);
			}
		}
		
		max = Collections.max(freq.values());
		System.out.println("Most frequent integers are");
		for (Entry<Integer, Integer> i : freq.entrySet()) {
			if(i.getValue()==max){
				System.out.println(i.getKey());
			}
		}
	}

}
