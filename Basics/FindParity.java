import java.util.*;
public class FindParity
{
	public static void main(String args[])
	{
		int s=01101001;
		boolean p=false;
		while(s!=0)
		{
			System.out.println(s);
			p=!p;
			s=s&s-1;
		}
		System.out.println(p?"odd":"even");
	}
}