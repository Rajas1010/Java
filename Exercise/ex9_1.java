import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.sql.*;

public class ex9_1
{
	public static void main(String args[])throws SQLException
	{
		new frame1();
	}
}
class c
{	
	public static Connection contn()
	{
		try
		{
			
			Class.forName("org.sqlite.JDBC");
			Connection conn=DriverManager.getConnection("jdbc:sqlite:/C:\\Users\\rasu\\DataBase\\exercise.db");
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
	
	String qry="";
	Connection conn=null;
	ResultSet rs=null;
	PreparedStatement pst=null;

	
	public frame1()
	{
		c o=new c();conn=o.contn ();
		
		this.setLayout(null);
		this.setSize(1366,778);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1=new JLabel("TXT");
		l1.setBounds(100,100,100,25);
		this.add(l1);
		
		l3=new JLabel("SMS");
		l3.setBounds(450,100,100,25);
		this.add(l3);
		
		l4=new JLabel("output");
		l4.setBounds(175,250,250,25);
		this.add(l4);	
		
		l2=new JLabel("output");
		l2.setBounds(550,250,250,25);
		this.add(l2);
		
		l5=new JLabel("Abbrivation");
		l5.setBounds(100,50,100,25);
		this.add(l5);
		
		l6=new JLabel("sms text");
		l6.setBounds(450,50,100,25);
		this.add(l6);
		
		
		
		t1=new JTextField();
		t1.setBounds(250,100,100,25);
		this.add(t1);

		
		t3=new JTextField();
		t3.setBounds(600,100,100,25);
		this.add(t3);
		
		
		b1=new JButton("click");
		b1.setBounds(175,175,100,25);
		this.add(b1);
		b1.addActionListener(this);
		
		b2=new JButton("click");
		b2.setBounds(525,175,100,25);
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
				qry="select abbrivation from explanation where txt=?";
				pst=conn.prepareStatement(qry);
				pst.setString(1,t1.getText());
				rs=pst.executeQuery();
				if(rs.next())
				{				
					l4.setText(rs.getString("abbrivation"));
				}
				else
					JOptionPane.showMessageDialog(null,"information Failed","information",JOptionPane.ERROR_MESSAGE);
			}catch(SQLException ex){System.err.println(ex);}	
		}
		if(e.getSource()==b2)
		{			
			try
			{		
				qry="select EXPLAIN from message where sms=?";
				pst=conn.prepareStatement(qry);
				pst.setString(1,t3.getText());
				rs=pst.executeQuery();
				if(rs.next())
				{
					l2.setText(rs.getString("EXPLAIN"));
				}
				else
					JOptionPane.showMessageDialog(null,"information Failed","information.",JOptionPane.ERROR_MESSAGE);
			}catch(SQLException ex){System.err.println(ex);}	
		}
	}
}
