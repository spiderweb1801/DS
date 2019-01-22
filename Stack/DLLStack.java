package Stack;

public class DLLStack {

	int size;
	DLLNode node;
	
	public void push(int a){
	
		DLLNode newNode= new DLLNode(a);
		if(size==0)
		{
			node=newNode;
		}
		else
		{
			DLLNode temp=node;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newNode;
			newNode.prev=temp;
		}
		size++;
	}
	
	public int peek(){
		
		if(size==0)
		{
			System.out.println("NO ELEMENTS.");
			return 0;
		}
		else
		{
			DLLNode temp=node;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			return temp.value;
		}
	}
	
	public int pop(){
		
		int poped=0;
		
		if(size==0)
		{
			System.out.println("NO ELEMENT.");
			return poped;
		}
		
		else if(size==1){
			
			poped=node.value;
			node=null;
			size--;
		}
		
		else
		{
			DLLNode temp=node;
			while(temp.next!=null)
			{
				//int val=temp.value;
				//System.out.println("b4 temp.next the value of node is:"+val);
				temp=temp.next;
			//	System.out.println("inside pop...b4 poping size is:-"+size+". Current node's value is:-"+temp.value);				
			}
			poped=temp.value;
			temp=temp.prev;
			temp.next=null;
			/*poped=temp.value;
			System.out.println("sss"+size);
			temp.next=null;*/
			size--;
		}
		//System.out.println("after poping size is:-"+size);
		return poped;
	}
	
	public int StackSize(){
		return size;
	}
	
	public static void main(String[] args) {
		
		DLLStack s= new DLLStack();
		
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println("peeked 1st:-"+s.peek());
		s.pop();
		System.out.println("poped....\n"+"peeked 2nd:-"+s.peek());
		s.pop();
		System.out.println("poped....\n"+"peeked 3nd:-"+s.peek());
		s.pop();
		System.out.println("poped....\n"+"peeked last:-"+s.peek());
		s.push(3);
		System.out.println("peeked 1st:-"+s.peek());
	}

}
