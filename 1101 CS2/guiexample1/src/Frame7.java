import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Frame7 extends JFrame implements ActionListener{
	
	private JPanel panel = new JPanel();
	private JButton sunny = new JButton("Sunny");
	private JButton cloudy = new JButton("Cloudy");
	private JLabel response1 = new JLabel("It's a beautiful day");
	private JLabel response2 = new JLabel("Cloudy with a chance of showers");
	
	//constructor
	public Frame7(){
		
		//add objects to panel
		panel.add(sunny);
		panel.add(cloudy);
		panel.add(response1);
		panel.add(response2);
		
		//control responses
		response1.setVisible(false);
		response2.setVisible(false);
		sunny.addActionListener(this);
		cloudy.addActionListener(this);
		
		//add panel to JFrame
		add(panel);
		
		setTitle("How was it today?");
		setSize(300,250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("Sunny")){
			response1.setVisible(true);
			response2.setVisible(false);
			panel.setBackground(Color.YELLOW);
		}
		else if(e.getActionCommand().equals("Cloudy")){
			response1.setVisible(false);
			response2.setVisible(true);
			panel.setBackground(Color.gray);
		}
	}
	
	public static void main(String[] args) {
		new Frame7();

	}

}
