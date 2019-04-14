/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import model.m_Service;
import view.v_service;
import view.v_service_load;
import view.v_service_distribute;
/**
 *
 * @author albariiqy
 */
public class c_Service {
    m_Service model;
    v_service service;
    public c_Service(v_service v,m_Service m) {
        this.model = m;
        this.service = v;
        
        service.setVisible(true);
        service.getAddBtnLoad().addActionListener(new BtnAddLoad());
    }

    private class BtnAddLoad implements ActionListener {

        public BtnAddLoad() {
            System.out.println("i");
            v_service_load view = new v_service_load();
            view.setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("a");
            v_service_load view = new v_service_load();
            view.setVisible(true);
        }
    }
    
    
    
}
