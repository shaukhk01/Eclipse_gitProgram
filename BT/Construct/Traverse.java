package BT.Construct;
import java.util.Stack;
public class Traverse {

	
	
	
	public void traverseInOrder(Node node) {
		Stack<Node> stack1 = new Stack<Node>();	
		Node tmp = node;
		
		while(tmp !=null || !stack1.isEmpty()) {
			
			if(tmp !=null) {
				
				stack1.push(tmp);
				System.out.print(tmp.getData()+" ");
				tmp =tmp.getLeft();
			}
			else {
				tmp = stack1.pop();
				tmp = tmp.getRight();
			}
		}
	}
	
	public void postOrderTraverse(Node node) {
		
		Stack<Node> stack1 = new Stack<Node>();
		Stack<Node> stack2 = new Stack<Node>();
		stack1.add(node);
		
		while(!stack1.isEmpty()) {
			
			Node tmp = stack1.pop();
				stack2.push(tmp);//here u can also say tmp.data[stac<Integer>
			if(tmp.getLeft() !=null) {
				
				stack1.push(tmp.getLeft());
			}
			if(tmp.getRight() !=null) {
				stack1.push(tmp.getRight());
			}
		}
		while(!stack2.isEmpty()) {
			
			System.out.print(stack2.pop().getData()+" ");
		}
			
		}
}
