package miscellaneousProblems;

public class Rand5 {
	
	long rand5(){
		long start_time = System.currentTimeMillis();
		return start_time % 6;
	}

	public static void main(String[] args) {
		System.out.println(new Rand5().rand5());
	}

}
