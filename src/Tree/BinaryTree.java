package Tree;

class Node
{
	int key;
	Node left, right;
	
	public Node(int item)
	{
		key = item;
		left = right = null;
	}
}

public class BinaryTree {
	
	Node root;
	
	BinaryTree()
	{
		root = null;
	}
	
	void Post(Node node)
	{
		if(node == null)
		{
			return;
		}
		
		Post(node.left); // left subtree recursion
		Post(node.right); // right subtree recursion	
		System.out.print(node.key + " "); // node
	}
	
	void In(Node node)
	{
		if(node == null)
		{
			return;
		}
		
		In(node.left); // left subtree recursion
		System.out.print(node.key + " "); // Node
		In(node.right); // right subtree recursion
	}
	
	void Pre(Node node)
	{
		if(node == null)
		{
			return;
		}
		
		System.out.print(node.key + " ");
		Pre(node.left);
		Pre(node.right);
	}
	
	void Post()
	{
		Post(root);
	}
	
	void In()
	{
		In(root);
	}
	
	void Pre()
	{
		Pre(root);
	}
	
	public static void main(String[] args)
	{
		BinaryTree tree = new BinaryTree();
		
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		System.out.print("Preorder traversal: ");
		tree.Pre();
		
		System.out.print("\nInorder traversal: ");;
		tree.In();
		
		System.out.print("\nPostorder traversal: ");
		tree.Post();
	}
	
	
	
}
