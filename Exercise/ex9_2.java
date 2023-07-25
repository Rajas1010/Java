import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.sql.*;

public class ex9_2
{
	public static void main(String args[])throws SQLException
	{
		frame1 o=new frame1();
	}
	public static Connection contn()
	{
		try
		{
			
			Class.forName("org.sqlite.JDBC");
			Connection conn=DriverManager.getConnection("jdbc:sqlite:/C:\\Users\\rasu\\DataBase\\projectLap.db");
			return conn; 
		}
		catch(Exception exc){
			System.out.println("error");
			return null;
		}
	}
}
class frame1 extends JFrame implements ActionListener
{
	JFrame f1=new JFrame("GUI APPLICATION TRAINING");
	JButton b1,b2;
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField t1,t3;
	JPasswordField t2,t4;
	JPanel p1;
	
	String qry=" ";
	Connection conn=null;
	ResultSet rs=null;
	PreparedStatement pst=null;
	
	public frame1()
	{
		conn=ex9_2.contn ();
		
		this.setLayout(null);
		this.setSize(1366,778);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1=new JLabel("USER NAME :");
		l1.setBounds(100,100,100,25);
		this.add(l1);

		l2=new JLabel("PASSWORD  : ");
		l2.setBounds(100,150,100,25);

		this.add(l2);
		
		l3=new JLabel("USERNAME");
		l3.setBounds(450,100,100,25);
		this.add(l3);
		
		l4=new JLabel("PASSWORD");
		l4.setBounds(450,150,100,25);
		this.add(l4);
		
		l5=new JLabel("SIGN IN FOR");
		l5.setBounds(100,50,100,25);
		this.add(l5);
		
		l6=new JLabel("SIGN UP FOR");
		l6.setBounds(450,50,100,25);
		this.add(l6);
		
		t1=new JTextField();
		t1.setBounds(250,100,100,25);
		this.add(t1);

		t2=new JPasswordField();
		t2.setBounds(250,150,100,25);
		this.add(t2);
		
		t3=new JTextField();
		t3.setBounds(600,100,100,25);
		this.add(t3);
		
		t4=new JPasswordField();
		t4.setBounds(600,150,100,25);
		this.add(t4);
		
		b1=new JButton("SIGN IN");
		b1.setBounds(175,200,100,25);
		b1.setFocusable(false);
		this.add(b1);
		b1.addActionListener(this);
		
		b2=new JButton("SIGN UP");
		b2.setBounds(525,200,100,25);
		b2.setFocusable(false);
		this.add(b2);
		b2.addActionListener(this);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{			
			try
			{	
				qry="select * from users where username=?and password=?";
				pst=conn.prepareStatement(qry);
				pst.setString(1,t1.getText());
				pst.setString(2,t2.getText());
				rs=pst.executeQuery();
				
				if(rs.next())
				{
					JOptionPane.showMessageDialog(null,"Sign in success","LoginDetail",JOptionPane.PLAIN_MESSAGE);
				}
				else
					JOptionPane.showMessageDialog(null,"Login Failed","LoginDetail",JOptionPane.ERROR_MESSAGE);
			}catch(SQLException ex){System.err.println(ex);}	
				catch(Exception exc){}
			finally
			{
				try
				{
					rs.close();
					pst.close();
				}catch(Exception exc){}
			}
		}
			
		if(e.getSource()==b2)
		{			
			try
			{		
				qry="insert into users (username,password) values(?,?)";
				pst=conn.prepareStatement(qry);
				pst.setString(1,t3.getText());
				pst.setString(2,t4.getText());
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null,"sign up success","SignUpDetails",JOptionPane.PLAIN_MESSAGE);
			}catch(SQLException ex){System.err.println(ex);}
			finally
			{
				try
				{
					rs.close();
					pst.close();
				}
				catch(Exception exc){}
			}
		}
	
	}
}

