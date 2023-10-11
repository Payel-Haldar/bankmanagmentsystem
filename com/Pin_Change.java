package com;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Pin_Change extends JFrame implements ActionListener {
	
	static final String DB_URL = "jdbc:mysql://localhost:3306/bankmanagement";
	   static final String USER = "root";
	   static final String PASS = "P@2915djkh#";
	   static final String QUERY = "INSERT INTO signup (name,father_name )VALUES('deb','ram')";
	
	   JPasswordField newpin;
	   JPasswordField repin;
	JButton change, back ;
	String pin;
	
	Pin_Change(String Pin){
		this.pin = pin;
		
		 setLayout(null);
			
			ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
	        Image i2 = i1.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
	        ImageIcon i3 = new ImageIcon(i2);
	        JLabel image = new JLabel(i3);
	        image.setBounds(0, 0, 800, 800);
	        add(image);
	        
	        JLabel text = new JLabel("Change Your PIN");
	        text.setBounds(230,260,700,35);
	        text.setForeground(Color.WHITE);
	        text.setFont(new Font("System", Font.BOLD, 16));
	        image.add(text);
	        
	        JLabel pintext = new JLabel("New PIN");
	        pintext.setBounds(150,300,500,25);
	        pintext.setForeground(Color.WHITE);
	        pintext.setFont(new Font("System", Font.BOLD, 16));
	        image.add(pintext);
	        
	         newpin = new JPasswordField();
	        newpin.setFont(new Font("Raleway", Font.BOLD, 25));
	        newpin.setBounds(290,300,160,25);
	        newpin.setForeground(Color.black);
	        image.add(newpin);
	        
	        JLabel repintext = new JLabel("ReEnter New PIN");
	        repintext.setBounds(150,340,500,25);
	        repintext.setForeground(Color.WHITE);
	        repintext.setFont(new Font("System", Font.BOLD, 16));
	        image.add(repintext);
	        
	        repin = new JPasswordField();
	        repin.setFont(new Font("Raleway", Font.BOLD, 25));
	        repin.setBounds(290,340,160,25);
	        repin.setForeground(Color.black);
	        image.add(repin);
	        
	         change  = new JButton("CHANGE");
	        change.setBounds(310,430,140,25);
	        change.addActionListener(this);
	        image.add(change);
	        
	         back  = new JButton("BACK");
	        back.setBounds(310,460,140,25);
	        back.addActionListener(this);
	        image.add(back);
	        
	        setSize(800,800);
	        setLocation(300,0);
	       //setUndecorated(true);
	        setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try{
			 String npin = newpin.getText();
	         String rpin = repin.getText();
	         if(!npin.equals(rpin)){
	                JOptionPane.showMessageDialog(null, "Entered PIN does not match");
	                return;
	            }
	         if(e.getSource()==change){
	                if (newpin.getText().equals("")){
	                    JOptionPane.showMessageDialog(null, "Enter New PIN");
	                }
	                if (repin.getText().equals("")){
	                    JOptionPane.showMessageDialog(null, "Re-Enter new PIN");
	                }
	                String q1 = "update bank set pin = '"+rpin+"' where pin = '"+pin+"' ";
	                String q2 = "update login set pin = '"+rpin+"' where pin = '"+pin+"' ";
	                String q3 = "update signup3 set pin = '"+rpin+"' where pin = '"+pin+"' ";
	                System.out.println(q1);
	                System.out.println(q2);
	                System.out.println(q3);
	                
	                try{Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	                Statement stmt = conn.createStatement();
	                int rs = stmt.executeUpdate(q1);
	                int rs1 = stmt.executeUpdate(q2);
	                int rs2 = stmt.executeUpdate(q3);
	                System.out.println(rs);
	                System.out.println(rs1);
	                System.out.println(rs2);
	                
	                JOptionPane.showMessageDialog(null, "PIN changed successfully");
	                setVisible(false);
	                new Transaction(rpin).setVisible(true);
	             }
	                // Extract data from result set
	             
	           catch (SQLException ea) {
	                ea.printStackTrace();
	             }
	         }else if(e.getSource()==back){
	               
	                new Transaction(pin).setVisible(true);
	                setVisible(false);
	            }   
			
	         }catch(Exception ae){
			ae.printStackTrace();
		      }
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		new Pin_Change("pin").setVisible(true);
		// TODO Auto-generated method stub

	}


}
