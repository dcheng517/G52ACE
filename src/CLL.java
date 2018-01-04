
public class CLL {
	
Node last;
	
	class Node	
	{
		int data;
		Node next;
		Node(int d) {data = d; next = null;}
	}
	
	public void push(int data)
	{
		Node newNode = new Node(data);
		
		if( last == null)
		{
			last = newNode;
			last.next = last;
		}else
		{
			newNode.next = last.next;
			last.next = newNode;
		}
	}
	
	public void addBetween(int loc1, int loc2, int newData)
	{
		Node newNode = new Node(newData);
		Node temp = last;
		
		if ( last == null )
		{
			last = newNode;
			last.next = last;
		}
		
		while( temp.data != loc1 && temp.data != loc2 )
		{
			temp = temp.next;
		}
		
		newNode.next = temp.next;
		temp.next = newNode;	
	}
	
	public void addLast(int newData)
	{
		Node newNode = new Node(newData);
		
		
		if(last == null)
		{
			last = newNode;
			last.next = last;
		}
		
		newNode.next = last.next;
		last.next = newNode;
		last = newNode;
		
	}
	
	public void delete(int data)
	{
		Node tempNode = last;
		Node prevNode = null;
		
		if(last.data == data)
		{
			while(tempNode.next != last )
			{
				tempNode = tempNode.next;			
			}
			
			tempNode.next = last.next;
			last = tempNode;
		}else
		{
			while(tempNode.data != data)
			{
				prevNode = tempNode;
				tempNode = tempNode.next;
			}
			
			prevNode.next = tempNode.next;
		}
		
		
	}
	
	public void print()
	{
		Node tNode = last.next;	
		
		if(last != null)
		{
			while(tNode != last)
			{
				System.out.print(tNode.data + " ");
				tNode = tNode.next;
			}
			
			System.out.println(tNode.data);
		}
	}
	
	public static void main(String[] args) 
	{
		CLL list = new CLL();
		
		list.push(12);
		list.push(56);
		list.push(2);
		list.push(11);
		list.addBetween(2, 11, 69);
		list.addBetween(69, 2, 57);
		list.delete(12);
		
		list.print();
	}
}
