import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.Color;
public class guiChooseFile
{
	public static void main(String args[])
	{
		 fileChooser o=new fileChooser();
	}
}
class fileChooser extends JFrame implements ActionListener
{
			JFrame f1=new JFrame("GUI APPLICATION TRAINING");
			JButton b1;
	public fileChooser() 
	{
		this.setLayout(new FlowLayout());
		this.setSize(520,520);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1=new JButton("choose");
		b1.addActionListener(this);
		this.add(b1);
		this.setVisible(true);

		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			JFileChooser fc=new JFileChooser();
			fc.setCurrentDirectory(new File("C:\\Users\\rasu\\Pictures"));		// set current Directory
			//int out=fc.showOpenDialog(null);		//for open
			int out=fc.showSaveDialog(null);		//for save
			System.out.println(out);
			if(out==JFileChooser.APPROVE_OPTION)
			{
				File file=new File(fc.getSelectedFile().getAbsolutePath());
				System.out.println(file);
			}
		}
		
	}
}
