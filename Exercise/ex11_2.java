import java.awt.*;
import java.awt.event.*;

public class ex11_2
{

Frame f=new Frame("");
Button b1=new Button("A");
Button b2=new Button("B");
Button b3=new Button("C");
Button b4=new Button("D");
Button b5=new Button("E");
Button b6=new Button("F");
Button b7=new Button("G");
Button b8=new Button("H");
Button b9=new Button("I");
Button b10=new Button("J");
Button b11=new Button("K");
Button b12=new Button("L");
Button b13=new Button("M");
Button b14=new Button("N");
Button b15=new Button("O");
Button b16=new Button("P");
ex11_2()
{

b1.setBounds(0,18,325,50);
b2.setBounds(0,58,108,150);
b3.setBounds(109,58,108,150);
b4.setBounds(218,58,108,150);
b5.setBounds(0,198,325,50);
b6.setBounds(0,248,200,50);
b7.setBounds(201,248,200,50);
b8.setBounds(0,298,200,50);


b9.setBounds(201,298,200,50);
b10.setBounds(0,348,200,50);
b11.setBounds(201,348,200,50);
b12.setBounds(326,18,75,50);
b13.setBounds(326,58,75,50);
b14.setBounds(326,98,75,50);
b15.setBounds(326,148,75,50);
b16.setBounds(326,198,75,50);


f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(b5);
f.add(b6);
f.add(b7);
f.add(b8);

f.add(b9);
f.add(b10);
f.add(b11);
f.add(b12);
f.add(b13);
f.add(b14);
f.add(b15);
f.add(b16);


f.setLayout(null);
f.setVisible(true);
f.setSize(400,410);
}
public static void main(String args[])
{
new ex11_2();
}
}