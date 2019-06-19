/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import connector.config;
import java.io.FileOutputStream;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author albariiqy
 */
public class m_Service extends config {

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

    public DefaultTableModel load() {
        DefaultTableModel model = new DefaultTableModel();
        m_Service_Load load = new m_Service_Load();

        model = load.tabelload();

        return model;
    }

    public DefaultTableModel distribute() {
        DefaultTableModel model = new DefaultTableModel();
        m_Service_Distribute distribute = new m_Service_Distribute();

        model = distribute.tabeldistribute();

        return model;
    }

    public void tabelexportdistribute(String path) {
        try {

            String file_name = path + "/distribute.pdf";
            Document dc = new Document();
            PdfWriter.getInstance(dc, new FileOutputStream(file_name));
            dc.open();
            String sql = "SELECT d.tgl_distribute,d.sum_goods,g.nama_brg,p.nama_penerima FROM distribute d JOIN penerima p on d.id_penerima=p.id_penerima join goods g on d.id_brg=g.id_brg";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            PdfPTable tbl = new PdfPTable(5);
            tbl.addCell("Event");
            tbl.addCell("Tanggal");
            tbl.addCell("Jumlah");
            tbl.addCell("Barang");
            tbl.addCell("Penerima");
            while (resultSet.next()) {
                tbl.addCell("Distribute");
                tbl.addCell(resultSet.getString("tgl_distribute"));
                tbl.addCell(String.valueOf(resultSet.getInt("sum_goods")));
                tbl.addCell(resultSet.getString("nama_brg"));
                tbl.addCell(resultSet.getString("nama_penerima"));

            }
            dc.add(tbl);
            dc.close();
            JOptionPane.showMessageDialog(null, "PDF Berhasil di export");
        } catch (Exception ae) {
            System.out.println(ae);
        }
    }

    public void tabelexportload(String path) {
        try {

            String file_name = path + "/load.pdf";
            Document dc = new Document();
            PdfWriter.getInstance(dc, new FileOutputStream(file_name));
            dc.open();
            String sql = "SELECT l.tgl_load,g.nama_brg,l.jml_brg,w.nama_wh,s.nama_supp FROM loaded l JOIN goods g on l.id_brg=g.id_brg JOIN warehouse w on l.id_wh=w.id_wh JOIN suppliers s ON g.id_supp=s.id_supp";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            PdfPTable tbl = new PdfPTable(6);
            tbl.addCell("Event");
            tbl.addCell("Tanggal");
            tbl.addCell("Barang");
            tbl.addCell("Jumlah");
            tbl.addCell("Gudang");
            tbl.addCell("Supplier");
            while (resultSet.next()) {
                tbl.addCell("Load");
                tbl.addCell(resultSet.getString("tgl_load"));
                tbl.addCell(resultSet.getString("nama_brg"));
                tbl.addCell(String.valueOf(resultSet.getInt("jml_brg")));
                tbl.addCell(resultSet.getString("nama_wh"));
                tbl.addCell(resultSet.getString("nama_supp"));
            }
            dc.add(tbl);
            dc.close();
            JOptionPane.showMessageDialog(null, "PDF Berhasil di export");
        } catch (Exception ae) {
            System.out.println(ae);
        }
    }
}
