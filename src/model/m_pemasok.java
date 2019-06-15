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
import javax.swing.table.DefaultTableModel;
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
            String sql = "INSERT INTO suppliers (kode_supp,nama_supp,almt_supp,notlp) values (?,?,?,?)";
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
    
    public void updatepemasok(int id, String nama, String almat, String notlp ,String kode ){
        try {
            String sql = "update suppliers set nama_supp = '" + nama + "', kode_supp = '"+kode+"', almt_supp = '" + almat + "', notlp = '" + notlp + "' where id_supp = " + id;
            com.mysql.jdbc.PreparedStatement ps = (com.mysql.jdbc.PreparedStatement) connection.prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil diupdate");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public DefaultTableModel tabellpenerima() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("id");
        model.addColumn("Nama Pemasok");
        model.addColumn("Alamat Pemasok");
        model.addColumn("Kode pemasok");
        model.addColumn("No Telp");

        try {
            String sql = "select * from suppliers";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                model.addRow(new Object[]{
                    resultSet.getInt("id_supp"), resultSet.getString("nama_supp"), resultSet.getString("almt_supp"),resultSet.getString("kode_supp") ,resultSet.getString("notlp")
                });

            }

        } catch (Exception e) {
            e.getMessage();
        }
        return model;
    }

}
