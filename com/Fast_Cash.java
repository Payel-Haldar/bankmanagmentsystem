package com;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Fast_Cash extends JFrame implements ActionListener {

    static final String DB_URL = "jdbc:mysql://localhost:3306/bankmanagement";
    static final String USER = "root";
    static final String PASS = "P@2915djkh#";
    
    JButton b1, b2, b3, b4, b5, b6, b7;
    String pin;

    Fast_Cash(String pin) {
        this.pin = pin;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 800, 800);
        add(image);

        JLabel text = new JLabel("SELECT WITHDRAWAL AMOUNT");
        text.setBounds(175, 260, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);

        b1 = new JButton("Rs 100");
        b1.setBounds(140, 348, 142, 20);
        b1.addActionListener(this);
        image.add(b1);

        b2 = new JButton("Rs 500");
        b2.setBounds(300, 348, 142, 20);
        b2.addActionListener(this);
        image.add(b2);

        b3 = new JButton("Rs 1000");
        b3.setBounds(140, 378, 142, 20);
        b3.addActionListener(this);
        image.add(b3);

        b4 = new JButton("Rs 2000");
        b4.setBounds(300, 378, 142, 20);
        b4.addActionListener(this);
        image.add(b4);

        b5 = new JButton("Rs 5000");
        b5.setBounds(140, 408, 142, 20);
        image.add(b5);

        b6 = new JButton("Rs 10000");
        b6.setBounds(300, 408, 142, 20);
        b6.addActionListener(this);
        image.add(b6);

        b7 = new JButton("BACK");
        b7.setBounds(300, 438, 142, 20);
        b7.addActionListener(this);
        image.add(b7);

        setSize(800, 800);
        setLocation(300, 0);
        setVisible(true);
    }

    
   
    	@Override
    	public void actionPerformed(ActionEvent e) {
    	    try {
    	        String amount = ((JButton) e.getSource()).getText().substring(3); //k
    	        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
    	        Statement stmt = conn.createStatement();

    	        // Execute the SQL statement to insert the data into the database
    	        stmt.executeUpdate("insert into bank values('" + pin + "','" + new Date() + "','Withdraw','" + amount + "')");

    	        JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");

    	        setVisible(false);
    	        new Transactions(pin).setVisible(true);
    	    } catch (Exception ae) {
    	        ae.printStackTrace();
    	    }
    	}
    public static void main(String[] args) {
        new Fast_Cash("").setVisible(true);
    }
}
