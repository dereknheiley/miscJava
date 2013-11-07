import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe extends JFrame implements ActionListener{
	
	private JPanel panel1 = new JPanel(new GridLayout(3,3));
	
	//constructor
	public TicTacToe(){

	}
	
	public void actionPerformed(ActionEvent e){

	}
	
	public static void main(String[] args) {
		new TicTacToe();

	}

}
