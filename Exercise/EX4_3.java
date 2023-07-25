//ex4_3
import java.util.*;
//import java.lang.IndexOutOfBoundsException;
public class ex4_3 //extends IndexOutOfBoundsException
{
	public static void main(String args[])
	{
		reverse o=new reverse();
		o.demo();
	}
}
class reverse
{
	public void demo()
	{
		 Scanner in=new Scanner(System.in);
		StringBuffer a=new StringBuffer();
		StringBuffer b=new StringBuffer();

		int i;
		char [] stack=new char[20];
			int top=0;
		System.out.println("enter the text");
		a.append(in.nextLine());
		for(i=0;i<a.length();i++)
		{
			//try
			//{
				stack[top]=a.charAt(i);
				top++;
			//}catch(StringIndexOutOfBoundsException e)
			//{
			//		System.out.println("exception occur");

			//}
		}
		for(i=1;i<a.length();i++)
		{
			//try
			//{
				b=b.append(stack[top-1]);
				top--;
			//}/*catch(StringIndexOutOfBoundsException e)
			//{
			//	System.out.println("exception occur");
			//
			//}
			//catch(ArrayIndexOutOfBoundsException e)
			//{
			//	System.out.println("exception occur");
			//
			//}*/
			
			
			
		}
		b=b.append(stack[top-1]);
		System.out.println("Reverse text : "+b);
		
	}
}

