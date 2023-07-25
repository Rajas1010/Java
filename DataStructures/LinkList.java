import java.util.*;
public class LinkList
{
	public static void main(String args[])
	{
		LinkedList l=new LinkedList();
		l.add(4);
		l.add(7);
		l.add(8);
		l.add(0,2);
		l.remove(2);
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		 
					System.out.println(l.size());

	}
}