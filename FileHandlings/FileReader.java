import java.io.*;
public class FileReader
{
	public static void main(String args[])
	{
		File o=new File("D:\\raja.txt");
		boolean x=o.exists();
		System.out.print("file exists :  "+x);
		
		try
		{
			if(x==true)
			{
				FileReader o_read=new java.io.FileReader(o);
				char[]a=new char[(int)o.length()];
				System.out.println(a.length);
				o_read.read(a);
				for(char c:a)
					System.out.print(c);
				o_read.close();
			}
			else 
				System.out.print("File not avaliable");
		}catch(IOException e)
			{System.out.println("exception occurs");}
	}
	
}