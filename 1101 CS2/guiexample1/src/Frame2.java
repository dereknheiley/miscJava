import javax.swing.*;
public class Frame2 extends JFrame{
	
	//create panel
	private JPanel panel = new JPanel();
	
//create & populate object attributes
	private JLabel messageLabel  = new JLabel("Enter the temperature");
	private JTextField tempTextField  = new JTextField(10);
	private JButton calcButton  = new JButton("Convert");
	
	//constructor
	public Frame2(){
		
		//define JFrame
		setTitle("Temperature Converter");
		setSize(400,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//add objects to panel
		panel.add(messageLabel);
		panel.add(tempTextField);
		panel.add(calcButton);
		
		//add panel to JFrame
		add(panel);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Frame2 myWindow = new Frame2();

	}

}
