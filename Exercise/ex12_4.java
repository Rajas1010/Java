import java.awt.*;
import java.awt.event.*;

public class ex12_4 extends Frame implements KeyListener {


        Frame f;
        Label l1=new Label("Celcius");
        Label l2=new Label("Fahrenheit");
        TextField t1=new TextField("0");
        TextField t2 = new TextField("0");
                TextField t3 = new TextField();

        ex12_4()
        {

                f = new Frame("TEMPERATURE CONVERTER");

                try {

                }
                catch (Exception e) {
                }
                l1.setBounds(10,100,75,50);
                l2.setBounds(10,151,75,50);
                t1.setBounds(86,100,75,50);
                t2.setBounds(86,151,75,50);
                t3.setBounds(75,120,22,22);


                f.add(l1);f.add(l2);f.add(t1);f.add(t2);
                f.add(t3);


t1.addKeyListener(this);
t2.addKeyListener(this);


                f.setSize(600,600);
                f.show();
    }

    public void keyPressed(KeyEvent e) {}

    public void keyReleased (KeyEvent e) {
float n1=Float.parseFloat(t1.getText());
n1=(n1*(9.00f/5.00f))+32.00f;

                        t2.setText(String.valueOf(n1));



    }
    public void keyTyped(KeyEvent e) {


        }
    public static void main(String[] args) {
        new ex12_4();
    }
}