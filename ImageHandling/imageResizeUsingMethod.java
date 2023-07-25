import javax.swing.*;
import java.awt.*;

public class imageResizeUsingMethod
{
	public static void main(String args[])
	{
		demo o=new demo ();
	}
}
class demo extends JFrame
{
	public demo()
	{
		setContentPane(c.img("C:\\Users\\rajas\\OneDrive\\Pictures\\Saved Pictures\\handsDigital.jpg"));
		this.setLayout(null);
		this.setSize(1366,778);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}
}

class c
{
	public static JLabel img(String image)
	{
		ImageIcon i1= new ImageIcon(image);
		Image img=i1.getImage();
		Image modifyImage=img.getScaledInstance(1366,778,java.awt.Image.SCALE_SMOOTH);
		JLabel L=new JLabel(new ImageIcon(modifyImage));
		return L;
	}	

}
