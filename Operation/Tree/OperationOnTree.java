package Operation.Tree;
import BT.Construct.Node;
import java.util.Queue;
import java.util.LinkedList;

public class OperationOnTree {

	
	public int countNoOfNode(Node node) {
		
		if(node !=null) {
			
			int x = countNoOfNode(node.getLeft());
			int y = countNoOfNode(node.getRight());
			
			return x + y + 1;
		}
		
		return 0;
	}
	
	public int zeroDegreeLeafNode(Node root) {
		
		int x,y;
		x=y=0;
		if(root !=null) {
		 x = zeroDegreeLeafNode(root.getLeft());
		 y = zeroDegreeLeafNode(root.getRight());
		
		if(root.getLeft() == null && root.getRight() == null) {
			
			return x + y + 1;
		}
	}
		return x+y;
	}
	
	public int maxElementPresentInTree(Node root) {
		
		Queue<Node> q = new LinkedList<Node>();
		q.offer(root);
		int max = Integer.MIN_VALUE;
		
		while(!q.isEmpty()) {
			
			Node tmp = q.poll();
			
			if(tmp !=null) {

				if(tmp.getData() >= max) {
				
					max = tmp.getData();
				}
				
				if(tmp.getLeft() !=null) {
					
					q.offer(tmp.getLeft());
				}
				if(tmp.getRight() !=null) {
					q.offer(tmp.getRight());
				}
		}
	}
		return max;
	}
	
	public boolean searchTree(Node root,int value) {
		
		Queue<Node> q = new LinkedList<Node>();
		q.offer(root);
		
		while(!q.isEmpty()) {
			
			Node tmp = q.poll();
			
			if(tmp !=null) {
				
				if(tmp.getData() == value) {
					
					return true;
				}
				
				if(tmp.getLeft() !=null) {
					q.offer(tmp.getLeft());
				}
				if(tmp.getRight() !=null) {
					q.offer(tmp.getRight());
				}
			}
		}
		return false;

	}
	
	
	public Node insert(Node root,int value) {
		
		Queue<Node> q = new LinkedList<Node>();
		
		q.offer(root);
		while(!q.isEmpty()) {
			
			Node tmp = q.poll();
			
			if(tmp !=null) {
				
				if(tmp.getLeft() !=null) {
					
					q.offer(tmp.getLeft());
				}
				if(tmp.getRight() !=null) {
					q.offer(tmp.getRight());
				}
				if(tmp.getLeft() == null) {
					
					tmp.setLeft(new Node(value));
					break;
				}
				
				if(tmp.getRight() == null) {
					
					tmp.setRight(new Node(value));
					break;
				}

				
			}
		}
		return root;
	}

}
	