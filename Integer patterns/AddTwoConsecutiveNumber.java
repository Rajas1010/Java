import java.io.*;
import java.util.*;
public class AddTwoConsecutiveNumber
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String a[];
		
		String b="";
		int y=0;
		a=bf.readLine().split(" ");
		int n[]=new int [a.length];
		int m[]=new int[a.length];
		for(int i=0;i<a.length;i++)
			n[i]=Integer.parseInt(a[i]);
		System.out.println(Arrays.toString(a));
		while(n[1]!=0)
		{
			if(a.length%2==0)
			{
				for(int i=0;i<n.length;i+=2)
				{
				m[i/2]=n[i]+n[i+1];
				System.out.print(m[i/2]+" ");
				}
			}
			else
			{
				for(int i=0;i<n.length-1;i+=2)
				{
				m[i/2]=n[i]+n[i+1];
				y=i/2;
				//System.out.print(m[i/2]+" ");
				}
				m[y+1]=n[n.length-1];
				//System.out.print(n[n.length-1]);
			}
			System.out.println("");
			for(int i=0;i<m.length;i++)
				n[i]=m[i];
			System.out.println(Arrays.toString(n));
		}
	}
}
