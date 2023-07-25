import java.io.*;
import java.util.*;
public class Ex7_3
{
	public static void main(String args[])
	{
		try
		{
			Scanner in=new Scanner(System.in);
			System.out.println("Enter the string to be  converted");
			String s1=in.next();
			String s2;
			char []ch=new char[s1.length()];
			for(int i=0;i<s1.length();i++)
			{
				
				char ch1,ch2,temp;
				ch1=s1.charAt(i);
				if(Character.isLowerCase(ch1))
				{
					ch2=Character.toUpperCase(ch1);
					ch[i]=ch2;
				}
				else
				{
					ch[i]=ch1;
				}
			}
			s2=String.valueOf(ch);
			FileOutputStream fout=new FileOutputStream("upper.txt");
			byte b[]=s2.getBytes();
			fout.write(b);
		}
		catch(IOException e)
		{
			System.out.println("File not avaliable");
		}
		
	}
}