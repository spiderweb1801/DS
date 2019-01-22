package Stack;

public class DLLNode {

	int value;
	DLLNode prev, next;
	
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
