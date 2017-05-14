import javax.swing.JOptionPane;

public class Fibonacci {
	
	public static void main(String[] args) {
		int number1 = 0;
		int number2 = 1;
		int a;
		int x = 0;
		String answer = JOptionPane.showInputDialog("How many numbers of the fibonacci code would you like to see?"); 
		a = Integer.parseInt(answer);
		for (x = 0; x < a; x++){
		JOptionPane.showMessageDialog(null, number1 + ", " + number2);
		number1 = number1 + number2;
		number2 = number2 + number1;
		}
	}

}
