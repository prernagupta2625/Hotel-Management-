package winbuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JTree;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class jframe6 extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
 String roomselected;
	 String room;int f=0;
	 String floor;String user;String add;String phno;String adh;String noofdays;int rate;String value;int v;int sum;int sum1;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {jframe6 frame = new jframe6();
			
					
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
	public jframe6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 797, 487);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		DefaultMutableTreeNode f1=new DefaultMutableTreeNode("1st Floor");
		DefaultMutableTreeNode r11=new DefaultMutableTreeNode("11");
		DefaultMutableTreeNode r12=new DefaultMutableTreeNode("12");
		DefaultMutableTreeNode r13=new DefaultMutableTreeNode("13");
		DefaultMutableTreeNode r14=new DefaultMutableTreeNode("14");
		DefaultMutableTreeNode r15=new DefaultMutableTreeNode("15");
		DefaultMutableTreeNode r16=new DefaultMutableTreeNode("16");
		
		DefaultMutableTreeNode f2=new DefaultMutableTreeNode("2nd FLoor");
		DefaultMutableTreeNode r21=new DefaultMutableTreeNode("21");
		DefaultMutableTreeNode r22=new DefaultMutableTreeNode("22");
		DefaultMutableTreeNode r23=new DefaultMutableTreeNode("23");
		DefaultMutableTreeNode r24=new DefaultMutableTreeNode("24");
		DefaultMutableTreeNode r25=new DefaultMutableTreeNode("25");
		DefaultMutableTreeNode r26=new DefaultMutableTreeNode("26");
		
		DefaultMutableTreeNode f3=new DefaultMutableTreeNode("3rd Floor");
		DefaultMutableTreeNode r31=new DefaultMutableTreeNode("31");
		DefaultMutableTreeNode r32=new DefaultMutableTreeNode("32");
		DefaultMutableTreeNode r33=new DefaultMutableTreeNode("33");
		DefaultMutableTreeNode r34=new DefaultMutableTreeNode("34");
		DefaultMutableTreeNode r35=new DefaultMutableTreeNode("35");
		DefaultMutableTreeNode r36=new DefaultMutableTreeNode("36");
		
		DefaultMutableTreeNode f4=new DefaultMutableTreeNode("4th FLoor");
		DefaultMutableTreeNode r41=new DefaultMutableTreeNode("41");
		DefaultMutableTreeNode r42=new DefaultMutableTreeNode("42");
		DefaultMutableTreeNode r43=new DefaultMutableTreeNode("43");
		DefaultMutableTreeNode r44=new DefaultMutableTreeNode("44");
		DefaultMutableTreeNode r45=new DefaultMutableTreeNode("45");
		DefaultMutableTreeNode r46=new DefaultMutableTreeNode("46");
		
		DefaultMutableTreeNode f5=new DefaultMutableTreeNode("5th FLoor");
		DefaultMutableTreeNode r51=new DefaultMutableTreeNode("51");
		DefaultMutableTreeNode r52=new DefaultMutableTreeNode("52");
		DefaultMutableTreeNode r53=new DefaultMutableTreeNode("53");
		DefaultMutableTreeNode r54=new DefaultMutableTreeNode("54");
		DefaultMutableTreeNode r55=new DefaultMutableTreeNode("55");
		DefaultMutableTreeNode r56=new DefaultMutableTreeNode("56");
		
		f1.add(r11);
		f1.add(r12);f1.add(r13);f1.add(r14);f1.add(r15);f1.add(r16);
		
		f2.add(r21);f2.add(r22);f2.add(r23);f2.add(r24);f2.add(r25);f2.add(r26);
		f3.add(r31);f3.add(r32);f3.add(r33);f3.add(r34);f3.add(r35);f3.add(r36);
		f4.add(r41);f4.add(r42);f4.add(r43);f4.add(r44);f4.add(r45);f4.add(r46);
		f5.add(r51);f5.add(r52);f5.add(r53);f5.add(r54);f5.add(r55);f5.add(r56);
		
		DefaultMutableTreeNode rootnode=new DefaultMutableTreeNode("ROOMS");
		rootnode.add(f1);rootnode.add(f2);rootnode.add(f3);rootnode.add(f4);rootnode.add(f5);
		JTree tree = new JTree(rootnode);
	      
		tree.setBounds(10, 11, 183, 426);
		contentPane.add(tree);
		
		panel = new JPanel();
		panel.setBounds(213, 11, 535, 426);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(132, 24, 88, 38);
		panel.add(lblNewLabel_1);
		
		lblNewLabel = new JLabel("Address");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(151, 73, 69, 31);
		panel.add(lblNewLabel);
		
		lblNewLabel_2 = new JLabel("Phone Number");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(104, 125, 119, 14);
		panel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Aadhar Number");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(101, 167, 119, 20);
		panel.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("No of days room taken for");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(68, 204, 193, 14);
		panel.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(249, 19, 276, 27);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(249, 78, 276, 24);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(249, 121, 276, 27);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(249, 164, 268, 31);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(271, 204, 125, 31);
		panel.add(textField_4);
		JCheckBox checkbox = new JCheckBox(" PAID");
		checkbox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		checkbox.setBounds(374, 368, 97, 23);
		panel.add(checkbox);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(420, 204, 105, 31);
		panel.add(textField_5);
		
		JLabel lblNewLabel_5 = new JLabel("Total Food Ordered Cost");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(75, 249, 203, 14);
		panel.add(lblNewLabel_5);
		
		JButton button = new JButton("CHECK OUT");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(checkbox.isSelected())
				{JOptionPane.showMessageDialog(null,"Are You Sure you want to  CHECK OUT");
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","root","root");
					PreparedStatement stmt=(PreparedStatement)con.prepareStatement("Delete from custdetails where roomno="+textField_11.getText()+" and floorno="+textField_10.getText()+"");
					stmt.executeUpdate();
					JOptionPane.showMessageDialog(null,"CheckOut Successful");
			   con.close();
			}catch(Exception e1) {System.out.println(e1);}
				}else {JOptionPane.showMessageDialog(null,"Select the PAID option");}}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBounds(24, 360, 125, 38);
		
			panel.add(button);
		
		
		
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(420, 243, 105, 31);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(420, 290, 105, 31);
		panel.add(textField_7);
		
		JLabel lblNewLabel_6 = new JLabel("+");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_6.setBounds(388, 289, 22, -21);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("TOTAL AMOUNT ");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_7.setBounds(271, 295, 125, 38);
		panel.add(lblNewLabel_7);
		
		
		
		textField_10 = new JTextField();
		textField_10.setBounds(54, 8, 31, 20);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(54, 35, 31, 20);
		panel.add(textField_11);
		
		JLabel lblNewLabel_8 = new JLabel("Floor No");
		lblNewLabel_8.setBounds(10, 11, 46, 14);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1 = new JLabel("Room No");
		lblNewLabel_8_1.setBounds(10, 38, 46, 14);
		panel.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_9 = new JLabel("+");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_9.setBounds(388, 248, 14, 14);
		panel.add(lblNewLabel_9);
		
		JButton btnNewButton_1 = new JButton("show");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultMutableTreeNode selected=(DefaultMutableTreeNode)tree.getSelectionPath().getLastPathComponent();
				roomselected=selected.getUserObject().toString();
				 room=roomselected.substring(1);
				floor=roomselected.substring(0,1);
				textField_10.setText(floor);
				textField_11.setText(room);
			}
		});
		btnNewButton_1.setBounds(10, 73, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {jframe4 j20=new jframe4();
			j20.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_2.setBounds(199, 370, 89, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("Fetch");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","root","root");
					Statement stmt=con.createStatement();
					ResultSet rs=stmt.executeQuery("Select * from custdetails ");
				    while(rs.next())
				    {if(rs.getString(6).equals(floor)&&rs.getString(7).equals(room)) {f++;
				    	user=rs.getString(1);
				     add=rs.getString(2);
				     phno=rs.getString(3);
				     noofdays=rs.getString(5);
				     adh=rs.getString(4);			   
				     break;}}			    
				    textField.setText(user);
				     textField_1.setText(add);
				     textField_2.setText(phno);
				     textField_3.setText(adh);
				     textField_4.setText(noofdays);
				     if(room.equals("1")||room.equals("2")){rate=1500;}
				     if(room.equals("3")) {rate=2000;}
				     if(room.equals("4")||room.equals("5")||room.equals("6") ){rate=2500;}
				     v=Integer.parseInt(noofdays)*rate;
				     value=String.valueOf(v);
				    textField_5.setText(value);
				    if(f==0) {JOptionPane.showMessageDialog(null,"Room not Occupied");}
				    con.close();
				}catch(Exception e1) {System.out.println(e1);}
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","root","root");
					Statement stmt=con.createStatement();
					ResultSet rs=stmt.executeQuery("Select * from food ");
					
				    while(rs.next())
				    {if(rs.getString(3).equals(floor)&&rs.getString(4).equals(room)) {
				    	sum=sum+rs.getInt(2);
				    }
				    }}
				    catch(Exception e2) {System.out.println(e2);}
				textField_6.setText(String.valueOf(sum));
				sum1=v+sum;
				textField_7.setText(String.valueOf(sum1));
			}
		});
		btnNewButton_1_1.setBounds(10, 116, 89, 23);
		
		panel.add(btnNewButton_1_1);
		
		
		textField_8 = new JTextField();
		textField_8.setBounds(36, 275, 86, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(36, 275, 86, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
	}
}
