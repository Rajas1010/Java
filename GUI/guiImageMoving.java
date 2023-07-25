import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.event.*;
import java.awt.Color;

public class guiImageMoving
{
	public static void main(String args[])
	{
		 Animation o=new Animation();
	}
}
class Animation extends JFrame
{
	AniPanal p1;
	public Animation() 
	{	
		p1=new AniPanal();
		this.setTitle("GUI TRAINING");
		this.setSize(600,600);
		this.undecorated(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		this.setVisible(true);
		this.add(p1);
	}
}


class AniPanal extends JPanel implements ActionListener
{
	
	
		final int PANAL_WIDTH=500;
		final int PANAL_HEIGHT=500;
		Image img;
		Image bgImg;
		Timer timer;
		int xVelocity=10;
		int yVelocity=5;
		int x=250,y=120;
	
		
	AniPanal()
	{
		this.setPreferredSize(new Dimension(PANAL_WIDTH,PANAL_HEIGHT));
		this.setBackground(Color.black);
		img=new ImageIcon("C:\\Users\\rajas\\OneDrive\\Pictures\\javaArt.png").getImage();
		timer=new Timer(10,this);
		timer.start();
	}	
	public void paint(Graphics g)
	{
		super.paint(g);						//paint background
		Graphics2D g2d=(Graphics2D) g;
		g2d.drawImage(img,x,y,null);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(x>=PANAL_WIDTH-img.getWidth(null) || x<0)
		{
			xVelocity=xVelocity*-1;
		}
			x+=xVelocity;
			
			if(y>=PANAL_HEIGHT-img.getHeight(null) || y<0)
		{
			yVelocity=yVelocity*-1;
		}
			y+=yVelocity;
			
			repaint();
		
	}


}