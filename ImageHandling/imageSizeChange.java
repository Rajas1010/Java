import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.event.*;

public class imageSizeChange 
{
	public static void main(String args[])
	{
		new demo();

	}
}
class demo extends JFrame
{
	demo()
	{		this.setLayout(null);
		this.setSize(1366,778);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ImageIcon i1= new ImageIcon("C:\\Users\\rasu\\Pictures\\Landscaps\\1393334.jpg");
		Image img=i1.getImage();
		Image modifyImage=img.getScaledInstance(1366,778,java.awt.Image.SCALE_SMOOTH);
		setContentPane(new JLabel(new ImageIcon(modifyImage)));	
		this.setVisible(true);

	}
}