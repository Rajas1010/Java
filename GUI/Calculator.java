import java.awt.*;
import java.awt.event.*;
 
class Calculator implements ActionListener
{

Frame f=new Frame("CALCULATOR");
Label l1=new Label("enter the value of a");
Label l2=new Label("enter the value of b");
Label l3=new Label("answer:");
TextField t1=new TextField();
TextField t2=new TextField();
TextField t3=new TextField();
Button b1=new Button("Add");
Button b2=new Button("Sub");
Button b3=new Button("Mul");
Button b4=new Button("Div");
Button b5=new Button("modulo");
Button b6=new Button("square");
Button b7=new Button("exit");
Calculator()
{

l1.setBounds(50,100,200,20);
l2.setBounds(50,140,200,20);
l3.setBounds(50,180,100,20);
t1.setBounds(300,100,100,20);
t2.setBounds(300,140,100,20);
t3.setBounds(300,180,100,20);
b1.setBounds(50,250,50,20);
b2.setBounds(110,250,50,20);
b3.setBounds(170,250,50,20);
b4.setBounds(230,250,50,20);
b5.setBounds(290,250,50,20);
b6.setBounds(350,250,50,20);
b7.setBounds(410,250,50,20);

f.add(l1);
f.add(l2);
f.add(l3);
f.add(t1);
f.add(t2);
f.add(t3);
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(b5);
f.add(b6);
f.add(b7);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);

f.addWindowListener(new WindowAdapter()
		{
			public void WindowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
f.setLayout(null);
f.setVisible(true);
f.setSize(600,600);
}
public void actionPerformed(ActionEvent e)
{
int n1=Integer.parseInt(t1.getText());
int n2=Integer.parseInt(t2.getText());
if(e.getSource()==b1)
{
t3.setText(String.valueOf(n1+n2));
}
if(e.getSource()==b2)
{
t3.setText(String.valueOf(n1-n2));
}
if(e.getSource()==b3)
{
t3.setText(String.valueOf(n1*n2));
}
if(e.getSource()==b4)
{
t3.setText(String.valueOf(n1/n2));
}
if(e.getSource()==b5)
{
t3.setText(String.valueOf(n1%n2));
}
if(e.getSource()==b6)
{
t3.setText(String.valueOf(n1*n1));
}
if(e.getSource()==b7)
{
System.exit(0);
}
}
public static void main(String...s)
{
new Calculator();
}
}