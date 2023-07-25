import java.io.*;
public class writeAppend
{
	public static void main(String args[])
	{
		try
		{
			File o= new File("E:\\raja.txt");
			FileWriter oW=new FileWriter(o,true);					//true ->append
			BufferedWriter oBW=new BufferedWriter(oW);
			oBW.write("hi..How are you ..?");
			oBW.newLine();
			oBW.write("yes, I am fine.");
			oBW.flush();
			oBW.close();
		}catch(IOException e)
			{System.out.println("exception occurs");}
	}
	
}