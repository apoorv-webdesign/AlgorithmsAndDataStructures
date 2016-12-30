package dataStructureImplementations;

import java.util.ArrayList;

public class Trie{

	private String data;
	private ArrayList<Trie> children = new ArrayList<Trie>();
	private Trie root;	
	
	public Trie(Trie r){
		this.root = r;
	}

	public Trie getRoot() {
		return root;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public String getData() {
		return data;
	}
	
	public ArrayList<Trie> getChildren() {
		return children;
	}
	
	public Trie addChild(Trie r, String data){
		Trie node = new Trie(r);
		node.setData(data);
		r.getChildren().add(node);
		return node;
	}

	public void preOrderTraversal(){
		System.out.println(this.getData());
		for(Trie n:this.getChildren()){
			n.preOrderTraversal();
		}
	}	
	
	public void postOrderTraversal(){
		for(Trie n:this.getChildren()){
			n.postOrderTraversal();
			System.out.println(n.getData());
		}
		if(this.getRoot()==null){
			System.out.println(this.getData());
		}		
	}
	
	public void inOrderTraversal(Trie r) {
		//inOrderTraversal(r.getChildren().get(0));
		if(r.getChildren()!=null){
			inOrderTraversal(r.getChildren().get(0));
		}
		if(r.getChildren()==null){
			System.out.println(r.getData());
			System.out.println(r.getRoot().getData());
			System.out.println(r.getData());
			
		}
/*		for (Node n : r.getChildren()) {			
			inOrderTraversal(n);
			//System.out.println(n.getData());		
		}		
		System.out.println(r.getData());*/		
	}
	
	public boolean areTreesIdentical(Trie n2) {
		return true;
	}

	public static void main(String[] args) {
		
		Trie n = new Trie(null);	
		n.setData("root");
		
		Trie child_1 = n.addChild(n, "left-child-1");
		Trie child_2 = n.addChild(n, "right-child-1");
		
		Trie child_11 = child_1.addChild(child_1, "left-child-11");
		Trie child_12 = child_1.addChild(child_1, "left-child-12");
		
		Trie child_111 = child_11.addChild(child_11, "left-child-111");
		Trie child_112 = child_11.addChild(child_11, "right-child-112");		
		
		Trie child_21 = child_2.addChild(child_2, "right-child-21");
		Trie child_22 = child_2.addChild(child_2, "right-child-22");				
		
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
