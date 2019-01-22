package Queue;

public class DLLNode {

	DLLNode prev, next;
	int value;
	
	public DLLNode(int a){
		value=a;
		prev=null;
		next=null;
	}
	
	public DLLNode(int a, DLLNode pr, DLLNode nxt){
		value=a;
		prev=pr;
		next=nxt;
	}
	
}
