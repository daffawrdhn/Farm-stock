/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.v_penerima_edit;
import model.m_penerima;

/**
 *
 * @author albariiqy
 */
public class c_penerima_edit {

    v_penerima_edit views;
    m_penerima model;

    public c_penerima_edit(v_penerima_edit views, m_penerima model) {
        this.views = views;
        this.model = model;

        views.setVisible(true);

        views.getCancel().addActionListener(new btncancel());
        views.getSubmit().addActionListener(new btnsubmit());
        views.setTabel(views.getTablepenerima(), model.tabellpenerima());
    }

    private class btnsubmit implements ActionListener {

        public btnsubmit() {
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            int id;
            String notlp = views.getNotlp().getText();
            String nama = views.getNamapnrima().getText();
            String alamat = views.getAlamatpnrima().getText();

            try {
                id = Integer.parseInt(views.getIdpenerima().getText());
            } catch (Exception e) {
                id = 0;
            }

            if (id == 0 || notlp.equalsIgnoreCase("") || nama.equalsIgnoreCase("") || alamat.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Data tidak boleh kosong");
            } else {
                int jawab = JOptionPane.showOptionDialog(null,
                        "Anda Yakin Akan Merubah Penerima ini ?",
                        "Keluar",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, null, null);

                if (jawab == JOptionPane.YES_OPTION) {
                    model.updatepenerima(id, nama, alamat, notlp);
//                        JOptionPane.showMessageDialog(null, "Pemasok berhasil disimpan");
                    views.setTabel(views.getTablepenerima(), model.tabellpenerima());
                }

            }
        }
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

}
