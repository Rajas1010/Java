public class Queue
{
	Node head;
	Node tail;
	class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
		}
	}
	
	void insert(int data)
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
			tail.next=newNode;
			tail=newNode;
			tail.next=null;
		}
	}
	void display()
	{
		Node n1=head;
		do
		{
			System.out.println(n1.data);
			n1=n1.next;
		}while(n1!=null);
	}
	void delete()
	{
		Node temp;
		if(head==null)
		{
			System.out.println("list is empty");
		}
		else
		{
			temp=head;
			head=head.next;
			temp=null; 
		}
		
	}
	public static void main(String args[])
	{
		Queue d=new Queue();
		d.insert(2);
		d.insert(6);
		d.insert(3);
		d.display();
		d.delete();
		d.display();
	}
}