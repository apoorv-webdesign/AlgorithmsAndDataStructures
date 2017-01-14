package AlgorithmImplementations;

import java.util.Collections;

// Purpose: Algorithm for picking number randomly out of given numbers 
public class WeightedRandomNumbers {
	// get modulus of the current time in milis to get a random number less than the total weight of items
	long random(long ws) {
		return (System.currentTimeMillis() % ws);
	}

	long weightedRandomNumbers(long[]items, long weighted_sum){
		long rnd =random(weighted_sum)/2;
		for(int i=0; i<items.length; i++){
			System.out.println(rnd);
			if(rnd < items[i]){
				return items[i];
				}
			rnd -=items[i];
			}
		return 978944545;
	}

	public static void main(String[] args) {
		WeightedRandomNumbers wrn = new WeightedRandomNumbers();

		// This is a list of items out of which we will pick numbers randomly
		long[] items = { 10, 11, 3, 22, 4, 2, 6, 7, 5, 8, 9, 1 };
		long weighted_sum = 0;
		for (int i = 0; i < items.length; i++) {
			weighted_sum += items[1];
		}
		System.out.println("weighted_sum "+weighted_sum);
		//
		System.out.println(wrn.weightedRandomNumbers(items,weighted_sum ));
	}
}
