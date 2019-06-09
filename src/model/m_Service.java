/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import connector.config;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author albariiqy
 */

public class m_Service extends config{
    Connection connection;
    Statement statement;
    ResultSet resultSet;

    public m_Service() {
        try {
            connection = connection();
            statement = connection.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public DefaultTableModel load(){
        DefaultTableModel model = new DefaultTableModel();
        m_Service_Load load = new m_Service_Load();
        
        model = load.tabelload();
  
        return model;
    }
    
    public DefaultTableModel distribute(){
        DefaultTableModel model = new DefaultTableModel();
        m_Service_Distribute distribute = new m_Service_Distribute();
        
        model = distribute.tabeldistribute();
  
        return model;
    }
    
}
