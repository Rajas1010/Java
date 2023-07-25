import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
public class panelOnPanel
{
	public static void main(String args[])
	{
		business o=new business();
	}
}
class business extends JFrame 
{
		JPanel p[]=new JPanel[100];
		//JScrollPane sp;
		JPanel p1;
	public business() 
	{
		JFrame f1=new JFrame("GUI APPLICATION TRAINING");
		f1.setVisible(true);
		f1.setSize(500,500);
		f1.setLayout(new FlowLayout());
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		p1=new JPanel();
		p1.setBackground(Color.RED);
		p1.setPreferredSize(new Dimension(450,450));
		f1.add(p1);
		
	/*sp=new JScrollPane();
		sp.setPreferredSize(new Dimension(450,450));
		sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
				this.add(sp);*/
				
		for(int i=0;i<100;i++)
		{
		p[i]=new JPanel();
		p[i].setBackground(Color.GREEN);
		p[i].setPreferredSize(new Dimension(450,100));
		p1.add(p[i]);
		}
	}
}