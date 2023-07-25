import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
public class guiBorderLayout
{
	public static void main(String args[])
	{
		business o=new business();
	}
}
class business
{
	JFrame f1;
	JPanel p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;
	public business() 
	{
		f1=new JFrame("GUI APPLICATION TRAINING");
		Font F1=new Font("times new roman",Font.PLAIN,14);
		f1.setVisible(true);
		f1.setSize(500,500);
		f1.setLayout(new BorderLayout(10,10));
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p1=new JPanel();
		p1.setBackground(Color.RED);
		p1.setPreferredSize(new Dimension(100,100));
		f1.add(p1,BorderLayout.NORTH);
		
		p2=new JPanel();
		p2.setBackground(Color.GREEN);
		p2.setPreferredSize(new Dimension(100,100));
		f1.add(p2,BorderLayout.SOUTH);
		
		p3=new JPanel();
		p3.setBackground(Color.CYAN);
		p3.setPreferredSize(new Dimension(100,100));
		f1.add(p3,BorderLayout.EAST);
		
		p4=new JPanel();
		p4.setBackground(Color.ORANGE);
		p4.setPreferredSize(new Dimension(100,100));
		f1.add(p4,BorderLayout.WEST);
		
		p5=new JPanel();
		p5.setBackground(Color.BLUE);
		p5.setPreferredSize(new Dimension(100,100));
		f1.add(p5,BorderLayout.CENTER);
		
		p5.setLayout(new BorderLayout());
		
		p6=new JPanel();
		p6.setBackground(Color.RED);
		p6.setPreferredSize(new Dimension(50,50));
		p5.add(p6,BorderLayout.NORTH);
		
		p7=new JPanel();
		p7.setBackground(Color.GREEN);
		p7.setPreferredSize(new Dimension(50,50));
		p5.add(p7,BorderLayout.SOUTH);
		
		p8=new JPanel();
		p8.setBackground(Color.CYAN);
		p8.setPreferredSize(new Dimension(50,50));
		p5.add(p8,BorderLayout.EAST);
		
		p9=new JPanel();
		p9.setBackground(Color.ORANGE);
		p9.setPreferredSize(new Dimension(50,50));
		p5.add(p9,BorderLayout.WEST);
		
		p10=new JPanel();
		p10.setBackground(Color.PINK);
		p10.setPreferredSize(new Dimension(50,50));
		p5.add(p10,BorderLayout.CENTER);
		
	}
}