package dataStructureImplementations;

import java.util.ArrayList;

public class Node{

	private String data;
	private ArrayList<Node> children = new ArrayList<Node>();
	private Node root;	
	
	public Node(Node r){
		this.root = r;
	}

	public Node getRoot() {
		return root;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public String getData() {
		return data;
	}
	
	public ArrayList<Node> getChildren() {
		return children;
	}
	
	public Node addChild(Node r, String data){
		Node node = new Node(r);
		node.setData(data);
		r.getChildren().add(node);
		return node;
	}

	public void preOrderTraversal(){
		System.out.println(this.getData());
		for(Node n:this.getChildren()){
			n.preOrderTraversal();
		}
	}	
	
	public void postOrderTraversal(){
		for(Node n:this.getChildren()){
			n.postOrderTraversal();
			System.out.println(n.getData());
		}
		if(this.getRoot()==null){
			System.out.println(this.getData());
		}		
	}
	
	public void inOrderTraversal(Node r) {
		for (Node n : r.getChildren()) {			
			inOrderTraversal(n);
			System.out.println(n.getData());			
		}		
	}
	
	public boolean areTreesIdentical(Node n2) {
		return true;
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
		
		//tpot.traverseTree(n);
		System.out.println("PreOrder");
		n.preOrderTraversal();
		System.out.println("");		
		System.out.println("PostOrder");		
		n.postOrderTraversal();
		System.out.println("");			
		System.out.println("InOrder");		
		n.inOrderTraversal(n);		
	}

}
