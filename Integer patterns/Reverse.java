import java.util.*;
public class Reverse 
{
	static public void main(String args[])
	{	
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the value : ");
		int n=in.nextInt();
		Home o=new Home();
		System.out.println(o.demo(n));
		
	}
}
class Home 
{
	
	public int demo(int n)
	{
		int reverse=0,rem;
		while(n!=0)
		{
			rem=n%10;
			reverse=(reverse*10)+rem;
			n=n/10;
		}
		return reverse;
	}
}