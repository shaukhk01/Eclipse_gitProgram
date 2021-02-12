import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
class Tree{
	
	private int data;
	private Tree left;
	private Tree right;
	
	public Tree(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public Tree getLeft() {
		return left;
	}

	public void setLeft(Tree left) {
		this.left = left;
	}

	public Tree getRight() {
		return right;
	}

	public void setRight(Tree right) {
		this.right = right;
	}
	
	public void insert(int value) {
		
		if(value<=getData()) {
			
			if(getLeft() == null) {
				
				setLeft(new Tree(value));
			}
			else {
				left.insert(value);
			}
		}
		else {
			
			if(getRight() == null) {
				
				this.right = new Tree(value);
				
			}
			else {
				
				right.insert(value);
			}
		}
	}
	
	public int findHeight(Tree root) {
		
		if(root == null) {
			return 0;
		}
		
		if(root !=null) {
		int leftDepth = findHeight(root.getLeft());
		int rightDepth= findHeight(root.getRight());
		
		return leftDepth > rightDepth ? leftDepth+1:rightDepth+1;
		}
		return 0;
	}
	
	public int height(Tree node) {
		
		
		Queue<Tree> q = new LinkedList<Tree>();
		q.add(node);
		int height = 0;
		while(true) {
			
			int size = q.size();
			if(size == 0) {
				break;
			}
		while(size > 0) {
			
			Tree tmp = q.remove();
			if(tmp.left !=null) {
				q.add(tmp.left);
			}
			if(tmp.right !=null) {
				q.add(tmp.right);
			}
			size--;
			}
		height = height +1;
		}
		return height;
	}
}

public class Main {

	public static void main(String[]args) {
		
		Tree root = new Tree(10);
		
		root.insert(5);
		root.insert(8);
		root.insert(15);
		
//		root.travese(root);
		System.out.println();
		//System.out.println("HeightDepth: "+root.findHeight(root));
		System.out.println(root.height(root));
	}
}