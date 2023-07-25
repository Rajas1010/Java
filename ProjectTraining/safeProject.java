import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.event.*;
import java.sql.*;
import java.io.*;
import java.awt.print.*;
public class safeProject
{		

	public static void main(String args[])throws SQLException
	{
		new frame1();
	}
}
class c
{		
	static String cq="select count(id)from laptop";
	static String aq="select * from laptop where id=";
	public static Connection contn()
	{
		try
		{		
			Class.forName("org.sqlite.JDBC");
			Connection conn=DriverManager.getConnection("jdbc:sqlite:/C:\\Users\\rasu\\DataBase\\project.db");
			return conn; 
		}
		catch(Exception exc)
		{
			System.out.println("error");
			return null;
		}
	}
}
class frame1 extends JFrame implements ActionListener
{
	JButton b1;
	JLabel l1,l2,l3,l4;
	JTextField t1;
	JPasswordField t2;
	JPanel p1;
	Font F1=new Font("times new roman",Font.PLAIN,14);
	Font F2=new Font("times new roman",Font.BOLD,40);
	
	String qry="";
	Connection conn=null;
	ResultSet rs=null;
	PreparedStatement pst=null;
	
	public void clear()
	{
		t1.setText("");
		t2.setText("");
	}
	
	public frame1()
	{
		c o=new c();
		conn=o.contn ();
		
		this.setLayout(null);
		this.setSize(1366,778);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon i1= new ImageIcon("C:\\Users\\rasu\\Pictures\\Landscaps\\2970045.jpg");
		Image img=i1.getImage();
		Image modifyImage=img.getScaledInstance(1366,778,java.awt.Image.SCALE_SMOOTH);
		setContentPane(new JLabel(new ImageIcon(modifyImage)));
		
		l1=new JLabel("USER NAME :");
		l1.setBounds(100,100,100,25);
		l1.setFont(F1);
		this.add(l1);
		
		l2=new JLabel("PASSWORD  : ");
		l2.setBounds(100,150,100,25);
		l2.setFont(F1);
		this.add(l2);
		
		l3=new JLabel("RCB LAP WORLD");
		l3.setBounds(350,10,500,80);
		l3.setFont(F2);
		this.add(l3);
		
		l4=new JLabel("");
		l4.setBounds(175,250,100,25);
		this.add(l4);
		
		t1=new JTextField();
		t1.setFont(F1);
		t1.setBounds(250,100,100,25);
		this.add(t1);
		t2=new JPasswordField();
		t2.setBounds(250,150,100,25);
		this.add(t2);
		
		b1=new JButton("LOG IN");
		b1.setFont(F1);
		b1.setBounds(175,200,100,25);
		b1.setFocusable(false);
		this.add(b1);
		b1.addActionListener(this);
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
				clear();
				if(rs.next())
				{
					l4.setText("Login success");
					JOptionPane.showMessageDialog(null,"LOGIN SUCCESS "," LoginDetail",JOptionPane.PLAIN_MESSAGE);
					this.dispose();
					new homePage(c.cq,c.aq);
					setVisible(false);
					System.out.println("page1 Enter success ");
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
}
class homePage extends JFrame implements ActionListener
{
	String q;
	String pic;
	Connection conn=null;
	ResultSet rs=null;
	PreparedStatement pst=null;
	int idCount,i,j=1;
	JPanel p[]=new JPanel[50];
	JPanel p2[]=new JPanel[50];
	JLabel l[]=new JLabel[50];
	JLabel l2[]=new JLabel[50];
	JLabel l3[]=new JLabel[50];
	JLabel l4[]=new JLabel[50];
	JLabel l5[]=new JLabel[50];
	JLabel l6[]=new JLabel[50];
	JButton b[]=new JButton[50];
	JButton b2[]=new JButton[50];
	int d[]=new int[50];
	
	JFrame f2,f3;

	JButton b3,b4,b5,b6;
	JTextField t1,t2,t3;
	JLabel l7,l8;
	JMenuBar mb;
	JMenu m,m1,m2;
	JMenuItem ad,prs,byPrs,byBrand,exit,adDlt,adLap,previous,upAvl;
	ImageIcon i1[]=new ImageIcon[50];
	JScrollPane sp;
	JPanel p1;
	
	public homePage(String qry,String qry1) 
	{
		c o=new c();
		conn=o.contn ();
		this.setSize(1366,778);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try
			{
				//qry="";
				pst=conn.prepareStatement(qry);
				rs=pst.executeQuery();
				idCount=rs.getInt("count(id)");
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
		p1=new JPanel();
		p1.setBackground(Color.BLACK);
		p1.setPreferredSize(new Dimension(1546,idCount*155));
		
		sp=new JScrollPane();
		sp.setViewportView(p1);
		add(sp);
		
		mb=new JMenuBar();
		m=new JMenu("Add");
		m1=new JMenu("Update");
		m2=new JMenu("Filter");
		
		ad=new JMenuItem("Add Admin");
		ad.addActionListener(this);
		m.add(ad);
		adDlt=new JMenuItem("Delete Admin");
		adDlt.addActionListener(this);
		m.add(adDlt);
		
		exit=new JMenuItem("Exit");
		exit.addActionListener(this);
		m.add(exit);
		
		adLap=new JMenuItem("Add Laptop");
		adLap.addActionListener(this);
		m1.add(adLap);
		
		prs=new JMenuItem("Update Price");		
		prs.addActionListener(this);
		m1.add(prs);
		
		upAvl=new JMenuItem("update Avaliable");		
		upAvl.addActionListener(this);
		m1.add(upAvl);
		
		byBrand=new JMenuItem("Brand");		
		byBrand.addActionListener(this);
		m2.add(byBrand);
		
		byPrs=new JMenuItem("byPrice");
		m2.add(byPrs);		
		byPrs.addActionListener(this);
		
		previous=new JMenuItem("prev");
		m2.add(previous);		
		previous.addActionListener(this);
		
		
		mb.add(m);
		mb.add(m1);
		mb.add(m2);
		
		this.setJMenuBar(mb);
		String q1=qry1;

		for(i=1;i<=idCount;i++)
		{		
			p[i]=new JPanel();
			p[i].setBackground(Color.WHITE);
			p[i].setPreferredSize(new Dimension(1536,150));
			p[i].setLayout(null);
			
			p2[i]=new JPanel();								//for Image
			p2[i].setBackground(Color.WHITE);
			p2[i].setPreferredSize(new Dimension(150,150));
			p2[i].setBounds(10,10,130,130);
			
			i1[i]= new ImageIcon("C:\\Users\\rasu\\Pictures\\Icon128\\iconDell01.png");
			//i1[i]= new ImageIcon(pic);
			l5[i]=new JLabel();
			l5[i].setPreferredSize(new Dimension(140,140));
			l5[i].setIcon(i1[i]);
			l5[i].setBounds(10,10,130,130);
			p2[i].add(new JLabel(i1[i]));
			
			l[i]=new JLabel(); 		//for name
			l[i].setBounds(200,10,500,20);
			l[i].setPreferredSize(new Dimension(200,15));
			p[i].add(l[i]);
			
			l4[i]=new JLabel();		//for detail
			l4[i].setBounds(200,35,500,20);
			l4[i].setPreferredSize(new Dimension(200,15));
			p[i].add(l4[i]);
	
			l2[i]=new JLabel();		//for ram
			l2[i].setBounds(200,60,200,20);
			l2[i].setPreferredSize(new Dimension(100,15));
			p[i].add(l2[i]);
	
			l3[i]=new JLabel();		// for price
			l3[i].setBounds(550,40,200,20);
			l3[i].setPreferredSize(new Dimension(100,15));
			p[i].add(l3[i]);
			
			l6[i]=new JLabel();		//for avaliable
			l6[i].setBounds(550,60,200,20);
			l6[i].setPreferredSize(new Dimension(100,15));
			p[i].add(l6[i]);
	
			b[i]=new JButton("All Details");
			b[i].setFocusable(false);
			b[i].setBounds(200,90,150,20);
			b[i].addActionListener(this);
			b[i].setPreferredSize(new Dimension(100,15));
			p[i].add(b[i]);
	
			b2[i]=new JButton("Buy");
			b2[i].setFocusable(false);
			b2[i].setBounds(550,90,100,20);
			b2[i].addActionListener(this);
			b2[i].setPreferredSize(new Dimension(100,15));
			p[i].add(b2[i]);
			
			p1.add(p[i]);	
			p[i].add(p2[i]);
		
			
			if(qry1=="select * from laptop where id=")
			{
				try
				{
					//qry=""+ i;
					this.q=qry1+""+i;
					pst=conn.prepareStatement(q);
					rs=pst.executeQuery();
					if(rs.next())
					{	d[i]=rs.getInt("id");
						l[i].setText(rs.getString("lname")+" "+rs.getInt("id"));
						l4[i].setText(rs.getString("detail"));
						l2[i].setText("Ram : "+ rs.getString("RAM"));
						l3[i].setText("Price : "+ rs.getInt("price"));
						l6[i].setText("Avaliable : "+ rs.getString("Avaliable"));
						//pic=setText(rs.getString("Image"));
					}
				}
				catch(SQLException ex){System.err.println(ex);}
				finally
				{
					try
					{
						rs.close();
						pst.close();
					}
					catch(Exception exc)
					{
						System.out.println("expn in filter");
					}
				}
			}
		}
				if(qry1==q1)
				{
					try
					{//d[i]=rs.getInt("id");
						pst=conn.prepareStatement(qry1);
						rs=pst.executeQuery();
						while(rs.next() && j< idCount)
						{		
							l[j].setText(rs.getString("lname")+" "+rs.getInt("id"));
							l4[j].setText(rs.getString("detail"));
							l2[j].setText("Ram : "+ rs.getString("RAM"));
							l3[j].setText("Price : "+ rs.getInt("price"));
							l6[j].setText("Avaliable : "+ rs.getString("Avaliable"));
							//pic=setText(rs.getString("Image"));
							j++;
						}
					}
					catch(SQLException ex){System.err.println(ex);}
					finally
					{
						try
						{
							rs.close();
							pst.close();
						}
						catch(Exception exc)
						{
							System.out.println("expn in filter");
						}
					}
				}
			
		
		
		sp=new JScrollPane();
		sp.setViewportView(p1);
		this.add(sp);
		this.setVisible(true);
	}
	void brandFilter()
	{
		f2=new JFrame();
		f2.setSize(300,150);
		f2.setLayout(null);
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		t1=new JTextField();
		t1.setBounds(10,10,150,25);
		f2.add(t1);
		
		b4=new JButton("Search");
		b4.setBounds(100,50,80,25);
		b4.addActionListener(this);		
		b4.setFocusable(false);
		f2.add(b4);
		f2.setVisible(true);
		
		b3=new JButton("Back");
		b3.setBounds(10,50,80,25);
		b3.addActionListener(this);
		b3.setFocusable(false);
		f2.add(b3);
		
		f2.setVisible(true);
	}
	void updateAvl()
	{
		try{
		f3=new JFrame();
		f3.setSize(300,200);
		f3.setLayout(null);
		f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l7=new JLabel("id");
		l7.setBounds(10,10,80,20);
		f3.add(l7);
		
		l8=new JLabel("add");
		l8.setBounds(10,50,80,20);
		f3.add(l8);

		t2=new JTextField();
		t2.setBounds(100,10,150,25);
		f3.add(t2);
		
		t3=new JTextField();
		t3.setBounds(100,50,150,25);
		f3.add(t3);
		
		b5=new JButton("update");
		b5.setBounds(100,90,80,25);
		b5.addActionListener(this);		
		b5.setFocusable(false);
		f3.add(b5);
		f3.setVisible(true);
		
		b6=new JButton("Back");
		b6.setBounds(10,90,80,25);
		b6.addActionListener(this);
		b6.setFocusable(false);
		f3.add(b6);
		
		f3.setVisible(true);
		}catch(Exception e){}
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==byPrs)
		{
			String  qry="select count(id) from laptop ORDER by Price asc";
			String  qry1="select * from laptop ORDER by Price asc";

			new homePage(qry,qry1);
		}
		if(e.getSource()==upAvl)
		{
			updateAvl();
		}
		if(e.getSource()==previous)
		{
			this.dispose();
			new homePage(c.cq,c.aq);
		}
		if(e.getSource()==b3)
		{
			f2.dispose();
		}
		if(e.getSource()==b6)
		{
			f3.dispose();
		}
		if(e.getSource()==byBrand)
		{
			System.out.println("filter enter");
			brandFilter();
		}
		if(e.getSource()==b4)
		{
			String s=t1.getText();
			String  qry="select count(id) from laptop where Lname like '%"+s+"%'";
			String  qry1="select * from laptop where Lname like '%"+s+"%'";
			new homePage(qry,qry1);
			f2.dispose();
		}
		if(e.getSource()==b5)
		{
			int g=Integer.parseInt(t2.getText());
			int h=Integer.parseInt(t3.getText());
			try
				{
					c o=new c();
					conn=o.contn ();	
					String  qry="update laptop set Avaliable=Avaliable+"+h+" where id ="+g;
					pst=conn.prepareStatement(qry);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null,"update success","update Details",JOptionPane.PLAIN_MESSAGE);
					this.dispose();
					this.dispose();
					f3.dispose();
					new homePage(c.cq,c.aq);
				}catch(SQLException ex){System.err.println(ex);
					JOptionPane.showMessageDialog(null,"update Failed","update Details",JOptionPane.PLAIN_MESSAGE);
				}
				catch(Exception exc){}
				finally
				{
					try
					{
						rs.close();
						pst.close();
						new homePage(c.cq,c.aq);
					}
					catch(Exception exc){}
				}
			f2.setVisible(false);
		}
		if(e.getSource()==ad)
		{
			this.dispose();
			setVisible(false);
			new signUP();
		}
		if(e.getSource()==adDlt)
		{
			this.dispose();
			setVisible(false);
			new removeAdmin();
		}
		if(e.getSource()==exit)
		{
			System.exit(0);
		}
		if(e.getSource()==adLap)
		{
			this.dispose();
			setVisible(false);
			new addLap();
		}
		if(e.getSource()==prs)
		{
			this.dispose();
			setVisible(false);
			new LapPriceUpdate();
		}
		for(int i=1;i<=idCount;i++)
		{
			
			if(e.getSource()==b2[i])			//buy
			{	
				try
				{	c o=new c();
					conn=o.contn ();	
					String qry="update laptop set Avaliable=Avaliable-1 where id="+i;
					pst=conn.prepareStatement(qry);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null,"success","SignUpDetails",JOptionPane.PLAIN_MESSAGE);
					this.setVisible(false);
					this.dispose();
					new bill(i);
				}catch(SQLException ex){System.err.println(ex);}	
				finally
				{
					try
					{
						rs.close();
						pst.close();
						this.dispose();
						new homePage(c.cq,c.aq);
					}
					catch(Exception exc){}
				}
			}
			if(e.getSource()==b[i])
			{
				
				//String qry="select id from details where id="+i;
				//pst=conn.prepareStatement(qry);
				//rs=pst.executeQuery();
				//new LapDetails(rs.getInt("id"));
				this.dispose();
				new LapDetails(i);
			}
		}
	}
}
class signUP extends JFrame implements ActionListener
{
	JFrame f2;
	JLabel l5,l6,l7;
	JButton b2,b1;
  	JTextField t3,t4;
	
	String qry;
	Connection conn=null;
	ResultSet rs=null;
	PreparedStatement pst=null;
	
	public signUP()
	{
		c o=new c();
		conn=o.contn ();
		f2=new JFrame();
		
		this.setLayout(null);
		this.setSize(1366,778);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon i1= new ImageIcon("C:\\Users\\rasu\\Pictures\\Landscaps\\3016822.jpg");
		Image img=i1.getImage();
		Image modifyImage=img.getScaledInstance(1366,778,java.awt.Image.SCALE_SMOOTH);
		setContentPane(new JLabel(new ImageIcon(modifyImage)));
		
		JPanel p3=new JPanel();
		p3.setLayout(null);
		p3.setBounds(470,500,300,150);
		p3.setPreferredSize(new Dimension(450,145));
		l7=new JLabel("ADMIN SIGNUP");
		l7.setBounds(120,10,150,25);
		p3.add(l7);
		
		l5=new JLabel("USERNAME");
		l5.setBounds(10,40,80,25);
		p3.add(l5);
		
		l6=new JLabel("PASSWORD");
		l6.setBounds(10,75,80,25);
		p3.add(l6);
		
		t3=new JTextField();
		t3.setBounds(130,40,120,25);
		p3.add(t3);
		t4=new JTextField();
		t4.setBounds(130,75,120,25);
		p3.add(t4);
		
		b2=new JButton("Sign Up");
		b2.setBounds(120,115,80,25);		
		b2.setFocusable(false);
		p3.add(b2);
		
		b1=new JButton("Back");
		b1.setBounds(20,115,80,25);		
		b1.setFocusable(false);
		b1.addActionListener(this);
		p3.add(b1);
		
		this.add(p3);
		b2.addActionListener(this);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
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
		if(e.getSource()==b1)
		{
			this.dispose();
			new homePage(c.cq,c.aq);	
		}
	}
}
class removeAdmin extends JFrame implements ActionListener
{
	JFrame f3;
	JLabel l8,l9;
	JButton b3,b1;
  	JTextField t5;
	String qry;
	Connection conn=null;
	
	ResultSet rs=null;
	PreparedStatement pst=null;
	
	public removeAdmin()
	{
		c o=new c();
		conn=o.contn ();
		f3=new JFrame();
		
		this.setLayout(null);
		this.setSize(1366,778);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon i1= new ImageIcon("C:\\Users\\rasu\\Pictures\\Landscaps\\3016822.jpg");
		Image img=i1.getImage();
		Image modifyImage=img.getScaledInstance(1366,778,java.awt.Image.SCALE_SMOOTH);
		setContentPane(new JLabel(new ImageIcon(modifyImage)));
		
		JPanel p3=new JPanel();
		p3.setLayout(null);
		p3.setBounds(470,500,300,150);
		p3.setPreferredSize(new Dimension(450,100));
		l9=new JLabel("ADMIN REMOVE");
		l9.setBounds(120,10,150,25);
		p3.add(l9);
		
		l8=new JLabel("USERNAME");
		l8.setBounds(10,40,80,25);
		p3.add(l8);
		t5=new JTextField();
		t5.setBounds(130,40,120,25);
		p3.add(t5);
		
		b3=new JButton("Delete");
		b3.setBounds(120,75,80,25);		
		b3.setFocusable(false);
		p3.add(b3);
		
		b1=new JButton("back");
		b1.setBounds(10,75,80,25);		
		b1.setFocusable(false);
		p3.add(b1);
		
		this.add(p3);
		b3.addActionListener(this);
		b1.addActionListener(this);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b3)
		{			
			try
			{
				qry="delete from users where username=?";
				pst=conn.prepareStatement(qry);
				pst.setString(1,t5.getText());
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null,"Delete Success","Remove Admin Details",JOptionPane.PLAIN_MESSAGE);
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
		if(e.getSource()==b1)
		{
			this.dispose();
			new homePage(c.cq,c.aq);	
		}
	}
}
class addLap extends JFrame implements ActionListener
{
	JFrame f3;
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JButton b1,b2;
  	JTextField t1,t2,t3,t4,t5,t6,t7;
	String qry;
	Connection conn=null;	
	ResultSet rs=null;
	PreparedStatement pst=null;

	public addLap()
	{
		c o=new c();
		conn=o.contn ();
		
		this.setLayout(null);
		this.setSize(1366,778);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon i1= new ImageIcon("C:\\Users\\rasu\\Pictures\\Landscaps\\1393206.jpg");
		Image img=i1.getImage();
		Image modifyImage=img.getScaledInstance(1366,778,java.awt.Image.SCALE_SMOOTH);
		setContentPane(new JLabel(new ImageIcon(modifyImage)));
		
		JPanel p3=new JPanel();
		p3.setLayout(null);
		p3.setBounds(459,50,400,290);
		p3.setPreferredSize(new Dimension(500,600));
		l7=new JLabel("ADD LAPTOP");
		l7.setBounds(170,10,150,25);
		p3.add(l7);
		
		l1=new JLabel("Laptop name");
		l1.setBounds(10,40,80,20);
		p3.add(l1);
		
		l2=new JLabel("Details");
		l2.setBounds(10,70,80,20);
		p3.add(l2);
		
		l3=new JLabel("RAM");
		l3.setBounds(10,100,80,20);
		p3.add(l3);
		
		l4=new JLabel("price");
		l4.setBounds(10,130,80,20);
		p3.add(l4);
		
		l5=new JLabel("avaliable");
		l5.setBounds(10,160,80,20);
		p3.add(l5);
		
		l6=new JLabel("Image");
		l6.setBounds(10,190,80,20);
		p3.add(l6);
		
		l7=new JLabel("id");
		l7.setBounds(10,220,80,20);
		p3.add(l7);
		
		t1=new JTextField();
		t1.setBounds(130,40,250,20);
		p3.add(t1);
		
		t2=new JTextField();
		t2.setBounds(130,70,250,20);
		p3.add(t2);
		
		t3=new JTextField();
		t3.setBounds(130,100,250,20);
		p3.add(t3);
		
		t4=new JTextField();
		t4.setBounds(130,130,250,20);
		p3.add(t4);
		
		t5=new JTextField();
		t5.setBounds(130,160,250,20);
		p3.add(t5);
		
		t6=new JTextField();
		t6.setBounds(130,190,250,20);
		p3.add(t6);
		
		t7=new JTextField();
		t7.setBounds(130,220,250,20);
		p3.add(t7);
		
		b2=new JButton("Add Laptop");
		b2.setBounds(200,250,120,25);		
		b2.setFocusable(false);
		b2.addActionListener(this);
		p3.add(b2);	
		
		b1=new JButton("Back ");
		b1.setBounds(50,250,120,25);		
		b1.setFocusable(false);
		b1.addActionListener(this);
		p3.add(b1);
		
		this.add(p3);
		this.setVisible(true);
	}	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b2)
		{			
			try
			{
				qry="insert into laptop (id,Lname,detail,RAM,Price,Avaliable,Image) values(?,?,?,?,?,?,?)";
				pst=conn.prepareStatement(qry);
				pst.setString(1,t7.getText());
				pst.setString(2,t1.getText());
				pst.setString(3,t2.getText());
				pst.setString(4,t3.getText());
				pst.setString(5,t4.getText());
				pst.setString(6,t5.getText());
				pst.setString(7,"C:\\Users\\rasu\\Pictures\\Icon128\\"+t6.getText()+".png");
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null,"Success","SignUpDetails",JOptionPane.PLAIN_MESSAGE);
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
			if(e.getSource()==b1)
		{
			this.dispose();
			new homePage(c.cq,c.aq);	
		}
	}
}
class LapPriceUpdate extends JFrame implements ActionListener
{
	JFrame f2;
	JLabel l1,l2,l3;
	JButton b1,b2;
  	JTextField t1,t2;
	String qry;
	Connection conn=null;
	ResultSet rs=null;
	PreparedStatement pst=null;
	
	public LapPriceUpdate()		// invoke details button
	{
		c o=new c();
		conn=o.contn ();	
		f2=new JFrame();
		
		this.setLayout(null);
		this.setSize(1366,778);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon i1= new ImageIcon("C:\\Users\\rasu\\Pictures\\Landscaps\\3016822.jpg");
		Image img=i1.getImage();
		Image modifyImage=img.getScaledInstance(1366,778,java.awt.Image.SCALE_SMOOTH);
		setContentPane(new JLabel(new ImageIcon(modifyImage)));
		
		JPanel p3=new JPanel();
		p3.setLayout(null);
		p3.setBounds(470,500,300,150);
		p3.setPreferredSize(new Dimension(450,145));
		l1=new JLabel("Price Update");
		l1.setBounds(120,10,150,25);
		p3.add(l1);
		
		l3=new JLabel("Laptop Id");
		l3.setBounds(10,40,80,25);
		p3.add(l3);
		
		l2=new JLabel("New Price");
		l2.setBounds(10,75,80,25);
		p3.add(l2);
		
		t1=new JTextField();
		t1.setBounds(130,40,120,25);
		p3.add(t1);
		t2=new JTextField();
		t2.setBounds(130,75,120,25);
		p3.add(t2);
		
		b1=new JButton("Update");
		b1.setBounds(160,115,80,25);		
		b1.setFocusable(false);
		b1.addActionListener(this);
		p3.add(b1);
		
		b2=new JButton("Back");
		b2.setBounds(40,115,80,25);		
		b2.setFocusable(false);
		b2.addActionListener(this);
		p3.add(b2);
		this.add(p3);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{			
			try
			{		
				qry="update laptop set price=? where id=?";
				pst=conn.prepareStatement(qry);
				System.out.println(t2.getText());
				int idA=Integer.parseInt(t1.getText());
				pst.setString(1,t2.getText());
				pst.setInt(2,idA);
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null,"update success","UpdateDetails",JOptionPane.PLAIN_MESSAGE);
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
		if(e.getSource()==b2)
		{
			this.dispose();
			new homePage(c.cq,c.aq);	
		}
	}
}
class LapDetails extends JFrame implements ActionListener
{
	JFrame f2;
	JLabel L[]=new JLabel[16];
	JButton b1;
	JTextField t1;
	String qry;
	
	Connection conn=null;
	ResultSet rs=null;
	PreparedStatement pst=null;
	public LapDetails(int x)
	{
		c o=new c();
		conn=o.contn ();	
		f2=new JFrame();
		int y=20;
		this.setLayout(null);
		this.setSize(1366,778);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon i1= new ImageIcon("C:\\Users\\rasu\\Pictures\\Landscaps\\3016822.jpg");
		Image img=i1.getImage();
		Image modifyImage=img.getScaledInstance(1366,778,java.awt.Image.SCALE_SMOOTH);
		setContentPane(new JLabel(new ImageIcon(modifyImage)));
		
		JPanel p3=new JPanel();
		p3.setLayout(null);
		p3.setBounds(10,10,1300,650);	
		
		for (int i=0;i<15;i++)
		{
			L[i]= new JLabel();
			L[i].setBounds(20,y,500,20);
			y+=25;
			p3.add(L[i]);	
		}
		b1=new JButton("back");
		b1.setBounds(120,y,80,25);		
		b1.setFocusable(false);
		p3.add(b1);
		this.add(p3);
		b1.addActionListener(this);
		this.setVisible(true);
		try
		{			
			qry="select * from details where id ="+x;  //?-b[]
			pst=conn.prepareStatement(qry);
			rs=pst.executeQuery();
			if(rs.next())
			{
				L[0].setText("Name : "+ rs.getString("Name"));
				L[1].setText("Processor : "+ rs.getString("Processor"));
				L[2].setText("Generation : "+ rs.getString("Generation"));
				L[3].setText("SSD : "+ rs.getString("SSD"));
				L[4].setText("SSD CAPACITY : "+ rs.getString("SSD CAPACITY"));
				L[5].setText("RAM : "+ rs.getString("RAM"));
				L[6].setText("CLOCK SPEED : "+ rs.getString("CLOCK SPEED"));
				L[7].setText(" CACHE: "+ rs.getString("CACHE"));
				L[8].setText("CORES : "+ rs.getString("CORES"));
				L[9].setText("OS_ARCH : "+ rs.getString("OS_ARCH"));
				L[10].setText("SCREEN_SIZE : "+ rs.getString("SCREEN_SIZE"));
				L[11].setText("WIRELESS : "+ rs.getString("WIRELESS"));
				L[12].setText("SLOT : "+ rs.getString("SLOT"));
				L[13].setText("WEIGHT : "+ rs.getString("WEIGHT"));
				L[14].setText("WARRANTY : "+ rs.getString("WARRANTY"));
			}
		}catch(SQLException ex){System.err.println(ex);}
		catch(Exception e){System.err.println(e);}
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
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			this.dispose();
			new homePage(c.cq,c.aq);	
		}
	}
}

class bill extends JFrame implements ActionListener
{
	static JFrame f1;
	int pr,tax,Gtot;
	JButton b1,b2,b3;
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2,t3,t4,t5;
	JTextArea ta1;
	JCheckBox cb1,cb2,cb3,cb4;
	String s1,s2,s3,s4,qry;
	
	Connection conn=null;
	ResultSet rs=null;
	PreparedStatement pst=null;

	
	public bill(int x)
	{	
		c o=new c();
		conn=o.contn ();

		f1=new JFrame("panel");
		this.setLayout(null);
		this.setSize(1366,778);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p1=new JPanel();
		p1.setLayout(null);
		
		ImageIcon i1= new ImageIcon("C:\\Users\\rasu\\Pictures\\Landscaps\\1393334.jpg");
		Image img=i1.getImage();
		Image modifyImage=img.getScaledInstance(1366,778,java.awt.Image.SCALE_SMOOTH);
		setContentPane(new JLabel(new ImageIcon(modifyImage)));

		try
		{			
			qry="select * from laptop where id ="+x;  //?-b[]
			pst=conn.prepareStatement(qry);
			rs=pst.executeQuery();
			if(rs.next())
			{
				s1=rs.getString("Lname");
				s2=rs.getString("detail");
				s3=rs.getString("id");
				pr=rs.getInt("price");
			}
			tax=pr/100*12;
			Gtot=pr+tax;
		}catch(SQLException ex){System.err.println(ex);}
		catch(Exception e){System.err.println(e);}
		finally
		{
			try
			{
				rs.close();
				pst.close();
			}
			catch(Exception exc){}
		}

		l1=new JLabel("Customer Name");
		l1.setBounds(10,10,150,25);
		p1.add(l1);
		
		l2=new JLabel("Customer Age");
		l2.setBounds(10,60,150,25);
		p1.add(l2);
		
		l3=new JLabel("Customer Address");
		l3.setBounds(10,110,150,25);
		p1.add(l3);
		
		l4=new JLabel("Customer Mobile No");
		l4.setBounds(10,160,150,25);
		p1.add(l4);
		
		l5=new JLabel("Customer ID");
		l5.setBounds(10,210,150,25);
		p1.add(l5);
		
		
		t1=new JTextField();
		t1.setBounds(250,10,200,25);
		p1.add(t1);
		
		t2=new JTextField();
		t2.setBounds(250,60,200,25);
		p1.add(t2);
		
		t3=new JTextField();
		t3.setBounds(250,110,200,25);
		p1.add(t3);
		
		t4=new JTextField();
		t4.setBounds(250,160,200,25);
		p1.add(t4);
		
		t5=new JTextField();
		t5.setBounds(250,210,200,25);
		p1.add(t5);
		
		b1=new JButton("Add");
		b1.setBounds(200,260,100,25);
		p1.add(b1);
		b1.addActionListener(this);
		
		ta1=new JTextArea();
		ta1.setBounds(750,50,450,500);
		this.add(ta1);

		b2=new JButton("Print");
		b2.setBounds(325,260,100,25);
		p1.add(b2);
		b2.addActionListener(this);
		
		b3=new JButton("Back");
		b3.setBounds(75,260,100,25);
		p1.add(b3);
		b3.addActionListener(this);
		
				//p1.setVisible(true);
				p1.setBackground(Color.GREEN);
				p1.setBounds(50,50,500,300);
		p1.setPreferredSize(new Dimension(500,500));

		this.add(p1);
		this.show();
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{			
		ta1.setText("\n"
						+"	======================================="+"\n"
						+"		RCB LAP WORLD"+"\n"
						+"	======================================="+"\n"
						+"		Customer Details"+"\n"
						+"	Customer Name	: "+t1.getText()+"\n"
						+"	Customer Age		: "+t2.getText()+"\n"
						+"	Customer Address	: "+t3.getText()+"\n"
						+"	Customer Mobile	: "+t4.getText()+"\n"
						+"	Customer ID		: "+t5.getText()+"\n"
						+"	======================================="+"\n"
						+"		Laptop Details"+"\n\n"
						+"	Laptop Name	:"+s1+"\n"
						+"	Laptop Model	:"+s2+"\n"
						+"	Laptop id	:"+s3+"\n"
						+"	======================================="+"\n"
						+"		Price Details "+"\n\n"
						+"	Laptop Price	:"+pr+".00"+"\n"
						+"	Laptop Tax	:"+tax+".00"+"\n"
						+"	Grant Total	:"+Gtot+".00"+"\n"
		);


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
		if(e.getSource()==b3)
		{
			this.dispose();
			new homePage(c.cq,c.aq);
		}
	}
}
