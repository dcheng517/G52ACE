package Tree;

public class BinarySearchTree {

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
	
	static Node root;
	
	BinarySearchTree()
	{
		root = null;
	}
	
	void insert(int key)
	{
		root = insertRec(root, key);
	}
	
	public Node insertRec(Node root, int key)
	{
		// if tree empty, return a new node
		if(root == null)
		{
			root = new Node(key);
			return root;
		}
		
		// recur down tree
		if(key < root.key)
		{
			root.left = insertRec(root.left, key);
		}else if(key > root.key)
		{
			root.right = insertRec(root.right, key);
		}
		
		return root;
	}
	
	void deleteKey(int key)
	{
		root = deleteRec(root, key);
	}
	
	public Node deleteRec(Node root, int key)
	{
		if(root == null)
		{
			return root;
		}
		
		if(key < root.key)
		{
			root.left = deleteRec(root.left, key);
		}else if(key > root.key)
		{
			root.right = deleteRec(root.right, key);
		}else //if key is same as root's key
		{
			if(root.left == null)
			{
				return root.right;
			}else if(root.right == null)
			{
				return root.left;
			}
			
			// node with 2 children, get the inorder successor
			root.key = minValue(root.right);
			// delete the inorder successor
			root.right = deleteRec(root.right, root.key);
		}	
		
		return root;
	}
	
	int minValue(Node root)
	{
		int minv = root.key;
		while(root.left != null)
		{
			minv = root.left.key;
			root = root.left;
		}
		
		return minv;
	}
	
	public Node search(Node root, int key)
	{
		// root is null or root == key
		if(root == null || root.key == key)
		{
			return root;
		}
		
		// key < root
		if(root.key > key)
		{
			return search(root.left, key);
		}
		
		// key > root
		return search(root.right, key);
	}
	
	void inorder()  {
	       inorderRec(root);
	    }
	 
	// A utility function to do inorder traversal of BST
	void inorderRec(Node root)
	{
		if (root != null) 
		{
			inorderRec(root.left);
	        System.out.println(root.key);
	        inorderRec(root.right);
	    }
	}
	
	public static void main(String[] args)
	{
		BinarySearchTree tree = new BinarySearchTree();
		
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		tree.insertRec(root, 90);
		
		tree.inorderRec(root);
		
	}
}
