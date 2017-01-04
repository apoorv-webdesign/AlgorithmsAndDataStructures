package miscellaneousProblems;

public class Fibonacci {
	//Purpose: print nth fibonacci number
	public int fib(int n){
		if(n<3){
			return 1;
		}
		else{
			 
			return fib(n-2)+ fib(n-1);
		}
	}

	public static void main(String[] args) {
		Fibonacci fn = new Fibonacci();
		System.out.println(fn.fib(5));
	}

}
