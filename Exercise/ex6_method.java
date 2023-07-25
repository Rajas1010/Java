public class Ex6_2
{
	public static void main(String args[])
	{
		bankC o=new bankC(1000,2000,3000);
		o.getBalance();
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
		System.out.println("bankA balance"+amountA);
	}
}
class bankB extends bankA
{ 
	int amountB;
	bankB(int a,int b)
	{
		super(a);
		amountB=b;
	}
	public void getBalance()
	{
		System.out.println("bankA balance"+amountA);
		System.out.println("bankB balance"+amountB);
	}
}
class bankC extends bankB
{
	int amountC;
	bankC(int a,int b,int c)
	{
		super(a,b);
		amountC=c;
	}
	public void getBalance()
	{
		System.out.println("bankA balance"+amountA);
		System.out.println("bankB balance"+amountB);
		System.out.println("bankC balance"+amountC);

	}
	
}

