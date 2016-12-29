package geeksForGeeks;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPairSum {

	public static void main(String[] args) {
		ArrayList<Integer> pairSum = new ArrayList<Integer>();
		Scanner reader = new Scanner(System.in);
		String end = reader.next();
		System.out.println(end);
		while (! "end".equals(end)){
			int n = reader.nextInt(); // Scans the next token of the input as an int.
			//(if end isNumber)
			pairSum.add(n);
		}
		//System.out.println("Enter a number: ");
		//System.out.println(n +" this is the number");
		
	}

}
