import java.util.*;
public class gtrn
{
	public static void main (String args[])
	{
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(1,"Sachin");
		m.put(2,"dhoni");
		m.put(3,"virat");
		for(Iterator<Entry<Integer,String>> iterator=m.entrySet().iterator();iterator.hasNext();)
		{
			Entry<Integer,String> e=iterator.next();
			System.out.println(e);
		}
	}
}
