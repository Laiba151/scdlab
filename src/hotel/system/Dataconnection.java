/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.system;

import java.beans.Statement;
import java.io.InputStream;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Dataconnection {
   
   
    private InputStream in;
      public static Connection con() { 
            Connection con =null;
        try{  
Class.forName("com.mysql.jdbc.Driver");  
//here sonoo is database name, root is username and password
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelsystem","root","");
        //here sonoo is database name, root is username and password
        
   
   JOptionPane.showMessageDialog(null,"Connected");
}
        catch(Exception e){
         JOptionPane.showMessageDialog(null,"  notConnected");
} 
        return con;
   
    
      }
    
}

