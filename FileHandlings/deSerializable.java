import java.io.*;
class deSerializable
{
	public static void main(String args[])
	{
		try
		{
			FileInputStream fis=new FileInputStream("ser.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			emp o=(emp)ois.readObject();
			System.out.print(o);
			ois.close();
			fis.close();
		}
		catch(IOException e)
		{
			System.err.print(e);
		}
		catch(Exception e2)
		{
			System.err.print(e2);
		}
	}
}
