package ctc;

import java.util.*;
public class ThreeStacks {
	//Purpose: implement three stacks in a single array
	private int[] stack;
	int index0;
	int index1;
	int index2;	
	
	public ThreeStacks(int size){
		stack = new int[size];
		index0=0;
		index1=1;
		index2=2;		
	}
	public void push(int s,int n){
		switch (s) {
		case 0:
			stack[index0]=n;
			index0 = index0 + 3;
			break;
		case 1:		
			stack[index1]=n;
			index1 = index1 + 3;			
			break;
		case 2:		
			stack[index2]=n;
			index2 = index2 + 3;			
			break;
		}	
		
	}
	
	public int pop(int s){
		int result=0;
		switch (s) {
		case 0:
			System.out.println("index0 "+index0);
			index0 = index0 - 3;
			return stack[index0];
		case 1:
			System.out.println("index1 "+index1);
			index1 = index1 - 3;
			return stack[index1];
		case 2:
			System.out.println("index2 "+index2);			
			index2 = index2 - 3;
			return stack[index2];
		}
		return result;
	}
	
	public boolean isEmpty(int s){
		switch (s) {
		case 0:
			return (index0<=1);
		case 1:
			return (index1<=2);
		case 2:
			return (index2<=3);
		}
		return false;
	}
	
	public static void main(String[] args) {
		ThreeStacks ts = new ThreeStacks(20);
		//push elements to stack 1
		for(int i=0;i<5;i++){
			ts.push(0, i);
		}
		//push elements to stack 2		
		for(int i=5;i<10;i++){
			ts.push(1, i);
		}	
		//push elements to stack 3		
		for(int i=10;i<15;i++){
			ts.push(2, i);
		}
		
/*		for(int i=0; i<15;i++){
			System.out.println(ts.stack[i]);
		}*/
		
		System.out.println("Stack");
		//pop elements from stack 3		
		while (!ts.isEmpty(2)){
			System.out.println(ts.pop(2));
		}

	}

}
