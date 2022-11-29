package winbuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class jframe2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JRadioButton f1;
	private JRadioButton f2;
	private JRadioButton f3;
	private JRadioButton f4;
	private JRadioButton f5;
	private JRadioButton r1;
	private JRadioButton r2;
	private JRadioButton r3;
	private JRadioButton r4;
	private JRadioButton r5;
	private JRadioButton r6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jframe2 frame = new jframe2();
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
	public jframe2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 758, 511);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Details");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(299, 11, 205, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_1.setBounds(86, 61, 113, 38);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Address");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(96, 120, 105, 31);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Phone Number");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(26, 307, 109, -3);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Aadhar Number");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_4.setBounds(75, 238, 174, 20);
		contentPane.add(lblNewLabel_4);
		
		textField_20 = new JTextField();
		textField_20.setBounds(329, 74, 363, 20);
		contentPane.add(textField_20);
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setBounds(329, 129, 363, 20);
		contentPane.add(textField_21);
		textField_21.setColumns(10);
		
		textField_22 = new JTextField();
		textField_22.setBounds(328, 179, 364, 20);
		contentPane.add(textField_22);
		textField_22.setColumns(10);
		
		textField_23 = new JTextField();
		textField_23.setBounds(329, 238, 363, 20);
		contentPane.add(textField_23);
		textField_23.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {String name=textField_20.getText();
				String add=textField_21.getText();
				String phno=textField_22.getText();
				String adhar=textField_23.getText();
				String romalot=textField_24.getText();
				String room1=null;
				String floor = null;
				if(r1.isSelected()) {room1 ="1";}
				if(r2.isSelected()) {room1 ="2";}
				if(r3.isSelected()) {room1 ="3";}
				if(r4.isSelected()) {room1 ="4";}
				if(r5.isSelected()) {room1 ="5";}
				if(r6.isSelected()) {room1 ="6";}
				if(f1.isSelected()) {floor ="1";}
				if(f2.isSelected()) {floor ="2";}
				if(f3.isSelected()) {floor ="3";}
				if(f4.isSelected()) {floor ="4";}
				if(f5.isSelected()) {floor ="5";}
				Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","root","root");
					PreparedStatement stmt=(PreparedStatement)con.prepareStatement("insert into custdetails(custname,custadd,custphno,custadhar,noofdays,floorno,roomno)values(?,?,?,?,?,?,?)");
                    stmt.setString(1,name);
                    stmt.setString(2,add);
                    stmt.setString(3,phno);
                    stmt.setString(4,adhar);
                    stmt.setString(5,romalot);
                    stmt.setString(6,floor);
                    stmt.setString(7,room1);
					stmt.executeUpdate();
				
				      JOptionPane.showMessageDialog(null,"data added"); 
				
			          }catch(Exception e2) {System.out.println(e2);}
			           }});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(90, 392, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("No of days room taken for");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(56, 290, 193, 14);
		contentPane.add(lblNewLabel_5);
		
		textField_24 = new JTextField();
		textField_24.setBounds(329, 289, 363, 20);
		contentPane.add(textField_24);
		textField_24.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Phone Number");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_6.setBounds(120, 296, 89, -13);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Phone Number");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_7.setBounds(75, 193, 174, 14);
		contentPane.add(lblNewLabel_7);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { jframe3 j3=new jframe3();
			j3.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(643, 438, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_8 = new JLabel("Room Alotted");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_8.setBounds(74, 337, 193, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("FLOOR");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_9.setBounds(230, 339, 69, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("ROOM NO");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_10.setBounds(391, 339, 89, 14);
		contentPane.add(lblNewLabel_10);
		
		f1 = new JRadioButton("Floor 1");
		f1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f1.isSelected())
				{f2.setSelected(false);
				f3.setSelected(false);
				f4.setSelected(false);
				f5.setSelected(false);
				
				}
			}
		});
		f1.setFont(new Font("Tahoma", Font.BOLD, 11));
		f1.setBounds(299, 337, 69, 23);
		contentPane.add(f1);
		
		f2 = new JRadioButton("Floor 2");
		f2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f2.isSelected())
				{f1.setSelected(false);
				f3.setSelected(false);
				f4.setSelected(false);
				f5.setSelected(false);
				
				}
			}
		});
		f2.setFont(new Font("Tahoma", Font.BOLD, 11));
		f2.setBounds(299, 366, 69, 23);
		contentPane.add(f2);
		
		f3 = new JRadioButton("Floor 3");
		f3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f3.isSelected())
				{f2.setSelected(false);
				f1.setSelected(false);
				f4.setSelected(false);
				f5.setSelected(false);
				
				}
			}
		});
		f3.setFont(new Font("Tahoma", Font.BOLD, 11));
		f3.setBounds(299, 392, 69, 23);
		contentPane.add(f3);
		
		f4 = new JRadioButton("Floor 4");
		f4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f4.isSelected())
				{f2.setSelected(false);
				f3.setSelected(false);
				f1.setSelected(false);
				f5.setSelected(false);
				
				}
			}
		});
		f4.setFont(new Font("Tahoma", Font.BOLD, 11));
		f4.setBounds(299, 412, 69, 23);
		contentPane.add(f4);
		
		f5 = new JRadioButton("Floor 5");
		f5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f5.isSelected())
				{f2.setSelected(false);
				f3.setSelected(false);
				f4.setSelected(false);
				f1.setSelected(false);
				
				}
			}
		});
		f5.setFont(new Font("Tahoma", Font.BOLD, 11));
		f5.setBounds(299, 438, 69, 23);
		contentPane.add(f5);
		
		r1 = new JRadioButton("Room 1");
		r1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(r1.isSelected()) {
					r2.setSelected(false);
					r3.setSelected(false);
					r4.setSelected(false);
					r5.setSelected(false);
					r6.setSelected(false);
				}
			}
		});
		r1.setFont(new Font("Tahoma", Font.BOLD, 11));
		r1.setBounds(475, 316, 109, 23);
		contentPane.add(r1);
		
		r2 = new JRadioButton("Room 2");
		r2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(r2.isSelected()) {
					r1.setSelected(false);
					r3.setSelected(false);
					r4.setSelected(false);
					r5.setSelected(false);
					r6.setSelected(false);
				}
			}
		});
		r2.setFont(new Font("Tahoma", Font.BOLD, 11));
		r2.setBounds(475, 339, 109, 23);
		contentPane.add(r2);
		
		r3 = new JRadioButton("Room 3");
		r3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(r3.isSelected()) {
					r2.setSelected(false);
					r1.setSelected(false);
					r4.setSelected(false);
					r5.setSelected(false);
					r6.setSelected(false);
				}
			}
		});
		r3.setFont(new Font("Tahoma", Font.BOLD, 11));
		r3.setBounds(475, 366, 109, 23);
		contentPane.add(r3);
		
		r4 = new JRadioButton("Room 4");
		r4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(r4.isSelected()) {
					r2.setSelected(false);
					r3.setSelected(false);
					r1.setSelected(false);
					r5.setSelected(false);
					r6.setSelected(false);
				}
			}
		});
		r4.setFont(new Font("Tahoma", Font.BOLD, 11));
		r4.setBounds(475, 392, 109, 23);
		contentPane.add(r4);
		
		r5 = new JRadioButton("Room 5");
		r5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(r5.isSelected()) {
					r2.setSelected(false);
					r3.setSelected(false);
					r4.setSelected(false);
					r1.setSelected(false);
					r6.setSelected(false);
				}
			}
		});
		r5.setFont(new Font("Tahoma", Font.BOLD, 11));
		r5.setBounds(475, 418, 109, 23);
		contentPane.add(r5);
		
		r6 = new JRadioButton("Room 6");
		r6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(r6.isSelected()) {
					r2.setSelected(false);
					r3.setSelected(false);
					r4.setSelected(false);
					r5.setSelected(false);
					r1.setSelected(false);
				}
			}
		});
		r6.setFont(new Font("Tahoma", Font.BOLD, 11));
		r6.setBounds(475, 444, 109, 23);
		contentPane.add(r6);
	
	}
}



