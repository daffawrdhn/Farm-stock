/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.m_pemasok;
import view.v_pemasok_edit;

/**
 *
 * @author albariiqy
 */
public class c_pemasok_edit {

    v_pemasok_edit views;
    m_pemasok model;

    public c_pemasok_edit(v_pemasok_edit views, m_pemasok model) {
        this.views = views;
        this.model = model;

        views.setVisible(true);

        views.setTabel(views.getTablepemasok(), model.tabellpenerima());

        views.getSubmit().addActionListener(new ButtonSubmit());
        views.getCancel().addActionListener(new ButtonCancel());
    }

    private class ButtonSubmit implements ActionListener {

        public ButtonSubmit() {
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

            String nama = views.getNamapemasok().getText();
            String alamat = views.getAlamatpemasok().getText();
            String kode = views.getKodepemasok().getText();
            String notlp = views.getNotlp().getText();
            int id;
            try {
                id = Integer.parseInt(views.getIdpemasok().getText());
            } catch (Exception e) {
                id = 0;
            }
            if (kode.length() > 5) {
                JOptionPane.showMessageDialog(null, "Kode tidak boleh melebihi 5 digit");
            } else if (alamat.equalsIgnoreCase("") || kode.equalsIgnoreCase("") || notlp.equalsIgnoreCase("") || nama.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(views, "Inputan Error/ Data Kosong");

            } else {
                int jawab = JOptionPane.showOptionDialog(null,
                        "Anda Yakin Akan Merubah Penerima ini ?",
                        "Keluar",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, null, null);

                if (jawab == JOptionPane.YES_OPTION) {
                    model.updatepemasok(id, nama, alamat, notlp, kode);
//                        JOptionPane.showMessageDialog(null, "Pemasok berhasil disimpan");
                    views.setTabel(views.getTablepemasok(), model.tabellpenerima());
                }
            }

        }
    }

    private class ButtonCancel implements ActionListener {

        public ButtonCancel() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            views.dispose();
        }
    }

}
