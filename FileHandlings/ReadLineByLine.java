import java.util.*;
import java.io.*;
public class ReadLineByLine
{
	public static void main(String args[])
	{	
		try
		{
			File inFile = new File("fileInp.txt");
			BufferedReader oBufRead=new BufferedReader(new java.io.FileReader(inFile));
			String line=oBufRead.readLine();
			while(line !=null)
			{
				System.out.println(line);
				line=oBufRead.readLine();
			}
		}catch(Exception ex){}
	}
}