import java.util.*;
public class list_arrayList
{
	public static void main (String args[])
	{
		List<String> L=new ArrayList<String>();
		L.add("John");
		L.add("Sara");
		L.add("Rena");
		L.add("Habi");
		for(String s:L)
		{
			System.out.println(s);
		}
	}
}
