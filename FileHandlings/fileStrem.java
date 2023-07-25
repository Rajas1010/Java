import java.io.*;
public class fileStrem
{
	public static void main(String args[]) throws Exception
	{
		int a;
		FileInputStream oFI=null;
		FileOutputStream oFO=null;
		try
		{
			oFI=new FileInputStream("fileInp.txt");
			oFO=new FileOutputStream("fileOtp.txt");
			
			while((a=oFI.read())!=-1)
			{
				oFO.write((byte)a);
			}
		}catch(IOException e){System.out.println("io xn");}
		finally
		{
			if(oFI !=null)
			{oFI.close();}
		}
	}
}

