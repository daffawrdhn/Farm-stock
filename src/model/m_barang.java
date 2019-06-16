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
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author albariiqy
 */
public class m_barang extends config {

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    public m_barang() {
        try {
            connection = connection();
            statement = connection.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public HashMap<String, Integer> combopemasok() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        try {
            String sql = "select id_supp,nama_supp,kode_supp from suppliers";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
//                m = new m_combobarang(resultSet.getInt(1), resultSet.getString(2));
                String xmap = resultSet.getString(2);
                map.put(xmap, Integer.MAX_VALUE);
//                System.out.println(resultSet.getInt(1));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return map;
    }
    public int getidpemasok(String id) throws SQLException {
        String sql = "select id_supp from suppliers where nama_supp = "+"'"+(id)+"'";
        connection = connection();
        PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
//        preparedStatement.setString(1, id);
        resultSet = preparedStatement.executeQuery();
        resultSet.next();
        int id1 = resultSet.getInt("id_supp");
        return id1;
    }
    public void simpanbarang(String kode, String nama, String jenis, int berat,String pemasok) {
        try {
            int id = getidpemasok(pemasok);
            String insert = "('"+kode+"','"+nama+"','"+berat+"','"+jenis+"','"+id+"')";
            String sql = "INSERT INTO goods (kode_brg,nama_brg,berat_brg,jenis_brg,id_supp) values"+insert;
         
            PreparedStatement ps =  connection.prepareStatement(sql);
//            String fnama = "'"+nama+"'";
//            ps.setString(1,kode);
//            ps.setString(2,fnama);
//            ps.setInt(3,berat );
//            ps.setString(4, jenis);
//            ps.setInt(5,id);
            
            ps.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null, "barang berhasil di inputkan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
    }
    
    public void updatebarang(int id, String nama, int brtbrg,String pemasok, String jenis ,String kode ){
        try {
            int idpemasok = getidpemasok(pemasok);
            String sql = "update goods set kode_brg ='"+kode+"', nama_brg='"+nama+"', berat_brg ='"+brtbrg+"', jenis_brg ='"+jenis+"', id_supp ='"+idpemasok+"' where id_brg ='"+id+"'";
            com.mysql.jdbc.PreparedStatement ps = (com.mysql.jdbc.PreparedStatement) connection.prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil diupdate");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public DefaultTableModel tabelbarang() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("id");
        model.addColumn("Nama Barang");
        model.addColumn("Kode Barang");
        model.addColumn("Berat Barang");
        model.addColumn("Jenis Barang");
        model.addColumn("Pemasok");

        try {
            String sql = "SELECT g.id_brg,g.kode_brg,g.nama_brg,g.berat_brg,g.jenis_brg,s.nama_supp FROM goods g JOIN suppliers s on g.id_supp=s.id_supp ";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                model.addRow(new Object[]{
                    resultSet.getInt("id_brg"), resultSet.getString("nama_brg"),resultSet.getString("kode_brg"), resultSet.getInt("berat_brg"),resultSet.getString("jenis_brg") ,resultSet.getString("nama_supp")
                });

            }

        } catch (Exception e) {
            e.getMessage();
        }
        return model;
    }

    
}
