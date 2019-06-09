/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
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
import model.m_Service_Distribute;
import view.mainframe;
import view.v_pemasok;
import model.m_pemasok;
import view.v_barang;
import model.m_barang;
import model.m_penerima;
import view.v_penerima;

/**
 *
 * @author albariiqy
 */
public class c_Service {

    v_service views;
    m_Service model;

    public c_Service(v_service service, m_Service model) {
        this.views = service;
        this.model = model;

        views.getBtnLoad().addActionListener(new ButtonLoad());
        views.getBtnDistribute().addActionListener(new ButtonDistribute());
        views.getBtnpemasok().addActionListener(new ButtonPemasok());
        views.getBtnbarang().addActionListener(new ButtonBarang());
        views.getBtnpenerima().addActionListener(new ButtonPenerima());
        views.setTabel(service.getTableload(), model.load());
        views.setTabel(service.getTabledistribute(), model.distribute());

    }

    private class ButtonLoad implements ActionListener {

        public ButtonLoad() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

            if (views.getLoadcekbox().isSelected()) {
                v_service_load v = new v_service_load();
                m_Service_Load m = new m_Service_Load();
                c_Service_Load cload = new c_Service_Load(v, m);
            } else {
                JOptionPane.showMessageDialog(null, "Muatan sedang dihentikan");
            }

        }
    }

    private class ButtonDistribute implements ActionListener {

        public ButtonDistribute() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if (views.getDistributecekbox().isSelected()) {
            v_service_distribute v = new v_service_distribute();
            m_Service_Distribute m = new m_Service_Distribute();
            c_Service_Distribute distribute = new c_Service_Distribute(v, m);
              
            }
            else{
            JOptionPane.showMessageDialog(null, "Distribusi sedang dihentikan");
            
            }
//              throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class ButtonPemasok implements ActionListener {

        public ButtonPemasok() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            m_pemasok m = new m_pemasok();
            v_pemasok v = new v_pemasok();
            c_pemasok pemasok = new c_pemasok(m, v);
        }
    }

    private static class ButtonBarang implements ActionListener {

        public ButtonBarang() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            m_barang m = new m_barang();
            v_barang v = new v_barang();
            c_barang barang = new c_barang(v, m);
        }
    }

    private static class ButtonPenerima implements ActionListener {

        public ButtonPenerima() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            m_penerima m = new m_penerima();
            v_penerima v = new v_penerima();
            c_penerima penerima = new c_penerima(v, m);
        }
    }

}
