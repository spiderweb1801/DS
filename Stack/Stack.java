package Stack;

public class Stack {

	int size;
	int arr[];
	int maxSize;
	
	public Stack(int capacity)
	{
		arr= new int[capacity];
		size=0;	
		maxSize=capacity;
	}
	
	public void push(int a)
	{
		if(size<maxSize)
		{
			arr[size]=a;
			size++;
		}
		else
		{
			System.out.println("No more data can be pushed.");
		}
	}
		
	public int pop()
	{
		int v=0;
		
		if(size>0)
		{
			size--;
			v=arr[size];
		}
		
		else if(size==0){v=arr[size];size--;}
			
		else{}
		
		return v;
	}
	
	public int peek()
	{
		if(!isEmpty())
		return arr[size-1];
		else
			return -4;
	}
	
	public int length()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return (size<=1);
	}
	
	public void listAll()
	{
		for(int i=(size-1);i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		
		Stack st= new Stack(5);
		st.push(1);
		st.push(2);
		st.push(12);
		st.push(22);
		st.push(32);
		st.push(24);
		st.listAll();
		System.out.println("PEEKING into stack"+st.peek());
		st.pop();
		System.out.println("Post POP function.");
		st.listAll();
		System.out.println("PEEKING into stack"+st.peek());
	}

}
