package travelpack;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Frame2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtApo;
	private JTextField txtEws;
	
	public Frame2(UserOptions uo) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 462, 543);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Flight");
		lblNewLabel.setFont(new Font("MS PGothic", Font.BOLD, 28));
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setBounds(193, 30, 73, 39);
		contentPane.add(lblNewLabel);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(205, 250, 1, 1);
		contentPane.add(layeredPane);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.BLACK);
		panel.setBounds(103, 67, 253, 177);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		contentPane.add(panel);
		panel.setLayout(null);
		
		Label label = new Label("Kathgoria Kampinas");
		label.setForeground(Color.DARK_GRAY);
		label.setFont(new Font("Poppins", Font.PLAIN, 15));
		label.setBounds(56, 10, 125, 22);
		panel.add(label);
		
		Label label_2 = new Label("Aposkeues");
		label_2.setForeground(Color.DARK_GRAY);
		label_2.setFont(new Font("Poppins", Font.PLAIN, 15));
		label_2.setBounds(84, 64, 125, 22);
		panel.add(label_2);
		
		ButtonGroup group = new ButtonGroup();
		
		JRadioButton radioYes = new JRadioButton("Yes");
		radioYes.setFont(new Font("Poppins", Font.PLAIN, 12));
		radioYes.setBackground(Color.LIGHT_GRAY);
		radioYes.setBounds(61, 92, 50, 22);
		panel.add(radioYes);
		
		JRadioButton radioNo = new JRadioButton("No",true);
		radioNo.setFont(new Font("Poppins", Font.PLAIN, 12));
		radioNo.setBackground(Color.LIGHT_GRAY);
		radioNo.setBounds(143, 92, 50, 22);
		panel.add(radioNo);
		
		group.add(radioNo);
		group.add(radioYes);
		
		Label label_2_1 = new Label("Wra Anaxwrhshs");
		label_2_1.setForeground(Color.DARK_GRAY);
		label_2_1.setFont(new Font("Poppins", Font.PLAIN, 15));
		label_2_1.setBounds(71, 120, 125, 22);
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
		comboBox.setBackground(Color.DARK_GRAY);
		comboBox.setForeground(Color.LIGHT_GRAY);
		panel.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.BLACK);
		panel_1.setBounds(103, 279, 253, 171);
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		Label label_1 = new Label("Tupos Dwmatiou");
		label_1.setForeground(Color.DARK_GRAY);
		label_1.setFont(new Font("Poppins", Font.PLAIN, 15));
		label_1.setBounds(62, 10, 125, 22);
		panel_1.add(label_1);
		
		JComboBox cb = new JComboBox();
		cb.addItem("Monoklino");
		cb.setForeground(Color.LIGHT_GRAY);
		cb.setBackground(Color.DARK_GRAY);
		cb.setBounds(60, 140, 112, 22);
		
		SpinnerModel value = new SpinnerNumberModel(1, 1, 4, 1);
		JSpinner spinner = new JSpinner(value);
		spinner.setBounds(90, 90, 30, 20);
		spinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
            	cb.removeAllItems();
				int val = (Integer)spinner.getValue();
				
				if(val>0) 
					cb.addItem("Monoklino");

				if(val > 1)
					cb.addItem("Diklino");
				
				if(val > 2)
					cb.addItem("Triklino");
				
				if(val > 3)
					cb.addItem("Tetraklino");            }
        });
		panel_1.add(spinner);
		
		
		Label label_2_1_1 = new Label("Arithmos Atomwn");
		label_2_1_1.setFont(new Font("Poppins", Font.PLAIN, 15));
		label_2_1_1.setForeground(Color.DARK_GRAY);
		label_2_1_1.setBounds(60, 64, 125, 22);
		panel_1.add(label_2_1_1);
		
		Label label_2_1_1_1 = new Label("Epilogh Dwmatiou");
		label_2_1_1_1.setForeground(Color.DARK_GRAY);
		label_2_1_1_1.setFont(new Font("Poppins", Font.PLAIN, 15));
		label_2_1_1_1.setBounds(62, 110, 125, 22);
		panel_1.add(label_2_1_1_1);
		
		
		
		
		
		panel_1.add(cb);
		
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(Color.DARK_GRAY);
		comboBox_1.setForeground(Color.LIGHT_GRAY);		comboBox_1.setBounds(62, 38, 112, 22);
		comboBox_1.addItem("Simple");
		comboBox_1.addItem("Suite");
		panel_1.add(comboBox_1);
		
		JLabel lblHotel = new JLabel("Hotel");
		lblHotel.setForeground(Color.LIGHT_GRAY);
		lblHotel.setFont(new Font("MS PGothic", Font.BOLD, 28));
		lblHotel.setBounds(193, 250, 73, 29);
		contentPane.add(lblHotel);
		
		JButton btnEpomeno = new JButton("Epomeno");
		btnEpomeno.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		btnEpomeno.setBackground(new Color(0, 128, 192));
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
				
				
				Frame3 gui3=new Frame3(PacketList.createPacketList(uo), uo);
				dispose();
				gui3.setVisible(true);
			}
		});
		contentPane.add(btnEpomeno);
	}
}
