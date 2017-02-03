package miscellaneousProblems;
// Purpose : find gcd of the two numbers
// Solution: Euclidean Algrithms
public class CalculateGCD {
	public int calcGCD(int a, int b){
		return b == 0 ? a : calcGCD (b, a % b); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new CalculateGCD().calcGCD(110, 22));
		System.out.println(new CalculateGCD().calcGCD(0, 22));
		System.out.println(new CalculateGCD().calcGCD(22, 0));
		System.out.println(new CalculateGCD().calcGCD(0, 0));
	}

}
