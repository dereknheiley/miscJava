import javax.swing.*;
public class Frame3 extends JFrame{
	
	//create panel
	private JPanel panel = new JPanel();
	private JButton start = new JButton("Start");
	private JButton stop = new JButton("Stop");
	
	//constructor
	public Frame3(){
		
		//add objects to panel
		start.setBackground(Color.green); //color button background
		start.setOpaque(true);
		start.setBackground(Color.RED); //color button background
		start.setOpaque(true);
		panel.setBackground(Color.YELLOW);
		
		for(int i=1; i<=9; i++){
			panel.add(new JButton(""+i));
		}
		panel.add(new JButton(""+0));
		panel.add(stop);
		panel.add(start);
		
		//add panel to JFrame
		add(panel);
		
		setTitle("Window with components");
		setSize(550,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Frame3();

	}

}
