/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.persistence.DiscriminatorType;
import javax.swing.JOptionPane;
import model.m_Service_Load;
import view.v_service_load_edit;

/**
 *
 * @author albariiqy
 */
public class c_Service_Load_Edit {
    
    m_Service_Load model;
    v_service_load_edit views;
    
    public c_Service_Load_Edit(m_Service_Load model, v_service_load_edit views) {
        this.model = model;
        this.views = views;
        
        views.setVisible(true);
        combobarang();
        combogudang();
        views.getSubmit().addActionListener(new btnsubmit());
        views.getCancel().addActionListener(new btncancel());
        views.setTabel(views.getTableload(), model.tabelload(0));
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

            String barang = views.getCombobarang().getSelectedItem().toString();
            String gudang = views.getCombogudang().getSelectedItem().toString();
            int id, sum;
            
            try {
                id = Integer.parseInt(views.getIdload().getText());
                sum = Integer.parseInt(views.getJmlbrang().getText());
                
            } catch (Exception e) {
                id = 0;
                sum = -1;
            }
            
            if (id != 0 && sum >= 0) {
                model.updateload(id, barang, gudang, sum);
            } else {
                JOptionPane.showMessageDialog(null, "data error atau kosong");
            }
            
        }
    }
    
}
