package com;

import java.awt.*;

import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

import java.util.*;

@SuppressWarnings("serial")
public class Signup2 extends JFrame implements ActionListener{
    
	static final String DB_URL = "jdbc:mysql://localhost:3306/bankmanagement";
	   static final String USER = "root";
	   static final String PASS = "P@2915djkh#";
	   static final String QUERY = "INSERT INTO signup2 (name,father_name )VALUES('deb','ram')";
	
    public class setVisible {

	}

	JLabel l2,l3,l4,l5,l6,l8,l9,l10,l11,l12;
    JTextField t4,t5;
    JRadioButton r1,r2,r3,r4;
    JButton b;
    JComboBox c1,c2,c3,c4,c5;
	 String formno;
       
    
    Signup2(String formno){
        
    	this.formno = formno;
    	
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(20, 0, 100, 100);
        add(l11);
        
        
		
        
        l2 = new JLabel("Page 2: Additional Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setBounds(290,80,600,30);
        add(l2);
        
        
        l3 = new JLabel("Religion:");
        l3.setFont(new Font("Raleway", Font.BOLD, 14));
        
        
        String religion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        c1 = new JComboBox(religion);
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 14));
       c1.setBounds(300,140,400,30);
        add(c1);
        
        l4 = new JLabel("Category:");
        l4.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String category[] = {"General","OBC","SC","ST","Other"};
        c2 = new JComboBox(category);
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 14));
        c2.setBounds(300,190,400,30);
        add(c2);
        
        l5 = new JLabel("Income:");
        l5.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String income[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        c3 = new JComboBox(income);
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 14));
        c3.setBounds(300,240,400,30);
        add(c3);
        
        l6 = new JLabel("Educational Qualification:");
        l6.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String educationqualification[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        c4 = new JComboBox(educationqualification);
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 14));
        c4.setBounds(300,290,400,30);
        add(c4);
        
        
        l8 = new JLabel("Occupation:");
        l8.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String occupation[] = {"Salaried","Self-Employmed","Business","Student","Retired","Others"};
        c5 = new JComboBox(occupation);
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 14));
        c5.setBounds(300,340,400,30);
        add(c5);
        
        
        l9 = new JLabel("Pan Number:");
        l9.setFont(new Font("Raleway", Font.BOLD, 14));
     
        l10 = new JLabel("Aadhar Number:");
        l10.setFont(new Font("Raleway", Font.BOLD, 14));
        
        
        l11 = new JLabel("Senior Citizen:");
        l11.setFont(new Font("Raleway", Font.BOLD, 14));
        
        l12 = new JLabel("Existing Account:");
        l12.setFont(new Font("Raleway", Font.BOLD, 14));
        
      
        
        t4 = new JTextField();
        t4.setFont(new Font("Raleway", Font.BOLD, 10));
        
      
        t5 = new JTextField();
        t5.setFont(new Font("Raleway", Font.BOLD, 10));
        
        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(Color.PINK);
        
        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(Color.PINK);
        
        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(Color.PINK);
        
        r4 = new JRadioButton("No");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(Color.PINK);
        
       
        
        b = new JButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD, 10));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
       
        
     
        setLayout(null);
     
        l3.setBounds(100,140,100,30);
        add(l3);
        
        l4.setBounds(100,190,200,30);
        add(l4);
    
        l5.setBounds(100,240,200,30);
        add(l5);
        
        l6.setBounds(100,290,200,30);
        add(l6);
  
        l8.setBounds(100,340,200,30);
        add(l8);
        
        
        
        l9.setBounds(100,390,200,30);
        add(l9);
        t4.setBounds(300,390,400,30);
        add(t4);
      
        
        l10.setBounds(100,440,200,30);
        add(l10);
        t5.setBounds(300,440,400,30);
        add(t5);
       
        
        l11.setBounds(100,490,200,30);
        add(l11);
        
        r1.setBounds(300,490,100,30);
        add(r1);
        
        r2.setBounds(600,490,100,30);
        add(r2);
        
        l12.setBounds(100,540,200,30);
        add(l12);
        
        r3.setBounds(300,540,100,30);
        add(r3);
        
        r4.setBounds(600,540,100,30);
        add(r4);
        
        
        b.setBounds(620,650,80,30);
        add(b);
        
        b.addActionListener(this); 
        
        ButtonGroup groupscitizen = new ButtonGroup();
        groupscitizen.add(r1);
        groupscitizen.add(r2);
        
        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r3);
        groupaccount.add(r4);
        
        
        getContentPane().setBackground(Color.PINK);
        
        setSize(850,750);
        setLocation(350,10);
        setVisible(true);
    }
    
    @SuppressWarnings("unused")
	public void actionPerformed(ActionEvent ae){
        
    	String religion = (String)c1.getSelectedItem(); 
        String category = (String)c2.getSelectedItem();
        String income = (String)c3.getSelectedItem();
        String educational = (String)c4.getSelectedItem();
        String occupation = (String)c5.getSelectedItem();
        
        String pan = t4.getText();
        String aadhar = t5.getText();
        
        String scitizen = "";
        if(r1.isSelected()){ 
            scitizen = "Yes";
        }
        else if(r2.isSelected()){ 
            scitizen = "No";
        }
           
        String account = "";
        if(r3.isSelected()){ 
            account = "Yes";
        }else if(r4.isSelected()){ 
            account = "No";
        }
        

        try{
           
            if(t4.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }else{
            	
                String q1 = "insert into signupTWO values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+educational+"','"+occupation+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+account+"')";
                System.out.println(q1);	
              
                try{Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                int rs = stmt.executeUpdate(q1);
                System.out.println(rs);
                
                setVisible(false);
                new Signup3(formno).setVisible(true);
             }
                // Extract data from result set
             
           catch (SQLException e) {
                e.printStackTrace();
             }
                
            }
        }
         catch (Exception e) {
            e.printStackTrace();
        }
    }
    }

    

	

