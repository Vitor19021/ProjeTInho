package com.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class conectionBD {
    
    public Connection getConnection(){
            Connection con = null;
            
            try{
                Class.forName("com.mysql.jdbc.Driver");
            }catch (ClassNotFoundException e){
                e.printStackTrace();
            }
            
            try{
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdcs?useSSL=false","root","29250327");
            }catch(SQLException e){
                e.printStackTrace();
                
            }
            
            return con;
    }
            
}
