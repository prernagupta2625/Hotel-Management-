package winbuilder;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import java.lang.*
;public class HM {

	JFrame frame;
	private final JLabel lblNewLabel = new JLabel("Username");
	private JTextField textField;
	private JTextField textField_1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HM window = new HM();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HM() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GREEN);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		lblNewLabel.setBackground(Color.PINK);
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 19));
		lblNewLabel.setBounds(64, 40, 98, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 19));
		lblNewLabel_1.setBounds(58, 124, 104, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				
			}
		});
		textField.setBounds(230, 49, 123, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(235, 133, 118, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jframe4 j =new jframe4();
				String get_pass = null;
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","root");
					Statement stmt=con.createStatement();
					ResultSet rs=stmt.executeQuery("Select pass from employee where user="+textField.getText()+"");
					
				    while(rs.next())
				    { 
				     get_pass=rs.getString(1);
				    } 
				    if(get_pass.equals(textField_1.getText()))
				    { 
				    j.setVisible(true);
				    }
				    else {
				    JOptionPane.showMessageDialog(null,"Wrong id or password");
				    }
				    con.close();
				}catch(Exception e1) {System.out.println(e1);}
				
			}
		});
		btnNewButton.setBounds(150, 177, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
