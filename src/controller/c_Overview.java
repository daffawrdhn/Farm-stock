/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import model.m_Overview;
import view.v_overview;


public class c_Overview {
    m_Overview model;
    v_overview overview;
    public c_Overview(m_Overview m, v_overview v) {
        this.model = m;
        this.overview = v;
        
        overview.setVisible(true);
    }
    
    
    
}