package Practice;
/*
Used BinarySearch operation
*/
public class SearchMatrix {

	public int searchMatrix(int a[][], int x){
		
		boolean got=false;
		for(int row=0;row<3;row++)
		{
			if(a[row][2]<x){}
			else{
				got = doBinarySearch(a[row],x,0,2);
			}
		}
		
		if(got)
			return 1;
		
		else
			return 0;
	}
	
	public boolean doBinarySearch(int a[],int x, int start, int end)
	{
		int mid=(start+end)/2;
		boolean b=false;
		
		if(start>end)
			b= false;
		
		if(a[mid]==x)
			b=true;
		
		else if(a[mid]>x)
			b=doBinarySearch(a,x,start,mid-1);
		
		else if(a[mid]<x)
			b=doBinarySearch(a,x,mid+1,end);
		
		return b;
	}
	
	public static void main(String[] args) {

		int arr[][]={
				{1,2,3},
				{4,15,6},
				{7,8,9}
				};
		
		int x=15;
		
		SearchMatrix sm= new SearchMatrix();
		System.out.println(sm.searchMatrix(arr, x));	
	}
}
