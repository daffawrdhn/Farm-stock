/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import connector.config;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class m_Service_Distribute extends config {

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    public m_Service_Distribute() {
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

    public HashMap<String, Integer> combopenerima() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        try {
            String sql = "SELECT nama_penerima from penerima";
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
            m_Service_Load models = new m_Service_Load();

            while (resultSet.next()) {
                map.put(resultSet.getString(1), Integer.MIN_VALUE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return map;
    }

    public int getidpenerima(String penerima) throws SQLException {
        String sql = "select * from penerima where nama_penerima = '" + penerima + "'";
        PreparedStatement ps = connection.prepareStatement(sql);
        resultSet = ps.executeQuery(sql);
        resultSet.next();
        int id = resultSet.getInt("id_penerima");
        return id;
    }

    public int baranggudang(int id_barang, int id_wh) throws SQLException {

        String data = "id_brg = " + id_barang + " and id_wh =" + id_wh;
        String sql = "select * from detailbarang where " + data;
        PreparedStatement ps = connection.prepareStatement(sql);
        resultSet = ps.executeQuery();
        resultSet.next();
        int cek = resultSet.getRow();

        int barang;
        if (cek == 0) {
            barang = 0;
        } else {
            barang = resultSet.getInt("jml_brg");
        }

        return barang;
    }

    public void simpanbutton(String barang, String gudang, String penerima, int jumlah, String ket) {
        try {

            m_Service_Load load = new m_Service_Load();
            int id_barang = load.getidbarang(barang);
            int id_gudang = load.getidgudang(gudang);
            int jml = baranggudang(id_barang, id_gudang);
            int id_penerima = getidpenerima(penerima);

            String datadistribute = "('" + id_barang + "','" + id_gudang + "','" + id_penerima + "','" + jumlah + "',NOW()" + ",'" + ket + "')";
            String distribute = "insert into distribute (id_brg, id_wh, id_penerima, sum_goods, tgl_distribute, keterangan) values " + datadistribute;
            System.out.println(distribute);

            if (jml == 0) {
                JOptionPane.showMessageDialog(null, "Maaf barang sedang kosong di gudang");
            } else if (jml < jumlah) {
                JOptionPane.showMessageDialog(null, "Barang yang anda kirimkan melebihi yang tersedia");
            } else {
                int updt_jml = load.whava(id_gudang) + jumlah;
                int updt_detail = load.getjmlbrg(id_barang, id_gudang) - jumlah;

                PreparedStatement ps = connection.prepareStatement(distribute);
                ps.executeUpdate();
                String sqldetailupdate = "update detailbarang set jml_brg = '" + updt_detail + "' where id_wh = '" + id_gudang + "' and  id_brg = '" + id_barang + "'";
                PreparedStatement pa = connection.prepareStatement(sqldetailupdate);
                pa.executeUpdate();
                load.updateavawh(updt_jml, id_gudang);

                JOptionPane.showMessageDialog(null, "data berhasil dimasukkan");

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public DefaultTableModel tabeldistribute() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("no");
        model.addColumn("Nama Barang");
        model.addColumn("Jenis Barang");
        model.addColumn("Jumlah Barang");
        model.addColumn("Gudang");

        model.addColumn("Alamat Penerima");
        model.addColumn("Nama Penerima");
        model.addColumn("Tanggal Distribute");
        model.addColumn("keterangan");
        try {
            String sql = " SELECT g.nama_brg,g.jenis_brg,d.sum_goods,concat(w.kode_wh,' - ',w.nama_wh) as gudang, p.almt_penerima,p.nama_penerima, d.tgl_distribute, d.keterangan FROM distribute d join goods g on d.id_brg=g.id_brg join penerima p on d.id_penerima=p.id_penerima JOIN warehouse w on d.id_wh=w.id_wh";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            int no = 0;
            while (resultSet.next()) {
                no++;
                model.addRow(new Object[]{
                    no, resultSet.getString("nama_brg"), resultSet.getString("jenis_brg"), resultSet.getInt("sum_goods"), resultSet.getString("gudang"), resultSet.getString("almt_penerima"), resultSet.getString("nama_penerima"), resultSet.getString("tgl_distribute"), resultSet.getString("keterangan")
                });

            }

        } catch (Exception e) {
            e.getMessage();
        }
        return model;

    }
    
    public DefaultTableModel tabeldistribute(int i) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("id");
        model.addColumn("Nama Barang");
        model.addColumn("Jenis Barang");
        model.addColumn("Jumlah Barang");
        model.addColumn("Gudang");

        model.addColumn("Alamat Penerima");
        model.addColumn("Nama Penerima");
        model.addColumn("Tanggal Distribute");
        model.addColumn("keterangan");
        try {
            String sql = " SELECT d.id_distribute,g.nama_brg,g.jenis_brg,d.sum_goods,concat(w.kode_wh,' - ',w.nama_wh) as gudang, p.almt_penerima,p.nama_penerima, d.tgl_distribute, d.keterangan FROM distribute d join goods g on d.id_brg=g.id_brg join penerima p on d.id_penerima=p.id_penerima JOIN warehouse w on d.id_wh=w.id_wh";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            int no = 0;
            while (resultSet.next()) {
                no++;
                model.addRow(new Object[]{
                    resultSet.getInt("id_distribute"), resultSet.getString("nama_brg"), resultSet.getString("jenis_brg"), resultSet.getInt("sum_goods"), resultSet.getString("gudang"), resultSet.getString("almt_penerima"), resultSet.getString("nama_penerima"), resultSet.getString("tgl_distribute"), resultSet.getString("keterangan")
                });

            }

        } catch (Exception e) {
            e.getMessage();
        }
        return model;

    }

    public void upatedistribute(int id, String namabrg, String namawh, String namapnrm, int jmlbrg) {
        try {
            
            m_Service_Load load = new m_Service_Load();
            int idbrg = load.getidbarang(namabrg);
            
            int idwh = load.getidgudang(namawh);
         
            int idpenerima = getidpenerima(namapnrm);
            

            String getjmlh = "select id_brg,id_wh,id_penerima,sum_goods from distribute where id_distribute = '"+id+"'";

            PreparedStatement ps = connection.prepareStatement(getjmlh);
            resultSet = ps.executeQuery(getjmlh);
            System.out.println();
            System.out.println(resultSet.next());
            

            int idbrglama = resultSet.getInt("id_brg");
//            System.out.println("idbrg"+idbrglama);
            int idwhlama = resultSet.getInt("id_wh");
//            System.out.println("idwh = "+idwhlama);
            int idpenerimalama = resultSet.getInt("id_penerima");
//            System.out.println("penerima "+idpenerimalama);
            int jmllama = resultSet.getInt("sum_goods");
//            System.out.println("jmlbrg = "+jmllama);
            int jmlwhlama = load.whava(idwh);
            int detaillama = load.getjmlbrg(idbrglama, idwhlama);
            int jmlwh, detailbaru, detailbarubaranglama, detailbarubarangbaru;

            if (idwh == idwhlama) {
                jmlwh = jmlwhlama + jmllama - jmlbrg;
                load.updateavawh(jmlwh, idwhlama);
                if (idbrg == idbrglama) {
                    detailbaru = detaillama + jmllama - jmlbrg;
                    String sqldetailupdate = "update detailbarang set jml_brg = '" + detailbaru + "' where id_wh = '" + idwhlama + "' and  id_brg = '" + idbrglama + "'";
                    PreparedStatement psa = connection.prepareStatement(sqldetailupdate);
                    psa.executeUpdate();
                } else {
                    detailbarubaranglama = detaillama + jmllama;
                    detailbarubarangbaru = load.getjmlbrg(idbrg, idwh) - jmlbrg;
                    String sqldetailupdate = "update detailbarang set jml_brg = '" + detailbarubaranglama + "' where id_wh = '" + idwhlama + "' and  id_brg = '" + idbrglama + "'";
                    PreparedStatement updatedetaillama = connection.prepareStatement(sqldetailupdate);
                    updatedetaillama.executeUpdate();
                    String sqldetailupdate2 = "update detailbarang set jml_brg = '" + detailbarubarangbaru + "' where id_wh = '" + idwhlama + "' and  id_brg = '" + idbrg + "'";
                    PreparedStatement updatedetailbaru = connection.prepareStatement(sqldetailupdate2);
                    updatedetailbaru.executeUpdate();

                }
            } else {
                jmlwh = load.whava(idwhlama) - jmllama;
                int cpctywhbaru = load.whava(idwh) + jmlbrg;
                load.updateavawh(jmlwh, idwhlama);
                load.updateavawh(cpctywhbaru, idwh);
                if (idbrglama == idbrg) {
                    int detailwhlamaupdate = load.getjmlbrg(idbrglama, idwhlama) + jmllama;
                    detailbaru = detaillama + jmllama - jmlbrg;
                    String sqldetailupdate = "update detailbarang set jml_brg = '" + detailbaru + "' where id_wh = '" + idwh + "' and  id_brg = '" + idbrglama + "'";
                    PreparedStatement pc = connection.prepareStatement(sqldetailupdate);
                    pc.executeUpdate();
                    String sqldetailupdate2 = "update detailbarang set jml_brg = '" + detailwhlamaupdate + "' where id_wh = '" + idwhlama + "' and  id_brg = '" + idbrglama + "'";
                    PreparedStatement pa = connection.prepareStatement(sqldetailupdate2);
                    pa.executeUpdate();
                } else {
                    detailbarubaranglama = detaillama + jmllama;
                    int detailbrgbaru = load.getjmlbrg(idbrg, idwh) - jmlbrg;

                    String sqldetailupdate = "update detailbarang set jml_brg = '" + detailbarubaranglama + "' where id_wh = '" + idwhlama + "' and  id_brg = '" + idbrglama + "'";
                    PreparedStatement ppe = connection.prepareStatement(sqldetailupdate);
                    ppe.executeUpdate();
                    String sqldetailupdate2 = "update detailbarang set jml_brg = '" + detailbrgbaru + "' where id_wh = '" + idwh + "' and  id_brg = '" + idbrg + "'";
                    PreparedStatement pf = connection.prepareStatement(sqldetailupdate2);
                    pf.executeUpdate();
                }
            }
            String updatedistribute = "update distribute set id_brg = '" + idbrg + "', id_wh ='" + idwh + "', id_penerima ='" + idpenerima + "', sum_goods ='" + jmlbrg + "' where id_distribute = '"+id+"'";
            PreparedStatement distribute = connection.prepareStatement(updatedistribute);
            distribute.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil diupdate");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
