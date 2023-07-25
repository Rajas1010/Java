class Insert
{
	
	Node root;
	static class Node
	{
		Object data;
		Node right;
		Node left;
		public Node(Object d)
		{
			this.data=d;
		}
	}
	public Insert(){root=null;}
	
	public void preorder(Node node)
	{
		if (node==null)
			return;
		System.out.println(node.data);
	if(node.left!=null)
		preorder(node.left);
		preorder(node.right);
	}
	
}
public class Tree
{
	public static void main(String args[])throws Exception
	{
		Insert o=new Insert();
		o.root=new Insert.Node(67);
		o.root.left=new Insert.Node(55);
		o.root.right=new Insert.Node(70);
		o.root.left.left=new Insert.Node(45);
		o.root.left.right=new Insert.Node(57);
		o.root.right.left=new Insert.Node(69);
		o.root.right.right=new Insert.Node(74);
		o.preorder(o.root);
		// System.out.println(o.root.data);
		// System.out.println(o.root.left.data);
		// System.out.println(o.root.right.data);
		// System.out.println(o.root.left.left.data);
		// System.out.println(o.root.left.right.data);
		// System.out.println(o.root.right.left.data);
		// System.out.println(o.root.right.right.data);
		
		
	}
}