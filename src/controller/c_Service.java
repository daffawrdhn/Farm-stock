/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.v_overview;
import view.v_service;
import view.v_service_load;
import view.v_service_distribute;
import view.v_storage;
import model.m_Login;
import model.m_Overview;
import model.m_Service;
import model.m_Service_Load;
import model.m_Service_Load;
import view.mainframe;
/**
 *
 * @author albariiqy
 */
public class c_Service {
    v_service service;
    m_Service model;
   
    public c_Service(v_service service, m_Service model) {
        this.service = service;
        this.model = model;
        
        
        
        service.getBtnLoad().addActionListener(new ButtonLoad());
        service.getBtnDistribute().addActionListener(new ButtonDistribute());
        
        
        
    }

    private static class ButtonLoad implements ActionListener {

        public ButtonLoad() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        v_service_load v = new v_service_load();
        m_Service_Load m = new m_Service_Load();
        c_Service_Load cload = new c_Service_Load(v, m);
            
        
        }
    }

    private static class ButtonDistribute implements ActionListener {

        public ButtonDistribute() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            v_service_distribute distribute = new v_service_distribute();
            distribute.setVisible(true);
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
