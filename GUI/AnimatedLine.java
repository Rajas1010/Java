import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
public class AnimatedLine extends JFrame
{
	private JPanel contentPane;
	 int x=35,y=25,flag=0;
	 JPanel panel=new JPanel()
	 {
		 protected void paintComponent(Graphics  g)
		 {
			 if(flag == 0)
			 {
				 g.drawString(".", x , y);
				 ++x;
				 ++y;
				 if(x == 500 || y == 300)
				 {
					 flag =1;
				 }
			 }
			 else if(flag == 1)
			 {
				 g.drawString(".", x , y);
				 --x;
				 if(x == 25)
				 {
					 flag = 2;
				 }
			 }
			 else if(flag == 2)
			 {
				  g.drawString(".", x , y);
				 ++x;
				 --y;
				 if(x==500 || y == 25)
				 {
					 flag =3;
				 }
			 }
			 else if(flag == 3)
			 {
				  g.drawString(".", x , y);
				 --x;
				 if(x==35 && y == 25) 
				 {
					 t.stop();
				 }
			 }
		 };
	 };
	 Timer t= new Timer(10,new ActionListener(){
	 
		 public void actionPerformed(ActionEvent e)
		 {
			 panel.repaint();
		 }
	 });
	
	public static void main(String args[])
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try{
						AnimatedLine frame=new AnimatedLine();
						frame.setVisible(true);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
	public AnimatedLine ()
	{
		setTitle("zigZag");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,811,443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel.setBounds(10,11,775,382);
		contentPane.add(panel);
		
		t.start();

	}
}
