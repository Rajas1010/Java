import java.io.*;
import java.net.*;
import java.util.*;
public class Serverm
{
	public static void main(String args[]) throws Exception
	{
		//Scanner in=new Scanner(System.in);
		//System.out.println("Enter The Port Number");
		//int a=in.nextInt();
		try
		{
		ServerSocket s=new ServerSocket(8877);
		Socket sk=s.accept();
		
		System.out.println("Connected");
		DataInputStream odis=new DataInputStream(sk.getInputStream());
		//while(true)
		//{
			String s1=(String)odis.readUTF();
			System.out.println("Client : "+s1);
				//if(s1=="bye")
				//break;
		//}
		sk.close();
		s.close();
		}catch(EOFException exp){}
	}
}