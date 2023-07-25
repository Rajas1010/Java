import java.util.*;
public class Ex6_1
{
	public static void main(String args[])
	{
		degree o=new degree();
		o.getDegree();
		undergraduate ob=new undergraduate();
		ob.getDegree();
		postgraduate obj=new postgraduate();
		obj.getDegree();
		
	}
}
class degree
{
	public static void getDegree()
	{
		System.out.println("i got degree");
	}
}
class undergraduate
{
	public void getDegree()
	{
		System.out.println("i got UG degree");
	}
}
class postgraduate
{
	public void getDegree()
	{
		System.out.println("i got PG degree");
	}
}

