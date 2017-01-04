package dataStructureImplementations;

import java.util.ArrayList;

public class Queue {
	private ArrayList<Integer> queue;
	private int index;
	
	public Queue(){
		queue = new ArrayList<Integer>();
		index =0;
	}
	
	public void push(int n){
		queue.add(n);
	}
	
	public int pop(){
		return queue.get(index++);
	}
	
	public boolean isEmpty(){
		return (index == queue.size());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		
		for(int i=1; i<5; i++){
		q.push(i*10);
		}
		do{
			System.out.println(q.pop());
		}
		while(!q.isEmpty());
	}

}
