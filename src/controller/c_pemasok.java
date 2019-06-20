/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import view.v_pemasok;
import model.m_pemasok;

/**
 *
 * @author albariiqy
 */
public class c_pemasok {

    m_pemasok model;
    v_pemasok view;

    public c_pemasok(m_pemasok model, v_pemasok view) {
        this.model = model;
        this.view = view;

        view.setVisible(true);

        view.getSubmit().addActionListener(new buttonsubmit());
        view.getBack().addActionListener(new buttonback());
    }

    private class buttonback implements ActionListener {

        public buttonback() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        view.dispose();
        }
    }

    private class buttonsubmit implements ActionListener {

        public buttonsubmit() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String kode_pmsk = view.getKode_pemasok().getText();
            String nama_pmsk = view.getNama_pemasok().getText();
            String almt_pmsk = view.getAlamat_pemasok().getText();
            String notlp = view.getNo_telp().getText();
            System.out.println(notlp);
            if (kode_pmsk.length() > 5) {
                JOptionPane.showMessageDialog(null, "Kode tidakboleh lebih dati 5 digit");
            }
            else if (kode_pmsk.equals("") || nama_pmsk.equals("") || almt_pmsk.equals("") || notlp.equals("")) {
                JOptionPane.showMessageDialog(null, "Data tidak Boleh kosong");
            } else {
                int jawab = JOptionPane.showOptionDialog(null,
                        "Anda Yakin Akan menambahkan Pemasok ini ?",
                        "Keluar",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, null, null);

                if (jawab == JOptionPane.YES_OPTION) {
                    model.simpanpemasok(kode_pmsk, nama_pmsk, almt_pmsk, notlp);
//                        JOptionPane.showMessageDialog(null, "Pemasok berhasil disimpan");
                    clear();
                }
            }
        }
    }

    public void clear() {
        String clear = "";
        view.setAlamat_pemasok(clear);
        view.setKode_pemasok(clear);
        view.setNo_telp(clear);
        view.setNama_pemasok(clear);
    }
}
