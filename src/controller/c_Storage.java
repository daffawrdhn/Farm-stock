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
import model.m_Storage_Edit;
import model.m_Storage_Info;
/**
 *
 * @author albariiqy
 */
public class c_Storage {

    v_storage storage;
    m_Storage model;

    public c_Storage(v_storage v, m_Storage m) {
        this.storage = v;
        this.model = m;
        
        storage.getBtnEditwr1().addActionListener(new BtnEdit());
        storage.getBtnInfowr1().addActionListener(new BtnInfo());
    }

    private static class BtnInfo implements ActionListener {

        public BtnInfo() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
//           throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            v_storage_info v = new v_storage_info();
            m_Storage_Info m = new m_Storage_Info();
            c_Storage_Info Info = new c_Storage_Info(v, m);
        }
    }

    private class BtnEdit implements ActionListener {

        public BtnEdit() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        v_storage_edit v = new v_storage_edit();
        m_Storage_Edit m = new m_Storage_Edit();
        c_Storage_Edit Edit = new c_Storage_Edit(v, m);
        }
    }
}
