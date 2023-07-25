import java.io.*;
public class copyImage
{
	public static void main(String args[])
	{
		try
		{
			InputStream oIP=new FileInputStream("E:\\Computer Language\\python Index.jpg");
			OutputStream oOP=new FileOutputStream("E:\\Computer Language\\py.jpg");
			int c=oIP.read();
			while(c!= -1)
			{			
			oOP.write(c);
			c=oIP.read();
			}		
			oOP.flush();
		}catch(FileNotFoundException e)
			{System.out.println("exception file not found");}
		catch(IOException e)
			{System.out.println("exception io");}
	}
	
}