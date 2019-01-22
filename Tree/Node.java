package Tree;

public class Node {

	int value;
	Node lchild,rchild;
	
	public Node(int value, Node lchild, Node rchild)
	{
		this.value=value;
		this.rchild=rchild;
		this.lchild=lchild;
	}
	
	public Node(int value)
	{
		this.value=value;
		lchild=null;
		rchild=null;
	}
}
