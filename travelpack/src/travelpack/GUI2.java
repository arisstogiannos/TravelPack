package travelpack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;

public class GUI2 extends JFrame{
	private JPanel panel = new JPanel();
	
	private JTextField baggageTextField;
	private JTextField flightCategoryTextfield;
	private JTextField DianuktereuseisTextField;
	private JTextField MhnasTextField;
	
	private JTextField ApoTextField=new JTextField("Apo");
	private JTextField EwsTextField=new JTextField("Ews");
	
	private DefaultListModel lista = new DefaultListModel<>();
	private JList list;
	
	
	private JLabel l = new JLabel();
	private JCheckBox checkBox;
	private JButton EpomenoButton;
	
	UserOptions uo;
	
public GUI2(UserOptions u) {
		uo = u;
		l.setText("Pthsh");
		l.setText("Kathgoria Kampinas");
		
		lista.addElement("AClass");
		lista.addElement("BClass");
		
		JList list = new JList<>(lista);
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
	    list.setLayoutOrientation(JList.VERTICAL);
	    
	    
		
		l.setText("Aposekeues");
		checkBox = new JCheckBox("Yes");
		checkBox = new JCheckBox("No");
		
		l.setText("Wra Anaxwrhshs");
		panel.add(ApoTextField);
		panel.add(EwsTextField);
		
		l.setText("Ksenodoxeio");
		l.setText("Tupos Dwmatiou");
		
		
		
		this.setContentPane(panel);
		
		ButtonListener listener = new ButtonListener();
		
		EpomenoButton.addActionListener(listener);
		
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
			uo.setDays(Integer.parseInt(DianuktereuseisTextField.getText()));
			uo.setMonth(MhnasTextField.getText());
		}
	}
	
	
}
