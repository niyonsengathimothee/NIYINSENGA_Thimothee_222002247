import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RoomForm implements ActionListener {
    private JFrame frame;
    private JLabel idLabel = new JLabel("Room ID");
    private JLabel roomTypeLabel = new JLabel("Room Type");
    private JLabel pricePerNightLabel = new JLabel("Price per Night");
    private JLabel descriptionLabel = new JLabel("Description");
    private JLabel customerIdLabel = new JLabel("Customer ID");

    private JTextField idTextField = new JTextField();
    private JTextField roomTypeTextField = new JTextField();
    private JTextField pricePerNightTextField = new JTextField();
    private JTextField descriptionTextField = new JTextField();
    private JTextField customerIdTextField = new JTextField();

    private JButton insertButton = new JButton("Insert");
    private JButton readButton = new JButton("Read");
    private JButton updateButton = new JButton("Update");
    private JButton deleteButton = new JButton("Delete");
    private JButton clearButton = new JButton("Clear");

    public RoomForm() {
        createForm();
    }

    private void createForm() {
        frame = new JFrame();
        frame.setTitle("Room Form");
        frame.setBounds(100, 100, 450, 350);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        setLocationAndSize();
        addComponentsForFrame();
    }

    private void setLocationAndSize() {
        idLabel.setBounds(20, 20, 100, 30);
        roomTypeLabel.setBounds(20, 60, 100, 30);
        pricePerNightLabel.setBounds(20, 100, 130, 30);
        descriptionLabel.setBounds(20, 140, 100, 30);
        customerIdLabel.setBounds(20, 180, 100, 30);

        idTextField.setBounds(160, 20, 130, 30);
        roomTypeTextField.setBounds(160, 60, 130, 30);
        pricePerNightTextField.setBounds(160, 100, 130, 30);
        descriptionTextField.setBounds(160, 140, 130, 30);
        customerIdTextField.setBounds(160, 180, 130, 30);

        insertButton.setBounds(20, 250, 85, 30);
        readButton.setBounds(120, 250, 85, 60);
        updateButton.setBounds(220, 250, 85, 30);
        deleteButton.setBounds(320, 250, 85, 30);
        clearButton.setBounds(320, 20, 85, 30);

        setFontForAll();
    }

    private void setFontForAll() {
        Font font = new Font("Arial", Font.PLAIN, 14);

        idLabel.setFont(font);
        roomTypeLabel.setFont(font);
        pricePerNightLabel.setFont(font);
        descriptionLabel.setFont(font);
        customerIdLabel.setFont(font);

        idTextField.setFont(font);
        roomTypeTextField.setFont(font);
        pricePerNightTextField.setFont(font);
        descriptionTextField.setFont(font);
        customerIdTextField.setFont(font);

        insertButton.setFont(font);
        readButton.setFont(font);
        updateButton.setFont(font);
        deleteButton.setFont(font);
        clearButton.setFont(font);
    }

    private void addComponentsForFrame() {
        frame.add(idLabel);
        frame.add(roomTypeLabel);
        frame.add(pricePerNightLabel);
        frame.add(descriptionLabel);
        frame.add(customerIdLabel);

        frame.add(idTextField);
        frame.add(roomTypeTextField);
        frame.add(pricePerNightTextField);
        frame.add(descriptionTextField);
        frame.add(customerIdTextField);

        frame.add(insertButton);
        frame.add(readButton);
        frame.add(updateButton);
        frame.add(deleteButton);
        frame.add(clearButton);

        insertButton.addActionListener(this);
        readButton.addActionListener(this);
        updateButton.addActionListener(this);
        deleteButton.addActionListener(this);
        clearButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == insertButton) {
            insertData();
        } else if (e.getSource() == deleteButton) {
            clearData();
        } else if (e.getSource() == readButton) {
            // Access read functionality
            // You can implement the read functionality here
            displayData();
        } else if (e.getSource() == updateButton) {
            // Access update functionality
            // You can implement the update functionality here
        } else if (e.getSource() == clearButton) {
            clearData();
        }
    }

    private void insertData() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel_reservation_management_system", "root", "");
            PreparedStatement pst = con.prepareStatement("INSERT INTO room(Roomid, Roomtype, Pricepernight, Description, Customerid) VALUES (?, ?, ?, ?, ?)");

            pst.setString(1, idTextField.getText());
            pst.setString(2, roomTypeTextField.getText());
            pst.setString(3, pricePerNightTextField.getText());
            pst.setString(4, descriptionTextField.getText());
            pst.setString(5, customerIdTextField.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data inserted Successfully");

            pst.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void clearData() {
        idTextField.setText("");
        roomTypeTextField.setText("");
        pricePerNightTextField.setText("");
        descriptionTextField.setText("");
        customerIdTextField.setText("");
    }

    private void displayData() {
        JOptionPane.showMessageDialog(null,
                "id: " + idTextField.getText() + "\n" +
                "Room Type: " + roomTypeTextField.getText() + "\n" +
                "Price per Night: " + pricePerNightTextField.getText() + "\n" +
                "Description: " + descriptionTextField.getText() + "\n" +
                "Customer ID: " + customerIdTextField.getText());
    }

    public static void main(String[] args) {
        new RoomForm();
    }
}
