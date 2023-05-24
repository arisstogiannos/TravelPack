	package travelpack;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class FramePlhrwmhs extends JFrame {

	private JPanel contentPane;
	private JLabel stoixeiaPlhromhs;
	private JLabel OnomaKsenodoxeiou;
	private JFormattedTextField txtArithmosKartas;
	private JTextField txtOnomaKatoxou;
	private JTextField txtHmeromhniaLhkshs;
	private JTextField txtCvv;


	
	public FramePlhrwmhs(Packet p, UserOptions uo) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		OnomaKsenodoxeiou = new JLabel();
		OnomaKsenodoxeiou.setHorizontalAlignment(SwingConstants.CENTER);
		OnomaKsenodoxeiou.setFont(new Font("Wide Latin", Font.PLAIN, 13));
		OnomaKsenodoxeiou.setText(p.getHotel().getName());
		OnomaKsenodoxeiou.setBounds(5, 10, 390, 48);
		contentPane.add(OnomaKsenodoxeiou);
		
		stoixeiaPlhromhs = new JLabel();
		stoixeiaPlhromhs.setHorizontalAlignment(SwingConstants.CENTER);
		stoixeiaPlhromhs.setFont(new Font("Poppins", Font.BOLD, 17));
		stoixeiaPlhromhs.setText("Stoixeia Plhromhs");
		stoixeiaPlhromhs.setBounds(210, 180, 317, 38);
		contentPane.add(stoixeiaPlhromhs);
		
		JPanel paymentPanel = new JPanel();
		paymentPanel.setLayout(null);
		paymentPanel.setForeground(Color.BLACK);
		paymentPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		paymentPanel.setBounds(238, 220, 250, 180);
		contentPane.add(paymentPanel);
		
		JPanel flightPanel = new JPanel();
		flightPanel.setLayout(null);
		flightPanel.setForeground(Color.BLACK);
		flightPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		flightPanel.setBounds(5, 220, 250, 180);
		contentPane.add(flightPanel);
		
		
		txtArithmosKartas = new JFormattedTextField();
		txtArithmosKartas.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) {
		        char c = e.getKeyChar();
		        if (!((c >= '0') && (c <= '9') ||
		           (c == KeyEvent.VK_BACK_SPACE) ||
		           (c == KeyEvent.VK_DELETE)) ||
		        	(txtArithmosKartas.getText().length()>=16)) {
		          getToolkit().beep();
		          e.consume();
		        }
		      }
		    });
		txtArithmosKartas.setHorizontalAlignment(SwingConstants.CENTER);
		txtArithmosKartas.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtArithmosKartas.setText("Arithmos Kartas");
		txtArithmosKartas.setBounds(10, 10, 225, 35);
		paymentPanel.add(txtArithmosKartas);
		txtArithmosKartas.setColumns(10);
		
		txtOnomaKatoxou = new JTextField();
		txtOnomaKatoxou.addKeyListener(new KeyAdapter() {
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
		txtOnomaKatoxou.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtOnomaKatoxou.setText("Onoma Katoxou*");
		txtOnomaKatoxou.setHorizontalAlignment(SwingConstants.CENTER);
		txtOnomaKatoxou.setColumns(10);
		txtOnomaKatoxou.setBounds(10, 50, 225, 35);
		paymentPanel.add(txtOnomaKatoxou);
		
		txtHmeromhniaLhkshs = new JTextField();
		txtHmeromhniaLhkshs.setText("Hmeromhnia Lhkshs*");
		txtHmeromhniaLhkshs.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) {
		        char c = e.getKeyChar();
		        if (!((c >= '0') && (c <= '9') ||
		           (c == KeyEvent.VK_BACK_SPACE) ||
		           (c == KeyEvent.VK_SLASH)||
		           (c == KeyEvent.VK_DELETE))||
		        	(txtCvv.getText().length()>=5)) {
		          getToolkit().beep();
		          JOptionPane.showMessageDialog(contentPane, e);
		          e.consume();
		        }
		      }
		    });
		txtHmeromhniaLhkshs.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtHmeromhniaLhkshs.setHorizontalAlignment(SwingConstants.CENTER);
		txtHmeromhniaLhkshs.setColumns(10);
		txtHmeromhniaLhkshs.setBounds(10, 90, 128, 35);
		paymentPanel.add(txtHmeromhniaLhkshs);
		
		txtCvv = new JTextField();
		txtCvv.setText("CVV*");
		txtCvv.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) {
		        char c = e.getKeyChar();
		        if (!((c >= '0') && (c <= '9') ||
		           (c == KeyEvent.VK_BACK_SPACE) ||
		           (c == KeyEvent.VK_DELETE))||
		        	(txtCvv.getText().length()>=3)) {
		          getToolkit().beep();
		          e.consume();
		        }
		      }
		    });
		txtCvv.addKeyListener(new java.awt.event.KeyAdapter() {
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        if(txtCvv.getText().length()>=3) {
		            getToolkit().beep();
		            evt.consume();
		         }
		     }
		});
		txtCvv.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtCvv.setHorizontalAlignment(SwingConstants.CENTER);
		txtCvv.setColumns(10);
		txtCvv.setBounds(160, 90, 75, 35);
		paymentPanel.add(txtCvv);
		
		JButton btnNewButton = new JButton("Oloklhrwsh Krathshs");
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Poppins", Font.BOLD, 16));

		btnNewButton.setBounds(10, 130, 225, 35);
		paymentPanel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(CheckPayment.checkCardNumber(txtArithmosKartas.getText())) {
				Booking.bookRoom(p.getHotel(), uo);
				FrameOloklhrwsh guiOloklhrwshs  = new FrameOloklhrwsh();
				guiOloklhrwshs.setVisible(true);
				dispose();
				}
			}
		});
		
		

		
		

	}
}
