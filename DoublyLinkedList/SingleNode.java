package DoublyLinkedList;

public class SingleNode {

	SingleNode next;
	int data;
	
	public SingleNode(int a){
		data=a;
		next=null;
	}
	
	public SingleNode(int a, SingleNode nxt){
		next=nxt;
		data=a;
	}
	
}
