/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.m_penerima;
import view.v_penerima;

/**
 *
 * @author albariiqy
 */
public class c_penerima {

    v_penerima view;
    m_penerima model;

    public c_penerima(v_penerima view, m_penerima model) {
        this.view = view;
        this.model = model;
        
        view.setVisible(true);
        
        view.getSubmit().addActionListener(new btnsubmit());
        view.getBack().addActionListener(new ButtonBack());
    }

    private  class ButtonBack implements ActionListener {

        public ButtonBack() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    view.dispose();
        }
    }

    private class btnsubmit implements ActionListener {

        public btnsubmit() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String nama = view.getNama_penerima().getText();
        String notlp = view.getNo_telppenerima().getText();
        String alamat = view.getAlamat_penerima().getText();
        
        
            if (nama.equals("") || notlp.equals("") || alamat.equals("")) {
                JOptionPane.showMessageDialog(null, "Data tidak Boleh kosong");
            } else {
                int jawab = JOptionPane.showOptionDialog(null,
                        "Anda Yakin Akan menambahkan Penerima ini ?",
                        "Keluar",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, null, null);

                if (jawab == JOptionPane.YES_OPTION) {
                    model.simpanpenerima(nama, alamat, notlp);
//                        JOptionPane.showMessageDialog(null, "Pemasok berhasil disimpan");
                    clear();
                }
            }    
        }
    
}
    public void clear() {
        String clear = "";
        view.setAlamat_penerima(clear);
        view.setNama_penerima(clear);
        view.setNo_telppenerima(clear);
//        view.setNama_pemasok(clear);
    }
}
