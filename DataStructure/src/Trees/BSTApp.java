package Trees;

class Node{
	int data;
	Node left;
	Node right;
}

class BST{
	public Node createNewNode(int k) {
		Node a=new Node();
		a.data = k;
		a.left = null;
		a.right = null;
		return a;
	}
	public Node insert(Node node, int val) {
		if(node == null) {
			return createNewNode(val);
		}
		if(val < node.data) {
			node.left=insert(node.left, val);
		} else if(val > node.data) {
			node.right=insert(node.right,val);
		}
		return node;
	}
	
}


public class BSTApp {
public static void main(String[] args) {
	BST b =new BST();
	Node root=null;
	//8 ,3, 6, 10 ,4 , 7, 1, 14 , 13
	
	
	
	root = b.insert(root, 8);
	

	
	root = b.insert(root, 3);

	
	
}
	
}
