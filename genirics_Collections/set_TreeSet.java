import java.util.*;
public class set_TreeSet
{
	public static void main (String args[])
	{
		int a[]={21,87,29,55,39};
		Set<Integer> s=new HashSet<Integer>();
		for(int n:a)
		{
			s.add(n);
		}
		System.out.println(s);
		TreeSet<Integer> ts=new TreeSet<Integer>(s);
		System.out.println(ts);
		System.out.println("first value "+ts.first());
		System.out.print("last value "+ts.last());
	}
}
