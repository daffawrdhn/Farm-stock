/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import connector.config;
import javax.swing.JOptionPane;

/**
 *
 * @author albariiqy
 */
public class m_penerima extends config{
    
    Connection connection;
    Statement statement;
    ResultSet resultSet;

    public m_penerima() {
        try {
            connection = connection();
            statement = connection.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void simpanpenerima(String nama, String alamat, String notlp) {
        String data = "('"+nama+"','"+alamat+"','"+notlp
                + "')";
        String sql = "insert into penerima (nama_penerima,almt_penerima,notlp_penerima) values"+data;
        try {
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "data berhasil dimasukkan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
}
