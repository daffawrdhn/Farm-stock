/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfTable;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import view.v_overview;
import view.v_service;
import view.v_service_load;
import view.v_service_distribute;
import model.m_Service;
import model.m_Service_Load;
import model.m_Service_Distribute;
import view.v_pemasok;
import model.m_pemasok;
import view.v_barang;
import model.m_barang;
import model.m_penerima;
import view.v_penerima;
import view.v_service_load_edit;
import view.v_penerima_edit;
import view.v_pemasok_edit;
import view.v_barang_edit;

/**
 *
 * @author albariiqy
 */
public class c_Service {

    v_service views;
    m_Service model;

    public c_Service(v_service service, m_Service model) {
        this.views = service;
        this.model = model;

        views.getBtnLoad().addActionListener(new ButtonLoad());
        views.getBtnDistribute().addActionListener(new ButtonDistribute());
        views.getBtnpemasok().addActionListener(new ButtonPemasok());
        views.getBtnbarang().addActionListener(new ButtonBarang());
        views.getBtnpenerima().addActionListener(new ButtonPenerima());
        views.getPrntdistri().addActionListener(new PrintDistribute());
        views.getPrntload().addActionListener(new ButtonPrintLoad());
        
        views.getEditload().addActionListener(new btneditload());
        views.getEditpmasok().addActionListener(new ButtonPemasokEdit());
        views.getEditpenerima().addActionListener(new ButtonPenerimaEdit());
        views.getEditbrang().addActionListener(new ButtonBarangEdit());
        
        views.setTabel(service.getTableload(), model.load());
        views.setTabel(service.getTabledistribute(), model.distribute());

    }

    private static class ButtonPenerimaEdit implements ActionListener {

        public ButtonPenerimaEdit() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            m_penerima m = new m_penerima();
            v_penerima_edit v = new v_penerima_edit();
            c_penerima_edit c = new c_penerima_edit(v, m);

        }
    }

    private static class ButtonBarangEdit implements ActionListener {

        public ButtonBarangEdit() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        m_barang m = new m_barang();
        v_barang_edit v = new v_barang_edit();
        c_barang_edit c = new c_barang_edit(v, m);
        }
    }

    private static class ButtonPrintLoad implements ActionListener {

        public ButtonPrintLoad() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private class PrintDistribute implements ActionListener {

        public PrintDistribute() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String path="";
            JFileChooser j = new JFileChooser();
            j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            
            int x = j.showSaveDialog(views);
            
            if (x==JFileChooser.APPROVE_OPTION) {
                path = j.getSelectedFile().getPath();
            }
            
            Document doc=new Document();
            
            try {
                PdfWriter.getInstance(doc, new FileOutputStream(path+"/abc123.pdf"));
                doc.open();
                
                PdfPTable tb = new PdfPTable(5);
                tb.addCell("Kegiatan");
                tb.addCell("Nama Barang");

                tb.addCell("Jumlah Barang");
                tb.addCell("Gudang");
                
                for (int i = 0; i < model.distribute().getRowCount(); i++) {
                    String kegiatan = "Distribute";
//                    String nama = views.getTabledistribute().getValueAt(i, 1).toString();
//                    String jumlah = views.getTabledistribute().getValueAt(i, 3).toString();
//                    String gudang = views.getTabledistribute().getValueAt(i, 4).toString();
                    String nama = "almas";
                    String jumlah = "12";
                    String gudang = "wh";
                    tb.addCell(kegiatan);
                    tb.addCell(nama);
                    tb.addCell(jumlah);
                    tb.addCell(gudang);
                    
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(c_Service.class.getName()).log(Level.SEVERE, null, ex);
            } catch (DocumentException ex) {
                Logger.getLogger(c_Service.class.getName()).log(Level.SEVERE, null, ex);
            }
            doc.close();
            
        }
    }

    private class ButtonPemasokEdit implements ActionListener {

        public ButtonPemasokEdit() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        m_pemasok m = new m_pemasok();
        v_pemasok_edit v = new v_pemasok_edit();
        c_pemasok_edit c = new c_pemasok_edit(v, m);
        }
    }

    private class btneditload implements ActionListener {

        public btneditload() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            v_service_load_edit v = new v_service_load_edit();
            m_Service_Load m = new m_Service_Load();
            c_Service_Load_Edit control = new c_Service_Load_Edit(m, v);
        }
    }

    private class ButtonLoad implements ActionListener {

        public ButtonLoad() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

            if (views.getLoadcekbox().isSelected()) {
                v_service_load v = new v_service_load();
                m_Service_Load m = new m_Service_Load();
                c_Service_Load cload = new c_Service_Load(v, m);
            } else {
                JOptionPane.showMessageDialog(null, "Muatan sedang dihentikan");
            }

        }
    }

    private class ButtonDistribute implements ActionListener {

        public ButtonDistribute() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            if (views.getDistributecekbox().isSelected()) {
                v_service_distribute v = new v_service_distribute();
                m_Service_Distribute m = new m_Service_Distribute();
                c_Service_Distribute distribute = new c_Service_Distribute(v, m);

            } else {
                JOptionPane.showMessageDialog(null, "Distribusi sedang dihentikan");

            }
//              throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class ButtonPemasok implements ActionListener {

        public ButtonPemasok() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            m_pemasok m = new m_pemasok();
            v_pemasok v = new v_pemasok();
            c_pemasok pemasok = new c_pemasok(m, v);
        }
    }

    private static class ButtonBarang implements ActionListener {

        public ButtonBarang() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            m_barang m = new m_barang();
            v_barang v = new v_barang();
            c_barang barang = new c_barang(v, m);
        }
    }

    private static class ButtonPenerima implements ActionListener {

        public ButtonPenerima() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            m_penerima m = new m_penerima();
            v_penerima v = new v_penerima();
            c_penerima penerima = new c_penerima(v, m);
        }
    }

}
