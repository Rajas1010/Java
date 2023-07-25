 import java.net.*;
 public class network
 {
	public static void main(String args[]) throws  UnknownHostException
	{ 
		String url="www.protectedtext.com";
		InetAddress oInet=Inet4Address.getByName(url);
		System.out.println("host Address ;"+oInet.getHostAddress());
		System.out.println("local Address ;"+oInet.isAnyLocalAddress());
		System.out.println("link local Address ;"+oInet.isLinkLocalAddress());
	}
 }