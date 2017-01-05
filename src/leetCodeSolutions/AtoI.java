package leetCodeSolutions;

public class AtoI {

	public static void main(String[] args) {
		
		String str = "   12Apoorv";
		str=str.trim();
		int result=0,r=0;
		int reverse =0;
		for(int i=0; i<str.length();i++){
			if(!Character.isDigit(str.charAt(i)) || str.ch){
				break;
			}
			if(Character.isDigit(str.charAt(i))){
				result += (str.charAt(i)-48) * Math.pow(10, r);
				r++;
			}
		}
		r=1;
		while (result!=0){
			r = result%10;
			reverse =reverse*10+r;
			result = result/10;
		}
		System.out.println(reverse);

	}

}
