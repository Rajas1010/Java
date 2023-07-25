import java.util.*;
public class DataStructure
{
	Node Head=null;
	Node Tail=null;
	class Node
	{
		char Data;
		Node Right;
		Node Left;
		public Node(char Data)
		{
			this.Data=Data;
		}
	}
	void priorder(char n)
	{
		System.out.print(n+" ");
		priorder(Left.n);
		priorder(Right.n);
	}
	public static void main(String args[])
	{
		DataStructure tree=new DataStructure();
		tree.Node=new 
	
	}
}