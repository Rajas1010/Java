import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.sql.*;
import java.awt.print.*;

public class print
{
	public static void main(String args[])throws SQLException
	{
		new frame1();
	}
}
class frame1 extends JFrame implements ActionListener
{
	JButton b1,b2;
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField t1,t3;
	JTextArea ta1;
	
	public frame1()
	{		
		this.setLayout(null);
		this.setSize(1366,778);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1=new JLabel("TXT");
		l1.setBounds(100,100,100,25);
		this.add(l1);
		
		l3=new JLabel("SMS");
		l3.setBounds(450,100,100,25);
		this.add(l3);
		
	
		
		l5=new JLabel("Abbrivation");
		l5.setBounds(100,50,100,25);
		this.add(l5);
		
		l6=new JLabel("sms text");
		l6.setBounds(450,50,100,25);
		this.add(l6);
		
		
		
		t1=new JTextField();
		t1.setBounds(250,100,100,25);
		this.add(t1);
		
		ta1=new JTextArea();
		ta1.setBounds(300,300,200,200);
		this.add(ta1);

		
		t3=new JTextField();
		t3.setBounds(600,100,100,25);
		this.add(t3);
		
		
		b1=new JButton("add");
		b1.setBounds(175,175,100,25);
		this.add(b1);
		b1.addActionListener(this);
		
		b2=new JButton("print");
		b2.setBounds(525,175,100,25);
		this.add(b2);
		b2.addActionListener(this);
		this.setVisible(true);
	}
	public void print()
	{
		String name=t1.getText();
		String id=t3.getText();
		ta1.setText(ta1.getText()+name);
		ta1.setText(ta1.getText()+id);

	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{			
		

		}
		if(e.getSource()==b2)
		{
			try
			{
				ta1.print();
				
			}
			catch(PrinterException ex)
			{
				//Logger.getLogger(trnn.class.getName()).log(Level.SEVERE,null,ex);
			}
			
		}
	}
}
