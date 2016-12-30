package geeksForGeeks;

import java.util.ArrayList;

import dataStructureImplementations.Trie;

public class IdenticalTrees extends Trie{
	//ArrayList<Node> n;
	public IdenticalTrees(Trie r) {
		super(r);
	}

	public String traversTree(Trie r){
		System.out.println("traversTree");
		for(Trie n:r.getChildren()){
			preOrderTraversal();
			return n.getData();
		}
		return r.getData();
	}	
	@Override
	public boolean areTreesIdentical(Trie i2){
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
		Trie n1 = new Trie(null);
		//IdenticalTrees it1 = new IdenticalTrees(n1);
		n1.setData("root");

		Trie child_1 = n1.addChild(n1, "left-child-1");
		Trie child_2 = n1.addChild(n1, "right-child-1");

		Trie child_11 = child_1.addChild(child_1, "left-child-L1");
		Trie child_12 = child_1.addChild(child_1, "left-child-R1");
		
		Trie child_21 = child_1.addChild(child_2, "right-child-L1");
		
		//tree2
		System.out.println("tree-2");		
		Trie n2 = new Trie(null);
		//IdenticalTrees it2 = new IdenticalTrees(n2);
		n2.setData("root");

		Trie ch_1 = n2.addChild(n2, "left-child-1");
		Trie ch_2 = n2.addChild(n2, "right-child-1");

		Trie ch_11 = child_1.addChild(child_1, "left-child-L1");
		Trie ch_12 = child_1.addChild(child_1, "left-child-R1");
		
		Trie ch_21 = child_2.addChild(child_2, "right-child-L1");	
		
		System.out.println(n1.areTreesIdentical(n2));
	}

}
