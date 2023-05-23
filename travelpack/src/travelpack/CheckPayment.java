package travelpack;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CheckPayment {


	public static boolean checkCardNumber(String num) {
		if(num.length()==16 )
			return true;
		else {
			JOptionPane.showMessageDialog(null, "Card number should be 16 numbers long");
			return false;
		
		}
	}
}