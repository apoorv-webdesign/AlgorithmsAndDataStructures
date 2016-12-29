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
	//Preorder
	public void traverseTree(Node r){
		System.out.println(r+ ": "+r.getData());
		for(Node n:r.getChildren()){
			traverseTree(n);
		}
	}

	public boolean areTreesIdentical(Node n2) {
		return true;
	}

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n = new Node(null);
		n.setData("root");				
		Node child= n.addChild(n, "child-1");
		n.addChild(child, "child-11");
		n.addChild(child, "child-12");
		n.addChild(child, "child-13");		
		n.printTree(n);
	}*/

}
