package Queue;

import Stack.Stack;

public class SortQueue {

	public void sortQueue(Queue q)
	{
		Stack s1= new Stack(q.size);
		
		while(!q.isEmpty())
		{
			int get=q.remove();
			System.out.println("Removed element from Queue is:"+get);
			
			if(s1.isEmpty())
			{
				System.out.println("SQ sorted stack is empty......");
				s1.push(get);
				System.out.println("SQ sorted stack was empty. BUT now has :"+s1.peek());
			}
			
			else if(!s1.isEmpty())
			{
				
				if((s1.peek()) == -4 )
				{
					System.out.println(s1.peek()+" hence doing nothing here...");
				}
				
				else
				{
					System.out.println(s1.peek()+ " strange???");
					int temp=-4;
					while(get>s1.peek())
					{
						temp=s1.pop();
						if(temp != -4)
							q.add(temp);
					}
					s1.push(get);
				}
				
			}
			
		}
		
		while(!s1.isEmpty())
		{
			q.add(s1.pop());
		}
	
		System.out.println("SORTED QUEUE IS");
		q.listAll();
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q1= new Queue(5);
		q1.add(2);
		q1.add(21);
		q1.add(12);
		q1.add(45);
		q1.add(25);
		
		System.out.println("head 1:"+q1.getHead()+". Start is:"+q1.start+". Actual_size is:"+q1.actual_size);
	/*	q1.remove();
		System.out.println("head 2:"+q1.getHead()+". Start is:"+q1.start+". Actual_size is:"+q1.actual_size);
		System.out.println("head 2:"+q1.getHead());
		q1.remove();*/
		q1.listAll();
		//System.out.println("head 2:"+q1.getHead()+". Start is:"+q1.start+". Actual_size is:"+q1.actual_size);
		
		SortQueue sq= new SortQueue();
		sq.sortQueue(q1);
	}

}
