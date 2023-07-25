import java.io.File;
public class showAllFiles
{
	public static void main(String args[])
	{
		File o=new File("E:\\");
		boolean ob=o.exists();
		System.out.println("Path avaliable:"+ob);
		if(ob==true)
			try
			{
				String[] list=o.list();		//get all list of the path
				for(int i=0;i<list.length;i++)
					System.out.println(list[i]);
			}catch (Exception e)
				{System.out.println("expn");}
		else
			System.out.println("path not avaliable");
	}
}