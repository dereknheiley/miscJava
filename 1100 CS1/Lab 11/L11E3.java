// Derek Neil
// Lab 10, Excersize 3

public class L11E3 {
	
	public static void main(String [] args){
		Bot.setSpeed(15);
		Bot.smallDot();
		for (int i =1; i<=5; i+=1){
			drawSpiral(8, 1, 1, 360);
			Bot.rt(36);
		}
	}
	
	public static void drawSpiral(int length, double angle, double increment, int numberOfSides) {
   	double turn = angle;
   	for (int j = 1; j <= numberOfSides; j++) {
			Bot.fd(length);
			Bot.rt(turn);
			turn += increment;
		}
	}

}