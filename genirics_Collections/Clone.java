class Clone implements Cloneable
{
	int no;
	String name;
	Clone(int no,String name)
	{
		this.no=no;
		this.name=name;
	}
	public Object clone()throws CloneNotSupportedException
	{
		return super.clone();
	}
	public static void main(String args[])
	{
		try
		{
		Clone o=new Clone(10,"Raja");
		Clone o1=(Clone)o.clone();	
		System.out.println("Number : "+o1.no+" Name : "+o1.name);

		}catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}
}