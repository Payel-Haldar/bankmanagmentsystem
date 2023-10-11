package com;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Deposite extends JFrame implements ActionListener{
	
	static final String DB_URL = "jdbc:mysql://localhost:3306/bankmanagement";
	   static final String USER = "root";
	   static final String PASS = "P@2915djkh#";
	   static final String QUERY = "INSERT INTO bank (name,father_name )VALUES('deb','ram')";

	JButton b1,b2;
	JTextField amount;
	String pin;
	
	Deposite(String pin){
		
		this.pin = pin;
         setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 800, 800);
        add(image);
        
        JLabel text = new JLabel("Enter The Amount You Want to Deposit ");
        text.setBounds(151,260,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);
        
        amount = new JTextField();
        amount.setFont(new Font("System", Font.BOLD, 22));
        amount.setBounds(151,310,300,20);
        image.add(amount);
        
        b1 = new JButton("DEPOSIT");
        b1.setBounds(300,438,142,20);
        b1.addActionListener(this);
        image.add(b1);
        
        b2 = new JButton("BACK");
        b2.setBounds(300,468,142,20);
        b2.addActionListener(this);
        image.add(b2);
		
		setSize(800,800);
        setLocation(300,0);
        //setUndecorated(true);
        setVisible(true);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1){
			String number = amount.getText();
			Date date = new Date();
			if(number.equals("")){
				JOptionPane.showMessageDialog(null, "Please Enter The Amount You Want to Deposit");
			}else{
				String q1 = "insert into bank values('"+pin+"','"+date+"','deposite','"+number+"')";
                System.out.println(q1);	
              
                try{Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                int rs = stmt.executeUpdate(q1);
                System.out.println(rs);
                JOptionPane.showMessageDialog(null, "Rs "+number+" Deposite Successfully" );
                setVisible(false);
                new Transaction(pin).setVisible(true);
                
			}catch(Exception ae){
				System.out.println(ae);
				}
			}
			
		}else if(e.getSource()==b2){
			setVisible(false);
            new Transaction(pin).setVisible(true);
			
		}
		// TODO Auto-generated method stub
		
	}
	

	public static void main(String[] args) {
		new Deposite("");
		// TODO Auto-generated method stub

	}

}
