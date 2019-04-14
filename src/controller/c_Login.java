/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import view.Login;
import view.mainframe;
import view.v_overview;
import view.v_service;
import view.v_storage;

/**
 *
 * @author albariiqy
 */
public class c_Login {

    Login login;

    public c_Login(Login v) {
        this.login = v;
        
        login.setVisible(true);
        
        login.getBtnLogin().addActionListener(new ButtonLogin());
    }

    private class ButtonLogin implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            
            v_overview L1 = new v_overview();
            v_service L2 = new v_service();
            v_storage L3 = new v_storage();
            mainframe mf = new mainframe(L1, L2, L3);
            login.dispose();
            mf.setVisible(true);
        }
    }
    
}
