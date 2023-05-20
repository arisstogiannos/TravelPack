package travelpack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JProgressBar;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class Frame3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame3 frame = new Frame3();
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
	public Frame3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(Color.BLACK);
		panel_1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_1.setBounds(136, 204, 357, 118);
		contentPane.add(panel_1);
		
		Label label_3 = new Label("Onoma Ksenodoxeiou");
		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_3.setBounds(10, 10, 154, 22);
		panel_1.add(label_3);
		
		Label label_1_1 = new Label("Plhrofories Pthshs");
		label_1_1.setForeground(Color.RED);
		label_1_1.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_1_1.setBounds(40, 38, 94, 22);
		panel_1.add(label_1_1);
		
		JButton btnNewButton_1 = new JButton("Kante Krathsh");
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_1.setBounds(226, 66, 121, 41);
		panel_1.add(btnNewButton_1);
		
		Label label_3_1_1_1 = new Label("Timh");
		label_3_1_1_1.setForeground(Color.BLACK);
		label_3_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_3_1_1_1.setBounds(300, 24, 47, 22);
		panel_1.add(label_3_1_1_1);
		
		Label label_2 = new Label("Diathesima Ksenodoxeia - Apotelesmata 2 apo 2 sunolika");
		label_2.setAlignment(Label.CENTER);
		label_2.setForeground(new Color(0, 0, 0));
		label_2.setFont(new Font("Dialog", Font.BOLD, 17));
		label_2.setBounds(56, 28, 460, 22);
		contentPane.add(label_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setForeground(Color.BLACK);
		panel_1_1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_1_1.setBounds(10, 204, 120, 118);
		contentPane.add(panel_1_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setForeground(Color.BLACK);
		panel_1_2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_1_2.setBounds(136, 56, 357, 118);
		contentPane.add(panel_1_2);
		
		Label label_3_1 = new Label("Onoma Ksenodoxeiou");
		label_3_1.setForeground(Color.BLACK);
		label_3_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_3_1.setBounds(10, 10, 154, 22);
		panel_1_2.add(label_3_1);
		
		Label label_1_1_1 = new Label("Plhrofories Pthshs");
		label_1_1_1.setForeground(Color.RED);
		label_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_1_1_1.setBounds(40, 38, 94, 22);
		panel_1_2.add(label_1_1_1);
		
		Label label_3_1_1 = new Label("Timh");
		label_3_1_1.setForeground(Color.BLACK);
		label_3_1_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_3_1_1.setBounds(300, 23, 47, 22);
		panel_1_2.add(label_3_1_1);
		
		JButton btnNewButton = new JButton("Kante Krathsh");
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnNewButton.setBounds(226, 66, 121, 41);
		panel_1_2.add(btnNewButton);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setForeground(Color.BLACK);
		panel_1_1_1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_1_1_1.setBounds(10, 56, 120, 118);
		contentPane.add(panel_1_1_1);
	}
}
