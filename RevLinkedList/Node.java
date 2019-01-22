package RevLinkedList;

public class Node {
	
	int value;
	Node next;
	
	public Node(int data)
	{
		value=data;
		next=null;
	}
	
	public Node(int data, Node n)
	{
		value=data;
		next=n;
	}

}
