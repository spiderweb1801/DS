package Tree;

import java.util.Arrays;

public class BinaryTree {

	Node root;
	
	public BinaryTree(int a[])
	{
		root=binaryTree(a,0,a.length-1);
		
	}
	
	public Node binaryTree(int a[], int start, int end)
	{
		int mid=(start+end)/2;
		Node curr;
		
		if(start>end)
			return null;
		
		curr= new Node(a[mid]);

		curr.lchild=binaryTree(a,start,mid-1);

		curr.rchild=binaryTree(a,mid+1,end);
		
		return curr;
	}
	
	public int maxDepth(Node n)
	{
		if(n==null)
			return 0;
		
		else
		{
			int l=maxDepth(n.lchild);
			int r=maxDepth(n.rchild);
			
			if(l>r)
				return l+1;
			else
				return r+1;
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
	
	int leafCount;
	public void leafNodeCount(Node n)
	{
		if(n!=null)
		{
			if(n.lchild==null && n.rchild==null)
			{
				leafCount++;
			}
			leafNodeCount(n.lchild);
			leafNodeCount(n.rchild);
			
		}
	}
	
	int maxValue;
	public void maxNode(Node n)
	{
		
		if(n!=null){
			if (maxValue<n.value)
			{
				maxValue=n.value;
			}
			maxNode(n.rchild);
		}
	}
	
	int minValue;
	public void minNode(Node n)
	{
		if(n!=null){
			minValue=n.value;			
			minNode(n.lchild);
		}
	}
	
	int sum;
	public void sumOfNodes(Node n)
	{
		if(n!=null)
		{
			sum=sum+n.value;
			sumOfNodes(n.lchild);
			sumOfNodes(n.rchild);
		}
	}
	
	public static void main(String[] args) {

		int arr[]={9,8,7,6,4,0,2,1};
		Arrays.sort(arr);
		System.out.println("Advance for loop...");
		for(int i:arr)
		{
			System.out.print(i);
		}
		
		System.out.println("\nBinary Search Tree elements...");
		BinaryTree bt= new BinaryTree(arr);
		bt.linearTrav(bt.root, arr.length);
		
		bt.leafNodeCount(bt.root);
		System.out.println("\nTotal leaf count...\n"+bt.leafCount);
		
		bt.maxNode(bt.root);
		System.out.println("MaxValue...\n"+bt.maxValue);
		
		bt.minNode(bt.root);
		System.out.println("MiValue...\n"+bt.minValue);
		
		bt.sumOfNodes(bt.root);
		System.out.println("Sum of all the nodes is...\n"+bt.sum);
		
		System.out.println("\nDepth of the Tree is...\n"+bt.maxDepth(bt.root));
	}

}
