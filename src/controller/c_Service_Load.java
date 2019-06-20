/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.v_service_load;
import model.m_Service_Load;
import java.util.HashMap;
import javax.swing.JOptionPane;


/**
 *
 * @author albariiqy
 */
public class c_Service_Load {

    v_service_load views;
    m_Service_Load model;

    /**
     *
     * @param v
     * @param m
     */
    public c_Service_Load(v_service_load v, m_Service_Load m) {
        this.views = v;
        this.model = m;

        combobarang();
        combogudang();
        this.views.setVisible(true);
        views.getlBack().addActionListener(new BackButton());
        views.getlSimpan().addActionListener(new ButtonSimpan());
        views.setTabel(views.getTabelload(), model.tabelload());
        

    }

    public void combobarang() {
        HashMap<String, Integer> map = model.combobarang();
        for (String s : map.keySet()) {
            views.setCombobarang(s);
        }
    }

    public void combogudang() {
        HashMap<String, Integer> map = model.combogudang();
        for (String s : map.keySet()) {
            views.setCombogudang(s);
        }
    }

    private class ButtonSimpan implements ActionListener {

        public ButtonSimpan() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            String barang = views.getCombobarang().getSelectedItem().toString();
            String gudang = views.getCombogudang().getSelectedItem().toString();
            String ket = views.getL_keterangan().getText();
            int sum;
            try {
                sum = Integer.parseInt(views.getBanyakBarang().getText());
            } catch (Exception ae) {
                sum = 0;
            }
            
            if (sum == 0) {
                JOptionPane.showMessageDialog(null, "barang tidak boleh kosong");
            } else {
                int jawab = JOptionPane.showOptionDialog(null,
                        "Anda Yakin Akan menambahkan Muatan gudang ini ?",
                        "Keluar",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, null, null);

                if (jawab == JOptionPane.YES_OPTION) {
                    model.simpanload(sum, barang, gudang, ket);
//                        JOptionPane.showMessageDialog(null, "Pemasok berhasil disimpan");
                    views.setBanyakBarang("");
                    views.setTabel(views.getTabelload(), model.tabelload());
                }
            }
        }
    }

    private class BackButton implements ActionListener {

        public BackButton() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            views.dispose();
        }
    }

}
