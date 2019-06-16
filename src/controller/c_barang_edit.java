/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JOptionPane;
import view.v_barang_edit;
import model.m_barang;

/**
 *
 * @author albariiqy
 */
public class c_barang_edit {
    
    v_barang_edit views;
    m_barang model;
    
    public c_barang_edit(v_barang_edit views, m_barang model) {
        this.views = views;
        this.model = model;
        
        views.setVisible(true);
        comboPemasok();
        views.getSubmit().addActionListener(new btnsubmit());
        views.getCancel().addActionListener(new btncancel());
        views.setTabel(views.getTabelbarang(), model.tabelbarang());
    }
    
    private class btncancel implements ActionListener {
        
        public btncancel() {
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            views.dispose();
        }
    }
    
    private class btnsubmit implements ActionListener {
        
        public btnsubmit() {
        }
        
        @Override
        public void actionPerformed(ActionEvent ae) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            String nama = views.getNamabarang().getText();
            String kode = views.getKodebarang().getText();
            String pemasok = views.getCombopemasok().getSelectedItem().toString();
            String jenisbrg = views.getJenisbrg().getText();
            int id, berat;
            
            try {
                id = Integer.parseInt(views.getIdbarang().getText());
                berat = Integer.parseInt(views.getBrtbrg().getText());
                
            } catch (Exception e) {
                id = 0;
                berat = 0;
            }
            
            if (nama.equalsIgnoreCase("") || kode.equalsIgnoreCase("") || jenisbrg.equalsIgnoreCase("") || id == 0 || berat <= 0) {
                JOptionPane.showMessageDialog(null, "Data salah inputan/ Data kosong");
            } else {
                int jawab = JOptionPane.showOptionDialog(null,
                        "Anda Yakin Akan menambahkan Barang ini ?",
                        "Keluar",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, null, null);
                
                if (jawab == JOptionPane.YES_OPTION) {
                    model.updatebarang(id, nama, berat, pemasok, jenisbrg, kode);
                    clear();
                }
            }
        }
    }
    
    public void comboPemasok() {
        HashMap<String, Integer> map = model.combopemasok();
        for (String s : map.keySet()) {
            views.setCombopemasok(s);
        }
    }
    
    public void clear() {
        String clear = "";
        views.setIdbarang(clear);
        views.setName(clear);
        views.setKodebarang(clear);
        views.setBrtbrg(clear);
        views.setBrtbrg(clear);
    }
    
}
