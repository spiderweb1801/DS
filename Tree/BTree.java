package Tree;//

public class BTree {
	
	Node root;
	
	public void addNodes(int a[])
	{
		root= addNodes(a,0);
	}
	
	public Node addNodes(int a[], int index)
	{
			
		int left=2*index+1;
		int right=2*index+2;
		
		Node curr= new Node(a[index]);
		
		if(left<a.length)
		curr.lchild=addNodes(a,left);
	
		if(right<a.length)
		curr.rchild=addNodes(a,right);
		
		return curr;
	}

	public void listTree()
	{
		System.out.println("PRE");
		listTreePre(root);
		System.out.println("\nIN");
		listTreeIn(root);
		System.out.println("\nPOST");	
		listTreePost(root);
	}
	
	public void listTreePre(Node n)
	{
		if(n!=null)
		{
			System.out.print(n.value);
			listTreePre(n.lchild);
			listTreePre(n.rchild);
		}
	}
	
	public void listTreeIn(Node n)
	{
		if(n!=null)
		{
			listTreeIn(n.lchild);
			System.out.print(n.value);
			listTreeIn(n.rchild);
		}
	}
	
	public void listTreePost(Node n)
	{
		if(n!=null)
		{
			listTreePost(n.lchild);
			listTreePost(n.rchild);
			System.out.print(n.value);
		}
	}
	
	public void linearTrav(Node n, int capacity)//has to be root only
	{
		Queue q= new Queue(capacity);
		Node curr;
		if(n!=null)
		{
			q.add(n);
			
			while(q.size>0)
			{
				curr=q.remove();
				System.out.print(curr.value);
				if(curr.lchild!=null)
					q.add(curr.lchild);
				if(curr.rchild!=null)
					q.add(curr.rchild);
				
			}
		}
	}

	public int[] linearTravs(Node n, int capacity)//has to be root only
	{
		Queue q= new Queue(capacity);
		Node curr;
		int arr[] = new int[capacity];
		int count=0;
		if(n!=null)
		{
			q.add(n);
			
			while(q.size>0)
			{
				curr=q.remove();
				arr[count]=curr.value;
				count++;
				
				System.out.print(curr.value);
				if(curr.lchild!=null)
					q.add(curr.lchild);
				if(curr.rchild!=null)
					q.add(curr.rchild);
				
			}
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
	
		int arr[]={0,1,2,3,4,5,6,7,8,9};
		BTree bt= new BTree();
		bt.addNodes(arr);
		System.out.println("Breadth first search...");
		bt.linearTrav(bt.root,arr.length);
		System.out.println();
		bt.listTree();
	}

}
