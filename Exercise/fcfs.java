import java.util.Scanner;
public class fcfs 
{
	public static void main(String [] args)
	{
		bus o=new bus();
		o.fcfs();
	}
}
class bus
{
	public void fcfs()
	{
		
		Scanner in= new Scanner(System.in);
		int seek = 0,diff = 0,head = 0;
		int[] queue;
		System.out.println("FCFS Disk Scheduling");
		System.out.println("Enter queue size");
		int qSize =in.nextInt();
		queue = new int[qSize+1];
		System.out.println("Input Queue elements");
		for(int i=1; i<=qSize; i++)
		{
			queue[i] =in.nextInt();
		}
		System.out.println("Enter initial head position");
		head =in.nextInt();
		queue[0] = head;
		for(int j=0; j<=qSize-1; j++)
		{
			diff = Math.abs(queue[j]- queue[j+1]);
			seek += diff;
			System.out.println("Move " +queue[j] + " to " + queue[j+1] + " with seek " + diff);
		}
		System.out.println("Total Seek time is " + seek);
	
	}
}