import java.io.*;
import java.util.*;
import java.net.*;
public class server
{
	public static void main(String args[]) throws IOException
	{
		System.out.println("server");
		System.out.println("waiting for con");
		InetAddress addr=InetAddress.getByName("Localhost");
		ServerSocket ss=new ServerSocket(500);
		Socket Client=new Socket();
		Client=ss.accept();
		
		BufferedInputStream in=new BufferedInputStream(Client.getInputStream());
		DataOutputStream out=new DataOutputStream(Client.getOutputStream());
		System.out.println("Received");
		int p=in.read();
		boolean f[]=new boolean[p];
		int pc=in.read();
		System.out.println("sending");
		if(pc==0)
		{
			for(int i=0;i<p;i++)
			{
				System.out.println("sending frame no :"+i);
				out.write(i);
				out.flush();
				System.out.println("waiting for ack");
				try
				{
					Thread.sleep(700);
					
				}catch(Exception e){}
				
				int a=in.read();
				System.out.println("receivr ack for frame"+i+" as "+a);
			}
			out.flush();
		}
		else
		{
			for(int i=0;i<p;i++)
			{
				if(i==2)
					System.out.println("sending Frame no :"+i);
				else
				{
					System.out.println("sending frame no :"+i);
					out.write(i);
					out.flush();
					System.out.println("waiting for ack");
					try
					{
						Thread.sleep(1000);
					}catch(Exception e){}
					
					int a=in.read();
					if(a!=255)
					{
						System.out.println("recv for farme no"+i+" as "+a);
						f[i]=true;
					}
				}
			}
			for(int a=0;a<p;a++)
			{
				if(f[a]==false)
				{
					System.out.println("Resending frame"+a);
					out.write(a);
					out.flush();
					System.out.println("waiting for ack");
					try
					{
						Thread.sleep(300);
					}catch(Exception e){}
					
					int b=in.read();
						System.out.println("recv for farme no"+a+" as "+b);
						f[a]=true;
				}
			}
			out.flush();
		}
		in.close();
		out.close();
		
	}
}