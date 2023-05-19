package travelpack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Frame1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 frame = new Frame1();
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
	public Frame1() {
		setTitle("TravelPack");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField("Anazhthsh Proorismou");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setBounds(108, 73, 149, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_4 = new JTextField("Anazhthsh Afethrias");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_4.setBounds(108, 153, 149, 34);
		textField_4.setColumns(10);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField("Epilogh Dianuktereusewn");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_5.setBounds(341, 154, 132, 34);
		textField_5.setColumns(10);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField("Epilogh Mhna");
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_6.setBounds(341, 73, 132, 34);
		textField_6.setColumns(10);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel = new JLabel("TravelPack");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(137, 15, 315, 47);
		lblNewLabel.setFont(new Font("Wide Latin", Font.BOLD, 28));
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Anazhthsh");
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setBounds(137, 229, 309, 40);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame2 gui2=new Frame2();
			}
		});
		contentPane.add(btnNewButton);
	}
}
