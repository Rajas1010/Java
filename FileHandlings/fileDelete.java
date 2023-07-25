import java.io.File;
public class fileDelete
{
	public static void main(String args[])
	{
		File o=new File("E:\\raja.txt");		//corrosponding filePath\\filename
		boolean ob=o.exists();
		System.out.println("file avaliable:"+ob);
		if(ob==true)
			try
			{
			boolean obj=o.delete();
			System.out.println("file delete :"+obj);
			}catch (Exception e)
				{System.out.println("expn");}
		else
			System.out.println("file not avaliable");
	}
}