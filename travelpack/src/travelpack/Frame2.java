package travelpack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;
import javax.swing.JDesktopPane;
import javax.swing.JTextField;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.TextArea;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTextPane;
import java.awt.Canvas;
import java.awt.Panel;
import java.awt.Label;
import java.awt.Choice;
import java.awt.List;
import java.awt.Checkbox;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Scrollbar;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import javax.swing.JTree;
import javax.swing.Box;
import java.awt.Component;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Frame2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtApo;
	private JTextField txtEws;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2 frame = new Frame2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frame2() {
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
		
		Panel panel = new Panel();
		panel.setForeground(Color.BLACK);
		panel.setBounds(103, 67, 253, 177);
		contentPane.add(panel);
		panel.setLayout(null);
		
		Label label = new Label("Kathgoria Kampinas");
		label.setForeground(Color.RED);
		label.setFont(new Font("Dialog", Font.ITALIC, 15));
		label.setBounds(56, 10, 154, 22);
		panel.add(label);
		
		Label label_2 = new Label("Aposkeues");
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("Dubai", Font.PLAIN, 13));
		label_2.setBounds(84, 64, 72, 22);
		panel.add(label_2);
		
		Checkbox checkbox = new Checkbox("Yes");
		checkbox.setFont(new Font("Dialog", Font.PLAIN, 12));
		checkbox.setBounds(61, 92, 40, 22);
		panel.add(checkbox);
		
		Checkbox checkbox_1 = new Checkbox("No");
		checkbox_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		checkbox_1.setBounds(143, 92, 35, 22);
		panel.add(checkbox_1);
		
		Label label_2_1 = new Label("Wra Anaxwrhshs");
		label_2_1.setForeground(Color.RED);
		label_2_1.setFont(new Font("Dubai", Font.PLAIN, 13));
		label_2_1.setBounds(71, 120, 105, 22);
		panel.add(label_2_1);
		
		txtApo = new JTextField("Apo");
		txtApo.setHorizontalAlignment(SwingConstants.CENTER);
		txtApo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtApo.setColumns(10);
		txtApo.setBounds(53, 148, 35, 18);
		panel.add(txtApo);
		
		txtEws = new JTextField("Ews");
		txtEws.setHorizontalAlignment(SwingConstants.CENTER);
		txtEws.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtEws.setColumns(10);
		txtEws.setBounds(143, 148, 35, 18);
		panel.add(txtEws);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(66, 38, 112, 22);
		comboBox.addItem("A Class");
		comboBox.addItem("B Class");
		panel.add(comboBox);
		
		Panel panel_1 = new Panel();
		panel_1.setForeground(Color.BLACK);
		panel_1.setBounds(103, 279, 253, 171);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		Label label_1 = new Label("Tupos Dwmatiou");
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Dialog", Font.ITALIC, 17));
		label_1.setBounds(52, 10, 133, 22);
		panel_1.add(label_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(155, 66, 30, 20);
		panel_1.add(spinner);
		
		Label label_2_1_1 = new Label("Arithmos Atomwn");
		label_2_1_1.setFont(new Font("Dubai", Font.PLAIN, 11));
		label_2_1_1.setBounds(52, 64, 103, 22);
		panel_1.add(label_2_1_1);
		
		Label label_2_1_1_1 = new Label("Epilogh Dwmatiou");
		label_2_1_1_1.setForeground(Color.RED);
		label_2_1_1_1.setFont(new Font("Dubai", Font.PLAIN, 13));
		label_2_1_1_1.setBounds(62, 92, 133, 22);
		panel_1.add(label_2_1_1_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Monoklino");
		chckbxNewCheckBox.setBounds(12, 120, 97, 23);
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxDiklino = new JCheckBox("Diklino");
		chckbxDiklino.setBounds(12, 146, 97, 23);
		panel_1.add(chckbxDiklino);
		
		JCheckBox chckbxTriklino = new JCheckBox("Triklino");
		chckbxTriklino.setBounds(156, 120, 97, 23);
		panel_1.add(chckbxTriklino);
		
		JCheckBox chckbxTetraklino = new JCheckBox("Tetraklino");
		chckbxTetraklino.setBounds(156, 146, 97, 23);
		panel_1.add(chckbxTetraklino);
		
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
				Frame3 gui3=new Frame3();
			}
		});
		contentPane.add(btnEpomeno);
	}
}
