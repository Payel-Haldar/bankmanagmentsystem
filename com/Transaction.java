package com;

import java.awt.Color;
import java.awt.*;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Transaction extends JFrame implements ActionListener{
	
	JButton b1,b2,b3,b4,b5,b6,b7;
	String pin;
	
	Transaction(String pin){
		this.pin = pin;
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 800, 800);
        add(image);
        
        JLabel text = new JLabel("Please select your Transaction");
        text.setBounds(185,260,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text); 
       

        b1 = new JButton("DEPOSIT");
        b1.setBounds(140,348,142,20);
        b1.addActionListener(this);
        image.add(b1);
        
        b2 = new JButton("CASH WITHDRAWL");
        b2.setBounds(300,348,142,20);
        b2.addActionListener(this);
        image.add(b2);
        
        b3 = new JButton("FAST CASH");
        b3.setBounds(140,378,142,20);
        b3.addActionListener(this);
        image.add(b3);
        
        b4 = new JButton("MINI STATEMENT");
        b4.setBounds(300,378,142,20);
        b4.addActionListener(this);
        image.add(b4);
        
        b5 = new JButton("PIN CHANGE");
        b5.setBounds(140,408,142,20);
        b5.addActionListener(this);
        image.add(b5);
        
        b6 = new JButton("BALANCE ENQUIRY");
        b6.setBounds(300,408,142,20);
        b6.addActionListener(this);
        image.add(b6);
        
        
        b7 = new JButton("EXIT");
        b7.setBounds(300,438,142,20);
        b7.addActionListener(this);
        image.add(b7);
        
		
		setSize(800,800);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b7){
			System.exit(0);
		}else if(e.getSource()==b1){
            setVisible(false);
            new Deposite(pin).setVisible(true);
        }else if(e.getSource()==b2){
            setVisible(false);
            new Withdrawl(pin).setVisible(true);
        }else if(e.getSource()==b3){
            setVisible(false);
            new Fast_Cash(pin).setVisible(true); 
		// TODO Auto-generated method stub
        }else if(e.getSource()==b5){
            setVisible(false);
            new Pin_Change(pin).setVisible(true); 
		// TODO Auto-generated method stub
        }
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Transaction("");
	}

}
