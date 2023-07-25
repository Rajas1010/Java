import java.io.File;
public class fileRename
{
	public static void main(String args[])
	{
		File o=new File("E:\\raja.txt");
		boolean ob=o.exists();
		System.out.println("file avaliable:"+ob);
		if(ob==true)
			try
			{
				File obj=new File("E:\\ram.txt");
			boolean objc=o.renameTo(obj);
			System.out.println("file rename Success :"+objc);
			}catch (Exception e)
				{System.out.println("expn");}
		else
			System.out.println("file not avaliable");
	}
}