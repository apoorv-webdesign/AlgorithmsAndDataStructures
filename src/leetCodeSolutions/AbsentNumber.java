package leetCodeSolutions;


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//Purpose: Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), 
//some elements appear twice and others appear once.
//Find all the elements of [1, n] inclusive that do not appear in this array.

public class AbsentNumber {
	// solution using extra space
	void findAbsentNumberExtraSpace(int[] nums) {
		
		HashMap<Integer, Integer> r = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			if(!r.containsKey(i+1))
				r.put(i + 1, 0);
			r.put(nums[i], 1);
		}
		Set<Integer> keySet = new HashSet<Integer>(r.keySet()); 
		
		for (Integer entry : keySet) {
			if (r.get(entry) != 0) {
				r.remove(entry);
			}
		}
		System.out.println(r.keySet());
	}
	// solution without without extra space in one pass
	void findAbsentNumber(int []nums){
		for(int i=0; i<nums.length; i++){
			int val = Math.abs(nums[i])-1;
			System.out.println(Arrays.toString(nums));
			System.out.println(val);
			if(nums[val]>0)
			nums[val] = -nums[val];
			System.out.println(Arrays.toString(nums));
		}
		System.out.println(Arrays.toString(nums));
		for(int i=0; i<nums.length;i++){
			if(nums[i]> 0){
				System.out.println(i+1);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] nums = { 5, 2, 3, 6, 3, 2 };
		AbsentNumber an = new AbsentNumber();
		//an.findAbsentNumberExtraSpace(nums);
		an.findAbsentNumber(nums);
	}

}
