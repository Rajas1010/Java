import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.*;

public class trn
{
	public static void main(String[] args) throws IOException
	{
		DatagramSocket ds = new DatagramSocket(1234);
		
		byte[] receive = new byte[65535];
		DatagramPacket DpReceive = null;
		
		DpReceive = new DatagramPacket(receive, receive.length);
		ds.receive(DpReceive);

		String s="";
		s=(data(receive)).toString();
		System.out.println(s);
		
		int h,r,x=0;
		for(int i=0;i<s.length();i++)
			if(s.charAt(i)==',')
			{
				x=i;
				break;
			}
		h=Integer.parseInt(s.substring(0,x));
		r=Integer.parseInt(s.substring(x+1,s.length()));
		System.out.println(h);
		System.out.println(r);
		x=0;
		int a[]=new int[(h/2)+1];
		
		if(h%2==0)
		{
			x=r*(h/2);
			for(int i=2;i<=h;i+=2)
				a[(i/2)-1]=i;
			a=Arrays.copyOf(a,h/2);
		}
		else
		{
			x=r*((h/2)+1);
			for(int i=1;i<=h;i+=2)
				a[i/2]=i;
		}
		System.out.println(Arrays.toString(a)+x);
		String str=Arrays.toString(a).replaceAll("\\s+","");
		str+=x;
		System.out.println(str);
		
		DatagramSocket dss = new DatagramSocket();
		InetAddress ip = InetAddress.getLocalHost();
		byte buf[] = null;
		
		buf=str.getBytes();
		DatagramPacket DpSend =new DatagramPacket(buf, buf.length, ip, 1238);
		dss.send(DpSend);	
	}

	public static StringBuilder data(byte[] a)
	{
		if (a == null)
			return null;
		StringBuilder ret = new StringBuilder();
		int i = 0;
		while (a[i] != 0)
		{
			ret.append((char) a[i]);
			i++;
		}
		return ret;
	}
}
