import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Frame7a extends JFrame implements ActionListener{
	
	private JPanel panel = new JPanel();
	private JButton sunny = new JButton("Sunny");
	private JButton cloudy = new JButton("Cloudy");
	private JButton snow = new JButton("Snow");
	private JLabel response1 = new JLabel("It's a beautiful day");
	private JLabel response2 = new JLabel("Cloudy with a chance of showers");
	private JLabel response3 = new JLabel("Heavey snowfall warning");
	private JLabel response4 = new JLabel("Tornado ALERT!");
	private ImageIcon tornado = new ImageIcon("Tornado.jpg");
	private JButton tornadoimg = new JButton(tornado);
	
	//constructor
	public Frame7a(){
		
		//add objects to panel
		panel.add(sunny);
		panel.add(cloudy);
		panel.add(snow);
		panel.add(tornadoimg);
		panel.add(response1);
		panel.add(response2);
		panel.add(response3);
		panel.add(response4);
		
		//control responses
		response1.setVisible(false);
		response2.setVisible(false);
		response3.setVisible(false);
		response4.setVisible(false);
		sunny.addActionListener(this);
		cloudy.addActionListener(this);
		snow.addActionListener(this);
		tornadoimg.addActionListener(this);
		//tornadoimg.setActionCommand("Tornado");
		
		panel.setBackground(Color.GREEN);
		
		//add panel to JFrame
		add(panel);
		
		setTitle("How was it today?");
		setSize(400,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("Sunny")){
			response1.setVisible(true);
			response2.setVisible(false);
			response3.setVisible(false);
			response4.setVisible(false);
			panel.setBackground(Color.YELLOW);
		}
		else if(e.getActionCommand().equals("Cloudy")){
			response1.setVisible(false);
			response2.setVisible(true);
			response3.setVisible(false);
			response4.setVisible(false);
			panel.setBackground(Color.gray);
		}
		else if(e.getSource() == snow){
			response1.setVisible(false);
			response2.setVisible(false);
			response3.setVisible(true);
			response4.setVisible(false);
			panel.setBackground(Color.white);
		}
		else if(e.getSource() == tornadoimg){
			response1.setVisible(false);
			response2.setVisible(false);
			response3.setVisible(false);
			response4.setVisible(true);
			panel.setBackground(Color.BLUE);
		}
	}
	
	public static void main(String[] args) {
		new Frame7a();

	}

}
