package dataStructureImplementations;

public class TreeInOrderTraversal extends Node {

	public TreeInOrderTraversal(Node r) {
		super(r);
	}

	@Override
	public void traverseTree(Node r) {
		for (Node n : r.getChildren()) {
			traverseTree(n);
			System.out.println(n + ": " + n.getData());
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
		
		TreeInOrderTraversal tpot = new TreeInOrderTraversal(n);
		tpot.traverseTree(n);

	}

}
