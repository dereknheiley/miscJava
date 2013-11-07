import javax.swing.*;
public class Frame1 {

	public Frame1(){
		JFrame window = new JFrame("My first Window");
		window.setSize(400,300);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	
	public static void main(String[] args) {
		Frame1 myWindow = new Frame1();

	}

}
