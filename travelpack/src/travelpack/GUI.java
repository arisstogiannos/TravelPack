 package travelpack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class GUI extends JFrame{
	
	private JPanel panel = new JPanel();
	private JTextField ProorismosTextField = new JTextField("Anazhthsh Proorismou");
	private JTextField AfethriaTextField = new JTextField("Anazhthsh Afethrias");
	private JTextField DianuktereuseisTextField = new JTextField("Epilogh dianuktereusewn");
	private JTextField MhnasTextField = new JTextField("Epilogh Mhna");
	
	private JButton AnazhthshButton = new JButton("Anazhthsh");
	UserOptions uo = new UserOptions();
	public GUI() {
		
		panel.add(ProorismosTextField);
		panel.add(AfethriaTextField);
		panel.add(DianuktereuseisTextField);
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
			uo.setDepCity(AfethriaTextField.getText());
			uo.setDestination(ProorismosTextField.getText());
			uo.setDays(Integer.parseInt(DianuktereuseisTextField.getText()));
			uo.setMonth(MhnasTextField.getText());
			GUI2 Frame2 =new GUI2(uo);
		}
	}

}
