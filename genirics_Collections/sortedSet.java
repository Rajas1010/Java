import java.util.*;
public class sortedSet
{
	public static void main (String args[])
	{
		SortedSet s=new TreeSet();
		s.add("ram");
		s.add("damu");
		s.add("abi");
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			Object o=i.next();
			System.out.println(o.toString());
		}
	}
}
