/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connector;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author albariiqy
 */
public class config {
    protected Connection conn;
    
    protected Connection connection(){
        try {
            String username = "root";
            String password = "";
            String database = "farmstock";
            String url = "jdbc:mysql://localhost/"+database;
            conn = DriverManager.getConnection(url, username, password);
            
        } catch (SQLException e) {
            
        }
        return conn;
    }
    
}
