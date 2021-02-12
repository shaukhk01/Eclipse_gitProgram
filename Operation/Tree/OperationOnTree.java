package Operation.Tree;
import BT.Construct.Node;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class OperationOnTree {

	
	
	public int heightIterative(Node root) {
		
		Queue<Node> q = new LinkedList<Node>();
		q.offer(root);
		
		int height = 0;
		while(true) {
			
			int size = q.size();
			
			if(size == 0)
				break;
			
			while(size > 0) {
				
				Node tmp = q.remove();
				if(tmp.getLeft() !=null) 
					q.add(tmp.getLeft());
				if(tmp.getRight() !=null)
					q.add(tmp.getRight());
				size--;
			}
			height = height+1;
		}
		return height;
	}
	public int size(Node root) {
/*------------------------------------------------------------	
		//using ternary operator.
		int leftCount = root.getLeft() == null ? 0:size(root.getLeft());
		int rightCount= root.getRight() == null ? 0:size(root.getRight());
		
		return 1 + leftCount + rightCount;
--------------------------------------------------------------		

//recursive method
		/*
		if(node !=null) {
			
			int x = countNoOfNode(node.getLeft());
			int y = countNoOfNode(node.getRight());
			
			return x + y + 1;
		}
		
		return 0;
---------------------------------------------------------------
*/
		
		//using non-recursive[count no of node we can use level order in this case]
		
		Queue<Node> q = new LinkedList<Node>();
		q.offer(root);
		int count = 0;
		while(!q.isEmpty()) {
			
			Node tmp = q.poll();
			count++;
			if(tmp.getLeft() !=null) {
				q.offer(tmp.getLeft());
			}
			if(tmp.getRight() !=null)
				q.offer(tmp.getRight());
		}
		return count;
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
	
	public void levelOrderTraverseReverse(Node root) {
		
		Stack<Node> s = new Stack<Node>();
		Queue<Node> q = new LinkedList<>();
		
		q.offer(root);
		
		while(!q.isEmpty()) {
			
			Node tmp = q.poll();
			if(tmp.getLeft() !=null) {
				
				q.offer(tmp.getLeft());
			}
			
			if(tmp.getRight() !=null) {
				
				q.offer(tmp.getRight());
			}
			s.push(tmp);
		}
		
		while(!s.isEmpty()) {
			
			System.out.print(s.pop().getData()+" ");
		}

	}

}
	