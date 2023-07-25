import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.event.*;
import java.awt.Color;

public class guiDragPanal
{
	public static void main(String args[])
	{
		 dragDemo o=new dragDemo();
	}
}
class dragDemo extends JFrame
{
			DragPanel d1=new DragPanel();
	public dragDemo() 
	{	
		this.setTitle("GUI TRAINING");
		this.setSize(1020,720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.add(d1);
	}
}
class DragPanel extends JPanel
{
		ImageIcon i1=new ImageIcon("C:\\Users\\rasu\\Pictures\\Icon128\\iconKrystledsouza1.png");
		final int WIDTH=i1.getIconWidth();
		final int HEIGHT=i1.getIconHeight();
		Point imageCorner;
		Point prevPt;
		
	DragPanel()
	{
		imageCorner = new Point(10,10);
		ClickListener clk=new ClickListener();
		DragListener drg=new DragListener();
		this.addMouseListener(clk);
		this.addMouseMotionListener(drg);
		
	}	

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		i1.paintIcon(this,g,(int)imageCorner.getX(),(int)imageCorner.getY());
	}
	private class ClickListener extends MouseAdapter
	{
		public void mousePressed(MouseEvent e)
		{
			prevPt=e.getPoint();
		}
	}
	private class DragListener extends MouseMotionAdapter
	{
		public void mouseDragged(MouseEvent e)
		{
			Point currentPt=e.getPoint();
			imageCorner.translate(
			(int)(currentPt.getX() - prevPt.getX()),
			(int)(currentPt.getY()-prevPt.getY())
			);
			prevPt=currentPt;
			repaint();
			
		}
	}
}