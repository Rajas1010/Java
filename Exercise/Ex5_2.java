public class Ex5_2
{
	public static void main(String args[])
	{
		int []a=new int[7];		//NAME - MARK 1 M2 M3 ...
		int x=0;
		try{
			String s=args[0];
		System.out.println("Name: " +s);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ENTER THE NAME AND MARKS IN COMMEND LINE");
		}
		try
		{
			for(int i=1;i<args.length;i++)
			{
			a[i]=Integer.parseInt(args[i]);
			} 
			for(int i=1;i<args.length;i++)
			{
				
				if (a[i]>100)
					throw new RangeException(a[i]+" mark is more then 100");
				else
					x+=a[i];
			}
			int y=x/(args.length-1);
			System.out.println("TOTAL MARKS : "+x);
			System.out.println("PERCENTAGE :"+y+"%");
		}
		catch(RangeException e1)
		{
			//System.out.println("exception "+e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e2)
		{
			System.out.println("ENTER ONLY 6 MARKS");
		}
		catch(ArithmeticException e3)
		{
			System.out.println("enter the marks");
		}
		
		
	}
}
class RangeException extends Exception
{
	public RangeException(String s)
	{
		//super(s);
		//System.out.println("excepionc occur");
		System.out.println(s);
		
	}
}