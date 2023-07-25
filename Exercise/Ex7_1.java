import java.io.*;
public class Ex7_1
{
	public static void main(String args[])
	{
		try
		{
			File oFile=new File("raja.txt");
			FileInputStream oFileInStm=new FileInputStream("raja.txt");
			BufferedInputStream oBufInStm=new BufferedInputStream(oFileInStm);
			int a=0;
			byte[] n=new byte[(int)oFile.length()];
			oFileInStm.read(n);
			String str=new String(n);
			String []s=str.split(" ");
			System.out.println("word counting are "+s.length);
			oFileInStm.close();
		}
		catch(IOException e)
		{
			System.out.println("File is not Avaliable");
		}
	}
}