package Heap;

public class MaxHeap {

	int arr[];
	int size;
	int index;
	
	public int max(int a, int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
	
	public MaxHeap(int array[])
	{
		arr=array;
		size=array.length;
		index=size-1;
		
		int mid=index/2;
		
		for(int a=0;a<=mid;a++)
		for(int i=mid;i>=0;i--)
		{
			int li=2*i;
			int ri=li+1;
			
			if(ri<=index)
				doIt(ri, 1);
			else
				doIt(li,0);
		}
	}
	
	public void doIt(int lorR, int on)
	{
		int i;
		int li;
		int ri=-1;
		int temp;
		
		if(on==1)
		{
		
			ri=lorR;
			li=ri-1;
			i=li/2;
			
		}
		else
		{
			li=lorR;
			i=li/2;
		}
		
		if(ri!=-1)
		{
			//System.out.println(i+"=i, and li ="+li+". ri="+ri);
			
				temp=max(arr[i],max(arr[ri],arr[li]));
			
				if(arr[ri]==temp)
					arr[ri]=arr[i];
			
				else if(arr[li]==temp)
					arr[li]=arr[i];
			
				arr[i]=temp;
			
		}
		
		else if (ri==-1)
		{
			//System.out.println(i+"=i, and li =here:"+li);
			temp=max(arr[i],arr[li]);		
			if(arr[li]==temp)
				arr[li]=arr[i];
		
			arr[i]=temp;
		}
	}
	
	public static void main(String[] args) {
		
		int a[]={1,2,3,4,5,6};
		MaxHeap mh = new MaxHeap(a);
		
		for(int a1: mh.arr)
			System.out.print(a1);

	}

}
