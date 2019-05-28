/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        
        views.setVisible(true);
        views.getdBack().addActionListener(new BackButton());
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
