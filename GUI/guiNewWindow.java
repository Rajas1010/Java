import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
public class guiNewWindow
{
	public static void main(String args[])
	{
		LaunchPage o=new LaunchPage();
	}
}
class  LaunchPage extends JFrame implements ActionListener
{
			JFrame f1=new JFrame("GUI APPLICATION TRAINING");
			JButton b1=new JButton("login");
	public LaunchPage() 
	{
		
		f1.setVisible(true);
		f1.setLayout(null);
		f1.setSize(900,700);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1.setBounds(100,100,80,25);
		b1.setFocusable(false);
		b1.addActionListener(this);
		f1.add(b1);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			f1.dispose();
			NewWindow oNW=new NewWindow();
		}
	}
}
class NewWindow extends JFrame
{
	JFrame f2=new JFrame();
	JLabel L1=new JLabel("Hello..!");
	JButton b2=new JButton("page 1");

	public NewWindow()
	{		
		b2.setBounds(100,100,80,25);
		L1.setBounds(300,300,80,20);	
		f2.add(b2);
		f2.add(L1);
		f2.setVisible(true);
		f2.setLayout(null);
		f2.setSize(900,700);
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}