package Queue;

public class DLLQueue {

	int size;
	DLLNode node;
	
	public void add(int a){
		
		DLLNode newNode=new DLLNode(a);
		if(size==0){
			node=newNode;
		}
		else{
			DLLNode temp=node;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=newNode;
			newNode.prev=temp;
		}
		size++;
		
	}
	
	public int remove(){
		
		int val=0;
		
		if(size==0){
			System.out.println("NO ELEMENTS PRESENT TO REMOVE.");
			val=0;
		}
		
		else if(size==1){
			val=node.value;
			node=null;
			size--;
		}
		
		else{
			DLLNode temp=node;
			val=temp.value;
			node=temp.next;
			node.prev=null;
			size--;
		}
		
		return val;
	}
	
	public static void main(String[] args) {
		
		DLLQueue queue= new DLLQueue();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		System.out.println("b4 size:-"+queue.size+". Removed:-"+queue.remove()+". After size:-"+queue.size);
		System.out.println("b4 size:-"+queue.size+". Removed:-"+queue.remove()+". After size:-"+queue.size);
		System.out.println("b4 size:-"+queue.size+". Removed:-"+queue.remove()+". After size:-"+queue.size);
		queue.add(5);
		queue.add(6);
		queue.add(7);
		System.out.println("b4 size:-"+queue.size+". Removed:-"+queue.remove()+". After size:-"+queue.size);
		System.out.println("b4 size:-"+queue.size+". Removed:-"+queue.remove()+". After size:-"+queue.size);
		System.out.println("b4 size:-"+queue.size+". Removed:-"+queue.remove()+". After size:-"+queue.size);
		System.out.println("b4 size:-"+queue.size+". Removed:-"+queue.remove()+". After size:-"+queue.size);
		System.out.println("b4 size:-"+queue.size+". Removed:-"+queue.remove()+". After size:-"+queue.size);
	}

}
