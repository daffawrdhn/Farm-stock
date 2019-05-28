/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.m_Storage_Edit;
import view.v_storage_edit;
/**
 *
 * @author albariiqy
 */
public class c_Storage_Edit {
    v_storage_edit views;
    m_Storage_Edit model;
    
    public c_Storage_Edit(v_storage_edit v, m_Storage_Edit m) {
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
