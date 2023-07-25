import javax.swing.JFrame;
public class swing
{
	public static void main(String args[])
	{
		JFrame o=new JFrame();
		o.setTitle("Raja");
		o.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		o.setSize(500,500);
		o.setResizable(false); 
		o.setVisible(true);
		ImageIcon oImg=new ImageIcon("C:\\java programs\\images\\icon2.jpg");
		oF.setIconImage(oImg.getImage());
		JFrame oF=new JFrame();
		oF.setLayout(null);
		oF.setVisible(true);
		oF.setSize(920,630);
		oF.setResizable(false);
		oF.setTitle("GUI Training Application");
		oF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//oF.getContentPane().setBackground(new Color(126,233,90));		//setBackground color
		JLabel L=new JLabel();
		L.setText("userName");
		L.setBounds(20,20,100,30);
		oF.add(L);
		//ImageIcon oImg2=new ImageIcon("C:\\java programs\\images\\img.jpg");
		//L.setIcon(oImg2);
		
	}
}