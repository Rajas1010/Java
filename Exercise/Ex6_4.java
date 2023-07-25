import java.util.*;
public class Ex6_4
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("value of I & J :");
		int i=in.nextInt();
		int j=in.nextInt();

		user2 o=new user2(i,j);
		o.printNum();
	}
}
class user
{
	int i;
	user(int n)
	{
		this.i=n;
	}
	public void printNum()
	{
		System.out.println("value of I is :"+i);
	}
}
class user2 extends user
{
	int j;
	
	user2(int d,int n)
	{
		super(n);
		this.j=d;
	}
	public void printNum()
	{
		System.out.println("value of I is :"+i);
		System.out.println("value of J is :"+j);
	}
}
	