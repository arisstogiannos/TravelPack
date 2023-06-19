package travelpack;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CheckPayment {
	private static String errmsg;
	// Ελεγχος στοιχείων πληρωμης και εμφανιση μυνηματος σε περιπτωση μη ορθης
	// καταχωρισης

	public static boolean checkPayment(String cn, String cvv, String name, String date) {
		boolean b1, b2, b3, b4;
		errmsg = "Please enter the following fields:\n";
		b1 = checkCardNumber(cn);
		b2 = checkCVV(cvv);
		b3 = checkName(name);
		b4 = checkDate(date);
		if (!(b1 && b2 && b3 && b4))
			JOptionPane.showMessageDialog(null, errmsg);

		return b1 && b2 && b3 && b4;
	}

	public static boolean checkCardNumber(String s) {
		if (s.length() == 16 && !s.equals("Card Number") && !s.isBlank())
			return true;
		else {
			errmsg += "Card Number (16 numbers)\n";
			return false;

		}
	}

	public static boolean checkCVV(String s) {
		if (s.length() == 3 && !s.equals("CVV") && !s.isBlank()) {
			return true;
		} else {
			errmsg += "CVV (3 numbers)\n";
			return false;
		}
	}

	public static boolean checkName(String s) {
		if (!s.equals("Name") && !s.isBlank()) {
			return true;
		} else {
			errmsg += "Name \n";
			return false;
		}
	}

	public static boolean checkDate(String s) {
		if (!s.equals("Exp. Date") && !s.isBlank() && s.length() == 5 && s.charAt(2) == '/') {
			return true;
		} else {
			errmsg += "Exp. Date (dd/mm)\n";
			return false;
		}
	}
}