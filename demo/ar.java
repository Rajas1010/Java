import java.util.*;

public class ar
{
	public static void main(String args[])
	{
		List c=new ArrayList();
		c.add('(');
		c.add('{');
		System.out.println(c);
		c.remove(c.size()-1);
		System.out.println(c);
			
	}
}