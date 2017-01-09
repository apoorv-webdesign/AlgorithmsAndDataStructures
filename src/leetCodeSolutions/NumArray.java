package leetCodeSolutions;

public class NumArray {
	    int [] nums;
	    public NumArray(int[] nums) {
	        this.nums = new int[nums.length];
	        for(int i=0; i<nums.length; i++){
	        	this.nums[i]=nums[i];
	        }
	    }

	    public int sumRange(int i, int j) {
	    	int sum=0;
	    	for(int k=i; k<=j;k++){
	    		sum=sum+nums[k];
	    	}
	    	return sum;
	    }
	    
	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		 NumArray numArray = new NumArray(a);
		 System.out.println(numArray.sumRange(0, 1));
		 numArray.sumRange(1, 2);

	}

}
