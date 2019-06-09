/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author albariiqy
 */
import java.util.HashMap;
import javax.swing.JOptionPane;
import model.m_Service;
import connector.config;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class m_Service_Load extends config {

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    public m_Service_Load() {
        try {
            connection = connection();
            statement = connection.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public HashMap<String, Integer> combobarang() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        try {
            String sql = "SELECT nama_brg from goods";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                map.put(resultSet.getString(1), Integer.MIN_VALUE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return map;
    }

    public HashMap<String, Integer> combogudang() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        try {
            String sql = "SELECT nama_wh from warehouse";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                map.put(resultSet.getString(1), Integer.MIN_VALUE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return map;
    }

    public int getidbarang(String nama) throws SQLException {
        String sql = "Select id_brg from goods where nama_brg = '" + nama + "'";
        PreparedStatement ps = connection.prepareStatement(sql);
        resultSet = ps.executeQuery(sql);
        resultSet.next();
        int id = resultSet.getInt("id_brg");
        return id;
    }

    public int getidgudang(String nama) throws SQLException {
        String sql = "Select id_wh from warehouse where nama_wh = '" + nama + "'";
        PreparedStatement ps = connection.prepareStatement(sql);
        resultSet = ps.executeQuery(sql);
        resultSet.next();
        int id = resultSet.getInt("id_wh");
        return id;
    }

    public int whava(int id_wh) throws SQLException {

        String sql = "select * from warehouse where id_wh =" + id_wh;
        PreparedStatement ps = connection.prepareStatement(sql);
        resultSet = ps.executeQuery();
        resultSet.next();
        int ava = resultSet.getInt("kapasitas_ava");

        System.out.println(ava);

        return ava;
    }

    public int getjmlbrg(int id_brg, int id_wh) throws SQLException {

        String sql = "select jml_brg from detailbarang where id_brg = '" + id_brg + "' and id_wh =" + id_wh;
        PreparedStatement ps = connection.prepareStatement(sql);
        resultSet = ps.executeQuery();
        resultSet.next();
        int jumlah = resultSet.getInt("jml_brg");

        return jumlah;
    }

    public boolean cekbrgdigudang(int id_brg, int id_wh) throws SQLException {
        boolean check = true;

        String data = "id_brg = " + id_brg + " and id_wh =" + id_wh;
        String sql = "select id_detailbarang from detailbarang where " + data;
        PreparedStatement ps = connection.prepareStatement(sql);
        resultSet = ps.executeQuery();
        resultSet.next();
        int row = resultSet.getRow();
        if (row == 0) {
            check = false;
        }
        return check;

    }

    public void updateavawh(int newava, int id_wh) {
        try {
            String sql = "update warehouse set kapasitas_ava = " + newava + " where id_wh =" + id_wh;
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.executeUpdate(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public void simpanload(int sum, String barang, String gudang, String ket) {
        try {

            int id_brg = getidbarang(barang);
            int id_wh = getidgudang(gudang);

//            System.out.println(sqlload);
            String datadetail = "(" + id_brg + "," + id_wh + "," + sum + ")";
            String sqldetail = "insert into detailbarang (id_brg,id_wh,jml_brg) values " + datadetail;

            int cek = whava(id_wh);
            boolean cekbarang = cekbrgdigudang(id_brg, id_wh);
            System.out.println(cekbarang);

            if (sum < cek) {
                if (cekbarang) {
                    int jbrglama = getjmlbrg(id_brg, id_wh);
                    int jbrgbaru = jbrglama + sum;
                    
                    String sqldetailupdate = "update detailbarang set jml_brg = '" + jbrgbaru + "' where id_wh = '" + id_wh + "' and  id_brg = '" + id_brg+"'";
                    PreparedStatement ps = connection.prepareStatement(sqldetailupdate);
                    ps.executeUpdate();
                } else {
                    PreparedStatement pc = connection.prepareStatement(sqldetail);
                    pc.executeUpdate();
                }
                int ava = cek - sum;
                updateavawh(ava, id_wh);
                String dataload = "('" + id_brg + "','" + id_wh + "','" + sum + "',NOW(),'" + ket + "')";
                String sqlload = "INSERT INTO loaded (id_brg, id_wh, jml_brg, tgl_load,keterangan) values " + dataload;
                PreparedStatement ps = connection.prepareStatement(sqlload);
                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "data berhasil diinputkan");
            } else {
                JOptionPane.showMessageDialog(null, "gudang penuh atau barang anda melebihi kapasitas tersedia");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public DefaultTableModel tabelload() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("no");
        model.addColumn("Nama Barang");
        model.addColumn("Jenis Barang");
        model.addColumn("Jumlah Barang");
        model.addColumn("Gudang");
        model.addColumn("Pemasok");
        model.addColumn("Tanggal Load");
        model.addColumn("keterangan");
        try {
            String sql = "SELECT g.nama_brg,s.nama_supp,g.jenis_brg,concat(w.kode_wh,' - ',w.nama_wh) as gudang, l.jml_brg,l.tgl_load,l.keterangan FROM loaded l JOIN goods g on g.id_brg=l.id_brg join suppliers s on g.id_supp=s.id_supp JOIN warehouse w on l.id_wh=w.id_wh";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            int no = 0;
            while (resultSet.next()) {
                no++;
                model.addRow(new Object[]{
                    no, resultSet.getString("nama_brg"), resultSet.getString("jenis_brg"),resultSet.getInt("jml_brg"),resultSet.getString("gudang"),resultSet.getString("nama_supp"),resultSet.getString("tgl_load"),resultSet.getString("keterangan")
                });
                
            }

        } catch (Exception e) {
            e.getMessage();
        }
        return model;

    }

}
