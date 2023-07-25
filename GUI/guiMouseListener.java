import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.Color;
public class guiMouseListener
{
	public static void main(String args[])
	{
		 mouseListen o=new mouseListen();
	}
}
class mouseListen extends JFrame implements MouseListener
{
			JFrame f1=new JFrame("GUI APPLICATION TRAINING");
			JLabel l1;
	public mouseListen() 
	{
		this.setLayout(null);
		this.setSize(1020,720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		
		l1=new JLabel();
		l1.setBounds(10,10,30,30);
		l1.setBackground(Color.red);
		l1.setOpaque(true); 
		l1.addMouseListener(this);

		this.add(l1);
		this.setVisible(true);
	}
	public void mouseClicked(MouseEvent e)
	{
		System.out.println("clicked");
		l1.setBackground(Color.blue);
	}
		public void mousePressed(MouseEvent e)
	{
	System.out.println("pressed");
			l1.setBackground(Color.green);

	}
	public void mouseReleased(MouseEvent e)
	{
		System.out.println("released");
				l1.setBackground(Color.yellow);

	}
	public void mouseEntered(MouseEvent e)
	{ 
		System.out.println("entered");
				l1.setBackground(Color.black);

	}
	public void mouseExited(MouseEvent e)
	{
		System.out.println("exited");
				l1.setBackground(Color.cyan);

	}
}
