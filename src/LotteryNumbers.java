import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {

	public static void main(String[] args) {
		Random random = new Random();
		int num;
		String message = "";

		JOptionPane.showMessageDialog(null, "Would you like to win the lottery?");

		for (int i = 0; i < 5; i++) {
			num = random.nextInt(49) + 1;
			message = message + " " + Integer.toString(num);

		}
		JOptionPane.showMessageDialog(null, message);

	}

}