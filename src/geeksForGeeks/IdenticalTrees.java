package geeksForGeeks;

import java.util.ArrayList;

import dataStructureImplementations.Node;

public class IdenticalTrees extends Node{
	//ArrayList<Node> n;
	public IdenticalTrees(Node r) {
		super(r);
	}

	public String traversTree(Node r){
		System.out.println("traversTree");
		for(Node n:r.getChildren()){
			traverseTree(n);
			return n.getData();
		}
		return r.getData();
	}	
	@Override
	public boolean areTreesIdentical(Node i2){
		System.out.println("here");
		System.out.println("traversTree(this): "+traversTree(this));
		System.out.println("traversTree(i2): "+traversTree(i2));		
		while (traversTree(this) !="root" || traversTree(this) !="root" ){
			System.out.println("traversTree(this): "+traversTree(this));
			System.out.println("traversTree(i2): "+traversTree(i2));
			if(traversTree(this) == traversTree(i2)){
				continue;
			}
			else{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		//tree-1
		System.out.println("tree-1");
		Node n1 = new Node(null);
		//IdenticalTrees it1 = new IdenticalTrees(n1);
		n1.setData("root");

		Node child_1 = n1.addChild(n1, "left-child-1");
		Node child_2 = n1.addChild(n1, "right-child-1");

		Node child_11 = child_1.addChild(child_1, "left-child-L1");
		Node child_12 = child_1.addChild(child_1, "left-child-R1");
		
		Node child_21 = child_1.addChild(child_2, "right-child-L1");
		
		//tree2
		System.out.println("tree-2");		
		Node n2 = new Node(null);
		//IdenticalTrees it2 = new IdenticalTrees(n2);
		n2.setData("root");

		Node ch_1 = n2.addChild(n2, "left-child-1");
		Node ch_2 = n2.addChild(n2, "right-child-1");

		Node ch_11 = child_1.addChild(child_1, "left-child-L1");
		Node ch_12 = child_1.addChild(child_1, "left-child-R1");
		
		Node ch_21 = child_2.addChild(child_2, "right-child-L1");	
		
		System.out.println(n1.areTreesIdentical(n2));
	}

}
