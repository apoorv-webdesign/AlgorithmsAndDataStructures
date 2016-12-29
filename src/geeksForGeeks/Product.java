package geeksForGeeks;

import java.util.HashMap;

public class Product {

	public static void main(String[] args) {
		// n solution
		// TODO Auto-generated method stub
		int[] arr = { 5, 10, 6, 8, 2 };
		int[] newAr = new int[arr.length];
		int value=1;
		for(int i=0;i<arr.length;i++){
			newAr[i]=value;
			value *=arr[i];
		}
		for(int i:newAr){
			System.out.println(i);
		}		
		value=1;
		for(int i=arr.length-1;i>=0;i--){
			newAr[i] *=value;
			value *=arr[i];
		}
		for(int i:newAr){
			System.out.println(i);
		}
		
/*		n^2 solution
 * for (int i = 0,j=0; i < arr.length; i++) {
			newAr[i] = 1;
			
			newAr[i] *= arr[j];
		}*/
		/*
		 * for(int i=0; i<arr.length;i++){ newAr[i]=1; for(int
		 * j=0;j<arr.length;j++){ if(j==i){ continue; } newAr[i] *=arr[j]; } }
		 */
/*		for (int i : newAr) {
			System.out.println(i);
		}*/
	}

}
