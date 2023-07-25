import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.plaf.metal.*;
import javax.swing.text.*;
class ex12_2 extends JFrame implements ActionListener {
int value;

        JTextArea t;

        JFrame f;
        Label l1=new Label("COUNTER");

        TextField t1=new TextField();
        Button b1=new Button("count_up");
Button b2=new Button("count_down");
Button b3=new Button("Reset");
        ex12_2()
        {

                f = new JFrame();

                try {

                }
                catch (Exception e) {
                }
                l1.setBounds(0,100,75,50);
                t1.setBounds(76,100,75,50);
                b1.setBounds(152,100,75,50);
                b2.setBounds(228,100,75,50);
                b3.setBounds(304,100,75,50);
                f.add(l1);f.add(t1);f.add(b1);f.add(b2);
                f.add(b3);


b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);

                f.setSize(600,200);
                f.show();
        }
        public void actionPerformed(ActionEvent e)
        {
                String s = e.getActionCommand();

                if (e.getSource()==b1) {
                value++;
                t1.setText(String.valueOf(value));
                }
                else if (e.getSource()==b2) {
                        value--;
                        t1.setText(String.valueOf(value));
                }

                else if (e.getSource()==b3) {
                        t1.setText("");
                }

        }
        public static void main(String args[])
        {
                ex12_2 e = new ex12_2();
        }
}
