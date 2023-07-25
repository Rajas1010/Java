import java.util.*;
import java.io.File;
public class createDir
{
	public static void main(String args[])
	{
		File o=new File("C:\\java programs\\FileHandlings");
		boolean ob=o.exists();
		System.out.println("Folder Present"+ob);
		if (ob==false)
		{
			o.mkdir();
		}
	}
}