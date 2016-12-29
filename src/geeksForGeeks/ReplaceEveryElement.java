package geeksForGeeks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ReplaceEveryElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();
		System.out.println("Enter no of ints");
		int size = input.nextInt();
		while (0<size){
			array.add(input.nextInt());
			size--;
		}
		Iterator<Integer> itr = array.iterator();
		//System.out.println(array.get(0));
		System.out.println("befores");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		for (int i = 0; i < array.size(); i++) {
			for(int j=i+1; j<array.size()-1;j++){
				if (array.get(j)< array.get(i)){
					int elementGreater = array.get(j);
					array.add(j, array.get(i));
					array.add(i, elementGreater);
				}
			}
		}
		System.out.println("after");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}


	}

}
