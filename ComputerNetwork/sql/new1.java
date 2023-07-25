import java.util.*;
import java.net.*;
import java.io.*;
public class new1
{
	public static void main(String args[])throws Exception
	{
		Scanner in=new Scanner(System.in);
		String rno=in.nextLine();
		new1 oc=new new1();
		String[] res =oc.network(rno);
		System.out.println(Arrays.toString(res));
	}
	}
	public static String[] network(String rno)throws Exception
	{
		String[] array=new String[19];
		try
		{
		Socket skt=new Socket("localhost",2255);
		DataOutputStream odos=new DataOutputStream(skt.getOutputStream());
		odos.writeUTF(rno);
		
		InputStream is = skt.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(is);
		
		List<Message> listOfMessages = (List<Message>) ois.readObject();
		
		System.out.println("");
		
		for(int i=0;i<20;i++)
		{
			array[i]=listOfMessages.get(i).getText();
		}
		System.out.println(Arrays.toString(array));
		skt.close();
		
		}catch(Exception e)
		{System.out.println("exception");}
		return array;
	}
}
class Message implements Serializable{
    private final String text;

    public Message(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }
}
