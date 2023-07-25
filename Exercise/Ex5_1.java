public class Ex5_1
{
	public static void main(String args[])
	{
		int []a=new int[10];
		int x=1;
		
		try
		{
			for(int i=0;i<args.length;i++)
			{
			a[i]=Integer.parseInt(args[i]);
			} 
			if(args.length>8)
				throw new CheckArguments("more then eight");
			else
				{
				for(int i=0;i<args.length;i++)
					{
						x*=a[i];
					}
					System.out.println("mul value : "+x);
				}
		}
		catch(CheckArguments e)
		{
			//System.out.println("exception "+e.getMessage());
		}
		
	}
}
class CheckArguments extends Exception
{
	public CheckArguments(String s)
	{
		//super(s);
		System.out.println("excepionc occur");
		System.out.println(s);
		
	}
}
