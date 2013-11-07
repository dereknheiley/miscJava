import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Frame6 extends JFrame implements ActionListener{
	
	private JPanel panel = new JPanel();
	private JButton push = new JButton("Tickle Me");
	private JLabel response = new JLabel("hee hee hee hee");
	
	//constructor
	public Frame6(){
		
		//add objects to panel
		panel.setBackground(Color.BLUE);
		panel.add(push);
		panel.add(response);
		
		//control responses
		response.setVisible(false);
		push.addActionListener(this);
		
		//add panel to JFrame
		add(panel);
		
		setTitle("Ticle Me Elmo - Window");
		setSize(200,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("Tickle Me")){
			response.setVisible(true);
			panel.setBackground(Color.RED);
		}
	}
	
	public static void main(String[] args) {
		new Frame6();

	}

}
