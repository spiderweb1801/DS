package RevLinkedList;

public class RevLL {

	int size;
	Node root;
	
	public void addFirst(int a)
	{
		if(size==0)
		{
			root=new Node(a);
		}
		else
		{
			Node temp= new Node(a);
			temp.next=root;
			root=temp;
		}
		size++;
	}
	
	public void addLast(int a)
	{
		Node temp=root;
		
		Node curr= new Node(a);
		
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=curr;
		size++;
	}
	
	public int getSize()
	{
		return size;
	}
	
	public void printList()
	{
		Node temp=root;
		
		while(temp.next!=null)
		{
			System.out.print(temp.value);
			temp=temp.next;
		}
		System.out.println(temp.value);
	}
	
	public void revListWithCount(int count)
	{
		
	}
	
	public static void main(String[] args) 
	{
		RevLL rv= new RevLL();
		
		rv.addFirst(34);
		rv.addFirst(2);
		rv.addFirst(3);
		rv.addFirst(4);
		rv.addFirst(5);
		rv.printList();
		System.out.println(rv.getSize());
	}

}
