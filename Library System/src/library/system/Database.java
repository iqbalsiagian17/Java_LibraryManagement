/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.system;

import java.sql.Connection;
import java.sql.DriverManager;


public class Database {
    
    public static Connection connectDB(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
//        MY DATABASE IS marcoData
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/db_library", "root", "");
            return connect;
        }catch(Exception e){e.printStackTrace();}
        
        return null;
    }
    
}
