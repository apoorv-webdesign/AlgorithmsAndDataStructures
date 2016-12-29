package geeksForGeeks;

import java.util.Scanner;

public class ExcelColumns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int s=in.nextInt();
		int rem=0;
		char []st = new char[10];
		char p = 'a';
		int count=0;
		while (s>1){
			if(s<26){
				System.out.println((char)(64+s));
				break;
			}
			s=s-26;
			p=(char) (65+s);
			System.out.println(p);
			/*rem=s%26;
			System.out.println("rem"+rem);
			p=(char) (65+rem);
			s=s/26;
			System.out.println("p:"+p);
			count++;
			rem=0;*/
		}
	}

}
