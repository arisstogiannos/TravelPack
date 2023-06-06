package travelpack;

import java.awt.Color;
import java.awt.EventQueue;
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
import javax.swing.JEditorPane;
import javax.swing.JTextPane;

public class FramePlhrwmhs extends JFrame {
	


	private JPanel contentPane;
	private JLabel stoixeiaPlhromhs;
	private JLabel OnomaKsenodoxeiou;
	private JFormattedTextField txtArithmosKartas;
	private JTextField txtOnomaKatoxou;
	private JTextField txtHmeromhniaLhkshs;
	private JTextField txtCvv;
	private JLabel priceP;
	private JLabel priceH;
	private JLabel priceF;

	/**
	 * Launch the application.
	 */
	
	

	/**
	 * Create the frame.
	 */
	public FramePlhrwmhs(Packet p, UserOptions uo) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.DARK_GRAY);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		OnomaKsenodoxeiou = new JLabel();
		OnomaKsenodoxeiou.setForeground(Color.LIGHT_GRAY);
		OnomaKsenodoxeiou.setHorizontalAlignment(SwingConstants.LEFT);
		OnomaKsenodoxeiou.setFont(new Font("Wide Latin", Font.PLAIN, 13));
		OnomaKsenodoxeiou.setText(p.getHotel().getName());
		OnomaKsenodoxeiou.setBounds(10, 10, 390, 48);
		contentPane.add(OnomaKsenodoxeiou);
		
		priceP = new JLabel();
		priceP.setHorizontalAlignment(SwingConstants.LEFT);
		priceP.setFont(new Font("Poppins", Font.BOLD, 17));
		priceP.setText("Timh paketou: "+p.getTotalprice()+"$");
		priceP.setBounds(10, 60, 190, 48);
		priceP.setForeground(Color.LIGHT_GRAY);
		contentPane.add(priceP);
		
		priceH = new JLabel();
		priceH.setHorizontalAlignment(SwingConstants.LEFT);
		priceH.setFont(new Font("Poppins", Font.BOLD, 17));
		priceH.setText("Timh ksenodoxeioy: "+p.getHotel().getPrice()+"$");
		priceH.setBounds(10, 100, 250, 48);
		priceH.setForeground(Color.LIGHT_GRAY);
		contentPane.add(priceH);
		
		priceF = new JLabel();
		priceF.setHorizontalAlignment(SwingConstants.LEFT);
		priceF.setFont(new Font("Poppins", Font.BOLD, 17));
		priceF.setText("Timh pthshs: "+p.getFlight().getPrice()+"$");
		priceF.setBounds(10, 140, 250, 48);
		priceF.setForeground(Color.LIGHT_GRAY);
		contentPane.add(priceF);
		
		stoixeiaPlhromhs = new JLabel();
		stoixeiaPlhromhs.setForeground(Color.LIGHT_GRAY);
		stoixeiaPlhromhs.setHorizontalAlignment(SwingConstants.CENTER);
		stoixeiaPlhromhs.setFont(new Font("Poppins", Font.BOLD, 17));
		stoixeiaPlhromhs.setText("Stoixeia Plhromhs");
		stoixeiaPlhromhs.setBounds(210, 180, 317, 38);
		contentPane.add(stoixeiaPlhromhs);
		
		JPanel paymentPanel = new JPanel();
		paymentPanel.setLayout(null);
		paymentPanel.setForeground(Color.BLACK);
		paymentPanel.setBackground(Color.LIGHT_GRAY);
		paymentPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		paymentPanel.setBounds(238, 220, 250, 191);
		contentPane.add(paymentPanel);
		
		JPanel flightPanel = new JPanel();
		flightPanel.setBackground(Color.LIGHT_GRAY);
		flightPanel.setForeground(Color.BLACK);
		flightPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		flightPanel.setBounds(5, 220, 250, 191);
		contentPane.add(flightPanel);
		flightPanel.setLayout(null);
		
		JLabel frmtdtxtfldAfethriaTo = new JLabel();
		frmtdtxtfldAfethriaTo.setBounds(10, 5, 215, 20);
		frmtdtxtfldAfethriaTo.setText("Afethria: "+p.getFlight().getDepartureCity());
		frmtdtxtfldAfethriaTo.setHorizontalAlignment(SwingConstants.LEFT);
		frmtdtxtfldAfethriaTo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		flightPanel.add(frmtdtxtfldAfethriaTo);
		
		JLabel proorimos = new JLabel();
		proorimos.setBounds(10, 35, 215, 20);
		proorimos.setText("Proorismos: "+p.getFlight().getDestinationCity());
		proorimos.setHorizontalAlignment(SwingConstants.LEFT);
		proorimos.setFont(new Font("Tahoma", Font.PLAIN, 17));
		flightPanel.add(proorimos);
		
		
		JLabel frmtdtxtfldHmeromhnia = new JLabel();
		frmtdtxtfldHmeromhnia.setHorizontalAlignment(SwingConstants.LEFT);
		frmtdtxtfldHmeromhnia.setBounds(10, 65, 215, 20);
		frmtdtxtfldHmeromhnia.setText("Hmeromhnia: "+p.getFlight().getDate());
		frmtdtxtfldHmeromhnia.setFont(new Font("Tahoma", Font.PLAIN,17));
		flightPanel.add(frmtdtxtfldHmeromhnia);
		
		JLabel frmtdtxtfldWraPthshs = new JLabel();
		frmtdtxtfldWraPthshs.setBounds(10, 95, 215, 20);
		frmtdtxtfldWraPthshs.setText("Wra pthshs: "+p.getFlight().getTimeAsString()+":00");
		frmtdtxtfldWraPthshs.setHorizontalAlignment(SwingConstants.LEFT);
		frmtdtxtfldWraPthshs.setFont(new Font("Tahoma", Font.PLAIN, 17));
		flightPanel.add(frmtdtxtfldWraPthshs);
		
		JLabel frmtdtxtfldBaggage = new JLabel();
		frmtdtxtfldBaggage.setBounds(10, 125, 215, 20);
		String b="No";
		if(p.getFlight().isBaggage())
			b="Yes";
		frmtdtxtfldBaggage.setText("Aposkeues: "+b);
		frmtdtxtfldBaggage.setHorizontalAlignment(SwingConstants.LEFT);
		frmtdtxtfldBaggage.setFont(new Font("Tahoma", Font.PLAIN, 17));
		flightPanel.add(frmtdtxtfldBaggage);
		
		JLabel frmtdtxtfldTypePthshs = new JLabel();
		frmtdtxtfldTypePthshs.setBounds(10, 155, 215, 20);
		frmtdtxtfldTypePthshs.setText("Typos Pthshs: "+p.getFlight().getType());
		frmtdtxtfldTypePthshs.setHorizontalAlignment(SwingConstants.LEFT);
		frmtdtxtfldTypePthshs.setFont(new Font("Tahoma", Font.PLAIN, 17));
		flightPanel.add(frmtdtxtfldTypePthshs);
		
		
		
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
		txtArithmosKartas.setText("Arithmos Kartas*");
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
		txtCvv.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtCvv.setHorizontalAlignment(SwingConstants.CENTER);
		txtCvv.setColumns(10);
		txtCvv.setBounds(160, 90, 75, 35);
		paymentPanel.add(txtCvv);
		
		JButton btnNewButton = new JButton("Oloklhrwsh Krathshs");
		btnNewButton.setBackground(new Color(0, 128, 192));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Poppins", Font.BOLD, 16));

		btnNewButton.setBounds(10, 145, 225, 35);
		paymentPanel.add(btnNewButton);
		
		JLabel lblStoixeiaPthshs = new JLabel();
		lblStoixeiaPthshs.setText("Stoixeia Pthshs");
		lblStoixeiaPthshs.setForeground(Color.LIGHT_GRAY);
		lblStoixeiaPthshs.setHorizontalAlignment(SwingConstants.CENTER);
		lblStoixeiaPthshs.setFont(new Font("Dialog", Font.BOLD, 17));
		lblStoixeiaPthshs.setBounds(-38, 180, 317, 38);
		contentPane.add(lblStoixeiaPthshs);
		btnNewButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
				
				if(CheckPayment.checkPayment(txtArithmosKartas.getText(),txtCvv.getText(),txtOnomaKatoxou.getText(),txtHmeromhniaLhkshs.getText())) {
				Booking.bookRoom(p.getHotel(), uo);
				FrameOloklhrwsh guiOloklhrwshs  = new FrameOloklhrwsh();
				guiOloklhrwshs.setVisible(true);
				dispose();
				}
			}
		});
	}
}
