import java.io.*;
import java.net.*;
import java.util.*;
import java.sql.*;

public class server
{
	public static void main(String args[]) throws Exception
	{
		
	try
		{
			ServerSocket skt=new ServerSocket(2255);
			Socket sk=skt.accept();
			System.out.println("Connected");
			DataInputStream odis=new DataInputStream(sk.getInputStream());
			String s=odis.readUTF();
			System.out.println("read  ; "+s);
				sqlCon o=new sqlCon();

			String as[]=o.sql(s);
			OutputStream os = sk.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			List<Message> messages = new ArrayList<>();
			messages.add(new Message(as[0]));
			messages.add(new Message(as[1]));
			messages.add(new Message(as[2]));
			messages.add(new Message(as[3]));
			messages.add(new Message(as[4]));
			messages.add(new Message(as[5]));
			messages.add(new Message(as[6]));
			messages.add(new Message(as[7]));
			messages.add(new Message(as[8]));
			messages.add(new Message(as[9]));
			oos.writeObject(messages);
			skt.close();
			sk.close();
			
		}catch(EOFException exp){}
		catch(Exception ep){}
		
		//sqlCon o=new sqlCon();
	//o.sql();
	}
	
}

class sqlCon
{
	public String[]  sql(String s)
	{
			Connection con=null;
			//String s="20BIT001";
			String ary[]=new String[10];
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/info","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=null;
			rs=stmt.executeQuery("SELECT * FROM student WHERE Rollno='"+s+"'");
			while(rs.next())
			{
				ary[0]=rs.getString("Rollno");
				ary[1]=rs.getString("AdNo");
				ary[2]=rs.getString("Name");
				ary[3]=rs.getString("Dept");
				ary[4]=Integer.toString(rs.getInt("Batch"));
				ary[5]=rs.getString("Quota");
				ary[6]=rs.getString("City");
				ary[7]=rs.getString("Mobile");
				ary[8]=rs.getString("BloodGroup");
				ary[9]=rs.getString("D_H");				
			}
			System.out.println(Arrays.toString(ary));
		}catch(Exception e)
		{System.err.println(e);}
		return ary;
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
/*
cls
{
	try
		{
			//Connection con=null;
		//sqlCon o=new sqlCon();
	//	con=o.con();
		
			
				String s=odis.readUTF();
				System.out.println(s);
				
	   /*  List<Message> messages = new ArrayList<>();
			
		
			while(rs.next())
			{
				messages.add(new Message(rs.getString("Rollno")));
				messages.add(new Message(rs.getString("AdNo")));
				messages.add(new Message(rs.getString("Name")));
				messages.add(new Message(rs.getString("Dept")));
				messages.add(new Message(Integer.toString(rs.getInt("Batch"))));
				messages.add(new Message(rs.getString("	Quota")));
				messages.add(new Message(rs.getString("City")));
				messages.add(new Message(rs.getString("Mobile")));
				messages.add(new Message(rs.getString("BloodGroup")));
				messages.add(new Message(rs.getString("D_H")));				
			}
			System.out.println("Sending messages to the ServerSocket");
			odos.writeObject(messages);
			sk.close();
				

		}catch(EOFException exp){}
		catch(Exception ep){}
	}
}*/