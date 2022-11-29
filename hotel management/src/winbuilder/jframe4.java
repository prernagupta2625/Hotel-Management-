package winbuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class jframe4 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jframe4 frame = new jframe4();
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
	public jframe4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 702, 441);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setForeground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("ROOM ALOTMENT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {   jframe3 j5=new jframe3();
			j5.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton.setBounds(94, 42, 263, 52);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ROOM CHECK OUT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  jframe6 j8=new jframe6();
			j8.setVisible(true);
			
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_1.setBounds(99, 166, 258, 46);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Food Ordering Section");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  jframe5 j9=new jframe5();
			j9.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_2.setBounds(99, 286, 342, 40);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("LOG OUT");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  HM j7=new HM();
			(j7.frame).setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3.setBounds(542, 28, 114, 35);
		contentPane.add(btnNewButton_3);
	}
}
