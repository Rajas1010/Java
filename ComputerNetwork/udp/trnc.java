import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.*;

public class trnc
{
	public static void main(String args[]) throws IOException
	{
		Scanner in = new Scanner(System.in);
		DatagramSocket ds = new DatagramSocket();
		
		InetAddress ip = InetAddress.getLocalHost();
		byte buf[] = null;
		System.out.println("house no");
		int h=in.nextInt();
		System.out.println("cost");
		int r=in.nextInt();
		String s=Integer.toString(h)+","+Integer.toString(r);
		
		buf = s.getBytes();
		DatagramPacket DpSend =new DatagramPacket(buf, buf.length, ip, 1234);
		ds.send(DpSend);
		
		DatagramSocket dsr = new DatagramSocket(1238);
		byte[] receive = new byte[65535];
		DatagramPacket DpReceive = null;

		
		DpReceive = new DatagramPacket(receive, receive.length);
		dsr.receive(DpReceive);
		
		String t="";
		t=(data(receive)).toString();
		System.out.println(t);
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
