/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bsms;

/**
 *
 * @author Windows 10
 */
import java.sql.*;
public class Db {
    
    public static Connection myconnection(){
        Connection con=null;
        try{
             Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/loginsystem", "root", "");
             return con;
        }catch(Exception ex){
            System.out.println("Error Connection!");
            return null;
        }
    }
}
