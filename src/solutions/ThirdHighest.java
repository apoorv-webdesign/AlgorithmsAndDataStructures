package solutions;

import java.util.SortedSet;
import java.util.TreeSet;

public class ThirdHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 0,1,1,1, 1, 2,-1, 3, 4, 5, 6,2};
		int c=0;
		SortedSet<Integer> s=new TreeSet<Integer>();// =new SortedSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			s.add(nums[i]);
		}
		for (Integer i : s) {
			c++;
			//if(c==nums.length-2)
			System.out.println(i);
		}
	}
}
