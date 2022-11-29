package winbuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import javax.swing.JTree;
import javax.swing.JSplitPane;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class jframe5 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTextField textField_1;
  public static String foodselected;
  public static int spinvalue;
  int cost;
  private JTextField textField_3;
  private JTextField textField_4;
  private JTextField textField_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					jframe5 frame = new jframe5();
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
	public jframe5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 792, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		DefaultMutableTreeNode b=new DefaultMutableTreeNode("Breakfast");
		DefaultMutableTreeNode b1=new DefaultMutableTreeNode("Sambar Vada");
		DefaultMutableTreeNode b2=new DefaultMutableTreeNode("Plain Dosa");
		DefaultMutableTreeNode b3=new DefaultMutableTreeNode("Masala Dosa");
		DefaultMutableTreeNode b4=new DefaultMutableTreeNode("Poha");
		DefaultMutableTreeNode b5=new DefaultMutableTreeNode("Upman");
		DefaultMutableTreeNode b6=new DefaultMutableTreeNode("Uthapam");
		
		DefaultMutableTreeNode lun=new DefaultMutableTreeNode("Lunch");
		DefaultMutableTreeNode l=new DefaultMutableTreeNode("Dishes");
		DefaultMutableTreeNode l1=new DefaultMutableTreeNode("Chole Bhature");
		DefaultMutableTreeNode l2=new DefaultMutableTreeNode("Malai Chap");
		DefaultMutableTreeNode l3=new DefaultMutableTreeNode("Dal Makhni");
		DefaultMutableTreeNode l4=new DefaultMutableTreeNode("Shahi Paneer");
		DefaultMutableTreeNode l5=new DefaultMutableTreeNode("Matar Paneer");
		DefaultMutableTreeNode l6=new DefaultMutableTreeNode("Malai Kafta");
		
		DefaultMutableTreeNode l7=new DefaultMutableTreeNode("Chapati and other breads");
		DefaultMutableTreeNode l8=new DefaultMutableTreeNode("Tandoori Roti");
		DefaultMutableTreeNode l9=new DefaultMutableTreeNode("Butter Naan");
		DefaultMutableTreeNode l10=new DefaultMutableTreeNode("Chawal");
		DefaultMutableTreeNode l11=new DefaultMutableTreeNode("Lacha Naan");
		DefaultMutableTreeNode l12=new DefaultMutableTreeNode("Garlic Naan");
		DefaultMutableTreeNode l13=new DefaultMutableTreeNode("Plain Naan");
		
		DefaultMutableTreeNode d=new DefaultMutableTreeNode("Dinner");
		DefaultMutableTreeNode d1=new DefaultMutableTreeNode("Paneer Butter Masala");
		DefaultMutableTreeNode d2=new DefaultMutableTreeNode("Kadai Paneer");
		DefaultMutableTreeNode d3=new DefaultMutableTreeNode("Vegetable Korma");
		DefaultMutableTreeNode d4=new DefaultMutableTreeNode("Rajma");
		DefaultMutableTreeNode d5=new DefaultMutableTreeNode("Lentils and Beans");
		DefaultMutableTreeNode d6=new DefaultMutableTreeNode("Rice and Biryani");
		
		DefaultMutableTreeNode D=new DefaultMutableTreeNode("Desserts");
		DefaultMutableTreeNode D1=new DefaultMutableTreeNode("Ras Malai");
		DefaultMutableTreeNode D2=new DefaultMutableTreeNode("Gulab Jamun");
		DefaultMutableTreeNode D3=new DefaultMutableTreeNode("Gajar Ka Halwa");
		DefaultMutableTreeNode D4=new DefaultMutableTreeNode("Sandesh");
		DefaultMutableTreeNode D5=new DefaultMutableTreeNode("Modak");
		DefaultMutableTreeNode D6=new DefaultMutableTreeNode("Aam Shrikhand");
		
		b.add(b1);b.add(b2);b.add(b3);b.add(b4);b.add(b5);b.add(b6);
		lun.add(l);lun.add(l7);
		l.add(l1);l.add(l2);l.add(l3);l.add(l4);l.add(l5);l.add(l6);l7.add(l8);l7.add(l9);l7.add(l10);l7.add(l11);l8.add(l12);l7.add(l13);
		d.add(d1);d.add(d1);d.add(d2);d.add(d3);d.add(d4);d.add(d5);d.add(d6);
		D.add(D1);D.add(D2);D.add(D3);D.add(D4);D.add(D5);D.add(D6);
		DefaultMutableTreeNode node=new DefaultMutableTreeNode("MENU");
		node.add(b);;
		node.add(lun);
		node.add(d);
		node.add(D);
		contentPane.setLayout(null);
		
		JTree tree = new JTree(node);
		tree.setBounds(8, 11, 249, 438);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		contentPane.add(tree);
		
		JPanel panel = new JPanel();
		panel.setBounds(267, 11, 486, 438);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { jframe4 j21=new jframe4();
			j21.setVisible(true);
			}
		});
		btnNewButton.setBounds(10, 404, 89, 23);
		panel.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 184, 36);
		panel.add(textField);
		textField.setColumns(10);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(218, 19, 30, 20);
		panel.add(spinner);
		
		table = new JTable();
		table.setBounds(126, 180, 54, -29);
		panel.add(table);
		
		table_1 = new JTable();
		table_1.setBounds(37, 319, 376, -205);
		panel.add(table_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(206, 110, 256, 267);
		panel.add(scrollPane);
		
		table_2 = new JTable();
		scrollPane.setViewportView(table_2);
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.setBounds(320, 404, 89, 23);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Floor No");
		lblNewLabel.setBounds(322, 22, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblRoomNo = new JLabel("Room No");
		lblRoomNo.setBounds(322, 47, 46, 17);
		panel.add(lblRoomNo);
		
		textField_1 = new JTextField();
		textField_1.setBounds(383, 11, 60, 25);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Show");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultMutableTreeNode selected=(DefaultMutableTreeNode)tree.getSelectionPath().getLastPathComponent();
				foodselected=selected.getUserObject().toString();
				
				textField.setText(foodselected);
				spinvalue=Integer.parseInt(spinner.getValue().toString());
				
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","root","root");
					Statement stmt=con.createStatement();
					ResultSet rs=stmt.executeQuery("Select * from price");
					
				    while(rs.next())
				    { if(rs.getString(1).equals(foodselected))
				     {cost=rs.getInt(2);}
				    } 
				    System.out.println(cost);
				
				    con.close();
				}catch(Exception e1) {System.out.println(e1);}
				textField_3.setText(String.valueOf(cost));
				textField_4.setText(String.valueOf(cost*spinvalue));
						
			
			}});
		btnNewButton_2.setBounds(160, 58, 76, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("ADD");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			if((textField_2.getText()).equals(null)||(textField_1.getText()).equals(null)) {JOptionPane.showMessageDialog(null,"Either the floor no or the room no is not entered");
				}else
			{ 
				
				
				try{Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","root","root");
				
				
					
				PreparedStatement stmt=(PreparedStatement)con.prepareStatement("insert into food(meal,sum,floorno,roomno)values(?,?,?,?)");
             
            	  
            	  stmt.setString(1,foodselected);
				
                stmt.setInt(2,(spinvalue*cost));
                stmt.setInt(3,Integer.parseInt(textField_1.getText()));
                stmt.setInt(4,Integer.parseInt(textField_2.getText()));
               
				stmt.executeUpdate();
				JOptionPane.showMessageDialog(null,";data added");
				}catch(Exception e3){System.out.println(e3);}
			
			}}	
		
			
		});
		btnNewButton_3.setBounds(49, 196, 89, 36);
		panel.add(btnNewButton_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(110, 108, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(110, 139, 86, 20);
		panel.add(textField_4);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(378, 43, 60, 25);
		panel.add(textField_2);
		
		JLabel lblNewLabel_1 = new JLabel("Each item cost");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 109, 99, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Total Cost");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 142, 76, 14);
		panel.add(lblNewLabel_2);
	}
}
