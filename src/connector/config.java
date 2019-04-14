/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connector;
import java.sql.DriverManager;
import java.sql.Connection;
/**
 *
 * @author albariiqy
 */
public class config {
    protected Connection conn;
    
    protected Connection connection(){
        try {
            String username = "postgres";
            String password = "brianrizqi";
            String database = "e-waralaba";
            String url = "jdbc:postgresql://localhost:5432/"+database;
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
        }
        return conn;
    }
}
