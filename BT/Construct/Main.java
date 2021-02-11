package BT.Construct;

import Operation.Tree.OperationOnTree;

public class Main {

	public static void main(String[]args) {
		
		Node root = new Node(10);
		Traverse traverse = new Traverse();
		OperationOnTree oot = new OperationOnTree();
		
		root.insert(5);
		root.insert(8);
		root.insert(15);
		
	
		System.out.print("Pre	Order: ");
		traverse.preOrder(root);
		System.out.println();
		System.out.print("In	Order: ");
		traverse.inOrder(root);
		System.out.println();
		System.out.print("Post	Order: ");
		traverse.postOrder(root);
		System.out.println();
		System.out.print("Level	Order: ");
		traverse.levelOrder(root);
		System.out.println();
		
		System.out.println("********************");
		System.out.println("********************");
		System.out.println("********************");

		System.out.print("Reverse Tree: ");
		oot.levelOrderTraverseReverse(root);

		System.out.println();
		System.out.println("No OF ELEMENT: "+oot.size(root));
		System.out.println("zeroDegreeNode[LeafNode]: "+oot.zeroDegreeLeafNode(root));
		System.out.println("MaximumElementPresentInTree: "+oot.maxElementPresentInTree(root));
		System.out.println("Element present inside tree [true/false]: "+oot.searchTree(root, 8));

		Node newRoot = oot.insert(root,9);
		newRoot = oot.insert(root, 23);
		
		System.out.println("\nAfter new element insert");
		traverse.postOrder(newRoot);
		System.out.println();


	}
}
