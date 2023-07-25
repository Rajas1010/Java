import java.util.*;
public class Ex5_3 
{
	static int a;
	public static void main(String args[])
	{
		CheckingAccount o=new CheckingAccount();
		Scanner in=new Scanner(System.in);
		while(true)
		{
		System.out.println("deposit(1)  withdraw(2)  exit(3)");
		int x=in.nextInt();
		
			if(x==1)
			{
				System.out.println("Enter the deposit amount");
				int p=in.nextInt();
				o.deposit(p);
				System.out.println("bal :"+a);
			}
			if(x==2)
			{	
				System.out.println("Enter the withdraw amount");
				int q=in.nextInt();
				try
				{
					o.withdraw(q);
					System.out.println("bal :"+a);
				}
				catch(InsufficientFundsException e)
				{
					System.out.println(e.getMessage());
				}
			}
			if(x==3)
				System.exit(1);
		}
	}
}
class InsufficientFundsException extends Exception
{
	public InsufficientFundsException(String s)
	{
		super(s);
	}
}
class CheckingAccount 
{
	
	Scanner in=new Scanner(System.in);
	public int withdraw(int i)throws InsufficientFundsException
	{
		
		if(Ex5_3.a<i)
		{
			throw new InsufficientFundsException("insufficient Balance");
		}
		Ex5_3.a-=i;
		return Ex5_3.a;
	}
	public int deposit(int i)
	{
		Ex5_3.a+=i;
		return Ex5_3.a;
	}
}