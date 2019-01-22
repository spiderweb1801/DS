package Tree;

public class Queue {

	int size;
	Node curr[];
	
	public Queue(int capacity)
	{
		curr=new Node[capacity];
	}
	
	public void add(Node a)
	{
		curr[size]=a;
		size++;
	}
	
	public Node remove()
	{
		Node temp;
		if(size==0){temp=null;}
		else
			{
				temp=curr[0];
				for(int i=0;i<size;i++)
					curr[i]=curr[i+1];
				size--;
			}
		return temp;
	}
	
	public int capacity()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return size==0;
	}
	
	public Node firstElement()
	{
		if(size!=0)
		{
			return curr[0];
		}
		else
		{
			return null;
		}
	}
	
	public Node lastElement()
	{
		if(size!=0)
		{
			return curr[size-1];
		}
		else
		{
			return null;
		}
	}
	
		/* methods to be added:
		 * enqueue
		 * dequeue
		 * size
		 * isEmpty
		 * firstElement
		 * lastElement
		 */
}
