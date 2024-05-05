// Program to create an applet.

import java.applet.*;
import java.awt.*;
public class BasicApplet extends Applet
{
  public void init() 
  {
    setBackground(Color.white);
    setLayout(new FlowLayout(FlowLayout.CENTER));
  }
  public void paint(Graphics g) 
  {
    g.drawString("Hello World",100,200);
  }
}