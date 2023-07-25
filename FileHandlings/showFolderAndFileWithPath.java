import java.io.File;
public class showFolderAndFileWithPath
{
	public static void main(String args[])
	{
		File o=new File("D:\\");
		boolean ob=o.exists();
		System.out.println("Path avaliable:"+ob);
		if(ob==true)
			try
			{
				File[] o_list=o.listFiles();		//get all list of the path with path
				for (File s:o_list)
				{
					if(s.isFile())						// get File only
					System.out.println("FILE  ;"+s);
					if(s.isDirectory())				//get Folder only
					System.out.println("FOLDER  ;"+s);
						
				}
			}catch (Exception e)
				{System.out.println("expn");}
		else
			System.out.println("path not avaliable");
	}
}