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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author albariiqy
 */
public class m_penerima extends config {

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
        String data = "('" + nama + "','" + alamat + "','" + notlp
                + "')";
        String sql = "insert into penerima (nama_penerima,almt_penerima,notlp_penerima) values" + data;
        try {
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "data berhasil dimasukkan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public DefaultTableModel tabellpenerima() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("id");
        model.addColumn("Nama Penerima");
        model.addColumn("Alamat Penerima");
        model.addColumn("No Telp");

        try {
            String sql = "select * from penerima";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                model.addRow(new Object[]{
                    resultSet.getInt("id_penerima"), resultSet.getString("nama_penerima"), resultSet.getString("almt_penerima"), resultSet.getString("notlp_penerima")
                });

            }

        } catch (Exception e) {
            e.getMessage();
        }
        return model;

    }

    public void updatepenerima(int id, String nama, String alamat, String notlp) {
        try {
            String sql = "update penerima set nama_penerima = '" + nama + "', almt_penerima = '" + alamat + "', notlp_penerima = '" + notlp + "' where id_penerima = " + id;
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil dimasukkan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
}
