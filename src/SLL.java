
public class SLL {
	
	Node head;
	
	class Node	
	{
		int data;
		Node next;
		Node(int d) {data = d; next = null;}
	}
	
	public void push(int new_data) 
	{
		Node newNode = new Node(new_data);
		
		if( head == null )
		{
			newNode.next = null;
			head = newNode;
		}
		else
		{
			newNode.next = head;
			head = newNode;
		}
		
		return;
	}
	
	public void add(Node prevNode, int newData)
	{
		if(prevNode == null)
		{
			System.out.println("Previous node cannot be null.");
			return;
		}
		
		Node newNode = new Node(newData);
		
		if( head == null )
		{
			newNode.next = null;
			head = newNode;
		}
		else
		{
			newNode.next = prevNode.next;
			prevNode.next = newNode;
		}
	}
	
	public void addBetween(int loc1, int loc2, int newData)
	{
		Node newNode = new Node(newData);
		Node temp = head;
		
		if ( head == null )
		{
			newNode.next = null;
			head = newNode;
		}
		
		while( temp.data != loc1 && temp.data != loc2 )
		{
			temp = temp.next;
		}
		
		newNode.next = temp.next;
		temp.next = newNode;	
	}
	
	public void addAfterData(int location, int newData)
	{
		Node newNode = new Node(newData);
		Node temp = head;
		
		if(head == null )
		{
			newNode.next = null;
			head = newNode;
		}
		
		while( temp.data != location )
		{
			temp = temp.next;
		}
		
		newNode.next = temp.next;
		temp.next = newNode;
	}
	
	public void append(int new_data)
	{
		Node newNode = new Node(new_data);
		
		if (head == null)
		{
			head = newNode;
			return;
		}
		
		newNode.next = null;
		
		Node temp = head;
		
		while (temp.next != null)
		{
			temp = temp.next;
		}
		
		temp.next = newNode;
		return;
	}
	
	public void delete(int data)
	{
		Node tempNode = head;
		Node prevNode = null;
		
		if(head.data == data)
		{
			head = tempNode.next;
		}
		
		while(tempNode.data != data)
		{
			prevNode = tempNode;
			tempNode = tempNode.next;
		}
		
		prevNode.next = tempNode.next;
	}
	
	public void print()
	{
		Node tnode = head;
		
		while (tnode != null)
		{
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}
	}
	
	public static void main(String[] args)
	{
		SLL list = new SLL();
		
		list.push(6);
		list.push(7);
		list.push(1);
		list.append(4);
		list.addAfterData(6, 8);
		list.addBetween(6, 7, 9);
		list.delete(9);
		
		System.out.println("\nCreated Linked List is: ");
		list.print();
	}
	
}
