package BT.Construct;

import Operation.Tree.OperationOnTree;
import TREE.BUILD.*; 
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
		System.out.print("Reverse Tree: ");
		oot.levelOrderTraverseReverse(root);
		System.out.println();
		System.out.println("********************");
		System.out.print("Height of Given Tree: "+oot.heightIterative(root));
		System.out.println();


		System.out.println();
		System.out.println("No OF ELEMENT: "+oot.size(root));
		System.out.println("********************");
		System.out.println("zeroDegreeNode[LeafNode]: "+oot.zeroDegreeLeafNode(root));
		System.out.println("********************");
		System.out.println("MaximumElementPresentInTree: "+oot.maxElementPresentInTree(root));
		System.out.println("********************");
		System.out.println("Element present inside tree [true/false]: "+oot.searchTree(root, 8));

		System.out.println("********************");
		Node newRoot = oot.insert(root,9);
		newRoot = oot.insert(root, 18);
		
		System.out.println("\nAfter new element insert");
		traverse.postOrder(newRoot);
		System.out.println();
		System.out.println("--------------------");
		System.out.println("--------------------");
		System.out.println("--------------------");
		
		int[] pre = {10,5,8,15};
		int[] in  = {5,8,10,15};

		GenerateTree gt = new GenerateTree();
		Node g = gt.buildTreeUsingPreAndIn(in, pre, 0, pre.length-1);
		traverse.preOrder(g);


	}
}
