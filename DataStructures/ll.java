import java.util.*;
class S{
	
	Node head;
	Node tail;
	
	class Node
	{
		int data;
		Node next;
		public Node(int d)
		{
			this.data=d;
		}
	}
	
	void insertEnd(int data)
	{
		Node newNode=new Node(data);
		
		if(head==null)
		{
			head=newNode;
			tail=newNode;
			head.next=null;
		}
		else
		{
			tail.next=newNode;
			tail=newNode;
			tail.next=null;
		}
	}
	void insertBeg(int data)
	{
		Node newNode=new Node(data);
		
		if(head==null)
		{
			head=newNode;
			tail=newNode;
			tail.next=null;
		}
		else
		{
			newNode.next=head;
			head=newNode;
		}
		System.out.println(head.data);
	}
}

public class ll
{
	public static void main(String args[])
	{
		S o=new S();
		o.insertBeg(5);
	}
}