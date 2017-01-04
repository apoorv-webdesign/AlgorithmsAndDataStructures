package dataStructureImplementations;

import java.util.*;
public class Stack {
	
	private ArrayList<Integer> stack;
	//private ArrayList<Object> stack;
	private int index;
	
	public Stack(){
		stack = new ArrayList<Integer>();
		index=-1;
	}
	
	public void push(int n){
		stack.add(n);
		index++;
	}
	
	public int pop(){
		return  stack.get(index--);
	}
	
	public boolean isEmpty(){
		return (index==-1);
	}
	
	public int peek(){
		return  stack.get(index);
	}

	public static void main(String[] args) {
		Stack s = new Stack();
		
		for(int i=1; i<5; i++){
			s.push(i*10);
		}
		
		System.out.println("last element: "+s.peek());
		System.out.println("Elements in stack are: ");
		while (!s.isEmpty()){
			System.out.println(s.pop());
		}
	}

}
