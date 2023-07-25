import java.lang.*;
public class thred
{
	public static void main(String arg[])
	{
		Thread o=new Thread(new multi());
		o.start();
		multiple obj=new multiple();
		obj.start();
		System.out.println(o.getName());
		obj.setName("raj");
		System.out.println(obj.getName());
	}
}
class multiple extends Thread
{
	public void run()
	{
		for(int i=50;i<100;i++)
			System.out.print(i+" ");
	}
}
class multi implements Runnable
{
	public void run()
	{
		for(int i=0;i<50;i++)
			System.out.print(i+" ");
	}
}
