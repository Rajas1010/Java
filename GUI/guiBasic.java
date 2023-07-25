import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
public class guiBasic
{
	public static void main(String args[])
	{
		business o=new business();
	}
}
class business extends JFrame implements ActionListener
{
	JButton b1;
	public business() 
	{
		JFrame f1=new JFrame("GUI APPLICATION TRAINING");
		Font F1=new Font("times new roman",Font.PLAIN,14);
		f1.setVisible(true);
		f1.setSize(960,620);
		f1.setLayout(null);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//JLabel L1=new JLabel("USER NAME");
		//L1.setBounds(20,20,80,30);
		//L1.setFont(F1);
		//f1.add(L1);
		//ImageIcon I1=new ImageIcon("icon1.jpg");
		//f1.setIcon(I1);
		//f1.pack();
		//JPanel p1=new JPanel();
		//p1.setBackground(Color.RED);
		//p1.setBounds(200,200,80,80);
		//p1.setLayout(new BorderLayout());
		//f1.add(p1);
		//ImageIcon I3=new ImageIcon("icon3.jpg");
		b1=new JButton();
		b1.setText("LOGIN");
		b1.setFont(F1);
		b1.setBounds(70,70,200,200);
		//b1.setIcon(I3);
		//b1.setHorizontalTextPosition(JButton.RIGHT);
		//b1.setVerticalTextPosition(JButton.BOTTOM);
		b1.setBackground(Color.RED);
		b1.setEnabled(true);
		b1.setFocusable(false);
		b1.addActionListener(e -> System.out.println("clk"));
		f1.add(b1);
		
	}
	public void actionPerformed(ActionEvent e)
	{
	
	}
}