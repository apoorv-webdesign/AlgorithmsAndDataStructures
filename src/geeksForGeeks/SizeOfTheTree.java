package geeksForGeeks;

import dataStructureImplementations.BinaryTree;
import dataStructureImplementations.Node;

public class SizeOfTheTree extends BinaryTree{
	int size;
	
/*	public SizeOfTheTree(){
		super();
	}*/
	public int calculateSize(Node n){
		if(n==null){
			return 0;
		}
		else{
			return(calculateSize(n.left)+ 1 + calculateSize(n.right));
		}
	}

	public static void main(String[] args) {
		SizeOfTheTree sott =new SizeOfTheTree();
		
		sott.root=new Node("1");
		sott.root.left=new Node("2");
		sott.root.right=new Node("3");
		
		System.out.println(sott.calculateSize(sott.root));
	}

}
