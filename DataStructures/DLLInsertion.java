import java.util.*;
public class DLLInsertion
{
	Node rHead=null;
	Node rTail=null;
	class Node
	{
		int iData;
		Node rNext=null;
		Node rPrev=null;
		public Node(int iData){
		this.iData=iData;}
	}
	void insert(int iData,int iPos)
	{
		Node newNode=new Node(iData);
		int i=1;
		if(rHead==null)
		{
			rHead=newNode;
			rTail=newNode;
			newNode.rPrev=null;
			newNode.rNext=null;
		}
		else if(iPos==1)
		{
			rHead.rPrev=newNode;
			newNode.rNext=rHead;
			newNode.rPrev=null;
			rHead=newNode;
		}
		else
		{
			Node rTemp=rHead;
			try
			{
				while(i<iPos-1)
				{
					rTemp=rTemp.rNext;
					i++;
				}
				newNode.rNext=rTemp.rNext;
				newNode.rPrev=rTemp;
				rTemp.rNext=newNode;
				rTemp=newNode;
				if(rTemp.rNext!=null)
					rTemp.rNext.rPrev=newNode;
				else
					rTail=newNode;
				rTemp=null;
			}catch(Exception e){System.out.println("Wrong Position");}
		}
	}
	void display()
	{
		Node r1=rHead;
		System.out.print("List is : ");
		do
		{
			System.out.print(r1.iData+" ");
			r1=r1.rNext;
		}while(r1!=null);
		System.out.println();
	}
	void reverse()
	{
		Node r1=rTail;
		System.out.print("Reverse List is : ");
		do
		{
			System.out.print(r1.iData+" ");
			r1=r1.rPrev;
		}while(r1!=null);
	}
	public static void main(String args[])
	{
		DLLInsertion d=new DLLInsertion();
		Scanner in=new Scanner(System.in);
		while(true)
		{
			System.out.println("(1)Insert(2)Display(3)Reverse(4)Exit");
			System.out.print("Enter Your Choice : ");
			int choice=in.nextInt();
			switch(choice)
			{
				case 1:
				{
					System.out.print("Data :");
					int a=in.nextInt();
					System.out.print("Position :");
					int b=in.nextInt();
					d.insert(a,b);
					break;
				}
				case 2:
				{
					d.display();
					break;
				}	
				case 3:
				{
					d.reverse();
					break;
				}	
				case 4:
				{
					System.exit(0);
					break;
				}
			}
		}
	}
}