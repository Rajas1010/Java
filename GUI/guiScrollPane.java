import javax.swing.*;
import java.awt.*;
public class guiScrollPane
{
	public static void main(String args[])
	{
		new frame1();
	}
}
class frame1 extends JFrame
{ 
	JScrollPane sp;
	JLabel img;
	JPanel p1;
	frame1()
	{
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1=new JPanel();
		img=new JLabel(new ImageIcon("C:\\Users\\rasu\\Pictures\\Landscaps\\2970045.jpg"));
		p1.add(img);
		sp=new JScrollPane();
		sp.setViewportView(p1);
		add(sp);
		setVisible(true);
	}

}