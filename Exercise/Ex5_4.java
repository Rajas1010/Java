import java.util.*;
public class Ex5_4
{

	public static void main(String args[])
	{
		
		Scanner in=new Scanner(System.in);
		try
		{
			
			System.out.println("Enter your HSC percentage");
			int b=in.nextInt();
			percentage(b);
			System.out.println("enter the DIVISER value");
			int a=in.nextInt();
			divide(10,a);
		}
		catch(IllegalArgumentException e4)
		{
			System.out.println("IllegalArgumentException occur");
		}
		catch(InputMismatchException e1)
		{
			System.out.println("InputMismatchException occur ");
		}
		
	}
	public static void divide(int x,int y)
	{
		try
		{
			int z=x/y;
			System.out.println("divide: "+z);
		}
		catch(ArithmeticException e3)
		{
			System.out.println("ArithmeticException occur");
		}
		catch(InputMismatchException e1)
		{
			System.out.println("InputMismatchException occur ");
		}
	}
	public static void percentage(int n)
	{
		System.out.println("Enter your HSC percentage: ");
		if(n<0||n>100)
		{
			throw new IllegalArgumentException(Integer.toString(n));
		}
		else
			System.out.println("my HSC percentage is "+n);
	}
}
		
		/*catch(IllegalAccessException e2)
		{
			System.out.println("ENTER ONLY 6 MARKS");
			
		}*/
	
		

