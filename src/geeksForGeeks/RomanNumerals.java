package geeksForGeeks;

import java.util.Scanner;

public class RomanNumerals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String roman = "";
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number");
		int n = input.nextInt();

		int rem100 = n % 100;
		int noOfHundreds = (n - rem100) / 100;
		System.out.println("noOfHundreds:" + noOfHundreds);

		int noOfFiftiesAfterHundred = rem100 / 50;
		// int noOfFiftiesAfterHundred = rem50/2;
		System.out.println("noOfHundreds:" + noOfFiftiesAfterHundred);

		int noAfterFiftiesAndHundred = n
				- ((noOfHundreds * 100) + (noOfFiftiesAfterHundred * 50));
		System.out.println("noAfterFiftiesAndHundred: "
				+ noAfterFiftiesAndHundred);

		int rem10 = noAfterFiftiesAndHundred / 10;
		int noOfTens = rem10;

		int noAfterTensFiftiesAndHundreds = (noAfterFiftiesAndHundred - (10 * rem10));

		System.out.println("noAfterTensFiftiesAndHundreds: "
				+ noAfterTensFiftiesAndHundreds);

		int noOfFives = rem10 / 5;

		int rem_no = rem10 % 5;

		if (noOfHundreds != 0) {
			while (noOfHundreds > 0) {
				roman += "C";
				noOfHundreds--;
			}
		}

		if (noOfFiftiesAfterHundred != 0) {
			while (noOfFiftiesAfterHundred > 0) {
				roman += "L";
				noOfFiftiesAfterHundred--;
			}
		}
		System.out.println("noOfTens" + noOfTens);
		if (noOfTens == 4) {
			roman += "XL";
		}
		if (noOfTens != 0 && noOfTens != 4) {
			while (noOfTens > 0) {
				roman += "X";
				noOfTens--;
			}
		}
		if (noAfterTensFiftiesAndHundreds > 5
				&& noAfterTensFiftiesAndHundreds < 9) {
			roman += "V";
			noAfterTensFiftiesAndHundreds -= 5;
			while (noAfterTensFiftiesAndHundreds > 0) {
				roman += "I";
				noAfterTensFiftiesAndHundreds--;
			}
		}
		if (noAfterTensFiftiesAndHundreds < 4
				&& noAfterTensFiftiesAndHundreds != 0) {
			while (noAfterTensFiftiesAndHundreds > 0) {
				roman += "I";
				noAfterTensFiftiesAndHundreds--;
			}
		}
		
		if(noAfterTensFiftiesAndHundreds == 4){
			roman+="IV";
		}
		if(noAfterTensFiftiesAndHundreds == 9){
			roman+="IX";
		}

		System.out.println("Roman Numeral is " + roman);
	}

}
