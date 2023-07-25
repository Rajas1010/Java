public class generic1
{
	public static void main (String args[])
	{
		emp<Integer> o=new emp<Integer>();
	System.out.println
	(o.fun(10));
		emp<String> o1=new emp<String>();
				
System.out.print(o1.fun("raja"));
	}
}
class emp<T>
{
	public T fun(T v)
	{
		T a;
		a=v;
		return a;
	}
}