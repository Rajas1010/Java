import java.util.*;
import java.awt.*;
import javax.swing.*;
public class guiGetScreenSize 
{
	static public void main(String args[])
	{
		Demo o=new Demo();
	}
}
class c
{
	static int X,Y;
	static Toolkit tk=Toolkit.getDefaultToolkit();

	public static int getX()
	{
		X=(int)tk.getScreenSize().getWidth();
		return X;
	}
	public static int getY()
	{
		Y=(int)tk.getScreenSize().getHeight();
		return Y;
	}
}
class Demo extends JFrame
{
	public Demo()
	{		
		setTitle("Gui train");
		//Insets inst=Toolkit.getDefaultToolkit().getScreenInsets(getGraphicsConfiguration());
		//int tbSz=inst.bottom;
		System.out.println(c.getX());
		System.out.println(c.getY());
		this.setSize(c.getX(),c.getY());
		setVisible(true);
	}
}
