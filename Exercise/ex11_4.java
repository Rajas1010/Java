import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class ex11_4 extends Applet
{
        public static void main(String[] args)
       {
        Frame ForegroundBackgroundColor = new Frame("Change Background and Foreground Color of Applet");
        ForegroundBackgroundColor.setSize(420, 180);
        Applet ColorApplet = new ColorApplet();
        ForegroundBackgroundColor.add(ColorApplet);
                ForegroundBackgroundColor.setVisible(true);
ForegroundBackgroundColor.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {System.exit(0); }
     });
     }

  public void paint(Graphics g)
{
    Color c = getForeground();
            setBackground(Color.blue);
setForeground(Color.yellow);
          g.drawString("Foreground color set to yellow", 100, 50);
   g.drawString("Change Background and Foreground Color of Applet", 50, 100);
  }
}
 /* <applet code = "ColorApplet" width = 400 height = 200> </applet> */
