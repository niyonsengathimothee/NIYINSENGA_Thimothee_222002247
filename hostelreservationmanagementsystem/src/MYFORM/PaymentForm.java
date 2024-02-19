package MYFORM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PaymentForm implements ActionListener {
    JFrame frame;
    JLabel id_lb, Paymentmethod_lb, Paymentamount_lb, Paymentstatus_lb, Paymentdate_lb;
    JTextField id_txf, Paymentmethod_txf, Paymentamount_txf, Paymentstatus_txf, Paymentdate_txf;
    JButton insert_btn, Read_btn, update_btn, delete_btn;

    public PaymentForm() {
        createForm();
    }

    private void createForm() {
        frame = new JFrame();
        frame.setTitle("PaymentForm");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);

        id_lb = new JLabel("id");
        Paymentmethod_lb = new JLabel("Paymentmethod");
        Paymentamount_lb = new JLabel("Paymentamount");
        Paymentstatus_lb = new JLabel("Paymentstatus");
        Paymentdate_lb = new JLabel("Paymentdate");

        id_txf = new JTextField();
        Paymentmethod_txf = new JTextField();
        Paymentamount_txf = new JTextField();
        Paymentstatus_txf = new JTextField();
        Paymentdate_txf = new JTextField();

        insert_btn = new JButton("Insert");
insert_btn.addActionListener(new ActionListener() {
			
			public void actionPerformed(java.awt.event.ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");	
					Connection connection=DriverManager
							.getConnection("jdbc:mysql://localhost:3306/hostel_reservation_management_system","root","");
					String query="INSERT INTO payment VALUES(?,?,?,?,?)";
					PreparedStatement pStatement=connection.prepareStatement(query);
					pStatement.setInt(1,Integer.parseInt(id_txf.getText()));
					pStatement.setString(2, Paymentmethod_txf.getText());
					pStatement.setString(3, Paymentamount_txf.getText());
					pStatement.setString(4, Paymentstatus_txf.getText());
					pStatement.setString(5, Paymentdate_txf.getText());
					pStatement.executeUpdate();
					JOptionPane.showMessageDialog(insert_btn, "data inserted well");
					pStatement.close();
					connection.close();	
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
				
			}
		});
        Read_btn = new JButton("Read");
        update_btn = new JButton("Update");
        delete_btn = new JButton("Delete");

        setLocationAndSize();
        setFontForAll();
        addComponentsToFrame();

        frame.setSize(500, 400);
        frame.setVisible(true);

        insert_btn.addActionListener(this);
        Read_btn.addActionListener(this);
        update_btn.addActionListener(this);
        delete_btn.addActionListener(this);
    }

    private void setLocationAndSize() {
        id_lb.setBounds(10, 10, 100, 30);
        Paymentmethod_lb.setBounds(10, 50, 150, 30);
        Paymentamount_lb.setBounds(10, 90, 150, 30);
        Paymentstatus_lb.setBounds(10, 130, 150, 30);
        Paymentdate_lb.setBounds(10, 170, 150, 30);

        id_txf.setBounds(160, 10, 150, 30);
        Paymentmethod_txf.setBounds(160, 50, 150, 30);
        Paymentamount_txf.setBounds(160, 90, 150, 30);
        Paymentstatus_txf.setBounds(160, 130, 150, 30);
        Paymentdate_txf.setBounds(160, 170, 150, 30);

        insert_btn.setBounds(10, 250, 100, 30);
        Read_btn.setBounds(120, 250, 100, 30);
        update_btn.setBounds(230, 250, 100, 30);
        delete_btn.setBounds(340, 250, 100, 30);
    }

    private void setFontForAll() {
        Font font = new Font("Georgia", Font.BOLD, 18);
        id_lb.setFont(font);
        Paymentmethod_lb.setFont(font);
        Paymentamount_lb.setFont(font);
        Paymentstatus_lb.setFont(font);
        Paymentdate_lb.setFont(font);

        id_txf.setFont(font);
        Paymentmethod_txf.setFont(font);
        Paymentamount_txf.setFont(font);
        Paymentstatus_txf.setFont(font);
        Paymentdate_txf.setFont(font);

        insert_btn.setFont(font);
        Read_btn.setFont(font);
        update_btn.setFont(font);
        delete_btn.setFont(font);
    }

    private void addComponentsToFrame() {
        frame.add(id_lb);
        frame.add(Paymentmethod_lb);
        frame.add(Paymentamount_lb);
        frame.add(Paymentstatus_lb);
        frame.add(Paymentdate_lb);

        frame.add(id_txf);
        frame.add(Paymentmethod_txf);
        frame.add(Paymentamount_txf);
        frame.add(Paymentstatus_txf);
        frame.add(Paymentdate_txf);

        frame.add(insert_btn);
        frame.add(Read_btn);
        frame.add(update_btn);
        frame.add(delete_btn);
    }

    public void actionPerformed(ActionEvent e) {
       /* if (e.getSource() == insert_btn) {
            // Display message of data entered
            JOptionPane.showMessageDialog(frame, "Data entered successfully.");
            // Clear the text fields
            id_txf.setText("");
            Paymentmethod_txf.setText("");
            Paymentamount_txf.setText("");
            Paymentstatus_txf.setText("");
            Paymentdate_txf.setText("");
        } else if (e.getSource() == delete_btn) {
            // Clear the text fields
            id_txf.setText("");
            Paymentmethod_txf.setText("");
            Paymentamount_txf.setText("");
            Paymentstatus_txf.setText("");
            Paymentdate_txf.setText("");
        } else if (e.getSource() == Read_btn) {
            // Access Read functionality
            // (You can implement this functionality here or call another method to handle it)
            // For now, let's just display a message
            JOptionPane.showMessageDialog(frame, "Reading data...");
        } else if (e.getSource() == update_btn) {
            // Access Update functionality
            // (You can implement this functionality here or call another method to handle it)
            // For now, let's just display a message
            JOptionPane.showMessageDialog(frame, "Updating data...");*/
        }
      

    public static void main(String[] args) {
        new PaymentForm();
    }
}
