import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.event.*;
import java.awt.Color;

public class guiKeyBinding
{
	public static void main(String args[])
	{
		 game o=new game();
	}
}
class game extends JFrame
{
	JLabel l1;
	Action up;
	Action down;
	Action left;
	Action right;
	
	public game() 
	{	
		this.setTitle("GUI TRAINING");
		this.setSize(1020,720);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		l1=new JLabel();
		l1.setBackground(Color.red);
		l1.setOpaque(true);
		l1.setBounds(10,10,30,30);
		
		up=new UpAction();
		down=new DownAction();
		left=new LeftAction();
		right=new RightAction();
		
		l1.getInputMap().put(KeyStroke.getKeyStroke("UP"),"up");				//UP ->upArrow button we have to change into W also
		l1.getActionMap().put("up",up);
		
		l1.getInputMap().put(KeyStroke.getKeyStroke("DOWN"),"down");
		l1.getActionMap().put("down",down);
		
		l1.getInputMap().put(KeyStroke.getKeyStroke("LEFT"),"left");
		l1.getActionMap().put("left",left);
		
		l1.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"),"right");
		l1.getActionMap().put("right",right);
		this.add(l1);
		this.setVisible(true);

	}
	public class UpAction extends AbstractAction
	{
		public void actionPerformed(ActionEvent e)
		{
			l1.setLocation(l1.getX(),l1.getY()-10);
		}
	}

	public class DownAction extends AbstractAction
	{
		public void actionPerformed(ActionEvent e)
		{
			l1.setLocation(l1.getX(),l1.getY()+10);

		}
	}

	public class LeftAction extends AbstractAction
	{
		public void actionPerformed(ActionEvent e)
		{
			l1.setLocation(l1.getX()-10,l1.getY());

		}
	}

	public class RightAction extends AbstractAction
	{
		public void actionPerformed(ActionEvent e)
		{
			l1.setLocation(l1.getX()+10,l1.getY());

		}
	}

}