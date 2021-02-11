package BT.Construct;
import java.util.Stack;

public class Node{
	
	private int data;
	private Node left;
	private Node right;
	
	public Node(int data) {
		this.data =data;
	}
	
	public int getData() {
		return data;
	}
	
	public Node getLeft() {
		
		return left;
	}
	
	public void setLeft(Node left) {
		this.left = left;
	}
	
	public Node getRight() {
		
		return right;
	}
	
	public void setRight(Node right) {
		
		this.right = right;
	}
	
	public void insert(int value) {
		
		if(value <= getData()) {
			
			if(getLeft() == null) {
				
				setLeft(new Node(value));
			}
			else {
				left.insert(value);
			}
		}
		else {
			
			if(getRight() == null) {
				
				setRight(new Node(value));
			}
			else {
				
				right.insert(value);
			}
		}
	}
}
