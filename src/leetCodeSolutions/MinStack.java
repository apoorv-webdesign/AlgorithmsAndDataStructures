package leetCodeSolutions;

import java.util.ArrayList;
import java.util.Collections;

public class MinStack {
	ArrayList<Integer> stack;
	int index;
	
	public MinStack(){
		stack = new ArrayList<Integer>();
		index=-1;
	}
	
	public void push(int item){
		stack.add(item);
		index++;
	}
	public void pop(){
		stack.remove(index);
		index--;
	}
	
	public int minStack(){
		return Collections.min(stack);
	}
	
	public void display(){
		System.out.println(stack);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack s = new MinStack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.display();
		s.pop();
		s.display();
		System.out.println(s.minStack());
	}

}
