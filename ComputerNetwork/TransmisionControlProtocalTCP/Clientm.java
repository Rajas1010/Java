import java.io.*;
import java.util.*;
import java.net.*;
public class Clientm
{
	public static void main(String args[]) throws Exception
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter The Port Number");
		int a=in.nextInt();
		try
		{
		Socket skt=new Socket("192.168.137.1",a);
		DataOutputStream odos=new DataOutputStream(skt.getOutputStream());
		BufferedReader obr=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			String s=obr.readLine();
			odos.writeUTF(s);
			if(s.equalsIgnoreCase("bye"))
				break;
		}
		skt.close();
		}catch(ConnectException ex){System.out.println("Server Not Avaliable 404 Error Found");}
	}
}