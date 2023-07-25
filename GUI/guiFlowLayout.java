import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
public class guiFlowLayout
{
	public static void main(String args[])
	{
		business o=new business();
	}
}
class business extends JFrame implements ActionListener
{
	public business() 
	{
		JFrame f1=new JFrame("GUI APPLICATION TRAINING");
		Font F1=new Font("times new roman",Font.PLAIN,14);
		f1.setVisible(true);
		f1.setSize(500,500);
		f1.setLayout(new FlowLayout(FlowLayout.CENTER,20,10));
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p1=new JPanel();
		p1.setPreferredSize(new Dimension(100,250));
		p1.setBackground(Color.RED);
		p1.setLayout(new FlowLayout());
		f1.add(p1);
		
		p1.add(new JButton("1"));
		p1.add(new JButton("2"));
		p1.add(new JButton("3"));
		p1.add(new JButton("4"));
		p1.add(new JButton("5"));
		p1.add(new JButton("6"));
		p1.add(new JButton("7"));
		p1.add(new JButton("8"));
		p1.add(new JButton("9"));
		p1.add(new JButton("0"));
		
		
		
	}
	public void actionPerformed(ActionEvent e)
	{
	
	}
}