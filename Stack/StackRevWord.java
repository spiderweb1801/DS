package Stack;

public class StackRevWord {

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
			//size--;
		//}
	}
	
	public void reverse(char[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==' ' || i==a.length-1)
			{
				int temp=size;
				for(int j=0;j<temp;j++)
				{
					pop();
				}
				System.out.print(" ");
			}
			else
			{
				push(a[i]);
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackRevWord str= new StackRevWord();
		String string="this is the string.";
		str.reverse(string.toCharArray());
	}

}
