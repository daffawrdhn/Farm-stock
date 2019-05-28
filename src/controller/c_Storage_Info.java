/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.m_Storage_Info;
import view.v_storage_info;

/**
 *
 * @author albariiqy
 */
public class c_Storage_Info {

    v_storage_info views;
    m_Storage_Info model;

    public c_Storage_Info(v_storage_info v, m_Storage_Info m) {
        this.views = v;
        this.model = m;

        this.views.setVisible(true);
        views.getBack().addActionListener(new ButtonBack());
    }

    private class ButtonBack implements ActionListener {

        public ButtonBack() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

}
