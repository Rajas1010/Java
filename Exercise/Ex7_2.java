import java.io.*;
public class Ex7_2
{
	public static void main(String args[])
	{
		try
		{
			File oFile=new File("in.txt");
			FileInputStream oFileInStm=new FileInputStream("in.txt");
			BufferedInputStream oBufInStm=new BufferedInputStream(oFileInStm);
			int a=0,i,j,y;
			Double r,x=0.00;
			String o;
			byte[] n=new byte[(int)oFile.length()];
			oFileInStm.read(n);
			String str=new String(n);
			String []s=str.split(" ");
			ptr:
			for(i=0;i<s.length;i++)
			{
				o=s[i];
				next:
					for(j=0;j<o.length();j++)
					{
						if(o.charAt(j)==46)
						{
							System.out.println("The floating point number read is :"+o);
							r=Double.parseDouble(o);
							x+=r;
							continue ptr;
						}
						continue next;
					}
				for(j=0;j<o.length();j++)
				{
					if(o.charAt(j)>=48 && o.charAt(j)<=57 )
					{
						if(j==0)
						{
							System.out.print("The Integer read is :");
							y=Integer.parseInt(o);
							x+=y;
						}
						System.out.print(o.charAt(j));
					}
					if(o.charAt(j)>=65 && o.charAt(j)<=90 || o.charAt(j)>=97 && o.charAt(j)<=122)
					{
						if(j==0)
						{
							System.out.print("The String read is :");
						}
						System.out.print(o.charAt(j));
					}
				}
				System.out.println("");
			}
			System.out.println("Hi,Peter,The sum of all integer & float value is :"+x);
			oFileInStm.close();
		}catch (IOException e)
			{	
				System.out.println("File not Avaliable");
			}
	}
} 