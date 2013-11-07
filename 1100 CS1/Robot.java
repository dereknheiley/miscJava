/* 
   Version 1.5 has methods: setHouseSize(int, int), clear() and 
   smallDot() for sharpening the robot point and normalDot() for resetting
   the point. 
   May, 2006
*/
import java.awt.image.*;   
import java.awt.*;

import java.awt.event.*;
import javax.swing.*;
public class Robot {

  private static int x = 640, y = 480;
  private static Graphics g;
  private static Graphics bg;
  private static Image buffered_image;
  private int XSTART, YSTART, DELAY = 200, DIRSTART = 0, SIZE = 4;
  private double xpos, xposnew, ypos, yposnew, dir;
  private Color colorold, colornew, colorRobot;
  private boolean robothidden = false;
  public static int robotcount = 0;
  private static boolean houseExists = false;
  private static RobotHouse rh;
 static final int RED = 1;
 static final int GREEN = 2;
   static final int BLUE = 3;
   static final int YELLOW = 4;
  static final int BLACK = 5;
  static final int WHITE = 6;
 class RobotHouse extends JFrame {
  private RobotHouse() {
    setTitle("Robots Live Here: Version 1.4");
    setSize(x,y);
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  }
  private void init(){
    this.show();
    g = getGraphics();
    buffered_image = createImage(x,y);
    bg = buffered_image.getGraphics();
 }
//  public void paint(Graphics g) {
//    g.drawImage(buffered_image,0,0,null);
//  }
  private void clear() {
    buffered_image = createImage(x,y);
    bg = buffered_image.getGraphics();     
    super.paint(g);
  }
  private Image bufferedImage;
}

  public Robot() {
    this(Color.blue, 300 + robotcount * 20, 200);
  }
  public Robot(int x, int y) {
    this(Color.blue,x,y);
  }
  public Robot(Color c) {
    this(c,300 + robotcount * 20,200);
  }
  public Robot(Color c, int x, int y) {
    XSTART = x; YSTART = y; DIRSTART = 0; //nr++;
    DELAY = 300;
    xpos = XSTART; xposnew = XSTART; ypos = YSTART; yposnew = YSTART; dir = DIRSTART;
    colorRobot = colorold = colornew = c;
    if (!houseExists) {
      rh = new RobotHouse();
 rh.init();
      houseExists = true;
    }
    show();
    robotcount++;
  }
  private void delay() {
    try {
      Thread.sleep(DELAY);
    } catch (Exception e){}
  }

  public Robot home(){
    xpos = yposnew = XSTART; ypos = yposnew = YSTART;
    dir = DIRSTART; draw(); return this;}
  private Robot draw(){
    if (!robothidden){
      g.setColor(colorRobot);
      g.fillOval((int)xposnew - SIZE / 2, (int)yposnew - SIZE / 2, SIZE, SIZE);
      g.setColor(colorold);
      bg.setColor(colorRobot);
      bg.fillOval((int)xposnew - SIZE / 2, (int)yposnew - SIZE / 2, SIZE, SIZE);
      bg.setColor(colorold);
    }
    return this;
  }
  public Robot hide(){robothidden = true; return this;}
  public Robot show(){
    fd(0); //  Seems to need this cludge.
    robothidden = false;
    draw(); setc(colorold); return this;
  }
  private static Color cCode(int c) {
    switch (c) {
      case RED: return Color.RED;
      case BLUE: return Color.BLUE;
      case GREEN: return Color.GREEN;
      case YELLOW: return Color.YELLOW;
      case WHITE: return Color.WHITE;
      default: return Color.BLACK;
    }
  }
  private boolean draw = true;
  public void smallDot() {draw = false;} 
  public void normalDot() {draw = true;}
  public Robot setc(Color c){colorold = c; colornew = c; return this;}
  public Robot setcr(Color c){colorRobot = c; return this;}
  public Robot setrc(Color c){colorRobot = c; return this;}
  public Robot setc(int c){colorold = cCode(c); colornew = cCode(c); return this;}
  public Robot setcr(int c){colorRobot = cCode(c); return this;}
  public Robot setrc(int c){colorRobot = cCode(c); return this;}

  public Robot fd(double dist){
    g.setColor(colorold);
    xpos = xposnew; ypos = yposnew;
    xposnew = xpos + dist * Math.sin(dir);
    yposnew = ypos - dist * Math.cos(dir);
    if (!robothidden) g.drawLine((int)xpos, (int)ypos, (int)xposnew, (int)yposnew);
    if (!robothidden) bg.drawLine((int)xpos, (int)ypos, (int)xposnew, (int)yposnew);
    if (draw)draw();
 delay();
 return this;
  }
  public Robot rt(double angle) {dir += angle * Math.PI / 180; return this;}
  public Robot lt(double a){rt(-a); return this;}
  public Robot setSpeed(int d) {DELAY = 200 / d; return this;}
 
  public Robot setDelay(int d) {DELAY = d; return this;};
  public Graphics getGraphics(){return g;}
  public Robot setHouseSize(int x, int y) {
    rh.setSize(x,y); return this;
  }
  public Robot clear() {rh.clear(); return this;}
 
}
class Bot {
  private static Robot r = new Robot(Color.blue, 300, 200);

  public static void fd(double dist) {
    r.fd(dist);
  }
  public static void rt(double dist) {
    r.rt(dist);
  }
 static final int RED = 1;
 static final int GREEN = 2;
   static final int BLUE = 3;
   static final int YELLOW = 4;
  static final int BLACK = 5;
  static final int WHITE = 6;
public static void show(){r.show();}
public static void hide(){r.hide();}
public static void setc(Color x){r.setc(x);}
public static void setcr(Color c){r.setcr(c);}
public static void setc(int x){r.setc(x);}
public static void setcr(int c){r.setcr(c);}
public static void setSpeed(int x){r.setSpeed(x);}
public static void smallDot(){r.smallDot();}
}

class BotTester {
  public static void main(String a[]) {
    Bot.setSpeed(500);
    Bot.setcr(Bot.GREEN);
    Bot.fd(100);
  }



}
class RobotTester {
  public static void main(String a[]) {
    Robot r1 = new Robot(Color.blue);
    r1.fd(100); r1.rt(90);
    r1.fd(10); r1.rt(90);
    r1.fd(100); r1.rt(90);
    r1.fd(10); r1.rt(90);
    Robot r2 = new Robot(Color.red);
    r2.fd(100); r2.rt(90);
    r2.fd(10); r2.rt(90);
    r2.fd(100); r2.rt(90);
    r2.fd(10); r2.rt(90);
	 double angle = 1;
	 r2.setDelay(1);
	 r2.smallDot();
	 for(int i = 0; i <= 720; i++) {
      angle += 0.05;
	   r2.fd(5); r2.rt(angle);
	 }
	 //System.exit(0);
  }
}