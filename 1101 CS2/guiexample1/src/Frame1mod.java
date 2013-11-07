import javax.swing.*;
public class Frame1mod extends JFrame{

	public Frame1mod(){
		setTitle("My first Window");
		setSize(400,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Frame1mod();

	}

}
