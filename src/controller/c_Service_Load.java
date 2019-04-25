/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.v_service_load;
import model.m_Service_Load;
/**
 *
 * @author albariiqy
 */
public class c_Service_Load {
    v_service_load views;
    m_Service_Load model;
    public c_Service_Load(v_service_load v, m_Service_Load m) {
        this.views = v;
        this.model = m;
        
        this.views.setVisible(true);
        views.getlBack().addActionListener(new BackButton());
    }

    private class BackButton implements ActionListener {

        public BackButton() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        views.dispose();
        }
    }

    
    
    
}
