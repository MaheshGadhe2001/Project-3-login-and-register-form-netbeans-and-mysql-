/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xemacscode.demo;
import java.sql.*;


/**
 *
 * @author mahes
 */
public class DBConnection {
            static final String DB_URL="jdbc:mysql://localhost/demo";
            static final String USER="root";
            static final String PASS="root";
    public static Connection connectDB(){
          Connection conn=null;
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
           conn= DriverManager.getConnection(DB_URL,USER,PASS);
            return conn;
         }catch(Exception ex){
           System.out.println("There were errors while connecting to db.");
           return null;
         }
        
        
        
    }
    
}
