package travelpack;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FrameOloklhrwsh extends JFrame {

	private JPanel contentPane;

	public FrameOloklhrwsh() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblOloklhrwshKrathshs = new JLabel("Booking Completed");
		lblOloklhrwshKrathshs.setForeground(new Color(0, 0, 0));
		lblOloklhrwshKrathshs.setFont(new Font("Dialog", Font.BOLD, 23));
		lblOloklhrwshKrathshs.setBounds(90, 11, 247, 47);
		contentPane.add(lblOloklhrwshKrathshs);

		JLabel lblHKrathshOloklhrwthike = new JLabel("Booking completed successfuly!");
		lblHKrathshOloklhrwthike.setForeground(Color.BLACK);
		lblHKrathshOloklhrwthike.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblHKrathshOloklhrwthike.setBounds(115, 57, 211, 23);
		contentPane.add(lblHKrathshOloklhrwthike);

		JButton btnNewButton = new JButton("Return to home page");
		btnNewButton.setBackground(new Color(0, 128, 192));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Poppins", Font.PLAIN, 18));
		btnNewButton.setBounds(70, 350, 309, 40);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Frame1 f1 = new Frame1();
				f1.setVisible(true);

			}
		});
		contentPane.add(btnNewButton);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(new Color(192, 192, 192));
		ImageIcon img = new ImageIcon(this.getClass().getResource("/tick.jpg"));
		lblNewLabel.setIcon(img);
		lblNewLabel.setBounds(85, 110, 250, 180);
		contentPane.add(lblNewLabel);
	}

}
