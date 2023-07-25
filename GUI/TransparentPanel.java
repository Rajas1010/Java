import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Color;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class TransparentPanel extends JFrame
{
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() {
				try {
					TransparentPanel frame = new TransparentPanel();
			
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public TransparentPanel() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 465);
		setBackground(new Color(1.0f, 1.0f, 1.0f, 0.5f));
		
		JPanel p1 = new JPanel();
		p1.setBorder(new LineBorder(Color.GREEN, 2));
		setContentPane(p1);
		p1.setLayout(null);
		p1.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));

		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setBounds(10, 11, 650, 56);
		p1.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("CLOSE");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
		btnNewButton.setBounds(279, 11, 89, 34);
		panel.add(btnNewButton);
	}

}