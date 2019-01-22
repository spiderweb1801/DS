package DoublyLinkedList;

public class DoublyLinkedList {

	
	/*addFirst--done
	addLast--done
	listAll--done
	deleteAll--done
	size--done
	isEmpty--done

	removeFirst--
	removeLast--
	removeAt--
	findElement--
	findAt--
	
	*/
	Node head;
	int size=0;
	
	public void addFirst(int a)
	{
		Node newNode= new Node(a);
		if (size==0)
			head=newNode;
		else
		{
			newNode.next=head;
			head.prev=newNode.next;
			head=newNode;
		}
		size++;
		
		
	}
	
	public void listAll()
	{
		Node temp=head;
		
		/*for(int i=1;i<=size;i++)
		{
			System.out.println(temp.value);
			temp=temp.next;
		}*/
		
		while(temp!=null)
		{
			System.out.println(temp.value);
			temp=temp.next;
		}
	}
	
	public void addLast(int a)
	{
		Node newNode= new Node(a);
		if (size==0)
			head=newNode;
		
		else
		{
			Node temp=head;
			while (temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newNode;
			newNode.prev=temp;
		}
		size++;
	}
	
	public void deleteAll()
	{
		head=null;
		size=0;
	}
	
	public int length()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return(size==0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoublyLinkedList dll= new DoublyLinkedList();
		dll.addFirst(4);
		dll.addFirst(5);
		dll.addFirst(6);
		dll.addLast(7);
		dll.addLast(8);
		dll.addLast(9);
		dll.addFirst(10);
		dll.listAll();
		dll.deleteAll();
		System.out.println("Post deletion");
		dll.listAll();
		}

}
