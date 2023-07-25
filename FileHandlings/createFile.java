import java.io.File;
import java.io.IOException;
public class createFile
{
	public static void main(String args[])
	{
		File o=new File("D:\\raja.txt");
		boolean ob=o.exists();
		System.out.println("file already avaliable:"+ob);
		if(ob==false)
			try
			{
			boolean obj=o.createNewFile();							//create file method
			System.out.println("file created :"+o.getName());	//to get the file name
			System.out.println("execute :"+o.canExecute());					
			System.out.println("read :"+o.canRead());
			System.out.println("write :"+o.canWrite());
			
			}catch (IOException e)
				{System.out.println("expn");}
		
	}
}