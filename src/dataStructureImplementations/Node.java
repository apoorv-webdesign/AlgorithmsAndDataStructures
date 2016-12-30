package dataStructureImplementations;

public class Node {
	public String key;
	public Node left;
	public Node right;
	
	public Node(String k){
		this.key=k;
		left=right=null;
	}
}
