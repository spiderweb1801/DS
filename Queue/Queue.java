package Queue;

public class Queue {

	int size;
	int start;
	int actual_size;
	int array[];
	
	public Queue(int capacity)
	{
		size=capacity;
		array = new int[size];
		start=0;
	}
	
	public int getHead()
	{
		int v;
		if(!isEmpty())
		{
			v=array[start];
		}
		else
		{
			v=-1;
		}
		return v;
	}
	
	public void add(int value)
	{
		if(actual_size==size)
			actual_size=actual_size%size;
		
		array[actual_size]=value;
		actual_size++;
	}
	
	public int remove()
	{
		int v;
		
		if(!isEmpty())
		{
			v=array[start];
			
			if(start==size-1)
				start=0;
			else
				start++;
			
			actual_size--;
		}
		
		else
			v=-1;
		
		return v;
	}
	
	public boolean isEmpty()
	{
		if(actual_size==0)
			return true;
		else
			return false;
	}
	
	public void listAll()
	{
		for(int i=start;i<size;i++)
		{
			System.out.println(array[i]);
		}
	}
	
}
