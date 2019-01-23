package DoublyLinkedList;

import DoublyLinkedList.*;

public class SinglyLinkedList {

	SingleNode head;
	int size=0;
	
	/*addFirst--Done
	addLast--Done
	showAll--done
	deleteAll--Done
	size--Done
	isEmpty--done
	removeFirst--done
	removeLast--done
	removeAt--done
	findElement--done
	findAt--done*/
	
	public void addFirst(int a)
	{
		SingleNode newNode = new SingleNode(a);
		
		if(size==0){
			head=newNode;
		}
		else{
			newNode.next=head;
			head=newNode;
		}
		size++;
	}
	
	public boolean findElement(int a)
	{
		SingleNode temp=head;
		while(temp.next!=null)
		{
			if(temp.data==a){
				return true;}
			temp=temp.next;
		}
		
		return false;
	}
	
	public void removeFirst()
	{
		if(isEmpty())
		{
			System.out.println("Cannot remove the element, as the LinkedList is empty.");
		}
		
		else
		{
			head=head.next;
			size--;
		}
		
	}
	
	public void removeLast()
	{
		SingleNode temp=head;
		SingleNode prev=null;
		if(isEmpty())
		{
			System.out.println("Cannot remove the element, as the LinkedList is empty.");
		}
		
		else
		{
			while(temp.next!=null)
			{
				prev=temp;
				temp=temp.next;
			}
			prev.next=null;
			size--;
		}
	}
	
	public void removeAt(int index)
	{
		SingleNode temp=head;
		if(isEmpty())
		{
			System.out.println("Cannot remove the element, as the LinkedList is empty.");
		}
		
		if (size>=index)
		{
			int count=0;
			if(index==1)
			{
				head=head.next;
			}
			else
			{
				while (temp.next!=null)
				{
					
					count++;
					if(count==index-1)
					{
						temp.next=temp.next.next;
						break;
					}
					temp=temp.next;
				}
			}
			size--;
		}
		
		else
		{
			System.out.println("LinkedList has less elements than the index provided.");
		}
		
	}
	
	public int elementAt(int index)
	{
		SingleNode temp=head;
		if(isEmpty())
		{
			System.out.println("Cannot remove the element, as the LinkedList is empty.");
			return -1;
		}
		
		if (size>=index)
		{
			int count=1;
			if(index==1)
			{
				return head.data;
			}
			else
			{
				while (temp.next!=null)
				{
					temp=temp.next;
					if(count==index-1)
					{
						return temp.data;
					}
					count++;
				}
				return -1;
			}
		}
		
		else
		{
			System.out.println("LinkedList has less elements than the index provided."); 
			return -1;
		}
		
	}
	
	
	
	public void deleteAll()
	{
		head=null;
	}
	
	public boolean isEmpty()
	{
		return (size==0);
	}
	
	public void addLast(int a){
		SingleNode newNode= new SingleNode(a);
		SingleNode temp=head;
		
		if(size!=0)
		{	
			while(temp.next!=null){
		
				temp=temp.next;
			
			}
			temp.next=newNode;
		}
		else{
			head=newNode;
		}
		size++;
	}
	
	public void showAll()
	{
		SingleNode temp=head;
		
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
		
	}
	
	public int length()
	{
		return size;
	}
	
	public static void main(String args[]){
		
		SinglyLinkedList ll= new SinglyLinkedList();
		
		ll.addLast(4);
		ll.addFirst(1);
		ll.addFirst(2);
		ll.addLast(54);
		ll.addFirst(31);
		ll.addFirst(44);
		ll.addLast(55);
		ll.showAll();
		//ll.deleteAll();
		ll.removeFirst();
		System.out.println("removedFirst.");
		ll.showAll();
		ll.removeLast();
		System.out.println("removedLast. Size is "+ll.size);
		ll.showAll();
		ll.removeAt(3);
		System.out.println("removed 3 element.");
		ll.showAll();
		System.out.println("Find if 31 is in the list "+ll.findElement(31));
		System.out.println("Find if 11 is in the list "+ll.findElement(11));
		System.out.println("Element at 4 position in the list "+ll.elementAt(2));
		
	}
}
