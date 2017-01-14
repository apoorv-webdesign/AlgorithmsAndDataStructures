package leetCodeSolutions;

public class FlipBits {
	// 476.
	//Purpose:Given a positive integer, output its complement number. 
	//The complement strategy is to flip the bits of its binary representation.
	public static void main(String[] args) {
		int digit =1;
		int mask =0;
		int num =19;
		
		while (mask< num){
			mask |=digit;
			System.out.println(mask);
			digit = digit << 1;
			System.out.println(digit);			
		}
		System.out.println(~5 & mask);
	}

}
