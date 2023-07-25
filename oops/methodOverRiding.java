public class methodOverRiding
{
	public static void main(String args[])
	{
		department o=new department("Raja",19,"HR");
		o.display();
	}
}
class user
{
	String name;
	int age;
	user(String s,int n)
	{
		this.name=s;
		this.age=n;
	}
	public void display()
	{
		System.out.println("Name :"+name);
		System.out.println("AGE :"+age);
	}
}
class department extends user
{
	String dept;
	department(String s,int n,String d)
	{
		super(s,n);
		this.dept=d;
	}
	public void display()
	{
		System.out.println("NAME :"+name);
		System.out.println("AGE :"+age);
		System.out.println("DEPT :"+dept);
	}
}
	