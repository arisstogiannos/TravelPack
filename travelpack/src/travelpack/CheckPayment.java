package travelpack;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CheckPayment {
	private static String errmsg;
	
	public static boolean checkPayment(String cn,String cvv, String name, String date) {
		boolean b1,b2,b3,b4;
		errmsg="Parakalw sumpliroste ta parakatw pedia:\n";
		b1=checkCardNumber(cn);
		b2=checkCVV(cvv);
		b3=checkName(name);
		b4=checkDate(date);
		if(!(b1 && b2 && b3 &&b4))
			JOptionPane.showMessageDialog(null, errmsg);
		
		return b1 && b2 && b3 &&b4;
	}


	public static boolean checkCardNumber(String s) {
		if(s.length()==16 && !s.equals("Arithmos Kartas*") && !s.isBlank())
			return true;
		else {
			errmsg+="Arithmos Kartas (16 arithmoi)\n";
			//JOptionPane.showMessageDialog(null, "Card number should be 16 numbers long");
			return false;
		
		}
	}
	
	public static boolean checkCVV(String s) {
		if(s.length()==3 && !s.equals("CVV*") && !s.isBlank()) {
			return true;
		}else {
			errmsg+="CVV (3 arithmoi)\n";
			//JOptionPane.showMessageDialog(null, "CVV should be 3 numbers long");
			return false;
		}
	}
	
	public static boolean checkName(String s) {
		if(!s.equals("Onoma Katoxou*") && !s.isBlank()) {
			return true;
		}else {
			errmsg+="Onoma Katoxou \n";
			//JOptionPane.showMessageDialog(null, "Parakalw sumpliroste onoma katoxou");
			return false;
		}
	}
	
	public static boolean checkDate(String s) {
		if(!s.equals("Hmeromhnia Lhkshs*") && !s.isBlank()) {
			return true;
		}else {
			errmsg+="Hmeromhnia Lhkshs (dd/mm)\n";
			//JOptionPane.showMessageDialog(null, "Parakalw sumpliroste Hmeromhnia lhkshs");
			return false;
		}
	}
}