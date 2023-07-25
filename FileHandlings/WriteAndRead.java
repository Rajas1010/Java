import java.io.*;
public class WriteAndRead
{
	public static void main(String args[])
	{
		File o=new File("E:\\raja.txt");
		boolean ob=o.exists();
		System.out.println("file already avaliable:"+ob);
		if(ob==true)
			try
			{
				FileWriter o_write=new FileWriter(o);
				o_write.write("How are you ?");
				o_write.flush();
				o_write.close();
				FileReader o_read=new FileReader(o);
				int r=o_read.read();
				while(r!=-1)
				{
					System.out.print((char)r);
					 r=o_read.read();
				}
					
			}catch (IOException e)
				{System.out.println("expn");}
		else
			System.out.println("file not avaliable");
	}
}