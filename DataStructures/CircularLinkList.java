import java.util.*;
public class CircularLinkList
{
	Node head;
	Node tail;
	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
		}
	}
	
	void insert(int data)
	{
		Node newNode= new Node(data);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
			tail.next=newNode;	
		}
		else
		{
			tail.next=newNode;
			tail=newNode;
			tail.next=head;
		}
	}
	void display()
	{
		Node n1=head;
		if(tail==null)
			System.out.println("empty");
		else
		{
			do
			{
				System.out.println(n1.data);
				n1=n1.next;
			}while(n1!=head);
		}
	}
	public static void main(String args[])
	{
		CircularLinkList d=new CircularLinkList();
		d.insert(2);
		d.insert(4);
		d.insert(1);
		d.display();
	}
}