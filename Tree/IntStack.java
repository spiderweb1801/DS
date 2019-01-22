package Tree;

public class IntStack {
	
	int size=0;
	Node arr[];
	
	public IntStack(int length)
	{
		arr= new Node[length];
	}
	
	public void push(Node a)
	{
		//System.out.println(size+" size inside push:");
		if(size<arr.length)
		{
			arr[size]=a;
			//System.out.println(a.value+" inside push command.");
		}
			
		size++;
	}

	public Node pop()
	{
		if(size>0)
		{
			size--;
			System.out.print(arr[size].value);
			
		}
		return arr[size];
	}
	
	public Node peep()
	{
		//if(size>0)
			return arr[size-1];
		
	}
	
	public int capacity()
	{
		return size;
	}
}
