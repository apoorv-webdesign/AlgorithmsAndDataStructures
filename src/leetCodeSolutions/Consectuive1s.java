package leetCodeSolutions;
//Purpose: Given a binary array, find the maximum number of consecutive 1s in this array.

public class Consectuive1s {
	
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter=0;
        int result=0;
        
        for(int i=0; i<nums.length;i++){
            if(nums[i]==1){
                counter++;
            }
            else{
                counter=0;
            }
            if(counter>result){
                result=counter;
            }
        }
        return result;
    }
    
	public static void main(String[] args) {
		int[] nums = {0,1,1,1,1,1,1,0,1,1,1,0,1,1,1,0};
		Consectuive1s c1 = new Consectuive1s();
		
		System.out.println(c1.findMaxConsecutiveOnes(nums));
	}

}
