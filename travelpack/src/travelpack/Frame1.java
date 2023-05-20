package travelpack;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Frame1 extends JFrame {

	private JPanel contentPane;
	private JTextField DestinationTextField;
	private JTextField DepCityTextField;
	private JTextField DaysTextField;
	private JTextField MonthTextField;
//	private UserOptions uo;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Frame1 frame = new Frame1();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Frame1() {
		
		setTitle("TravelPack");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		DestinationTextField = new JTextField("Anazhthsh Proorismou");
		DestinationTextField.setHorizontalAlignment(SwingConstants.CENTER);
		DestinationTextField.setForeground(Color.BLACK);
		DestinationTextField.setFont(new Font("Poppins", Font.PLAIN, 15));
		DestinationTextField.setBounds(70, 90, 179, 34);
		contentPane.add(DestinationTextField);
		DestinationTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		DestinationTextField.setColumns(10);
		
		DepCityTextField = new JTextField("Anazhthsh Afethrias");
		DepCityTextField.setHorizontalAlignment(SwingConstants.CENTER);
		DepCityTextField.setFont(new Font("Poppins", Font.PLAIN, 15));
		DepCityTextField.setBounds(70, 170, 179, 34);
		DepCityTextField.setColumns(10);
		DepCityTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		contentPane.add(DepCityTextField);
		
		DaysTextField = new JTextField("Epilogh Dianuktereusewn");
		DaysTextField.setHorizontalAlignment(SwingConstants.CENTER);
		DaysTextField.setFont(new Font("Poppins", Font.PLAIN, 15));
		DaysTextField.setBounds(341, 170, 179, 34);
		DaysTextField.setColumns(10);
		DaysTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		contentPane.add(DaysTextField);
		
		MonthTextField = new JTextField("Epilogh Mhna");
		MonthTextField.setHorizontalAlignment(SwingConstants.CENTER);
		MonthTextField.setFont(new Font("Poppins", Font.PLAIN, 15));
		MonthTextField.setBounds(341, 90, 179, 34);
		MonthTextField.setColumns(10);
		MonthTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		
		contentPane.add(MonthTextField);
		
		
		
		JLabel lblNewLabel = new JLabel("TravelPack");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(210, 15, 315, 47);
		lblNewLabel.setFont(new Font("Poppins", Font.BOLD, 28));
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Anazhthsh");
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setBounds(137, 250, 309, 40);
		btnNewButton.setFont(new Font("Poppins", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserOptions uo = new UserOptions();
				uo.setDepCity(DepCityTextField.getText());
				
				uo.setDestination(DestinationTextField.getText());
				uo.setDays(Integer.parseInt(DaysTextField.getText()));
				uo.setDate(MonthTextField.getText());
				Frame2 gui2=new Frame2(uo);
				gui2.setVisible(true);
				dispose();
				
				
				
			}
		});
		contentPane.add(btnNewButton);
	}
}
