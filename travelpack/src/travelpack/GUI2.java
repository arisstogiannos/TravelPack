package travelpack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI2 extends JFrame{
	private JPanel panel = new JPanel();
	private JTextField flightCategoryTextfield = new JTextField("Anazhthsh Proorismou");
	private JTextField baggageTextField = new JTextField("Anazhthsh Afethrias");
	private JTextField DianuktereuoeisTextField = new JTextField("Epilogh dianuktereuoewn");
	private JTextField MhnasTextField = new JTextField("Epilogh Mhna");
	
	private JButton AnazhthshButton = new JButton("Anazhthsh");
	UserOptions uo;
public GUI2(UserOptions u) {
		uo = u;
		
		panel.add(flightCategoryTextfield);
		panel.add(baggageTextField);
		panel.add(DianuktereuoeisTextField);
		panel.add(MhnasTextField);
		panel.add(AnazhthshButton);
		
		this.setContentPane(panel);
		
		ButtonListener listener = new ButtonListener();
		
		AnazhthshButton.addActionListener(listener);
		
		this.setVisible(true);
		this.setSize(400, 400);
		this.setTitle("TravelPack");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			
			uo.setDepCity(baggageTextField.getText());
			uo.setDestination(flightCategoryTextfield.getText());
			uo.setDays(Integer.parseInt(DianuktereuoeisTextField.getText()));
			uo.setMonth(MhnasTextField.getText());
		}
	}
}
