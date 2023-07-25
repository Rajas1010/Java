import java.util.*;
public class Producer_Consumer 
{
	public static void main(String args[])
	{
		List<Integer> list=new ArrayList<Integer>();
		Thread thread1=new Thread(new Producer(list));
		Thread thread2=new Thread(new Consumer(list));
		thread1.start();
		thread2.start();
	}
}

class Producer implements Runnable
{
	List<Integer> list=null;
	final int max=5;
	private int i=0;
	
	public Producer(List<Integer> list)
	{
		super();
		this.list=list;
	}
	public void run()
	{
		while(true)
		{
			try
			{
				produce(i++);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	public void produce(int i)throws InterruptedException
	{
		synchronized(list)
		{
			while(list.size()==max)
			{
				System.out.println("List Is Full_Waiting For Consumer To Consume");
				//list.wait();
			}
		}
		synchronized(list)
		{
			System.out.println("Producer Produce Element :"+i%5);
			list.add(i);
			Thread.sleep(1000);
			list.notify();
		}
	}
}

class Consumer implements Runnable
{
	List<Integer> list=null;
	
	
	public Consumer(List<Integer> list)
	{
		super();
		this.list=list;
	}
	public void run()
	{
		while(true)
		{
			try
			{
				consume();
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
	}
	public void consume()throws InterruptedException
	{
		synchronized(list)
		{
			while(list.isEmpty())
			{
				System.out.println("List Is Empty_Waiting For Producer To Produce");
				list.wait();
			}
		}
		synchronized(list)
		{
			System.out.println("Consume The Element"+list.remove(0)%5);
			Thread.sleep(1000);
		//	list.notify();
		}
	}
}

