package MYFORM;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.security.auth.callback.LanguageCallback;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class StaffForm implements ActionListener{
	JFrame frame;//id;fname;lname;email;telephone;
	JLabel id_lb=new JLabel("id");
	JLabel fname_lb=new JLabel("fname");
	JLabel lname_lb=new JLabel("lName");
	JLabel email_lb=new JLabel("email");
	JLabel telephone_lb=new JLabel("Telephone");
	JLabel paymentid_lb = new JLabel("Payment_id");
	
	JTextField id_txf=new JTextField();
	JTextField fname_txf=new JTextField();
	JTextField lname_txf=new JTextField();
	JTextField email_txf=new JTextField();
	JTextField telephone_txf=new JTextField();
    JTextField paymentid_texField=new JTextField();
    
	
	//Buttons CRUD
	JButton insert_btn=new JButton("Insert");
	JButton Read_btn=new JButton("View");
	JButton update_tbtn=new JButton("Update");
	JButton delete_btn=new JButton("Delete");
	Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
	int w=(int) screensize.getWidth();
	int h=(int) screensize.getHeight();
	public StaffForm() {
		createForm();

	}
	private void ActionEvent() {
		insert_btn.addActionListener(this);
insert_btn.addActionListener(new ActionListener() {
			
			public void actionPerformed(java.awt.event.ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");	
					Connection connection=DriverManager
							.getConnection("jdbc:mysql://localhost:3306/hostel_reservation_management_system","root","");
					String query="INSERT INTO staff VALUES(?,?,?,?,?,?)";
					PreparedStatement pStatement=connection.prepareStatement(query);
					pStatement.setInt(1,Integer.parseInt(id_txf.getText()));
					pStatement.setString(2, fname_txf.getText());
					pStatement.setString(3, lname_txf.getText());
					pStatement.setString(4, email_txf.getText());
					pStatement.setString(5, telephone_txf.getText());
					pStatement.setString(6, paymentid_texField.getText());
					pStatement.executeUpdate();
					JOptionPane.showMessageDialog(insert_btn, "data inserted well");
					pStatement.close();
					connection.close();	
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
				
			}
		});
		Read_btn.addActionListener(this);
		update_tbtn.addActionListener(this);
		delete_btn.addActionListener(this);
		
	}
	private void createForm() {
		frame=new JFrame();
		frame.setTitle("StaffForm");
		frame.setBounds(0, 0, w/2, h/2);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		setLocationandSize();
	}
	

	private void setLocationandSize() {
		id_lb.setBounds(10, 10, 100, 30);
		fname_lb.setBounds(10, 50, 100, 30);
		lname_lb.setBounds(10, 90, 100, 30);
		email_lb.setBounds(10, 130, 100, 30);
		telephone_lb.setBounds(10, 170, 100, 30);
		paymentid_lb.setBounds(10, 210, 100,30);
		
		id_txf.setBounds(160, 10, 130, 30);
		fname_txf.setBounds(160, 50, 130, 30);
		lname_txf.setBounds(160, 90, 130, 30);
		email_txf.setBounds(160, 130, 130, 30);
		telephone_txf.setBounds(160, 170, 130, 30);
		paymentid_texField.setBounds(160, 210, 130, 30);
		//Buttons CRUD
		insert_btn.setBounds(10,250, 85, 30);
		Read_btn.setBounds(100,250, 85, 30);
		update_tbtn.setBounds(190,250, 85, 30);
		delete_btn.setBounds(280,250, 85, 30);
		setFontforall();
		addcomponentforFrame();

	}
	private void setFontforall() {
		Font font = new Font("Georgia", Font.BOLD, 18);

		id_lb.setFont(font);
		fname_lb.setFont(font);
		lname_lb.setFont(font);
		email_lb.setFont(font);
		telephone_lb.setFont(font);
		paymentid_lb.setFont(font);

		id_txf.setFont(font);
		fname_txf.setFont(font);
		lname_txf.setFont(font);
		email_txf.setFont(font);
		telephone_txf.setFont(font);
		paymentid_texField.setFont(font);
		;
		//Buttons CRUD
		Font fonti = new Font("Courier New", Font.ITALIC, 12);

		insert_btn.setFont(fonti);
		Read_btn.setFont(fonti);
		update_tbtn.setFont(fonti);
		delete_btn.setFont(fonti);

	}
	private void addcomponentforFrame() {
		frame.add(id_lb);
		frame.add(fname_lb);
		frame.add(lname_lb);
		frame.add(email_lb);
		frame.add(telephone_lb);
		frame.add(paymentid_lb);
	
		
		frame.add(id_txf);
		frame.add(fname_txf);
		frame.add(lname_txf);
		frame.add(email_txf);
		frame.add(telephone_txf);
		frame.add(paymentid_texField);
				//Buttons CRUD
		frame.add(insert_btn);
		frame.add(Read_btn);
		frame.add(update_tbtn);
		frame.add(delete_btn);
		ActionEvent();
	}
	public static void main(String[] args) {
		StaffForm stf=new StaffForm();


}
	@Override
	public void actionPerformed(java.awt.event.ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
		
	}



