package MYFORM;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ReservationForm implements ActionListener {
    JFrame frame;
    JLabel Reservationid_lb = new JLabel("Reservation ID");
    JLabel Customerid_lb = new JLabel("Customer ID");
    JLabel Checkindate_lb = new JLabel("Check-in Date");
    JLabel Checkoutdate_lb = new JLabel("Check-out Date");
    JLabel Bookingdate_lb = new JLabel("Booking Date");
    JLabel Totalprice_lb = new JLabel("Total Price");

    JTextField Reservationid_txf = new JTextField();
    JTextField Customerid_txf = new JTextField();
    JTextField Checkindate_txf = new JTextField();
    JTextField Checkoutdate_txf = new JTextField();
    JTextField Bookingdate_txf = new JTextField();
    JTextField Totalprice_txf = new JTextField();

    JButton insert_btn = new JButton("Insert");
    JButton read_btn = new JButton("Read");
    JButton update_btn = new JButton("Update");
    JButton delete_btn = new JButton("Delete");

    Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
    int w = (int) screensize.getWidth();
    int h = (int) screensize.getHeight();

    public ReservationForm() {
        createForm();
        addActionListeners();
    }

    private void addActionListeners() {
        insert_btn.addActionListener(this);
        read_btn.addActionListener(this);
        update_btn.addActionListener(this);
        delete_btn.addActionListener(this);
    }

    private void createForm() {
        frame = new JFrame();
        frame.setTitle("Reservation Form");
        frame.setBounds(0, 0, w / 2, h / 2);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        setLocationAndSize();
    }

    private void setLocationAndSize() {
        Reservationid_lb.setBounds(10, 10, 100, 30);
        Customerid_lb.setBounds(10, 50, 100, 30);
        Checkindate_lb.setBounds(10, 90, 100, 30);
        Checkoutdate_lb.setBounds(10, 130, 100, 30);
        Bookingdate_lb.setBounds(10, 170, 100, 30);
        Totalprice_lb.setBounds(10, 210, 100, 30);

        Reservationid_txf.setBounds(160, 10, 130, 30);
        Customerid_txf.setBounds(160, 50, 130, 30);
        Checkindate_txf.setBounds(160, 90, 130, 30);
        Checkoutdate_txf.setBounds(160, 130, 130, 30);
        Bookingdate_txf.setBounds(160, 170, 130, 30);
        Totalprice_txf.setBounds(160, 210, 130, 30);

        insert_btn.setBounds(10, 250, 85, 30);
        read_btn.setBounds(100, 250, 85, 30);
        update_btn.setBounds(190, 250, 85, 30);
        delete_btn.setBounds(280, 250, 85, 30);

        setFontForAll();
        addComponentsToFrame();
    }

    private void setFontForAll() {
        Font font = new Font("Georgia", Font.BOLD, 18);

        Reservationid_lb.setFont(font);
        Customerid_lb.setFont(font);
        Checkindate_lb.setFont(font);
        Checkoutdate_lb.setFont(font);
        Bookingdate_lb.setFont(font);
        Totalprice_lb.setFont(font);

        Reservationid_txf.setFont(font);
        Customerid_txf.setFont(font);
        Checkindate_txf.setFont(font);
        Checkoutdate_txf.setFont(font);
        Bookingdate_txf.setFont(font);
        Totalprice_txf.setFont(font);

        Font fonti = new Font("Courier New", Font.ITALIC, 12);

        insert_btn.setFont(fonti);
        read_btn.setFont(fonti);
        update_btn.setFont(fonti);
        delete_btn.setFont(fonti);
    }

    private void addComponentsToFrame() {
        frame.add(Reservationid_lb);
        frame.add(Customerid_lb);
        frame.add(Checkindate_lb);
        frame.add(Checkoutdate_lb);
        frame.add(Bookingdate_lb);
        frame.add(Totalprice_lb);

        frame.add(Reservationid_txf);
        frame.add(Customerid_txf);
        frame.add(Checkindate_txf);
        frame.add(Checkoutdate_txf);
        frame.add(Bookingdate_txf);
        frame.add(Totalprice_txf);

        frame.add(insert_btn);
        frame.add(read_btn);
        frame.add(update_btn);
        frame.add(delete_btn);
    }

    public static void main(String[] args) {
        ReservationForm rtf = new ReservationForm();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == insert_btn) {
            // Display a message when data is entered
            JOptionPane.showMessageDialog(frame, "Data Entered Successfully!");
            clearFields();
        } else if (e.getSource() == delete_btn) {
            clearFields();
        } else if (e.getSource() == read_btn) {
            // Implement read functionality here
        } else if (e.getSource() == update_btn) {
            // Implement update functionality here
        }
    }

    private void clearFields() {
        Reservationid_txf.setText("");
        Customerid_txf.setText("");
        Checkindate_txf.setText("");
        Checkoutdate_txf.setText("");
        Bookingdate_txf.setText("");
        Totalprice_txf.setText("");
    }
}
