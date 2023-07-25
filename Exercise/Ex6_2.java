import java.util.*;
public class Ex6_2
{
	public static void main(String args[])
	{
		bank b=new bank();
		b.getBalance();
	}	
}
class bank 
{
	public void getBalance()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("bankA deposit amount ;");
		int a=in.nextInt();
		System.out.println("bankB deposit amount ;");
		int b=in.nextInt();
		System.out.println("bankC deposit amount ;");
		int c=in.nextInt();
		bankA o=new bankA(a);
		o.getBalance();
		bankB ob=new bankB(b);
		ob.getBalance();
		bankC obj=new bankC(c);
		obj.getBalance();
	}
}

class bankA
{
	int amountA;
	bankA(int a)
	{
		amountA=a;
	}
	public void getBalance()
	{
		System.out.println("bankA balance :"+amountA);
	}
}
class bankB 
{ 
	int amountB;
	bankB(int b)
	{
		amountB=b;
	}
	public void getBalance()
	{
		System.out.println("bankB balance :"+amountB);
	}
}
class bankC 
{
	int amountC;
	bankC(int c)
	{
		amountC=c;
	}
	public void getBalance()
	{
		System.out.println("bankC balance :"+amountC);
	}
	
}

