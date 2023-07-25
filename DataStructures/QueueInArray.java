class Operation 
{
	int front,rear;
	int size;
	static int a[]; 
	Operation(int x)
	{
		size=x;
		a=new int[size];
	}
	void enqueue(int y) 
	{
		if(rear==size)
			System.out.println("Queue is full");
		else
		{
			a[rear]=y;
			rear++;
		}
	}
	void dequeue()
	{
		if(rear==0)
			System.out.println("Queue is empty");
		else
		{
			for(int i=0;i<rear;i++)
				a[i]=a[i+1];
			rear--;
		}
		
	}
	void display()
	{
		if(rear==0)
			System.out.println("Queue is empty");
		else
		{
			for(int i=0;i<rear;i++)
				System.out.print(a[i]+" ");
		}
	}
}

public class QueueInArray
{
	public static void main(String args[])
	{
		Operation o=new Operation(5);
		o.enqueue(5);
		o.enqueue(3);
		o.enqueue(8);
		o.enqueue(56);
		o.enqueue(8);
		o.enqueue(56);
		
		o.display();
		o.dequeue();
		System.out.println("");
		o.display();

	}
}