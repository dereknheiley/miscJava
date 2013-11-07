// Derek Neil
// Lab 4 Ex1b

import javax.swing.JApplet;
import java.awt.*;
public class RedYellowLight extends JApplet{
  public void paint(Graphics g) { 
    g.setColor(Color.black);
    g.fillRect(100,100,100,200);
    g.setColor(Color.red);
    g.fillOval(125,125,50,50);
	 g.setColor(Color.yellow);
    g.fillOval(125,215,50,50);
  }
}





