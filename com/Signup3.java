package com;

import java.awt.*;

import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class Signup3 extends JFrame implements ActionListener {
	
	static final String DB_URL = "jdbc:mysql://localhost:3306/bankmanagement";
	   static final String USER = "root";
	   static final String PASS = "P@2915djkh#";
	   static final String QUERY = "INSERT INTO signup2 (name,father_name )VALUES('deb','ram')";
	
	   public class setVisible {

	   }
	   
	   JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
	   JRadioButton r1,r2,r3,r4;
	   JCheckBox c1,c2,c3,c4,c5,c6,c7;
	   JButton submit,cancel;
	   String formno;
	   
	   Signup3(String formno){
		   
		   this.formno = formno;
		   
		   setLayout(null);
		   
		   ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/logo.jpg"));
	        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
	        ImageIcon i3 = new ImageIcon(i2);
	        JLabel l11 = new JLabel(i3);
	        l11.setBounds(20, 0, 100, 100);
	        add(l11);
	        
		   
		    l1 = new JLabel("Page 3: Additional Details");
	        l1.setFont(new Font("Raleway", Font.BOLD, 24));
	        l1.setBounds(290,80,400,30);
	        add(l1);
	        
	        
	        
	        l2 = new JLabel("Account Type :");
	        l2.setFont(new Font("Raleway", Font.BOLD, 18));
	        l2.setBounds(100,140,200,30);
	        add(l2);
	        
	        r1 = new JRadioButton("Saving Account");
	        r1.setFont(new Font("Raleway", Font.BOLD, 12));
	        r1.setBackground(Color.WHITE);
	        r1.setBounds(100,180,150,20);
	        add(r1);
	        
	        r3 = new JRadioButton("Current Account");
	        r3.setFont(new Font("Raleway", Font.BOLD, 12));
	        r3.setBackground(Color.WHITE);
	        r3.setBounds(100,220,150,20);
	        add(r3);
	        	        
	        r2 = new JRadioButton("Fixed Deposit Account");
	        r2.setFont(new Font("Raleway", Font.BOLD, 12));
	        r2.setBackground(Color.WHITE);
	        r2.setBounds(400,180,180,20);
	        add(r2);
	        
	        r4 = new JRadioButton("Recurring Deposit Account");
	        r4.setFont(new Font("Raleway", Font.BOLD, 12));
	        r4.setBackground(Color.WHITE);
	        r4.setBounds(400,220,180,20);
	        add(r4);
 
	        ButtonGroup groupaccount = new ButtonGroup();
	        groupaccount.add(r1);
	        groupaccount.add(r2);
	        groupaccount.add(r3);
	        groupaccount.add(r4);
	        
	        
	        
	        l3 = new JLabel("Card Number :");
	        l3.setFont(new Font("Raleway", Font.BOLD, 18));
	        l3.setBounds(100,280,200,30);
	        add(l3);
	        
	        l4 = new JLabel("XXXX-XXXX-XXXX-4234");
	        l4.setFont(new Font("Raleway", Font.BOLD, 18));
	        l4.setBounds(330,280,300,30);
	        add(l4);
	        
	        l7 = new JLabel("Your 12 Digit Card Number");
	        l7.setFont(new Font("Raleway", Font.BOLD, 10));
	        l7.setBounds(100,300,200,30);
	        add(l7);
	        
	        
	        
	        l5 = new JLabel("PIN :");
	        l5.setFont(new Font("Raleway", Font.BOLD, 18));
	        l5.setBounds(100,350,200,30);
	        add(l5);
	        
	        l6 = new JLabel("XXXX");
	        l6.setFont(new Font("Raleway", Font.BOLD, 18));
	        l6.setBounds(330,350,100,30);
	        add(l6);
	        
	        l8 = new JLabel("Your 4 Digit Passward");
	        l8.setFont(new Font("Raleway", Font.BOLD, 10));
	        l8.setBounds(100,370,200,30);
	        add(l8);
	        
	        
	        
	        l9 = new JLabel("Services Required :");
	        l9.setFont(new Font("Raleway", Font.BOLD, 18));
	        l9.setBounds(100,420,200,30);
	        add(l9);
	        
	        c1 = new JCheckBox("ATM Card");
	        c1.setBackground(Color.WHITE);
	        c1.setFont(new Font("Raleway", Font.BOLD, 12));
	        c1.setBounds(100,460,150,20);
	        add(c1);
	        
	        c2 = new JCheckBox("Internet Banking");
	        c2.setBackground(Color.WHITE);
	        c2.setFont(new Font("Raleway", Font.BOLD, 12));
	        c2.setBounds(410,460,150,20);
	        add(c2);
	        
	        c3 = new JCheckBox("Mobile Banking");
	        c3.setBackground(Color.WHITE);
	        c3.setFont(new Font("Raleway", Font.BOLD, 12));
	        c3.setBounds(100,500,150,20);
	        add(c3);
	        
	        c4 = new JCheckBox("EMAIL & SMS Alerts");
	        c4.setBackground(Color.WHITE);
	        c4.setFont(new Font("Raleway", Font.BOLD, 12));
	        c4.setBounds(410,500,150,20);
	        add(c4);
	        
	        c5 = new JCheckBox("Cheque Book");
	        c5.setBackground(Color.WHITE);
	        c5.setFont(new Font("Raleway", Font.BOLD, 12));
	        c5.setBounds(100,540,150,20);
	        add(c5);
	        
	        c6 = new JCheckBox("E-Statement");
	        c6.setBackground(Color.WHITE);
	        c6.setFont(new Font("Raleway", Font.BOLD, 12));
	        c6.setBounds(410,540,150,20);
	        add(c6);
	        
	        
	        
	        
	        c7 = new JCheckBox("I hereby declares that the above details are correct to the best of my knowledge");
	        c7.setBackground(Color.WHITE);
	        c7.setFont(new Font("Raleway", Font.BOLD, 14));
	        c7.setBounds(100,600,600,25);
	        add(c7);
	        
	        submit = new JButton("Submit");
	        submit.setBackground(Color.BLACK);
	        submit.setForeground(Color.WHITE);
	        submit.setFont(new Font("Raleway", Font.BOLD, 14));
	        submit.setBounds(250,650,100,30);
	        submit.addActionListener(this);
	        add(submit); 
	        
	        cancel = new JButton("Cancel");
	        cancel.setBackground(Color.BLACK);
	        cancel.setForeground(Color.WHITE);
	        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
	        cancel.setBounds(420,650,100,30);
	        cancel.addActionListener(this);
	        add(cancel); 
	        
	        
	        getContentPane().setBackground(Color.PINK);
	        
       
       setSize(850,750);
       setLocation(350,10);
       setVisible(true);
	}
	   @Override
		public void actionPerformed(ActionEvent e) {
		   
		   
		   String atype = null;
	        if(r1.isSelected()){ 
	            atype = "Saving Account";
	        }
	        else if(r2.isSelected()){ 
	            atype = "Fixed Deposit Account";
	        }
	        else if(r3.isSelected()){ 
	            atype = "Current Account";
	        }else if(r4.isSelected()){ 
	            atype = "Recurring Deposit Account";
	        }
	        
	        Random ran = new Random();
	        long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
	        String cardno = "" + Math.abs(first7);
	        
	        long first3 = (ran.nextLong() % 9000L) + 1000L;
	        String pin = "" + Math.abs(first3);
	        
	        String facility = "";
	        if(c1.isSelected()){ 
	            facility = facility + " ATM Card";
	        }
	        if(c2.isSelected()){ 
	            facility = facility + " Internet Banking";
	        }
	        if(c3.isSelected()){ 
	            facility = facility + " Mobile Banking";
	        }
	        if(c4.isSelected()){ 
	            facility = facility + " EMAIL Alerts";
	        }
	        if(c5.isSelected()){ 
	            facility = facility + " Cheque Book";
	        }
	        if(c6.isSelected()){ 
	            facility = facility + " E-Statement";
	        }

	        try
	        {
	        	if(e.getSource()==submit)
	        	{
	        		
	        		 if(atype.equals(""))
	        		 {
		        		
		                JOptionPane.showMessageDialog(null, "Fill all the required fields");
		            }
	        		 else
	        		 {
	            	
		                String q1 = "insert into signup3 values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+facility+"')";
		                String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";

		                System.out.println(q1);	
		                
		              
		                try
		                {
		                	Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		                Statement stmt = conn.createStatement();
		                int rs = stmt.executeUpdate(q1);
		                int rs1 = stmt.executeUpdate(q2);
		                System.out.println(rs);	   
		                
	                    
	                    JOptionPane.showMessageDialog(null, "Card Number: " + cardno + "\n Pin:"+ pin);
	                    
	                    setVisible(false);
	                    new Deposite(pin).setVisible(true);
	                    
		                }
		                catch (SQLException ae) {
		                    ae.printStackTrace();
		                 }
	        		 
	        		 }
	            }else if(e.getSource()==cancel){
	            	 setVisible(false);
	                  new Login().setVisible(true);
	            }
	            
	        }catch(Exception ex){
	            ex.printStackTrace();
	        }
	        
	    }
	    
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Signup3("");
	}


	

}
