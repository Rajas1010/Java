import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.Color;
public class guiColorChooser
{
	public static void main(String args[])
	{
		 colorchooser o=new colorchooser();
	}
}
class colorchooser extends JFrame implements ActionListener
{
			JFrame f1=new JFrame("GUI APPLICATION TRAINING");
			JButton b1,b2;
			JLabel l1;
	public colorchooser() 
	{
		this.setLayout(new FlowLayout());
		this.setSize(520,520);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b1=new JButton("pick a fore color");
		b1.setFocusable(false);
		b1.addActionListener(this);
		this.add(b1);
		
		b2=new JButton("pick a back color");
		b2.setFocusable(false);
		b2.addActionListener(this);
		this.add(b2);

		l1=new JLabel();
		l1.setText("rajasekar"); 

		this.add(l1);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			JColorChooser ch =new JColorChooser();
			Color c=JColorChooser.showDialog(null,"pick a fore color",Color.black);
			l1.setForeground(c);
			
		}
		if(e.getSource()==b2)
		{
			JColorChooser ch2 =new JColorChooser();
			Color c1=JColorChooser.showDialog(null,"pick a back color",Color.black);
			l1.setBackground(c1); 
			l1.setOpaque(true);
			
		}
		
	}
}
