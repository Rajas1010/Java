import java.io.*;
class serializable
{
	public static void main(String args[])
	{
		emp o=new emp("raja",22);
		try
		{
			FileOutputStream fos=new FileOutputStream("ser.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(o);
			oos.close();
			fos.close();
		}
		catch(IOException e)
		{
			System.err.print(e);
		}
	}
}
class emp implements Serializable
{
	String n;
	int ag;
	public emp(String name,int age)
	{
		this.n=name;
		this.ag=age;
	}
	public String toString()
	{
		return(n+"----"+ag);	
	}
}
