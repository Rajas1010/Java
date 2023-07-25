import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.plaf.metal.*;
import javax.swing.text.*;
class ex12_3 extends JFrame implements ActionListener,ItemListener {
int value;

        JTextArea t;

        JFrame f;


JCheckBox c1=new JCheckBox("Student");
JCheckBox c2=new JCheckBox("Employee");


        Label l1=new Label("1");
Label l2=new Label("2");
                Label l3=new Label("3");
                Label l4=new Label("");

        TextField t1=new TextField();
        TextField t2=new TextField();
        Button b1=new Button("yes");
Button b2=new Button("no");
Button b3=new Button("disabled");
Button b4=new Button("enter");
        ex12_3()
        {

                f = new JFrame("DIALOG BOX");

                try {

                }
                catch (Exception e) {
                }
                l1.setBounds(152,90,75,50);
                l2.setBounds(228,90,75,50);
                l3.setBounds(304,90,75,50);
                l4.setBounds(6,12,2,1);

                b1.setBounds(152,150,75,50);
                b2.setBounds(228,150,75,50);
                b3.setBounds(304,150,75,50);

                c1.setBounds(228,250,100,100);
                c2.setBounds(400,250,100,100);

                t1.setBounds(228,350,70,30);
                t2.setBounds(350,350,70,30);
                b4.setBounds(350,250,70,50);
                f.add(l1);f.add(l2);f.add(l3);
                f.add(t2);f.add(t1);
                f.add(b1);f.add(b2);
                f.add(b3);f.add(c1);f.add(c2);f.add(l4);
                f.add(b4);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
c1.addItemListener(this);
c2.addItemListener(this);

                f.setSize(1200,1200);
                f.show();
        }
        public void actionPerformed(ActionEvent e)
        {
                String s = e.getActionCommand();

                if (e.getSource()==b1) {
                JOptionPane.showMessageDialog(this,"you have pressed yes!");
                }
                else if (e.getSource()==b2) {
                        JOptionPane.showMessageDialog(this,"you have pressed no!");
                }

                else if (e.getSource()==b3) {
                        JOptionPane.showMessageDialog(this,"you have pressed disabled!");
                }
                else if (e.getSource()==b4){

                JOptionPane.showMessageDialog(this,"username:  "+t1.getText()+"\npassword:  "+t2.getText());
                }
        }
        public void itemStateChanged(ItemEvent e)
        {
                if(c1.isSelected())
                {
                        JOptionPane.showMessageDialog(this,"You are a Student");
                }
                else if(c2.isSelected())
                {
                        JOptionPane.showMessageDialog(this,"You are a Employee");
        }
        }
        public static void main(String args[])
        {
                ex12_3 e = new ex12_3();
        }
}
