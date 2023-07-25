class math
{
	/*synchronized*/void multiples(int n)
	{
	synchronized (this)
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(n*i);
				try
				{
					Thread.sleep(400);
				}catch(Exception e){System.out.println(e);}
			}
		}
			for(int i=1;i<=5;i++)
			{
				System.out.println(n*i);
				try
				{
					Thread.sleep(400);
				}catch(Exception e){System.out.println(e);}
			}
	}
}
class thred1 extends Thread
{
	math x;
	public thred1(math x)
	{
		this.x=x;
	}
	public void run()
	{
		try
		{
			x.multiples(2);
		}catch(Exception e){System.out.println(e);}
	}
}
class thred2 implements Runnable
{
	math x;
	public thred2(math x)
	{
		this.x=x;
	}
	public void run()
	{
		try
		{
			x.multiples(3);
		}catch(Exception e){System.out.println(e);}
	}
}
public class synch
{
	public static void main(String args[])
	{
		math o =new math();
		thred1 ot1=new thred1(o);
		Thread ot2=new Thread(new thred2(o));
		ot1.start();
		ot2.start();
	}
}