package awtDb;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

/*class uframe extends Frame implements ActionListener
{
	Label l1,l2,l3,l4,l5,l6;
	TextField t1,t2,t3,t4;
	Button b1,b2,b3;
	
	String qry = "";
	Connection con = null;
	PreparedStatement st = null;
	ResultSet = null;
	Statement stmt = null;
	
	public void connect()
	{
		try {
				
			}catch(Exception e)
		{
				e.printStackTrace();
		}
		
	}
	
	public uframe()
	{
		this.setVisible(true);
		this.setLayout(null);
		this.setSize(1000,600);
		this.setTitle("Management System");
		
		this.addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		l1=new Label("MANAGEMENT SYSTEM");
		l1.setBounds(250,40,400,50);
		add(l1);
		l1=new Label("ID ");
		l1.setBounds(250,100,150,30);
		add(l1);
		l1=new Label("NAME");
		l1.setBounds(250,150,150,30);
		add(l1);
		l1=new Label("AGE");
		l1.setBounds(250,200,150,50);
		add(l1);
		l1=new Label("CITY");
		l1.setBounds(250,250,150,30);
		add(l1);
		t1=new TextField();
		t1.setBounds(400,100,300,30);
		add(t1);
		t2=new TextField();
		t2.setBounds(400,150,300,30);
		add(t2);
		t3=new TextField();
		t3.setBounds(400,200,300,30);
		add(t3);
		t4=new TextField();
		t4.setBounds(400,250,300,30);
		add(t4);
		b1=new Button("SAVE");
		b1.setBounds(250,300,100,30);
		add(b1);
		b2=new Button("CLEAR");
		b2.setBounds(400,300,100,30);
		add(b2);
		b2=new Button("DELETE");
		b2.setBounds(550,300,100,30);
		add(b2);
		
		
		



	}
	
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
*/

public class users {

	public static void main(String[] args) throws Exception {
		
	
	{
		//uframe o=new uframe();
		
		Class.forName("org.sqlite.JDBC");
		Connection con=DriverManager.getConnection("jdbc:sqlite:/C:\\Users\\rasu\\DataBase\\basefine.db");
		Statement stmt=con.createStatement();
		String qry="SELECT ID,NAME,AGE,CITY FROM USERS";
		ResultSet rs=stmt.executeQuery(qry);
		int id,age;
		String name,city;
		while(rs.next())
		{
			id=rs.getInt("id");
			age=rs.getInt("age");
			name=rs.getString("name");
			city=rs.getString("city");
			
			System.out.print(id+"");
			System.out.print(name+"");
			System.out.print(age+"");
			System.out.println(city+"");
		}
		stmt.close();
		con.close();
	}
	}

}
