import java.io.*;
import java.util.*;
public class ReadLine
{
	public static void main(String args[])
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String []a;
			a=br.readLine( ).split(" ");
			System.out.println(Arrays.toString(a));
		}catch(Exception e){}
	}
}
