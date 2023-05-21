package travelpack;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Frame2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtApo;
	private JTextField txtEws;
	private boolean flag=false;
	

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Frame2 frame = new Frame2();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
	//}

	/**
	 * Create the frame.
	 */
	public Frame2(UserOptions uo) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 462, 543);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Flight");
		lblNewLabel.setFont(new Font("MS PGothic", Font.BOLD, 28));
		lblNewLabel.setBounds(193, 30, 73, 39);
		contentPane.add(lblNewLabel);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(205, 250, 1, 1);
		contentPane.add(layeredPane);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.BLACK);
		panel.setBounds(103, 67, 253, 177);
		panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		contentPane.add(panel);
		panel.setLayout(null);
		
		Label label = new Label("Kathgoria Kampinas");
		label.setForeground(Color.RED);
		label.setFont(new Font("Poppins", Font.PLAIN, 15));
		label.setBounds(56, 10, 154, 22);
		panel.add(label);
		
		Label label_2 = new Label("Aposkeues");
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("Poppins", Font.PLAIN, 13));
		label_2.setBounds(84, 64, 72, 22);
		panel.add(label_2);
		
		ButtonGroup group = new ButtonGroup();
		
		JRadioButton radioYes = new JRadioButton("Yes");
		radioYes.setFont(new Font("Poppins", Font.PLAIN, 12));
		radioYes.setBounds(61, 92, 50, 22);
		panel.add(radioYes);
		
		JRadioButton radioNo = new JRadioButton("No");
		radioNo.setFont(new Font("Poppins", Font.PLAIN, 12));
		radioNo.setBounds(143, 92, 50, 22);
		panel.add(radioNo);
		
		group.add(radioNo);
		group.add(radioYes);
		
		Label label_2_1 = new Label("Wra Anaxwrhshs");
		label_2_1.setForeground(Color.RED);
		label_2_1.setFont(new Font("Poppins", Font.PLAIN, 13));
		label_2_1.setBounds(71, 120, 105, 22);
		panel.add(label_2_1);
		
		txtApo = new JTextField("Apo");
		txtApo.setHorizontalAlignment(SwingConstants.CENTER);
		txtApo.setFont(new Font("Poppins", Font.PLAIN, 13));
		txtApo.setColumns(10);
		txtApo.setBounds(53, 148, 35, 18);
		panel.add(txtApo);
		
		txtEws = new JTextField("Ews");
		txtEws.setHorizontalAlignment(SwingConstants.CENTER);
		txtEws.setFont(new Font("Poppins", Font.PLAIN, 13));
		txtEws.setColumns(10);
		txtEws.setBounds(143, 148, 35, 18);
		panel.add(txtEws);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(66, 38, 112, 22);
		comboBox.addItem("A Class");
		comboBox.addItem("B Class");
		comboBox.addItem("C Class");
		panel.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.BLACK);
		panel_1.setBounds(103, 279, 253, 171);
		panel_1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		Label label_1 = new Label("Tupos Dwmatiou");
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Poppins", Font.PLAIN, 13));
		label_1.setBounds(62, 10, 133, 22);
		panel_1.add(label_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(60, 90, 30, 20);
		panel_1.add(spinner);
		
		JComboBox cb = new JComboBox();
		cb.setBounds(60, 140, 112, 22);
	;
		JButton numSub = new JButton("Submit");
		numSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cb.removeAllItems();
				int val = (Integer)spinner.getValue();
				if(val >0) 
					cb.addItem("Monoklino");
				
				if(val > 1)
					cb.addItem("Diklino");
				
				if(val > 2)
					cb.addItem("Triklino");
				
				if(val > 3)
					cb.addItem("Tetraklino");
				
				
			}
			}
			);
		panel_1.add(numSub);
		numSub.setBounds(100, 90, 80, 25);
		
		
		Label label_2_1_1 = new Label("Arithmos Atomwn");
		label_2_1_1.setFont(new Font("Poppins", Font.PLAIN, 13));
		label_2_1_1.setForeground(Color.RED);
		label_2_1_1.setBounds(60, 64, 105, 22);
		panel_1.add(label_2_1_1);
		
		Label label_2_1_1_1 = new Label("Epilogh Dwmatiou");
		label_2_1_1_1.setForeground(Color.RED);
		label_2_1_1_1.setFont(new Font("Poppins", Font.PLAIN, 13));
		label_2_1_1_1.setBounds(62, 110, 133, 22);
		panel_1.add(label_2_1_1_1);
		
		
		
		
		
		panel_1.add(cb);
		
//		JCheckBox chckbxNewCheckBox = new JCheckBox("Monoklino");
//		chckbxNewCheckBox.setBounds(12, 120, 90, 23);
//		panel_1.add(chckbxNewCheckBox);
//		
//		JCheckBox chckbxDiklino = new JCheckBox("Diklino");
//		chckbxDiklino.setBounds(12, 146, 90, 23);
//		panel_1.add(chckbxDiklino);
//		
//		JCheckBox chckbxTriklino = new JCheckBox("Triklino");
//		chckbxTriklino.setBounds(156, 120, 90, 23);
//		panel_1.add(chckbxTriklino);
//		
//		JCheckBox chckbxTetraklino = new JCheckBox("Tetraklino");
//		chckbxTetraklino.setBounds(156, 146, 90, 23);
//		panel_1.add(chckbxTetraklino);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(62, 38, 112, 22);
		comboBox_1.addItem("Simple");
		comboBox_1.addItem("Suite");
		panel_1.add(comboBox_1);
		
		JLabel lblHotel = new JLabel("Hotel");
		lblHotel.setFont(new Font("MS PGothic", Font.BOLD, 28));
		lblHotel.setBounds(193, 250, 73, 29);
		contentPane.add(lblHotel);
		
		JButton btnEpomeno = new JButton("Epomeno");
		btnEpomeno.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		btnEpomeno.setBackground(Color.RED);
		btnEpomeno.setBounds(70, 456, 309, 40);
		btnEpomeno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uo.setFlightType(comboBox.getItemAt(comboBox.getSelectedIndex()));
				if(radioYes.isSelected())
					uo.setBaggage(true);
				uo.setTime(txtApo.getText()+ "," + txtEws.getText());
				uo.setRoomType(comboBox_1.getItemAt(comboBox_1.getSelectedIndex()));
				uo.setPplNum((Integer)spinner.getValue());
				uo.setRoomCapacity((String)cb.getItemAt(cb.getSelectedIndex()));
				
				
				Frame3 gui3=new Frame3(PacketList.createPacketList(uo));
				dispose();
				gui3.setVisible(true);
			}
		});
		contentPane.add(btnEpomeno);
	}
}
