package Tree;


public class CopyTree {

	BTree copied;
	
	public BTree copy(BTree from)
	{
		System.out.println("ORIGINAL TREE...");
		int arr[]=from.linearTravs(from.root, 10);
		copied= new BTree();
		copied.addNodes(arr);
		return copied;
	}
	
	public static void main(String[] args) {

		int arr[]={0,1,2,3,4,5,6,7,8,9};
		BTree bt= new BTree();
		bt.addNodes(arr);
		
		CopyTree cp= new CopyTree();
		BTree to=cp.copy(bt);
		System.out.println("\nCOPIED TREE...");
		to.linearTrav(to.root, 10);


		
		
	}

}
