import java.sql.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;
import java.util.*;
import java.util.ArrayList;
import java.awt.List;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
public class studentStaffDetail
{
	public static void main(String args[])
	{
		frame o=new frame();
		o.sql();
	}
}
class sqlCon
{
	public static Connection con()
	{
			Connection con=null;

		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kgf","root","");
		}catch(Exception e)
		{System.out.println("exception");}
		return con;
	}
	
}
class frame extends JFrame implements ActionListener
{
		
		ScreenSize o=new ScreenSize();
		JButton b1;
		JLabel l3,l2,l1;
		JPanel p1,p2;
		JTextField t1;
		JTextArea ta1;
		static JList lst1;
			JScrollPane sp;
		public frame()
	{
		this.setSize(o.getX(),o.getY());
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Font f1=new Font("times new roman",Font.PLAIN,64);
		Font f2=new Font("times new roman",Font.PLAIN,20);
		Font f3=new Font("times new roman",Font.PLAIN,18);
		
		l1=new JLabel("FTP PROTOCAL");
		l1.setFont(f1);
		l1.setBounds(600,10,800,80);
		this.add(l1);
		
		p1=new JPanel();
		p1.setLayout(null);
		p1.setBounds(250,150,250,270);
		p1.setBorder(new LineBorder(Color.BLACK, 1));
		add(p1);
		p2=new JPanel();
		p2.setLayout(null);
		p2.setBounds(700,150,720,720);
		p2.setBorder(new LineBorder(Color.BLACK, 1));
		add(p2);
		
		l2=new JLabel("Enter Your Roll NO :");
		l2.setFont(f2);
		l2.setBounds(20,10,200,20);
		p1.add(l2);
		
		/*l3=new JLabel();
		l3.setFont(f2);
		l3.setBounds(10,10,500,570);
		p2.add(l3);
		*/
		ta1=new JTextArea();
		ta1.setFont(f2);
		ta1.setBounds(10,10,700,700);
		p2.add(ta1);
		
		t1=new JTextField();
		t1.setFont(f3);
		t1.setBounds(20,40,200,25);
		p1.add(t1);
		
		b1=new JButton("Click");
		b1.setFocusable(false);  
		b1.setFont(f3);
		b1.setBounds(20,75,120,25);
		p1.add(b1);
		b1.addActionListener(this);

		this.setVisible(true);
	}
		static int rno,sector;
		static String name,city;
		
		public void sql()
	{	
		Connection con=null;
		sqlCon o=new sqlCon();
		con=o.con();
		
	
		try
		{
			Statement stmt=con.createStatement();
			ResultSet rs=null;
			rs=stmt.executeQuery("SELECT * FROM workers WHERE Rollno=1");
			while(rs.next())
			{
				rno=rs.getInt("Rollno");
				name=rs.getString("Name");
				sector=rs.getInt("Sector");
				city=rs.getString("City");
				//System.out.println(rno+" "+name+" "+sector+" "+city);
			}
		}catch(Exception e)
		{System.out.println("exception");}
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			//l3.setText(t1.getText());
			ta1.setText("\n"
							+"	======================================="+"\n"
							+"		RCB LAP WORLD"+"\n"
							+"	======================================="+"\n"
							+"		Customer Details"+"\n"
							+"	Customer Name	: "+t1.getText()+"\n"
							+"	Customer Age		: "+rno+"\n"
							+"	Customer Address	: "+name+"\n"
							+"	Customer Mobile 	: "+sector+"\n"
							+"	Customer ID		: "+city+"\n"
							+"	======================================="+"\n"
							+"		Laptop Details"+"\n\n"
							+"\t    Internal 1"+"\t\t    Iternal 2"+"\n"
							+"	Laptop Name	:"+"1234"+"\t"+"Laptop Price	:"+"998"+"\n"
							+"	Laptop Model	:"+"sjfkdjfk"+"\t"+"Laptop Price	:"+"998"+"\n"
							+"	Laptop id	:"+"jflksdjfl"+"\t"+"Laptop Price	:"+"998"+"\n"
							+"	======================================="+"\n"
							+"		Price Details "+"\n\n"
							+"	Laptop Price	:"+"998"+".00"+"\n"
							+"	Laptop Tax	:"+"7737"+".00"+"\n"
							+"	Grant Total	:"+"9899"+".00"+"\n");
		}
	}


}

class ScreenSize
{
	static int X,Y;
	static Toolkit tk=Toolkit.getDefaultToolkit();
		public static int getX()
	{
		X=(int)tk.getScreenSize().getWidth();
		return X;
	}
	public static int getY()
	{
		Y=(int)tk.getScreenSize().getHeight();
		return Y;
	}
}
