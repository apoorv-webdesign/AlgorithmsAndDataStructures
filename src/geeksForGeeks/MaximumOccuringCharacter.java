package geeksForGeeks;

import java.util.Scanner;

public class MaximumOccuringCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String st = scan.next();
		scan.close();
		int max=0;
		int[]charArr = new int[256];
		int index=0;
		for(int i=0; i<st.length();i++){
			index=(int)st.charAt(i);
			charArr[index]=charArr[index]+1;
			if(max<index){
				max=index;
			}
		}
		System.out.println((char)max);
		
		
		//############Bruteforce###############
		/*Scanner scan = new Scanner(System.in);
		String st = scan.next();
		scan.close();
		char [] stAsCharArr = st.toCharArray();
		int currCount=1;
		int prevCount=0;
		char ch = 0;
		for(int i = 0; i < stAsCharArr.length;i++){
			currCount=1;
			for(int j=i+1; j<stAsCharArr.length;j++){
				if(stAsCharArr[i]==(stAsCharArr[j])){
					System.out.println("true");
					currCount++;
				}
			}
			if(currCount>prevCount){
				prevCount =currCount;
				ch=stAsCharArr[i];
			}
		}
		System.out.println(prevCount+";"+ch);
		System.out.println(stAsCharArr.length);*/
	}

}
