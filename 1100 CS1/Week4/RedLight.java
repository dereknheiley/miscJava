// Derek Neil
// Lab 4 Ex1

import javax.swing.JApplet;
import java.awt.*;
public class RedLight extends JApplet{
  public void paint(Graphics g) { 
    g.setColor(Color.black);
    g.fillRect(100,100,200,200);
    g.setColor(Color.green);
    g.fillOval(125,125,75,75);
  }
}



