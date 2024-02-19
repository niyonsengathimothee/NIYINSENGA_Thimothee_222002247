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

public class CustomerForm implements ActionListener {
    JFrame frame;
    JLabel id_lb = new JLabel("ID");
    JLabel Paymentid_lb = new JLabel("Payment ID");
    JLabel fname_lb = new JLabel("First Name");
    JLabel lname_lb = new JLabel("Last Name");
    JLabel email_lb = new JLabel("Email");
    JLabel telephone_lb = new JLabel("Telephone");

    JTextField id_txf = new JTextField();
    JTextField Paymentid_txf = new JTextField();
    JTextField fname_txf = new JTextField();
    JTextField lname_txf = new JTextField();
    JTextField email_txf = new JTextField();
    JTextField telephone_txf = new JTextField();

    JButton insert_btn = new JButton("Insert");
    JButton read_btn = new JButton("View");
    JButton update_btn = new JButton("Update");
    JButton delete_btn = new JButton("Delete");

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int w = (int) screenSize.getWidth();
    int h = (int) screenSize.getHeight();

    public CustomerForm() {
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
        frame.setTitle("CustomerForm");
        frame.setBounds(0, 0, w / 2, h / 2);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        setLocationAndSize();
        frame.setVisible(true);
    }

    private void setLocationAndSize() {
        id_lb.setBounds(10, 10, 100, 30);
        Paymentid_lb.setBounds(10, 50, 100, 30);
        fname_lb.setBounds(10, 90, 100, 30);
        lname_lb.setBounds(10, 130, 100, 30);
        email_lb.setBounds(10, 170, 100, 30);
        telephone_lb.setBounds(10, 210, 100, 30);

        id_txf.setBounds(160, 10, 130, 30);
        Paymentid_txf.setBounds(160, 50, 130, 30);
        fname_txf.setBounds(160, 90, 130, 30);
        lname_txf.setBounds(160, 130, 130, 30);
        email_txf.setBounds(160, 170, 130, 30);
        telephone_txf.setBounds(160, 210, 130, 30);

        insert_btn.setBounds(10, 250, 85, 30);
        read_btn.setBounds(100, 250, 85, 30);
        update_btn.setBounds(190, 250, 85, 30);
        delete_btn.setBounds(280, 250, 85, 30);

        setFontForAll();
        addComponentsForFrame();
    }

    private void setFontForAll() {
        Font labelFont = new Font("Georgia", Font.BOLD, 18);
        Font textFieldFont = new Font("Georgia", Font.PLAIN, 16);
        Font buttonFont = new Font("Courier New", Font.ITALIC, 12);

        JLabel[] labels = { id_lb, Paymentid_lb, fname_lb, lname_lb, email_lb, telephone_lb };
        JTextField[] textFields = { id_txf, Paymentid_txf, fname_txf, lname_txf, email_txf, telephone_txf };
        JButton[] buttons = { insert_btn, read_btn, update_btn, delete_btn };

        for (JLabel label : labels)
            label.setFont(labelFont);

        for (JTextField textField : textFields)
            textField.setFont(textFieldFont);

        for (JButton button : buttons)
            button.setFont(buttonFont);
    }

    private void addComponentsForFrame() {
        frame.add(id_lb);
        frame.add(Paymentid_lb);
        frame.add(fname_lb);
        frame.add(lname_lb);
        frame.add(email_lb);
        frame.add(telephone_lb);

        frame.add(id_txf);
        frame.add(Paymentid_txf);
        frame.add(fname_txf);
        frame.add(lname_txf);
        frame.add(email_txf);
        frame.add(telephone_txf);

        frame.add(insert_btn);
        frame.add(read_btn);
        frame.add(update_btn);
        frame.add(delete_btn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == insert_btn) {
            // Show message of data entered
            String message = "Data entered:\n"
                    + "ID: " + id_txf.getText() + "\n"
                    + "Payment ID: " + Paymentid_txf.getText() + "\n"
                    + "First Name: " + fname_txf.getText() + "\n"
                    + "Last Name: " + lname_txf.getText() + "\n"
                    + "Email: " + email_txf.getText() + "\n"
                    + "Telephone: " + telephone_txf.getText();
            JOptionPane.showMessageDialog(frame, message);

            // Clear data
            clearTextFields();
        } else if (e.getSource() == delete_btn) {
            // Clear data
            clearTextFields();
        } else if (e.getSource() == read_btn) {
            // Access read functionality
            // Implement read functionality here
        } else if (e.getSource() == update_btn) {
            // Access update functionality
            // Implement update functionality here
        }
    }

    private void clearTextFields() {
        id_txf.setText("");
        Paymentid_txf.setText("");
        fname_txf.setText("");
        lname_txf.setText("");
        email_txf.setText("");
        telephone_txf.setText("");
    }

    public static void main(String[] args) {
      CustomerForm cf = new CustomerForm();
    }
}
