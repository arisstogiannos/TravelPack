package travelpack;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Frame1 extends JFrame {

	private JPanel contentPane;
	private JTextField DepCityTextField;
	private JTextField DaysTextField;
	private JTextField MonthTextField;
	private JComboBox destination;
	private int max;
	private JLabel lblNewLabel_1;

	public Frame1() {
		int i;

		setTitle("TravelPack");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 434);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.DARK_GRAY);

		setContentPane(contentPane);
		contentPane.setLayout(null);

		destination = new JComboBox();
		destination.addItem("Destination");
		destination.setFont(new Font("Poppins", Font.PLAIN, 15));
		destination.setBounds(62, 168, 189, 34);
		contentPane.add(destination);
		destination.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		try {
			File f = new File("resources/hotels.txt");
			Scanner myReader = new Scanner(f);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String[] city = data.split(",", 7);
				if (!city[1].trim().equals(destination.getItemAt(destination.getItemCount() - 1)))
					destination.addItem(city[1].trim());

			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		DepCityTextField = new JTextField("Departure");
		DepCityTextField.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!((c >= 'A') && (c <= 'Z')
						|| ((c >= 'a') && (c <= 'z') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)))) {
					getToolkit().beep();
					e.consume();
				}
			}
		});
		DepCityTextField.setHorizontalAlignment(SwingConstants.CENTER);
		DepCityTextField.setFont(new Font("Poppins", Font.PLAIN, 15));
		DepCityTextField.setBounds(62, 248, 189, 34);
		DepCityTextField.setColumns(10);
		DepCityTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		DepCityTextField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DepCityTextField.setText("");
			}
		});
		contentPane.add(DepCityTextField);

		DaysTextField = new JTextField("Overnights");
		DaysTextField.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))
						|| (DaysTextField.getText().length() >= 2)) {
					getToolkit().beep();
					e.consume();
				}
			}
		});
		DaysTextField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DaysTextField.setText("");
			}
		});
		DaysTextField.setHorizontalAlignment(SwingConstants.CENTER);
		DaysTextField.setFont(new Font("Poppins", Font.PLAIN, 15));
		DaysTextField.setBounds(333, 248, 189, 34);
		DaysTextField.setColumns(10);
		DaysTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		contentPane.add(DaysTextField);

		JComboBox dayCb = new JComboBox();
		dayCb.addItem("Day");
		dayCb.setBounds(410, 168, 70, 34);
		dayCb.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		contentPane.add(dayCb);

		JComboBox monthCb = new JComboBox();
		monthCb.addItem("Month");
		for (i = 1; i <= 12; i++) {
			monthCb.addItem(Integer.toString(i));
		}

		monthCb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dayCb.removeAllItems();
				dayCb.addItem("Day");
				// Ανάλογα με τον επιλεγμένο μηνα εμφανίζονται και οι αντιστοιχες μέρες του μηνα
				if (Integer.parseInt((String) monthCb.getItemAt(monthCb.getSelectedIndex())) == 2)
					max = 28;
				else if (Integer.parseInt((String) monthCb.getItemAt(monthCb.getSelectedIndex())) % 2 == 0)
					max = 30;
				else
					max = 31;

				for (int i = 1; i <= max; i++) {
					dayCb.addItem(Integer.toString(i));
				}
			}

		});
		monthCb.setBounds(333, 168, 70, 34);
		monthCb.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		contentPane.add(monthCb);

		JComboBox yearCb = new JComboBox();
		yearCb.addItem("Year");
		yearCb.addItem("2023");
		yearCb.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

		yearCb.setBounds(487, 168, 70, 34);
		contentPane.add(yearCb);

		JLabel lblNewLabel = new JLabel("TravelPack");
		lblNewLabel.setForeground(new Color(0, 128, 192));
		lblNewLabel.setBounds(214, 118, 162, 27);
		lblNewLabel.setFont(new Font("Poppins", Font.BOLD, 28));
		contentPane.add(lblNewLabel);

		JButton btnNewButton = new JButton("Next >");
		btnNewButton.setBackground(new Color(0, 128, 192));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(129, 328, 309, 40);
		btnNewButton.setFont(new Font("Poppins", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean flag = true;
				UserOptions uo = new UserOptions();
				String errMsg = "";
//				Έλεγχος ορθής καταχωρησης των πεδίων και καταχώριση των στοιχείων στις μεταβλητες ενός αντικειμενου UserOptions 
				if (DepCityTextField.getText().isBlank() || DepCityTextField.getText().equals("Departure")) {
					errMsg += "Departure \n";
					flag = false;
				} else {
					uo.setDepCity(DepCityTextField.getText());
				}

				if (destination.getItemAt(destination.getSelectedIndex()).equals("Destination")) {
					errMsg += "Destination \n";
					flag = false;
				} else {
					uo.setDestination((String) destination.getItemAt(destination.getSelectedIndex()));
				}

				if (DaysTextField.getText().isBlank() || DaysTextField.getText().equals("Overnights")) {
					errMsg += "Overnights \n";
					flag = false;
				} else {
					uo.setDays(Integer.parseInt(DaysTextField.getText()));
				}

				if (dayCb.getItemAt(dayCb.getSelectedIndex()).equals("Day")
						|| monthCb.getItemAt(monthCb.getSelectedIndex()).equals("Month")
						|| yearCb.getItemAt(yearCb.getSelectedIndex()).equals("Year")) {
					errMsg += "Date \n";
					flag = false;
				} else {
					uo.setDate((String) dayCb.getItemAt(dayCb.getSelectedIndex()) + "/"
							+ (String) monthCb.getItemAt(monthCb.getSelectedIndex()) + "/"
							+ (String) yearCb.getItemAt(yearCb.getSelectedIndex()));
				}

				if (flag) {
					Frame2 gui2 = new Frame2(uo);
					gui2.setVisible(true);
					dispose();
				} else {
					// Εμφάνιση των μη κατάλληλα συμπληρωμένων πεδίων
					JOptionPane.showMessageDialog(contentPane, "Please enter the following fields:\n" + errMsg);

				}

			}
		});
		contentPane.add(btnNewButton);

		lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setBounds(239, 11, 100, 107);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/Screenshot_32.jpg"));
		lblNewLabel_1.setIcon(img);
		contentPane.add(lblNewLabel_1);
	}
}
