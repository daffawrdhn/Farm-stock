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
import view.v_service_distribute;
import model.m_Service_Distribute;

/**
 *
 * @author albariiqy
 */
public class c_Service_Distribute {

    v_service_distribute views;
    m_Service_Distribute model;

    public c_Service_Distribute(v_service_distribute v, m_Service_Distribute m) {
        this.views = v;
        this.model = m;
        combobarang();
        combogudang();
        combopenerima();
        views.setVisible(true);
        views.getdBack().addActionListener(new BackButton());
        views.getdSend().addActionListener(new Buttonsend());
        views.setTabledistribute(views.getTabledistribute(), model.tabeldistribute());
    }

    public void combobarang() {
        HashMap<String, Integer> map = model.combobarang();
        for (String s : map.keySet()) {
            views.setCombonamabarang(s);
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

    private class Buttonsend implements ActionListener {

        public Buttonsend() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            String gudang = views.getCombogudang().getSelectedItem().toString();
            String penerima = views.getCombopenerima().getSelectedItem().toString();
            String barang = views.getCombonamabarang().getSelectedItem().toString();

            String ket = views.getKeterangan().getText();
            int sum;
            try {
                sum = Integer.parseInt(views.getSum().getText());
            } catch (NumberFormatException ea) {
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
                    model.simpanbutton(barang, gudang, penerima, sum, ket);
//                        JOptionPane.showMessageDialog(null, "Pemasok berhasil disimpan");
                    views.setSum("");
                    views.setTabledistribute(views.getTabledistribute(), model.tabeldistribute());
                }
            }
        }
    }

    private class BackButton implements ActionListener {

        public BackButton() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

}
