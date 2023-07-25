import java.io.File;
public class showTxtFileOnly
{
	public static void main(String args[])
	{
		File o=new File("E:\\");
		boolean ob=o.exists();
		System.out.println("Path avaliable:"+ob);
		if(ob==true)
			try
			{
				File[] o_list=o.listFiles();		//get all list of the path with path
				for (File s:o_list)
				{
					if(s.isFile())						// get File only
					{
						String o_Fname=s.getName();
						//System.out.println(o_Fname);
						int i=o_Fname.lastIndexOf(".");
						//System.out.println(i);
						String extn=o_Fname.substring(i+1);
						//System.out.println(extn);
						if(extn.equals("txt"))
							System.out.println(o_Fname);
					}
				}
			}catch (Exception e)
				{System.out.println("expn");}
		else
			System.out.println("path not avaliable");
	}
}