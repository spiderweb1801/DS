/*
sorting stack using another stack

*/
package Stack;

public class SortStack {

	public static void main(String[] args) {
		int arr[]={1,2,3,65,77,4,6,87,1};
		int size= arr.length;
		Stack s1= new Stack(size);
		for(int i=0;i<size;i++)
		{
			s1.push(arr[i]);
		}
		
		Stack s2= new Stack(size);
		
		while(!s1.isEmpty()){
			
			int value=s1.pop();
			
			if(value>s2.peek())
			{
				s2.push(value);
			}
			
			else
			{
				if(!s2.isEmpty())
				{	
					while(s2.peek()>value)
					{
						s1.push(s2.pop());
					}
					s2.push(value);
				}
			}
		}
		
		s2.listAll();
		
	}

}
