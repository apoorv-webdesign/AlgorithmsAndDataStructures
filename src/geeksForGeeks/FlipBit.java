package geeksForGeeks;

import java.util.ArrayList;
import java.util.Scanner;

public class FlipBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int zero = 0;
		int one = 0;
		ArrayList<Integer> flip = new ArrayList<Integer>();
		while (reader.hasNextInt()) {
			flip.add(reader.nextInt());
		}
		for (int i : flip) {
			if (0 == i) {
				zero++;
			}
			if (1 == i) {
				one++;
			}
		}
		if (one == 1 || zero == 1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
