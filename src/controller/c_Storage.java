/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.v_storage;
import view.v_storage_edit;
import view.v_storage_info;
import model.m_Storage;
/**
 *
 * @author albariiqy
 */
public class c_Storage {

    v_storage storage;
    m_Storage model;

    public c_Storage(v_storage storage, m_Storage model) {
        this.storage = storage;
        this.model = model;
        
        storage.getBtnEdit().addActionListener(new BtnEdit());
    }

    private class BtnEdit implements ActionListener {

        public BtnEdit() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        v_storage_edit view = new v_storage_edit();
        
        view.setVisible(true);
        }
    }
}
