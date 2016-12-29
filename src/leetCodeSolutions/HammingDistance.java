package leetCodeSolutions;

public class HammingDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
		int y=4;
		int count=0;
		int rem1=0, rem2=0;
		int max=Math.max(x, y);
		
		while (max>=1){
			rem1=x%2;
			x=x>>1;
			rem2=y%2;
			y=y>>1;
			max=max>>1;
			if((rem1 + rem2 ==1)){
				count++;
			}
		}
		System.out.println(count);
	}

}
