package travelpack;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

// Η κλάση Frame3 εμφανίζει τα διαθέσιμα πακέτα στο χρήστη
public class Frame3 extends JFrame {
	
	ImageIcon image;
	JLabel displayField;

	private JPanel contentPane;

	private int y= -92;	
	



	public Frame3(ArrayList<Packet> packetList, UserOptions uo) {


		
		int listSize = packetList.size();
		ArrayList<JPanel> panels= new ArrayList<>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, listSize*180);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		Label label_2 = new Label("Available hotels - Results "+listSize+" out of "+listSize+" total");
		label_2.setAlignment(Label.CENTER);
		label_2.setForeground(Color.LIGHT_GRAY);
		label_2.setFont(new Font("Dialog", Font.BOLD, 17));
		label_2.setBounds(20, 28, 460, 22);
		contentPane.add(label_2);
		
		for(int i=0;i<listSize*2;i+=2) {
			y+=148;
			addPanel(packetList, panels, i/2, y, uo);
			for (int j = 0; j < 2; j++) {
				contentPane.add(panels.get(i+j));
			}
		}

	}
	
	public void addPanel(ArrayList<Packet> packetList, ArrayList<JPanel> panels, int i, int y, UserOptions uo) {
		
		
		JPanel panelPhoto = new JPanel();
		panelPhoto.setLayout(null);
		panelPhoto.setForeground(Color.BLACK);
		panelPhoto.setBackground(Color.LIGHT_GRAY);
		panelPhoto.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
		panelPhoto.setBounds(10, y, 120, 118);
		panels.add(panelPhoto);
		
		JLabel photolbl = new JLabel("<html>"+ "Hotel photo"+"</html>");
		photolbl.setBounds(10, 30, 90, 40);
		photolbl.setFont(new Font("Dialog", Font.PLAIN, 15));
		photolbl.setHorizontalAlignment(SwingConstants.CENTER);
		panelPhoto.add(photolbl);
		
		
		
	
		JPanel infoPanel = new JPanel();
		infoPanel.setLayout(null);
		infoPanel.setBackground(Color.LIGHT_GRAY);
		infoPanel.setForeground(Color.BLACK);
		infoPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
		infoPanel.setBounds(136, y, 357, 118);
		panels.add(infoPanel);
		
		Label label_3_1 = new Label(packetList.get(i).getHotel().getName());
		label_3_1.setForeground(Color.DARK_GRAY);
		label_3_1.setFont(new Font("Poppins", Font.PLAIN, 15));
		label_3_1.setBounds(10, 10, 230, 22);
		infoPanel.add(label_3_1);
		
		
		
		Label label_3_1_1 = new Label("Total price:");
		label_3_1_1.setForeground(Color.DARK_GRAY);
		label_3_1_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_3_1_1.setBounds(250, 10, 100, 20);
		infoPanel.add(label_3_1_1);
		
		Label timh = new Label(packetList.get(i).getTotalprice()+"$");
		timh.setForeground(Color.DARK_GRAY);
		timh.setFont(new Font("Dialog", Font.PLAIN, 15));
		timh.setBounds(290, 30, 50, 20);
		infoPanel.add(timh);
		
		JButton btn1 = new JButton("Make booking");
		btn1.setForeground(Color.WHITE);
		btn1.setBackground(new Color(0, 128, 192));
		btn1.setFont(new Font("Montestratt", Font.BOLD , 12));
		btn1.setBounds(226, 66, 121, 41);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FramePlhrwmhs gui4 =new FramePlhrwmhs(packetList.get(i), uo);
				dispose();
				gui4.setVisible(true);
			}});
		infoPanel.add(btn1);
	}
}
