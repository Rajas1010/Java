import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.Color;
public class guiSlider
{
	public static void main(String args[])
	{
		 Slider o=new Slider();
	}
}
class Slider extends JFrame implements ChangeListener
{
			JFrame f1;
			JPanel p1;
			JLabel l1;
			JSlider s1;
	public Slider() 
	{
		f1=new JFrame("GUI APPLICATION TRAINING");
		f1.setVisible(true);
		f1.setSize(520,520);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1=new JPanel();
		l1=new JLabel();
		s1=new JSlider(0,100,50);
		s1.setPreferredSize(new Dimension(400,200));
		
		s1.setPaintTicks(true);
		s1.setMinorTickSpacing(10);
		s1.setPaintTicks(true);
		s1.setMajorTickSpacing(25);
		
		s1.setPaintLabels(true);
		//s1.setOrientation(SwingConstants.VERTICAL);
		
		l1.setText("C ="+s1.getValue());
		s1.addChangeListener(this);
		 p1.add(s1);
		 p1.add(l1);
		 f1.add(p1);
		 
		
	}
	public void stateChanged(ChangeEvent e)
	{		
		l1.setText("C ="+s1.getValue());
	}
}
