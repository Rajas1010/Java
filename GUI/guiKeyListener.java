import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.Color;
public class guiKeyListener
{
	public static void main(String args[])
	{
		 keyListen o=new keyListen();
	}
}
class keyListen extends JFrame implements KeyListener
{
			JFrame f1=new JFrame("GUI APPLICATION TRAINING");
			JLabel l1;
	public keyListen() 
	{
		this.setLayout(null);
		this.setSize(1020,720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		
		this.addKeyListener(this);
		l1=new JLabel();
		l1.setBounds(10,10,30,30);
		l1.setBackground(Color.red);
		l1.setOpaque(true); 

		this.add(l1);
		this.setVisible(true);
	}
	public void keyTyped(KeyEvent e)
	{
		switch(e.getKeyChar())
		{
			case 'a': l1.setLocation(l1.getX()-1,l1.getY());
			break;
			case 'w': l1.setLocation(l1.getX(),l1.getY()-1);
			break;
			case 's': l1.setLocation(l1.getX(),l1.getY()+1);
			break;
			case 'd': l1.setLocation(l1.getX()+1,l1.getY());
			break;
		}	
	}
		public void keyPressed(KeyEvent e)
	{
	switch(e.getKeyCode())
		{
			case 37: l1.setLocation(l1.getX()-10,l1.getY());
			break;
			case 38: l1.setLocation(l1.getX(),l1.getY()-10);
			break;
			case 40: l1.setLocation(l1.getX(),l1.getY()+10);
			break;
			case 39: l1.setLocation(l1.getX()+10,l1.getY());
			break;
		}	
	}
	public void keyReleased (KeyEvent e)
	{
		System.out.println("release key code"+ e.getKeyCode());
		System.out.println("release key code"+ e.getKeyChar());
	}
}
