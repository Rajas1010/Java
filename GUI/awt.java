import java.awt.*;
import java.awt.event.*;
public class awt 
{
	public static void main(String args[])
	{
		all o=new all();
	}
}
class all implements ActionListener
{
	Button b1,b2;
	Frame f1=new Frame("RAJA");
		Frame f2=new Frame("Page2");
	public all()
	{
	
		f1.setSize(600,600);
		f1.setLayout(null);
		b1=new Button("ra");
		b1.setBounds(30,30,40,40);
		b1.addActionListener(this);
		f1.add(b1);
		f2.setSize(600,600);
		f2.setLayout(null);
		b2=new Button("p2");
		b2.setBounds(30,30,40,40);
		f2.add(b2);
		f1.setVisible(true);
		f1.addWindowListener(new WindowAdapter()
		{
			public void WindowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		f2.addWindowListener(new WindowAdapter()
		{
			public void WindowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			f2.show();
			f2.setVisible(true);
			f1.setVisible(false);
		}
	}
}