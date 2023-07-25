import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.*;
import javax.swing.event.*;
import java.awt.Color;
import java.io.*;
import java.util.*;


public class Notepad
{
	public static void main(String args[])
	{
		business o=new business();
	}
}
class business extends JFrame implements ActionListener
{
	JTextArea t;
	JScrollPane sp;
	JSpinner spin;
	JLabel l1;
	JButton b1;
	JComboBox cbx1;
	JMenuBar mb;
	JMenu m;
	JMenuItem open;
	JMenuItem save;
	JMenuItem exit;
	
	public business() 
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("NOTEPAD");
		this.setSize(1366,778);
		this.setLayout(new FlowLayout());
		this.setLocationRelativeTo(null);		//frame in center of the screen
		
		
		t=new JTextArea();
		t.setPreferredSize(new Dimension(1346,678));		//text area size < frame size (in using FlowLAYOUT);
		t.setLineWrap(true);				// txt continue to next line
		t.setWrapStyleWord(true); 	// 	word continue to next line
		t.setFont(new Font("Arial",Font.PLAIN,20));
		
		sp=new JScrollPane(t);
		sp.setPreferredSize(new Dimension(1346,678));
		sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		spin=new JSpinner();
		spin.setPreferredSize(new Dimension(50,25));
		spin.setValue(20);
		
		spin.addChangeListener(new ChangeListener(){
		
			public void stateChanged(ChangeEvent x)
			{
				t.setFont(new Font(t.getFont().getFamily(),Font.PLAIN,(int)spin.getValue()));
			}
		});
		
		b1=new JButton("color");
		b1.setFocusable(false);
		b1.addActionListener(this);
		 
		 String[] fonts=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		cbx1=new JComboBox(fonts);
		cbx1.addActionListener(this);
		cbx1.setSelectedItem("Arial");
		 
		l1=new JLabel("Font Size :");
		
		mb=new JMenuBar();
		m=new JMenu("File");
		open=new JMenuItem("Open");
		save=new JMenuItem("Save");
		exit=new JMenuItem("Exit");
		open.addActionListener(this);
		save.addActionListener(this);
		exit.addActionListener(this);
		
		m.add(open);
		m.add(save);
		m.add(exit);
		mb.add(m);
		
		
		
		this.setJMenuBar(mb);
		this.add(l1);
		this.add(spin);
		this.add(b1);
		this.add(cbx1);
		this.add(sp);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			JColorChooser cc=new JColorChooser();
			Color c=cc.showDialog(null,"choose a color",Color.black);
			t.setForeground(c);
		}
		if(e.getSource()==cbx1)
		{
			t.setFont(new Font((String)cbx1.getSelectedItem(),Font.PLAIN,t.getFont().getSize()));
		}
		if(e.getSource()==open)
		{
			JFileChooser fc=new JFileChooser();
			fc.setCurrentDirectory(new File("."));
			
			FileNameExtensionFilter filter=new FileNameExtensionFilter("Text Files","txt");
			fc.setFileFilter(filter);
			
			int responce=fc.showOpenDialog(null);
			if(responce== JFileChooser.APPROVE_OPTION)
			{
				File file=new File(fc.getSelectedFile().getAbsolutePath());
				Scanner filein ;
				try{
				filein=new Scanner(file);
				if(file.isFile())
				{
					while(filein.hasNextLine())
					{
						String line=filein.nextLine()+"\n";
						t.append(line);
						filein.close();
					}
				}
				}
				catch(FileNotFoundException e1)
				{
					e1.printStackTrace();
				}
			}
			
		}	
		if(e.getSource()==save)
		{
			JFileChooser fc=new JFileChooser();
			fc.setCurrentDirectory(new File("."));
			
			int response=fc.showSaveDialog(null);
			if(response == JFileChooser.APPROVE_OPTION)
			{
				File file;
				PrintWriter fileOut;
				file=new File(fc.getSelectedFile().getAbsolutePath());
				try
				{
					fileOut=new PrintWriter(file);
					fileOut.println(t.getText());
					fileOut.close();
				}
				catch(FileNotFoundException e1)
				{e1.printStackTrace();}
			}
			
			
		}	
		if(e.getSource()==exit)
		{
			System.exit(0);
		}
		
		
	}
}