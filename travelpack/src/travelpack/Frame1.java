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

	private JLabel lblNewLabel_1;


	public Frame1() {
		
		setTitle("TravelPack");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 434);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.DARK_GRAY);
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		destination = new JComboBox();
		destination.addItem("Proorismos");
		destination.setFont(new Font("Poppins", Font.PLAIN, 15));
		destination.setBounds(62, 168, 189, 34);
		contentPane.add(destination);
		destination.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		 try {
		      File f = new File("hotels.txt");
		      Scanner myReader = new Scanner(f);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        String[] city =data.split(",", 7);
		        if(!city[1].trim().equals(destination.getItemAt(destination.getItemCount()-1)))
		        	destination.addItem(city[1].trim());
		        
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		

		
		DepCityTextField = new JTextField("Αφετηρία");
		DepCityTextField.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) {
		        char c = e.getKeyChar();
		        if (!((c >= 'A') && (c <= 'Z') ||
		        	((c >= 'a') && (c <= 'z') ||
		           (c == KeyEvent.VK_BACK_SPACE) ||
		           (c == KeyEvent.VK_DELETE)))) {
		          getToolkit().beep();
		          e.consume();
		        }
		      }
		    });
		DepCityTextField.setHorizontalAlignment(SwingConstants.CENTER);
		DepCityTextField.setFont(new Font("Poppins", Font.PLAIN, 15));
		DepCityTextField.setBounds(62, 248, 189, 34);
		DepCityTextField.setColumns(10);
		DepCityTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		DepCityTextField.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
            	DepCityTextField.setText("");
            }
        });
		contentPane.add(DepCityTextField);
		
		DaysTextField = new JTextField("Επιλογή διανυκτερεύσεων");
		DaysTextField.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) {
		        char c = e.getKeyChar();
		        if (!((c >= '0') && (c <= '9') ||
		           (c == KeyEvent.VK_BACK_SPACE) ||
		           (c == KeyEvent.VK_DELETE)) ||
		        	(DaysTextField.getText().length()>=2)) {
		           getToolkit().beep();
		          e.consume();
		        }
		      }
		    });
		DaysTextField.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
            	DaysTextField.setText("");
            }
        });
		DaysTextField.setHorizontalAlignment(SwingConstants.CENTER);
		DaysTextField.setFont(new Font("Poppins", Font.PLAIN, 15));
		DaysTextField.setBounds(333, 248, 189, 34);
		DaysTextField.setColumns(10);
		DaysTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		contentPane.add(DaysTextField);
		
		
		JTextField MonthTextField = new JTextField("Hmeromhnia(dd/mm/yyyy)");
		MonthTextField.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) {
		        char c = e.getKeyChar();
		        if (!((c >= '0') && (c <= '9') ||
		           (c == KeyEvent.VK_BACK_SPACE) ||
		           (c == KeyEvent.VK_SLASH)||
		           (c == KeyEvent.VK_DELETE))) {
		          getToolkit().beep();
		          e.consume();
		        }
		      }
		    });
		MonthTextField.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
            	MonthTextField.setText("");
            }
        });
		MonthTextField.setHorizontalAlignment(SwingConstants.CENTER);
		MonthTextField.setFont(new Font("Poppins", Font.PLAIN, 15));
		MonthTextField.setBounds(333, 168, 189, 34);
		MonthTextField.setColumns(10);
		MonthTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		MonthTextField.setToolTipText("Format should be dd/mm/yyyy (e.g 12/3/2023)");
		contentPane.add(MonthTextField);
		
		
		
		JLabel lblNewLabel = new JLabel("TravelPack");
		lblNewLabel.setForeground(new Color(0, 128, 192));
		lblNewLabel.setBounds(214, 118, 162, 27);
		lblNewLabel.setFont(new Font("Poppins", Font.BOLD, 28));
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Anazhthsh");
		btnNewButton.setBackground(new Color(0, 128, 192));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(129, 328, 309, 40);
		btnNewButton.setFont(new Font("Poppins", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean flag =true;
				UserOptions uo = new UserOptions();
				String errMsg ="";
				
				if(DepCityTextField.getText().isBlank() || DepCityTextField.getText().equals("Αφετηρία")) {
					errMsg+="Αφετηρία \n";
					flag = false;
				}else {
					uo.setDepCity(DepCityTextField.getText());
				}
				
				if(destination.getItemAt(destination.getSelectedIndex()).equals("Proorismos")) {
					errMsg+="Προορισμός \n";
					flag =false;
				}else {
					uo.setDestination((String) destination.getItemAt(destination.getSelectedIndex()));
				}
				
				
				if(DaysTextField.getText().isBlank() || DaysTextField.getText().equals("Επιλογή διανυκτερεύσεων")) {
					errMsg+="Διανυκτερεύσεις \n";
					flag = false;
				}else {
					uo.setDays(Integer.parseInt(DaysTextField.getText()));
				}
				
				if(MonthTextField.getText().isBlank() || MonthTextField.getText().equals("Hmeromhnia(dd/mm/yyyy)")) {
					errMsg+="Ημερομηνία \n";
					flag = false;
				}else {
					uo.setDate(MonthTextField.getText());
				}
					
					
				
				
				if (flag) {
					Frame2 gui2 = new Frame2(uo);
					gui2.setVisible(true);
					dispose();
				}else {
					JOptionPane.showMessageDialog(contentPane, "Παρακαλώ συμπληρώστε τα παρακάτω πεδία:\n"+errMsg);

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
