package com;

import java.sql.*;

public class FirstExample {
   static final String DB_URL = "jdbc:mysql://localhost:3306/bankmanagement";
   static final String USER = "root";
   static final String PASS = "P@2915djkh#";
   static final String QUERY = "INSERT INTO signup (name,father_name )VALUES('deb','ram')";

   public void main(String[] args) {
      // Open a connection
      try{Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         int rs = stmt.executeUpdate(QUERY);
         System.out.println(rs);	   
      }
         // Extract data from result set
      
    catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}
