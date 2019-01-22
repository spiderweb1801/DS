package Stack;

public class StackRevSen {

	int size=0;
	char arr[]=new char[50];
	
	public void push(char a)
	{
		if(size==50)
			System.out.println("Stack is full.");
		else{
			arr[size]=a;
			size++;
		}
	}
	
	public void pop()
	{
		/*if (size==0)
			System.out.println("Empty stack.");
		else
		{*/
		size--;
			System.out.print(arr[size]);
			
		//}
	}
	
	public void reverse(char[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			push(a[i]);
		}
		
		for(int i=0;i<a.length;i++)
		{
			
			pop();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackRevSen str= new StackRevSen();
		String string="this is the string.";
		str.reverse(string.toCharArray());
	}

}
