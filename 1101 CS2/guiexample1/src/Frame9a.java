import java.awt.*;
import java.net.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
public class Frame9a extends JFrame implements ActionListener{
	
	private JPanel panel = new JPanel();
	private JButton sunny = new JButton("Sunny");
	private JButton cloudy = new JButton("Cloudy");
	private JButton snow = new JButton("Snow");
	private JLabel response1 = new JLabel("It's a beautiful day");
	private JLabel response2 = new JLabel("Cloudy with a chance of showers");
	private JLabel response3 = new JLabel("Heavey snowfall warning");
	private JLabel response4 = new JLabel("Tornado ALERT!");
	//private ImageIon tornado = new ImageIcon("Tornado.jpg");
	private ImageIcon[] tornado = new ImageIcon[1];
	private JButton[] tor = new JButton[2];
	//private JButton tornadoimg = new JButton(tornado);
	private JButton reset = new JButton("Reset");
	private AudioClip audio;
	
	private String[] names = {"Tornado"};
	
	//constructor
	public Frame9a(){
		

		
		//control responses
		
		tornado[0] = new ImageIcon(names[0]+".jpg");
		Image image = tornado[0].getImage();
		image = image.getScaledInstance(-1, 100, image.SCALE_SMOOTH);
		tornado[0].setImage(image);
		response1.setVisible(false);
		response2.setVisible(false);
		response3.setVisible(false);
		response4.setVisible(false);
		sunny.addActionListener(this);
		cloudy.addActionListener(this);
		snow.addActionListener(this);
		//tornadoimg.addActionListener(this);
		tor[0] = new JButton(tornado[0]);
		tor[0].setBorderPainted(false);
		tor[0].addActionListener(this);
		reset.addActionListener(this);
		//tornadoimg.setActionCommand("Tornado");
		
		//add objects to panel
		panel.add(sunny);
		panel.add(cloudy);
		panel.add(snow);
		//panel.add(tornadoimg);
		panel.add(tor[0]);
		panel.add(reset);
		panel.add(response1);
		panel.add(response2);
		panel.add(response3);
		panel.add(response4);
		
		panel.setBackground(Color.GREEN);
		
		//add panel to JFrame
		add(panel);
		
		setTitle("How was it today?");
		setSize(400,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	
		try {
			audio = Applet.newAudioClip(new URL("http://new.wavlist.com/soundfx/022/storm-tornado2.wav"));
		}
		catch (MalformedURLException mfe){
			System.out.println("An error occured with the URL");
		}
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("Sunny")){
			response1.setVisible(true);
			response2.setVisible(false);
			response3.setVisible(false);
			response4.setVisible(false);
			audio.stop();
			panel.setBackground(Color.YELLOW);
		}
		else if(e.getActionCommand().equals("Cloudy")){
			response1.setVisible(false);
			response2.setVisible(true);
			response3.setVisible(false);
			response4.setVisible(false);
			audio.stop();
			panel.setBackground(Color.gray);
		}
		else if(e.getSource() == snow){
			response1.setVisible(false);
			response2.setVisible(false);
			response3.setVisible(true);
			response4.setVisible(false);
			audio.stop();
			panel.setBackground(Color.white);
		}
		else if(e.getSource() == tor[0]){
			response1.setVisible(false);
			response2.setVisible(false);
			response3.setVisible(false);
			response4.setVisible(true);
			audio.loop();
			panel.setBackground(Color.BLUE);
		}
		else if(e.getSource() == reset){
			response1.setVisible(false);
			response2.setVisible(false);
			response3.setVisible(false);
			response4.setVisible(false);
			audio.stop();
			panel.setBackground(Color.GREEN);
		}
	}
	
	public static void main(String[] args) {
		new Frame9a();

	}

}
