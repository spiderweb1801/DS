package DoublyLinkedList;

public class ReverseSLL {

	public void fillList(SinglyLinkedList list){
	
		SinglyLinkedList ll= list;
		ll.addFirst(5);
		ll.addLast(4);
		ll.addFirst(1);
		ll.addFirst(2);
		ll.addLast(54);
		ll.addFirst(31);
		ll.addFirst(44);
		ll.addLast(55);
		
	}
	
	public void showList(SinglyLinkedList list){
		list.showAll();
	}
	
	public void reverseList(SinglyLinkedList list){
		
		SingleNode current=list.head;
		SingleNode nxt=null;
		SingleNode prev=null;
		
		
		while(current!=null){
			nxt=current.next;
			current.next=prev;;
			prev=current;
			current=nxt;
		}
		
		list.head=prev;
		
	}
	
	public static void main(String args[]){
		ReverseSLL rev = new ReverseSLL();
		SinglyLinkedList list = new SinglyLinkedList();
		rev.fillList(list);
		rev.showList(list);
		rev.reverseList(list);
		System.out.println("AFTER REVERSING THE LINKED_LIST:");
		rev.showList(list);
	}
	
	
}
