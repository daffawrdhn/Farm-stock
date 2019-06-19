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
import model.m_Service_Distribute;
import view.v_service_distribute_edit;

/**
 *
 * @author albariiqy
 */
public class c_Service_Distribute_Edit {

    v_service_distribute_edit views;
    m_Service_Distribute model;

    public c_Service_Distribute_Edit(v_service_distribute_edit views, m_Service_Distribute model) {
        this.views = views;
        this.model = model;

        views.setVisible(true);
        combobarang();
        combogudang();
        combopenerima();
        views.setTabledistribute(views.getTabledistribute(), model.tabeldistribute(0));

        views.getSubmit().addActionListener(new ButtonSubmit());
        views.getCancel().addActionListener(new ButtonCancel());

    }

    public void combobarang() {
        HashMap<String, Integer> map = model.combobarang();
        for (String s : map.keySet()) {
            views.setCombobarang(s);
        }
    }

    public void combopenerima() {
        HashMap<String, Integer> map = model.combopenerima();
        for (String s : map.keySet()) {
            views.setCombopenerima(s);
        }
    }

    public void combogudang() {
        HashMap<String, Integer> map = model.combogudang();
        for (String s : map.keySet()) {
            views.setCombogudang(s);
        }
    }

    private class ButtonSubmit implements ActionListener {

        public ButtonSubmit() {
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            String namabrg = views.getCombobarang().getSelectedItem().toString();
            String namawh = views.getCombogudang().getSelectedItem().toString();
            String namapnrm = views.getCombopenerima().getSelectedItem().toString();
            int id, jmlbrg;
            try {
                id = Integer.parseInt(views.getIddistribute().getText());
                jmlbrg = Integer.parseInt(views.getJmlbrang().getText());
            } catch (Exception e) {
                id = 0;
                jmlbrg = -1;
            }
            if (id != 0 && jmlbrg >= 0) {
                int jawab = JOptionPane.showOptionDialog(null,
                        "Anda Yakin Akan mengubah Muatan ini ?",
                        "Keluar",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, null, null);

                if (jawab == JOptionPane.YES_OPTION) {
                    model.upatedistribute(id, namabrg, namawh, namapnrm, jmlbrg);
//                        JOptionPane.showMessageDialog(null, "Pemasok berhasil disimpan");
                    views.setTabledistribute(views.getTabledistribute(), model.tabeldistribute());

                }
            } else {
                JOptionPane.showMessageDialog(null, "Data yang dimasukkan salah/ kosong");
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
