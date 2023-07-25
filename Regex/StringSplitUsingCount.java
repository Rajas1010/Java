import java.util.*;
public class StringSplitUsingCount
{
	public static void main(String args[])
	{
		String s="1284987340187518027598";
		int e=5;
		String []a=s.split("(?<=\\G.{"+e+"})");
		
		//System.out.println(Arrays.toString(a));
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}