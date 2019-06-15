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
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author albariiqy
 */
public class m_Storage extends config{

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    public m_Storage() {
        try {
            connection = connection();
            statement = connection.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public DefaultTableModel tabelload(int id) {
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
            String sql = "SELECT g.nama_brg,s.nama_supp,g.jenis_brg,concat(w.kode_wh,' - ',w.nama_wh) as gudang, l.jml_brg,l.tgl_load,l.keterangan FROM loaded l JOIN goods g on g.id_brg=l.id_brg join suppliers s on g.id_supp=s.id_supp JOIN warehouse w on l.id_wh=w.id_wh where l.id_wh="+id+" order by l.tgl_load desc";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            int no = 0;
            while (resultSet.next()) {
                no++;
                model.addRow(new Object[]{
                    no, resultSet.getString("nama_brg"), resultSet.getString("jenis_brg"), resultSet.getInt("jml_brg"), resultSet.getString("gudang"), resultSet.getString("nama_supp"), resultSet.getString("tgl_load"), resultSet.getString("keterangan")
                });

            }

        } catch (Exception e) {
            e.getMessage();
        }
        return model;

    }
    
    
    public DefaultTableModel tabeldistribute(int id) {
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
            String sql = " SELECT g.nama_brg,g.jenis_brg,d.sum_goods,concat(w.kode_wh,' - ',w.nama_wh) as gudang, p.almt_penerima,p.nama_penerima, d.tgl_distribute, d.keterangan FROM distribute d join goods g on d.id_brg=g.id_brg join penerima p on d.id_penerima=p.id_penerima JOIN warehouse w on d.id_wh=w.id_wh where d.id_wh ="+id+"  order by d.tgl_distribute desc";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
          
            int no = 0;
            while (resultSet.next()) {
                no++;
                model.addRow(new Object[]{
                    no, resultSet.getString("nama_brg"), resultSet.getString("jenis_brg"), resultSet.getInt("sum_goods"), resultSet.getString("gudang"), resultSet.getString("almt_penerima"), resultSet.getString("nama_penerima"), resultSet.getString("tgl_distribute"), resultSet.getString("keterangan")
                });

            }
            System.out.println("bisa");
        } catch (Exception e) {
            e.getMessage();
        }
        return model;

    }
    
    public int getcapacity(int id_wh) {
        int capacity = 0;
        
        try {
        String sql = "select kapasitas_wh from warehouse where id_wh = " + id_wh;
        PreparedStatement ps = connection.prepareStatement(sql);
        resultSet = ps.executeQuery();
        resultSet.next();
        capacity = resultSet.getInt("kapasitas_wh");
            
        } catch (Exception e) {
        }
        return capacity;
    }

    public int datapercentage(int id_wh) {
        int progress = 0;
        try {

            m_Service_Load load = new m_Service_Load();

            int a = load.whava(id_wh);
            int b = getcapacity(id_wh);

            progress = b-a;
//            System.out.println(a +","+ b +","+(b-a)+"," +progress);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(progress);
        return progress;
    }

}
