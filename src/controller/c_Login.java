/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.KeyListener;
import view.Login;
import view.mainframe;
import view.v_help;
import view.v_overview;
import view.v_service;
import view.v_service_load;
import view.v_storage;
import model.m_Login;
import model.m_Service;
import model.m_Service_Load;
import controller.c_Service;
import controller.c_Service_Load;
import controller.c_Storage;



/**
 *
 * @author albariiqy
 */
public class c_Login {

    Login login;
    m_Login model;
    
    public c_Login(Login v, m_Login m) {
        this.login = v;
        this.model = m;
        
        login.setVisible(true);
        login.getBtnLogin().addActionListener(new ButtonLogin());
    }

    private class ButtonLogin implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("bisa login");
//          System.out.println("mantap");
            v_overview L1 = new v_overview();
            v_service L2 = new v_service();
            v_storage L3 = new v_storage();
            v_help L4 = new v_help();
            mainframe mf = new mainframe(L1, L2, L3,L4);
            login.dispose();
            mf.setVisible(true);
            m_Service M2 = new m_Service();
            c_Service service = new c_Service(L2, M2);
            
        }
    }
    
}
