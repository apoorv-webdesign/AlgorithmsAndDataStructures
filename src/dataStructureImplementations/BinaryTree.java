package dataStructureImplementations;

import java.util.ArrayList;

public class BinaryTree {
	
	public Node root;
	
	public BinaryTree(){
		root=null;
	}
	
	public void postOrder(Node n){
		if(n==null){
			return;
		}
		postOrder(n.left);
		postOrder(n.right);
		System.out.println(n.key);
	}
	
	public void preOrder(Node n){
		if(n==null){
			return;
		}
		System.out.println(n.key);
		preOrder(n.left);
		preOrder(n.right);
		
	}	
	
	public void inOrder(Node n){
		if(n==null){
			return;
		}
		inOrder(n.left);
		System.out.println(n.key);		
		inOrder(n.right);
		
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		bt.root = new Node("root");
		
		bt.root.left= new Node("1.left");
		bt.root.right= new Node("2.right");		
		
		bt.root.left.left= new Node("11.left");
		bt.root.left.right= new Node("11.right");
		
		bt.root.right.left= new Node("21.left");
		bt.root.right.right= new Node("22.right");
		
		//bt.preOrder(bt.root);
		bt.postOrder(bt.root);
		//bt.inOrder(bt.root);		
	}

}
