package geeksForGeeks;

import java.util.Scanner;

public class RemoveDuplicateParantheses {

	private char[] c;
	private int top;
	private int size;

	public RemoveDuplicateParantheses(int s) {
		this.size = s;
		top = -1;
		c = new char[size];
	}

	public void push(char ch) {
		c[++top] = ch;
	}

	public char pop() {
		return c[top--];
	}

	public char peek() {
		return c[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("enter the string");
		String input = scan.nextLine();
		System.out.println("this was your string " + input);
		System.out.println("length of string is " + input.length());
		RemoveDuplicateParantheses dup = new RemoveDuplicateParantheses(
				input.length());
		// System.out.println("char at:" + input.charAt(5));

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != ')') {
				dup.push(input.charAt(i));
			}
			if (input.charAt(i) == ')') {
				dup.push(input.charAt(i));

				if (dup.peek() == '(') {
					System.out.println("duplicate");
					break;
				}

				while (dup.peek() != '(') {
					System.out.println("popping out " + dup.pop());
				}

				System.out.println("popping out " + dup.pop());
			}

			/*
			 * if (input.charAt(i) != ')') { dup.push(input.charAt(i)); } else {
			 * while (dup.pop() != '('||dup.isEmpty()) {
			 * System.out.println("i is"+i); System.out.println(dup.pop()); } }
			 */
		}
		while (!dup.isEmpty()) {
			System.out.println(dup.pop());
		}
		scan.close();
	}

}
