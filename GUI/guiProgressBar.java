import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.Color;
public class guiProgressBar
{
	public static void main(String args[])
	{
		 ProgressBar o=new ProgressBar();
	}
}
class ProgressBar extends JFrame
{
			JFrame f1=new JFrame("GUI APPLICATION TRAINING");
			JProgressBar bar1=new JProgressBar();
			
	public ProgressBar() 
	{
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setSize(520,520);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		bar1.setValue(0);
		bar1.setBounds(20,20,420,50);
		bar1.setStringPainted(true);
		f1.add(bar1);
		 
		fill();
	}
	public void fill()
	{		int count=0;
		while(count<=100)		//for reverse use >
		{
			bar1.setValue(count);
			try
			{
				Thread.sleep(50);
			}catch(InterruptedException e){e.printStackTrace();}
			count++;
		}
		bar1.setString("Success..!");
	}
}
