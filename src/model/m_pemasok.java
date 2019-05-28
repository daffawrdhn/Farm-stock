/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import connector.config;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import sun.java2d.loops.CompositeType;

/**
 *
 * @author albariiqy
 */
public class m_pemasok extends config {

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    public m_pemasok() {
        try {
            connection = connection();
            statement = connection.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void simpanpemasok(String kp,String nm, String alm, String notelp){
        try {
            String sql = "INSERT INTO supplier (kode_supplier,nama_supp,almt_supp,notlp) values (?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, kp);
            ps.setString(2, nm);
            ps.setString(3, alm);
            ps.setString(4, notelp);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pemasok Berhasil ditambahkan");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    
    }
}
