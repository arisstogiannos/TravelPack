package travelpack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JList;

public class FramePlhrwmhs extends JFrame {

	private JPanel contentPane;
	private JTextField txtOnomaKsenodoxeiou;
	private JTextField txtArithmosKartas;
	private JTextField txtOnomaKatoxou;
	private JTextField txtHmeromhniaLhkshs;
	private JTextField txtCvv;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					FramePlhrwmhs frame = new FramePlhrwmhs();
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
	public FramePlhrwmhs(Packet p) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtOnomaKsenodoxeiou = new JTextField();
		txtOnomaKsenodoxeiou.setHorizontalAlignment(SwingConstants.CENTER);
		txtOnomaKsenodoxeiou.setFont(new Font("Wide Latin", Font.PLAIN, 16));
		txtOnomaKsenodoxeiou.setText(p.getHotel().getName());
		txtOnomaKsenodoxeiou.setBounds(42, 25, 354, 48);
		contentPane.add(txtOnomaKsenodoxeiou);
		txtOnomaKsenodoxeiou.setColumns(10);
		
		txtArithmosKartas = new JTextField();
		txtArithmosKartas.setHorizontalAlignment(SwingConstants.CENTER);
		txtArithmosKartas.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtArithmosKartas.setText("Arithmos Kartas");
		txtArithmosKartas.setBounds(238, 222, 225, 35);
		contentPane.add(txtArithmosKartas);
		txtArithmosKartas.setColumns(10);
		
		txtOnomaKatoxou = new JTextField();
		txtOnomaKatoxou.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtOnomaKatoxou.setText("Onoma Katoxou*");
		txtOnomaKatoxou.setHorizontalAlignment(SwingConstants.CENTER);
		txtOnomaKatoxou.setColumns(10);
		txtOnomaKatoxou.setBounds(238, 268, 225, 35);
		contentPane.add(txtOnomaKatoxou);
		
		txtHmeromhniaLhkshs = new JTextField();
		txtHmeromhniaLhkshs.setText("Hmeromhnia Lhkshs*");
		txtHmeromhniaLhkshs.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtHmeromhniaLhkshs.setHorizontalAlignment(SwingConstants.CENTER);
		txtHmeromhniaLhkshs.setColumns(10);
		txtHmeromhniaLhkshs.setBounds(238, 314, 128, 35);
		contentPane.add(txtHmeromhniaLhkshs);
		
		txtCvv = new JTextField();
		txtCvv.setText("CVV*");
		txtCvv.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtCvv.setHorizontalAlignment(SwingConstants.CENTER);
		txtCvv.setColumns(10);
		txtCvv.setBounds(395, 314, 68, 35);
		contentPane.add(txtCvv);
		
		JButton btnNewButton = new JButton("Oloklhrwsh Krathshs");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 17));
		btnNewButton.setBounds(238, 365, 240, 35);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameOloklhrwsh guiOloklhrwshs  = new FrameOloklhrwsh();
				guiOloklhrwshs.setVisible(true);
			}
		});
		contentPane.add(btnNewButton);
	}
}
