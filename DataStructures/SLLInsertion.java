import java.util.*;
public class SLLInsertion
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
	
	void insertBW(int data,int pos)
	{
		int i=1;
		Node t=head;
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
			head.next=null;
		}
		else
		{
			while(i<pos-1)
			{
				t=t.next;
				i++;
			}
			newNode.next=t.next;
			t.next=newNode;
			t=null;
		}
	}
	
	void display()
	{
		Node r1=head;
		if(head==null)
			System.out.println("List Is Empty");
		else
		{
			do
			{
				System.out.println(r1.data);
				r1=r1.next;
			}while(r1!=null);
		}
	}
	
	
	public static void main(String args[])
	{
		SLLInsertion d=new SLLInsertion();
		Scanner in=new Scanner(System.in);
		while(true)
		{
			System.out.println("(1)Insert Beg,(2)Insert End,(3)Insert Between,(4)Display,(5)Exit");
			System.out.print("Enter Your Choice : ");
			int choice=in.nextInt();
			switch(choice)
			{
				case 1:
				{
					System.out.print("Begnning Insertion Value :");
					int a=in.nextInt();
					d.insertBeg(a);
					break;
				}	
				case 2:
				{
					System.out.print("End Insertion Value :");
					int a=in.nextInt();
					d.insertEnd(a);
					break;
				}	
				case 3:
				{
					System.out.print("Between Insertion Value :");
					int a=in.nextInt();
					System.out.print("Position :");
					int b=in.nextInt();
					d.insertBW(a,b);
					break;
				}
				case 4:
				{
					d.display();
					break;
				}	
				case 5:
				{
					System.exit(0);
					break;
				}
			}
		}
	}
}