import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.Color;
public class guiMouseListenerImage
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
			ImageIcon i1,i2,i3,i4;
	public mouseListen() 
	{
		this.setSize(1020,720);
		this.setLayout(new FlowLayout());
		
		i1=new ImageIcon("C:\\Users\\rasu\\Pictures\\Icon128\\iconVaishu.png");
		i2=new ImageIcon("C:\\Users\\rasu\\Pictures\\Icon128\\iconTzuyu.png");
		i3=new ImageIcon("C:\\Users\\rasu\\Pictures\\Icon128\\iconSamantha.png");
		i4=new ImageIcon("C:\\Users\\rasu\\Pictures\\Icon128\\iconFearythanyarat.png");
		
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		l1=new JLabel();
		l1.addMouseListener(this);
		l1.setIcon(i1);
		this.add(l1);

		this.setVisible(true);
	}
	public void mouseClicked(MouseEvent e)
	{
		l1.setIcon(i2);
	}
		public void mousePressed(MouseEvent e)
	{
		l1.setIcon(i4);
	}
	public void mouseReleased(MouseEvent e)
	{
		l1.setIcon(i3);
	}
	public void mouseEntered(MouseEvent e)
	{ 		l1.setIcon(i2);
	}
	public void mouseExited(MouseEvent e)
	{
		l1.setIcon(i3);
	}
}
