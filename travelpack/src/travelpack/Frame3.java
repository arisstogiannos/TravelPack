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
import javax.swing.border.EmptyBorder;

public class Frame3 extends JFrame {
	
	ImageIcon image;
	JLabel displayField;

	private JPanel contentPane;

	private int y= -92;	
	



	public Frame3(ArrayList<Packet> packetList, UserOptions uo) {

	

		
		int listSize = packetList.size();
		ArrayList<JPanel> panels= new ArrayList<>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, listSize*200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		Label label_2 = new Label("Diathesima Ksenodoxeia - Apotelesmata "+listSize+" apo "+listSize+" sunolika");
		label_2.setAlignment(Label.CENTER);
		label_2.setForeground(new Color(0, 0, 0));
		label_2.setFont(new Font("Dialog", Font.BOLD, 17));
		label_2.setBounds(56, 28, 460, 22);
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
		
		
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setForeground(Color.BLACK);
		panel_1_1_1.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
		panel_1_1_1.setBounds(10, y, 120, 118);
		panels.add(panel_1_1_1);
		
		
		
	
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setForeground(Color.BLACK);
		panel_1_2.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
		panel_1_2.setBounds(136, y, 357, 118);
		panels.add(panel_1_2);
		
		Label label_3_1 = new Label(packetList.get(i).getHotel().getName());
		label_3_1.setForeground(Color.BLACK);
		label_3_1.setFont(new Font("Poppins", Font.PLAIN, 15));
		label_3_1.setBounds(10, 10, 230, 22);
		panel_1_2.add(label_3_1);
		
		
		
		
//		Label label_1_1_1 = new Label("Plhrofories Pthshs");
//		label_1_1_1.setForeground(Color.RED);
//		label_1_1_1.setFont(new Font("Montestratt", Font.PLAIN, 11));
//		label_1_1_1.setBounds(35, 50, 94, 22);
//		panel_1_2.add(label_1_1_1);
		
		Label label_3_1_1 = new Label("Timh paketou:");
		label_3_1_1.setForeground(Color.BLACK);
		label_3_1_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_3_1_1.setBounds(240, 10, 100, 20);
		panel_1_2.add(label_3_1_1);
		
		Label timh = new Label(packetList.get(i).getTotalprice()+"$");
		timh.setForeground(Color.BLACK);
		timh.setFont(new Font("Dialog", Font.PLAIN, 15));
		timh.setBounds(290, 30, 50, 20);
		panel_1_2.add(timh);
		
		JButton btn1 = new JButton("Kante Krathsh");
		btn1.setForeground(Color.WHITE);
		btn1.setBackground(Color.DARK_GRAY);
		btn1.setFont(new Font("Montestratt", Font.BOLD , 12));
		btn1.setBounds(226, 66, 121, 41);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FramePlhrwmhs gui4 =new FramePlhrwmhs(packetList.get(i), uo);
				dispose();
				gui4.setVisible(true);
			}});
		panel_1_2.add(btn1);
	}
}
