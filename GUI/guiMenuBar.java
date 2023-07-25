import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.Color;
public class guiMenuBar
{
	public static void main(String args[])
	{
		 menuBar o=new menuBar();
	}
}
class menuBar extends JFrame implements ActionListener
{
			JFrame f1=new JFrame("GUI APPLICATION TRAINING");
			JMenuBar m1;
			JMenu mf,me,mh;
			JMenuItem fl,fs,fe;
	public menuBar() 
	{
		this.setLayout(new FlowLayout());
		this.setSize(520,520);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		m1=new JMenuBar();
		mf=new JMenu("File");
		me=new JMenu("Edit");
		mh=new JMenu("Help");
		
		fl=new JMenuItem("Load");
		fs=new JMenuItem("Save");
		fe=new JMenuItem("Exit");
		
		fl.addActionListener(this);
		fs.addActionListener(this);
		fe.addActionListener(this);
		
		mf.setMnemonic(KeyEvent.VK_F);	//alt + F
		me.setMnemonic(KeyEvent.VK_E);	//alt + E
		mh.setMnemonic(KeyEvent.VK_H);	//alt + H
		
		fl.setMnemonic(KeyEvent.VK_L);		//L
		fs.setMnemonic(KeyEvent.VK_S);		//S
		fe.setMnemonic(KeyEvent.VK_E);		//E
		
		mf.add(fl);
		mf.add(fs);
		mf.add(fe);
		
		m1.add(mf);
		m1.add(me);
		m1.add(mh);
		this.setJMenuBar(m1);
		this.setVisible(true);

		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==fl)
		{
			System.out.println("file loaded");
		}
		if(e.getSource()==fs)
		{
			System.out.println("file saved");
		}
		if(e.getSource()==fe)
		{
			System.out.println("file Exit");
			System.exit(0);
		}
	}
}
