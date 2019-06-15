/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.v_storage;
import model.m_Storage;

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

        storage.getBtnInfowr1().addActionListener(new BtnInfo1());
        storage.getBtnInfowr2().addActionListener(new BtnInfo2());
        storage.getBtnInfowr3().addActionListener(new BtnInfo3());
        storage.setTabel(storage.getTabledistri(), model.tabeldistribute(1));
        storage.setTabel(storage.getTableload(), model.tabelload(1));
        storage.getPercentage01().setMaximum(model.getcapacity(1));
        storage.getPercentage01().setValue(model.datapercentage(1));
        storage.getPercentage02().setMaximum(model.getcapacity(2));
        storage.getPercentage02().setValue(model.datapercentage(2));
        storage.getPercentage03().setMaximum(model.getcapacity(3));
        storage.getPercentage03().setValue(model.datapercentage(3));
    }

    private class BtnInfo1 implements ActionListener {

        public BtnInfo1() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
//           throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            storage.setTabel(storage.getTabledistri(), model.tabeldistribute(1));
            storage.setTabel(storage.getTableload(), model.tabelload(1));
            storage.getPercentage01().setMaximum(model.getcapacity(1));
            storage.getPercentage01().setValue(model.datapercentage(1));
            storage.getPercentage02().setMaximum(model.getcapacity(2));
            storage.getPercentage02().setValue(model.datapercentage(2));
            storage.getPercentage03().setMaximum(model.getcapacity(3));
            storage.getPercentage03().setValue(model.datapercentage(3));
            
            storage.setIsi(String.valueOf(model.datapercentage(1)));
            storage.setCapacity(String.valueOf(model.getcapacity(1)));

        }
    }

    private class BtnInfo2 implements ActionListener {

        public BtnInfo2() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            storage.setTabel(storage.getTabledistri(), model.tabeldistribute(2));
            storage.setTabel(storage.getTableload(), model.tabelload(2));
            storage.getPercentage01().setMaximum(model.getcapacity(1));
            storage.getPercentage01().setValue(model.datapercentage(1));
            storage.getPercentage02().setMaximum(model.getcapacity(2));
            storage.getPercentage02().setValue(model.datapercentage(2));
            storage.getPercentage03().setMaximum(model.getcapacity(3));
            storage.getPercentage03().setValue(model.datapercentage(3));
            
            storage.setIsi(String.valueOf(model.datapercentage(2)));
            storage.setCapacity(String.valueOf(model.getcapacity(2)));
        }
    }

    private class BtnInfo3 implements ActionListener {

        public BtnInfo3() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            storage.setTabel(storage.getTabledistri(), model.tabeldistribute(3));
            storage.setTabel(storage.getTableload(), model.tabelload(3));
            storage.getPercentage01().setMaximum(model.getcapacity(1));
            storage.getPercentage01().setValue(model.datapercentage(1));
            storage.getPercentage02().setMaximum(model.getcapacity(2));
            storage.getPercentage02().setValue(model.datapercentage(2));
            storage.getPercentage03().setMaximum(model.getcapacity(3));
            storage.getPercentage03().setValue(model.datapercentage(3));
            
            storage.setIsi(String.valueOf(model.datapercentage(3)));
            storage.setCapacity(String.valueOf(model.getcapacity(3)));
        }
    }

    private class BtnEdit implements ActionListener {

        public BtnEdit() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}
