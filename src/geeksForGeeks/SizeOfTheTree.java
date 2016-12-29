package geeksForGeeks;

import dataStructureImplementations.Node;

public class SizeOfTheTree extends Node{
	int size;
	public SizeOfTheTree(Node r) {
		super(r);
	}
	
	public void calculateSize(Node n){
		if(n.getRoot()==null){
			size++;
		}
		for(Node e: n.getChildren()){
			size++;
			calculateSize(e);
		}
	}

	public static void main(String[] args) {
		Node n = new Node(null);
		n.setData("root");

		Node child_1 = n.addChild(n, "left-child-1");
		Node child_2 = n.addChild(n, "right-child-1");

		Node child_11 = child_1.addChild(child_1, "left-child-L1");
		Node child_12 = child_1.addChild(child_1, "left-child-R1");
		
		Node child_21 = child_2.addChild(child_2, "right-child-L1");
		Node child_22 = child_2.addChild(child_2, "right-child-R1");

		SizeOfTheTree sott = new SizeOfTheTree(n);
		sott.calculateSize(n);
		System.out.println("size of the tree is: "+sott.size);
	}

}
