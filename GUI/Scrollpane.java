import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
public class Scrollpane extends JFrame
{
	JScrollPane scrollpane;
	public Scrollpane()
	{
		super("JScrollPane Demonstration");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		String categories[] = {"Geeks", "Language", "Java",
							"Sudo Placement", "Python",
							"CS Subject", "Operating System",
							"Data Structure", "Algorithm",
							"PHP language", "JAVASCRIPT",
							"C Sharp" };

		JList list = new JList(categories);
		scrollpane = new JScrollPane(list);
		getContentPane().add(scrollpane, BorderLayout.CENTER);
	}

	public static void main(String args[])
	{
		Scrollpane o = new Scrollpane();
		o.setVisible(true);
	}
}
