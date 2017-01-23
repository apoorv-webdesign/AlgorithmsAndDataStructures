package miscellaneousProblems;

import java.util.HashMap;
//Purpose display the number of pairs in array which have sum =k
public class KSum {

	public static void main(String[] args) {
		int[] arr = {5, 3, 3, 4, 5, 6, 1, 2};
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		int k=7;
		int count=0;
		for(int i=0; i<arr.length;i++){
			if(map.containsKey(arr[i])){
				count++;
			}			
			map.put(k-arr[i], arr[i]);
		}
		System.out.println(count);
	}

}
