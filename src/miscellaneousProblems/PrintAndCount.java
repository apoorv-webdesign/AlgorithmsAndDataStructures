package miscellaneousProblems;

public class PrintAndCount {
//"1"
//"11"
//"21"
//"1211"
//"111221"
	public static void main(String[] args) {
		String s = "1";
		int n = 2;
		int count=1;
		for (int i = 1; i < n; i++) {
			if(i==1){
				s="11";
				continue;
			}
			
/*			for(int j=i;i<s.length();j++){
				if(s.charAt(j) == s.charAt(i-1)){
					count++;
				}
				else{
					break;
				}
			}*/
			//s = Integer.toString(count)+s.charAt();
/*			//loop=0;
			while(s.charAt(loop) == s.charAt(++loop)){
				count = count+1;
				if(loop+1 < s.length()-1){
					loop++;
				}
				else{
					break;
				}
			}*/
		}
		System.out.println(s);
	}
}
