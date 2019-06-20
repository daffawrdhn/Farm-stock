/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import java.sql.SQLException;
import view.v_barang;
import model.m_barang;

/**
 *
 * @author albariiqy
 */
public class c_barang {

    v_barang view;
    m_barang model;

    public c_barang(v_barang view, m_barang model) {
        this.view = view;
        this.model = model;

        view.setVisible(true);

        comboPemasok();
        view.getSubmit().addActionListener(new btnsubmit());
        view.getBack().addActionListener(new Buttonback());
    }

    public void comboPemasok() {
        HashMap<String, Integer> map = model.combopemasok();
        for (String s : map.keySet()) {
            view.setPemasokcombo(s);
        }
    }

    private class btnsubmit implements ActionListener {

        public btnsubmit() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            int brtbrg = 0;
            String kode = view.getKode_barang().getText();
            String namabrg = view.getNama_barang().getText();
            String jenisbrg = view.getJenis_barang().getText();

            try {
                brtbrg = Integer.parseInt(view.getBerat_barang().getText());
            } catch (Exception a) {
                brtbrg = 0;
            };
            System.out.println();

            String pemasok = view.getPemasok().getSelectedItem().toString();
            if (kode.length() > 5) {
                JOptionPane.showMessageDialog(null, "Kode tidak boleh lebih dari 5 digit");
            } else if (kode.equalsIgnoreCase("") || namabrg.equalsIgnoreCase("") || jenisbrg.equalsIgnoreCase("") || brtbrg == 0 || pemasok.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Data tidak boleh kosong");
            } else {
                int jawab = JOptionPane.showOptionDialog(null,
                        "Anda Yakin Akan menambahkan Barang ini ?",
                        "Keluar",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, null, null);

                if (jawab == JOptionPane.YES_OPTION) {
                    model.simpanbarang(kode, namabrg, jenisbrg, brtbrg, pemasok);
//                        JOptionPane.showMessageDialog(null, "Pemasok berhasil disimpan");
                    clear();
                }
            }
        }
    }

    private class Buttonback implements ActionListener {

        public Buttonback() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            view.dispose();
        }
    }

    public void clear() {
        String clear = "";
        view.setNama_barang(clear);
        view.setJenis_barang(clear);
        view.setKode_barang(clear);
        view.setBerat_barang(clear);
    }
}
