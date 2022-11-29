package winbuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.JSlider;
import javax.swing.JTextPane;
import javax.swing.JTree;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class jframe3 extends JFrame {
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
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
    static String room[][]=new String[5][6];
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jframe3 frame = new jframe3();
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
	
	public jframe3() {
		getContentPane().setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 805, 483);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FLoor/Room type");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblNewLabel.setBounds(10, 23, 112, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblstFloor = new JLabel("1st Floor");
		lblstFloor.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblstFloor.setBounds(37, 68, 63, 14);
		getContentPane().add(lblstFloor);
		
		JLabel lblndFloor = new JLabel("2nd Floor");
		lblndFloor.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblndFloor.setBounds(37, 121, 63, 14);
		getContentPane().add(lblndFloor);
		
		JLabel lblrdFloor = new JLabel("3rd Floor");
		lblrdFloor.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblrdFloor.setBounds(37, 178, 63, 14);
		getContentPane().add(lblrdFloor);
		
		JLabel lblthFloor = new JLabel("4th Floor");
		lblthFloor.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblthFloor.setBounds(37, 236, 63, 14);
		getContentPane().add(lblthFloor);
		
		JLabel lblNewLabel_5 = new JLabel("5th Floor");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(37, 291, 63, 14);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblCasual = new JLabel("Casual");
		lblCasual.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCasual.setBounds(142, 22, 63, 14);
		getContentPane().add(lblCasual);
		
		JLabel lblDeluxe = new JLabel("Deluxe");
		lblDeluxe.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDeluxe.setBounds(335, 22, 62, 14);
		getContentPane().add(lblDeluxe);
		
		JLabel lblSuperDeluxe = new JLabel("Super Deluxe");
		lblSuperDeluxe.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSuperDeluxe.setBounds(420, 22, 100, 14);
		getContentPane().add(lblSuperDeluxe);
		
		JLabel lblSuperDeluxe_1 = new JLabel("Super Deluxe");
		lblSuperDeluxe_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSuperDeluxe_1.setBounds(529, 22, 100, 14);
		getContentPane().add(lblSuperDeluxe_1);
		
		JLabel lblConference = new JLabel("Conference");
		lblConference.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblConference.setBounds(639, 22, 100, 14);
		getContentPane().add(lblConference);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setBounds(132, 65, 86, 31);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(240, 65, 86, 31);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(336, 65, 86, 31);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(432, 65, 86, 31);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(543, 65, 86, 31);
		getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(639, 65, 86, 31);
		getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBackground(Color.WHITE);
		textField_6.setColumns(10);
		textField_6.setBounds(132, 114, 86, 31);
		getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(132, 175, 86, 31);
		getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(132, 225, 86, 38);
		getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(132, 274, 86, 31);
		getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(240, 118, 86, 31);
		getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(240, 277, 86, 29);
		getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(240, 228, 86, 31);
		getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(240, 175, 86, 31);
		getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(336, 118, 86, 31);
		getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(336, 175, 86, 31);
		getContentPane().add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(336, 225, 86, 31);
		getContentPane().add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(336, 274, 86, 31);
		getContentPane().add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(432, 118, 86, 31);
		getContentPane().add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(432, 175, 86, 31);
		getContentPane().add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(432, 225, 86, 31);
		getContentPane().add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(432, 274, 86, 31);
		getContentPane().add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(543, 118, 86, 31);
		getContentPane().add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(543, 175, 86, 31);
		getContentPane().add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(543, 225, 86, 31);
		getContentPane().add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(543, 274, 86, 31);
		getContentPane().add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(639, 118, 86, 31);
		getContentPane().add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(639, 175, 86, 31);
		getContentPane().add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(639, 225, 86, 31);
		getContentPane().add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(639, 274, 86, 31);
		getContentPane().add(textField_29);
		
		JButton btnNewButton = new JButton("REFRESH");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String get_floor=null;
				String get_room=null;
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","root","root");
					Statement stmt=con.createStatement();
                     ResultSet rs;
					for(int i=0;i<5;i++)
					{	for(int h=0;h<6;h++)
					{
					 rs=stmt.executeQuery("select floorno,roomno  from custdetails ");
					
				    while(rs.next())
				    { 
				     get_floor=rs.getString("floorno");
				     get_room=rs.getString("roomno");
				    System.out.println(get_floor);
				    System.out.println(get_room);
				    if(get_floor.equals(Integer.toString(i+1))&&get_room.equals(Integer.toString(h+1)))
				    { 
				    room[i][h]="occupied";
				    }
				    }
					}}
				    con.close();
				}catch(Exception e1) {System.out.println(e1);}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				for(int i=0;i<5;i++)
				{	for(int h=0;h<6;h++)
				{
					
					System.out.print(room[i][h]);
				}System.out.println();
				
				}
				
				
				if(room[0][0]==null)
				{ textField.setBackground(Color.GREEN);
			}else {textField.setBackground(Color.RED);}

				if(room[0][1]==null)
				{ textField_1.setBackground(Color.GREEN);
			}else {textField_1.setBackground(Color.RED);}
				
				if(room[0][2]==null)
				{ textField_2.setBackground(Color.GREEN);
			}else {textField_2.setBackground(Color.RED);}
				
				if(room[0][3]==null)
				{ textField_3.setBackground(Color.GREEN);
			}else {textField_3.setBackground(Color.RED);}
				
			if(room[0][4]==null)
				{ textField_4.setBackground(Color.GREEN);
			}else {textField_4.setBackground(Color.RED);}
				
			
			if(room[0][5]==null)
				{ textField_5.setBackground(Color.GREEN);
			}else {textField_5.setBackground(Color.RED);}

if(room[1][0]==null)
	{ textField_6.setBackground(Color.GREEN);
}else {textField_6.setBackground(Color.RED);}

if(room[1][1]==null)
	{ textField_10.setBackground(Color.GREEN);
}else {textField_10.setBackground(Color.RED);
}

if(room[1][2]==null)
	{ textField_14.setBackground(Color.GREEN);
}else {textField_14.setBackground(Color.RED);
}
if(room[1][3]==null)
	{ textField_18.setBackground(Color.GREEN);
}else {textField_18.setBackground(Color.RED);
}
if(room[1][4]==null)
{ textField_22.setBackground(Color.GREEN);
}else {textField_22.setBackground(Color.RED);
}
if(room[1][5]==null)
{ textField_26.setBackground(Color.GREEN);
}else {textField_26.setBackground(Color.RED);
}
if(room[2][0]==null)
{ textField_7.setBackground(Color.GREEN);
}else {textField_7.setBackground(Color.RED);}

if(room[2][1]==null)
{ textField_13.setBackground(Color.GREEN);
}else {textField_13.setBackground(Color.RED);}

if(room[2][2]==null)
{ textField_15.setBackground(Color.GREEN);
}else {textField_15.setBackground(Color.RED);}

if(room[2][3]==null)
{ textField_19.setBackground(Color.GREEN);
}else {textField_19.setBackground(Color.RED);}

if(room[2][4]==null)
{ textField_23.setBackground(Color.GREEN);
}else {textField_23.setBackground(Color.RED);}


if(room[2][5]==null)
{ textField_27.setBackground(Color.GREEN);
}else {textField_27.setBackground(Color.RED);}

if(room[3][0]==null)
{ textField_8.setBackground(Color.GREEN);
}else {textField_8.setBackground(Color.RED);}

if(room[3][1]==null)
{ textField_12.setBackground(Color.GREEN);
}else {textField_12.setBackground(Color.RED);
}

if(room[3][2]==null)
{ textField_16.setBackground(Color.GREEN);
}else {textField_16.setBackground(Color.RED);
}
if(room[3][3]==null)
{ textField_20.setBackground(Color.GREEN);
}else {textField_20.setBackground(Color.RED);
}
if(room[3][4]==null)
{ textField_24.setBackground(Color.GREEN);
}else {textField_24.setBackground(Color.RED);
}
if(room[3][5]==null)
{ textField_28.setBackground(Color.GREEN);
}else {textField_28.setBackground(Color.RED);
}		
if(room[4][0]==null)
{ textField_9.setBackground(Color.GREEN);
}else {textField_9.setBackground(Color.RED);}

if(room[4][1]==null)
{ textField_11.setBackground(Color.GREEN);
}else {textField_11.setBackground(Color.RED);
}

if(room[4][2]==null)
{ textField_17.setBackground(Color.GREEN);
}else {textField_17.setBackground(Color.RED);
}
if(room[4][3]==null)
{ textField_21.setBackground(Color.GREEN);
}else {textField_21.setBackground(Color.RED);
}
if(room[4][4]==null)
{ textField_25.setBackground(Color.GREEN);
}else {textField_25.setBackground(Color.RED);
}
if(room[4][5]==null)
{ textField_29.setBackground(Color.GREEN);
}else {textField_29.setBackground(Color.RED);
}		
				
				
				
				
				
				
			}	});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(351, 392, 106, 41);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Casual");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(247, 24, 63, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("1500");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(153, 341, 46, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("1500");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2_1.setBounds(261, 341, 46, 14);
		getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("New label");
		lblNewLabel_2_2.setBounds(357, 361, 46, -6);
		getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("2500");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2_3.setBounds(454, 343, 46, 14);
		getContentPane().add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("2500");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2_4.setBounds(566, 343, 46, 14);
		getContentPane().add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("2500 per hour");
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_2_5.setBounds(639, 343, 100, 14);
		getContentPane().add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("2000");
		lblNewLabel_2_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2_6.setBounds(351, 343, 46, 14);
		getContentPane().add(lblNewLabel_2_6);
		
		JLabel lblNewLabel_2_7 = new JLabel("Rent per day in Rupees");
		lblNewLabel_2_7.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_2_7.setBounds(10, 343, 128, 14);
		getContentPane().add(lblNewLabel_2_7);
		
		btnNewButton_1 = new JButton("NEXT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jframe2 j2=new  jframe2();
				j2.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(654, 403, 89, 23);
		getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jframe4 j6=new jframe4();
				j6.setVisible(true);
				
			}
		});
		btnNewButton_2.setBounds(59, 403, 89, 23);
		getContentPane().add(btnNewButton_2);
	}
}
