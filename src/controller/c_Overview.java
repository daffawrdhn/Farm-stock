/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import javax.swing.JProgressBar;
import model.m_Overview;
import view.v_overview;

public class c_Overview {

    m_Overview model;
    v_overview overview;

    public c_Overview(m_Overview m, v_overview v) {
        this.model = m;
        this.overview = v;

        overview.setVisible(true);
        System.out.println("ok");
        overview.getBarwh1().setMaximum(model.getcapacity(1));
        overview.getBarwh1().setValue(model.datapercentage(1));
        overview.getBarwh2().setMaximum(model.getcapacity(2));
        overview.getBarwh2().setValue(model.datapercentage(2));
        overview.getBarwh3().setMaximum(model.getcapacity(3));
        overview.getBarwh3().setValue(model.datapercentage(3));
        
        
        
    }



}
