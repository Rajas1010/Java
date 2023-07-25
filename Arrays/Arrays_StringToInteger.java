import java.io.*;
import java.util.*;
public class Arrays_StringToInteger
{
	public static void main(String args[])
	{
		String a[]={"1","2","3","4","5"};
		int i[]=Arrays.stream(a).mapToInt(Integer::parseInt).toArray();
		System.out.println(Arrays.toString(i));
	}
}
