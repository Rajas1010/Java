import javax.swing.*;
import javax.swing.event.*;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.border.LineBorder;
import java.io.*;
import java.util.*;
import java.net.*;
import java.awt.Color;
import java.awt.*;
import java.sql.*;
public class cliGame
{
	public static void main(String args[]) throws Exception
	{
		
			new LoginPage();
			//String name="raj";
			//new frame(name);
			
	}
	public static String network() throws Exception
	{
		String s1="";
		try
		{
		Socket skt=new Socket("127.0.0.1",8877);
		DataOutputStream odos=new DataOutputStream(skt.getOutputStream());
		DataInputStream odis=new DataInputStream(skt.getInputStream());
		BufferedReader obr=new BufferedReader(new InputStreamReader(System.in));
		String s2="";
			//String s=obr.readLine();
			String s="start";
			odos.writeUTF(s);
			s1=odis.readUTF();
			System.out.println(odis);
			int i=1;
			while(s1!=null)
			{
								System.out.println(" s="+s1);
									if(Integer.parseInt(s1)==i);
									{
										frame.res(s1);
										i++;
									}
				s1=odis.readUTF();
			}
		System.out.println(s1);
		
			
	//	skt.close();
		}catch(ConnectException ex){System.out.println("Server Not Avaliable 404 Error Found");}
		return s1;
	}
	public static boolean isNumeric(String str) 
	{ 
			try
			{  
				Double.parseDouble(str);  
				return true;
			} catch(NumberFormatException e){  
			return false;  
  } 
}
}
class frame extends JFrame implements ActionListener
{
		
		ScreenSize o=new ScreenSize();
		JButton b1;
		JLabel l2,l1,l4,l5;
		static JLabel l3,l6;
		static String score;
		JPanel p1,p2;
		JTextField t1;
		static JTextArea ta1;
		static JList lst1;
		JScrollPane sp;
		String s ="rajja";
		static Connection conn=null;
	static PreparedStatement pst=null;
	ResultSet rs=null;
	static String name;

		public frame(String name) throws Exception
	{
		this.name=name;
		conn=c.contn();
		this.setSize(o.getX(),o.getY());
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(pic.img("C:\\Users\\rajas\\OneDrive\\Pictures\\Saved Pictures\\handsDigital.jpg"));

		Font f1=new Font("times new roman",Font.PLAIN,64);
		Font f2=new Font("times new roman",Font.PLAIN,20);
		Font f3=new Font("times new roman",Font.PLAIN,18);
		Font f4=new Font("times new roman",Font.PLAIN,32);
		
		l1=new JLabel("BOUNCING BALL");
		l1.setFont(f1);
		l1.setForeground(new Color(1.0f,1.0f,1.0f,1.f));
		l1.setBounds(600,10,800,80);
		this.add(l1);
		
		
		
		p1=new JPanel();
		p1.setLayout(new BorderLayout(10,10));
		p1.setBorder(new LineBorder(Color.BLACK, 1));
		p1.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
		p1.setBounds(150,300,250,170);
		add(p1);
		
		p2=new JPanel();
		p2.setLayout(null);
		p2.setBounds(550,150,620,620);
		p2.setBorder(new LineBorder(Color.BLACK, 1));
		p2.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
		add(p2);
		
		l2=new JLabel("To Start the Game");
		l2.setFont(f2);	
		l2.setForeground(new Color(1.0f,1.0f,1.0f,1.f));
		l2.setBounds(200,250,250,30);
		this.add(l2);
		
		l4=new JLabel("Current Result");
		l4.setFont(f1);
		l4.setBounds(1300,150,450,50);
		l4.setBorder(new LineBorder(Color.BLACK, 1));
		l4.setForeground(new Color(1.0f,1.0f,1.0f,1.f));
		this.add(l4);
		
		l3=new JLabel("Waiting...");
		l3.setFont(f4);
		l3.setBounds(1300,200,350,50);
		l3.setBorder(new LineBorder(Color.BLACK, 1));
		l3.setForeground(new Color(1.0f,1.0f,1.0f,1.f));
		this.add(l3);
		
		l5=new JLabel("Best Result");
		l5.setFont(f1);
		l5.setBounds(1300,550,350,50);
		l5.setBorder(new LineBorder(Color.BLACK, 1));
		l5.setForeground(new Color(1.0f,1.0f,1.0f,1.f));
		this.add(l5);
		
		try
		{
			String qry="select score from result where name='"+name+"'";
			pst=conn.prepareStatement(qry);
			rs=pst.executeQuery();
			//System.out.println(rs.getInt("score"));
		}catch(SQLException ex){System.err.println(ex);}	
		//finally
		//{
		//	try
		//	{
		//		rs.close();
		//		pst.close();
		//	}
		//	catch(Exception exc){}
		//}
		
		   while (rs.next())
             {      
               score =Integer.toString(rs.getInt("score"));
			 }
		l6=new JLabel(score);
		l6.setFont(f4);
		l6.setBounds(1300,600,350,50);
		l6.setBorder(new LineBorder(Color.BLACK, 1));
		l6.setForeground(new Color(1.0f,1.0f,1.0f,1.f));
		this.add(l6);
	
		/*ta1=new JTextArea("\tRESULTS");
		ta1.setFont(f2);
		ta1.setBounds(1300,150,300,620);
		this.add(ta1);*/
		
		b1=new JButton("Start");
		b1.setFocusable(false);  
		b1.setFont(f3);
		b1.setBounds(20,75,120,25);
		p1.add(b1);
		b1.addActionListener(this);
		
		
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		
		if(e.getSource()==b1)
		{
			try
			{
				s=cliGame.network();
			}catch(Exception ep)
			{System.out.println("exception");}
			//ta1.setText(s);
			
		}
	}
	public static void res(String a) throws Exception
	{
		//ta1.setText(a);
		l3.setText(a);	

		if(Integer.parseInt(a)>Integer.parseInt(score))
		{	
String qry="update result set score="+a+" where name='"+name+"'";
System.out.println(qry);
					pst=conn.prepareStatement(qry);
					pst.executeUpdate();
					System.out.println("ud scc");
					l6.setText(a);
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
class pic
{
	public static JLabel img(String image)
	{
		ScreenSize ob=new ScreenSize();
		ImageIcon i1= new ImageIcon(image);
		Image img=i1.getImage();
		Image modifyImage=img.getScaledInstance(ob.getX(),ob.getY(),java.awt.Image.SCALE_SMOOTH);
		JLabel L=new JLabel(new ImageIcon(modifyImage));
		return L;
	}	

}
class LoginPage extends JFrame implements ActionListener,KeyListener
{
	JButton b1;
	JLabel l1,l2,l3,l4;
	JTextField t1;
	JPasswordField t2;
	JPanel p1;
	Font F1=new Font("times new roman",Font.PLAIN,14);
	Font F2=new Font("times new roman",Font.BOLD,40);
	ScreenSize obj=new ScreenSize();
	String qry="";
	Connection con=null;
	ResultSet rs=null;
	PreparedStatement pst=null;
	String name;
	
	public void clear()
	{
		t1.setText("");
		t2.setText("");
	}

	public LoginPage()
	{
		con=c.contn();
		this.setLayout(null);
		this.setSize(obj.getX(),obj.getY());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(pic.img("C:\\Users\\rajas\\OneDrive\\Pictures\\Saved Pictures\\handsDigital.jpg"));
		
		p1=new JPanel();
		p1.setLayout(null);
		p1.setBounds(140,220,270,150);
		p1.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
		p1.setBorder(new LineBorder(Color.BLACK, 1));

		l1=new JLabel("USER NAME :");
		l1.setBounds(10,10,100,25);
		l1.setFont(F1);
		p1.add(l1);
		
		l2=new JLabel("PASSWORD  : ");
		l2.setBounds(10,50,100,25);
		l2.setFont(F1);
		p1.add(l2);
		
		l3=new JLabel("BOUNCING BALL");
		l3.setBounds(350,10,500,80);
		l3.setFont(F2);
		l3.setForeground(new Color(0,123,208));
		this.add(l3);
		
		l4=new JLabel("");
		l4.setBounds(175,250,100,25);
		p1.add(l4);
		
		t1=new JTextField();
		t1.setFont(F1);
		t1.setBounds(160,10,100,25);
		p1.add(t1);
		
		t2=new JPasswordField();
		t2.setBounds(160,50,100,25);
		p1.add(t2);
		
		b1=new JButton("LOG IN");
		b1.setFont(F1);
		b1.setBounds(85,110,100,25);
		b1.setFocusable(false);
		b1.addActionListener(this);
		t1.addKeyListener(this);
		t2.addKeyListener(this);
		p1.add(b1);
		
		add(p1);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			try
			{
				qry="select * from result where name = ? and password = ? ";
				pst=con.prepareStatement(qry);
				pst.setString(1,t1.getText());
				name=t1.getText();
				pst.setString(2,t2.getText());
				rs=pst.executeQuery();
				clear();
				if(rs.next())
				{
					try
					{
						l4.setText("Login success");
					JOptionPane.showMessageDialog(null,"LOGIN SUCCESS "," LoginDetail",JOptionPane.PLAIN_MESSAGE);
					this.dispose();
					new frame(name);
					}catch(Exception efc)
					{System.out.println("exception");}
					
				}
				else
					JOptionPane.showMessageDialog(null,"Login Failed","LoginDetail",JOptionPane.ERROR_MESSAGE);
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
	public void keyReleased(KeyEvent kr)
	{
		if(kr.getKeyCode()==KeyEvent.VK_ENTER)
		{
			try
			{
				qry="select * from result where name = ? and password = ? ";
				pst=con.prepareStatement(qry);
				pst.setString(1,t1.getText());
				pst.setString(2,t2.getText());
				name=t1.getText();
				rs=pst.executeQuery();
				clear();
				if(rs.next())
				{
					try
					{
						l4.setText("Login success");
					JOptionPane.showMessageDialog(null,"LOGIN SUCCESS "," LoginDetail",JOptionPane.PLAIN_MESSAGE);
					this.dispose();
					new frame(name);
					}catch(Exception epo)
					{System.out.println("exception");}
					
				}
				else
					JOptionPane.showMessageDialog(null,"Login Failed","LoginDetail",JOptionPane.ERROR_MESSAGE);
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
	public void keyPressed(KeyEvent kp){}
	public void keyTyped(KeyEvent kt){}
}
class c
{	
	public static Connection contn()
	{
		try
		{			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ball","root","");
				return con; 
		}
		catch(Exception exc)
		{
			System.out.println("error");
			return null;
		}
	}
}