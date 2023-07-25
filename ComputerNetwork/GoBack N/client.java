import java.io.*;
import java.util.*;
import java.net.*;
public class client
{
	public static void main(String args[]) throws IOException
	{
		
		InetAddress addr=InetAddress.getByName("Localhost");
		System.out.println(addr);
		Socket Client=new Socket(addr,500);
		
		BufferedInputStream in=new BufferedInputStream(Client.getInputStream());
		DataOutputStream out=new DataOutputStream(Client.getOutputStream());
		Scanner inp=new Scanner(System.in);
		
		System.out.println("client");
		System.out.println("connect");
		System.out.println("Enter the number of frames");
		int c=inp.nextInt();	//8
		out.write(c);
		out.flush();
		
		System.out.println("error=1, no error=0");
		int choice=inp.nextInt();	//
		out.write(choice);
		
		int check=0,i=0,j=0;
		if(choice==0)
		{
			for(j=0;j<c;j++)
			{
				i=in.read();
				System.out.println("received frame no :"+i);
				System.out.println("sending ack"+i);
				out.write(i);
				out.flush();
			}
			out.flush();
		}
		else
		{
			for(j=0;j<c;j++)
			{
				i=in.read();
				if(i==check)
				{
					System.out.println("i : "+i+"check : "+check);
					System.out.println("recv frame no :"+i);
					System.out.println("sending ack frame no"+i);
					out.write(i);
					++check;
				}
				else
				{
					--j;
					out.write(-1);
				}
				out.flush();
			}
		}
		in.close();
		out.close();
		System.out.println("Quiting");
	}
}