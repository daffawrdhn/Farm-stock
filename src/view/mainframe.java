package view;

import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Frame;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To chan
ge this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daffawrdhn
 */
public class mainframe extends javax.swing.JFrame {
    GridBagLayout layout = new GridBagLayout();
    
    v_overview l1;
    v_service l2 ;
    v_storage l3 ;
    
<<<<<<< HEAD
=======
    
>>>>>>> e1d7d28d522932fbb57ef6914b03cf87fe0fa0a1
    public mainframe(v_overview L1, v_service L2, v_storage L3) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.l1 = L1;
        this.l2 = L2;
        this.l3 = L3;
        
        panelLayout.setLayout(layout);
        panelLayout.add(L1);
        panelLayout.add(L2);
        panelLayout.add(L3);
        
        this.l1.setVisible(true);
        this.l2.setVisible(false);
        this.l3.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        side = new javax.swing.JPanel();
        txt_overviews = new javax.swing.JLabel();
        pOverviews = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        overviews = new javax.swing.JLabel();
        pServices = new javax.swing.JPanel();
        services = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pStorages = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        storages = new javax.swing.JLabel();
        panelLayout = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setSize(new java.awt.Dimension(112, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        side.setBackground(new java.awt.Color(58, 68, 88));
        side.setLayout(new java.awt.GridBagLayout());

        txt_overviews.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txt_overviews.setForeground(new java.awt.Color(255, 255, 255));
        txt_overviews.setText("overview");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(71, 37, 0, 0);
        side.add(txt_overviews, gridBagConstraints);

        pOverviews.setBackground(new java.awt.Color(58, 68, 88));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        overviews.setBackground(new java.awt.Color(255, 255, 255));
        overviews.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        overviews.setForeground(new java.awt.Color(255, 255, 255));
        overviews.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        overviews.setText("Overview");
        overviews.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                overviewsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                overviewsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                overviewsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                overviewsMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pOverviewsLayout = new javax.swing.GroupLayout(pOverviews);
        pOverviews.setLayout(pOverviewsLayout);
        pOverviewsLayout.setHorizontalGroup(
            pOverviewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOverviewsLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(overviews, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        pOverviewsLayout.setVerticalGroup(
            pOverviewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(overviews, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 33;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(155, 0, 0, 0);
        side.add(pOverviews, gridBagConstraints);

        pServices.setBackground(new java.awt.Color(58, 68, 88));
        pServices.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pServicesMouseEntered(evt);
            }
        });

        services.setBackground(new java.awt.Color(58, 68, 88));
        services.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        services.setForeground(new java.awt.Color(255, 255, 255));
        services.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        services.setText("Service");
        services.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                servicesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                servicesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                servicesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                servicesMousePressed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pServicesLayout = new javax.swing.GroupLayout(pServices);
        pServices.setLayout(pServicesLayout);
        pServicesLayout.setHorizontalGroup(
            pServicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pServicesLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(services, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
        );
        pServicesLayout.setVerticalGroup(
            pServicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pServicesLayout.createSequentialGroup()
                .addGroup(pServicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(services, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 163;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 0, 0, 0);
        side.add(pServices, gridBagConstraints);

        pStorages.setBackground(new java.awt.Color(58, 68, 88));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        storages.setBackground(new java.awt.Color(58, 68, 88));
        storages.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        storages.setForeground(new java.awt.Color(255, 255, 255));
        storages.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        storages.setText("Storage");
        storages.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                storagesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                storagesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                storagesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                storagesMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pStoragesLayout = new javax.swing.GroupLayout(pStorages);
        pStorages.setLayout(pStoragesLayout);
        pStoragesLayout.setHorizontalGroup(
            pStoragesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pStoragesLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(storages, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pStoragesLayout.setVerticalGroup(
            pStoragesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pStoragesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pStoragesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(storages, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.ipady = 33;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 0, 220, 0);
        side.add(pStorages, gridBagConstraints);

        getContentPane().add(side, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 680));

        panelLayout.setPreferredSize(new java.awt.Dimension(830, 720));
        getContentPane().add(panelLayout, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 830, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pServicesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pServicesMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pServicesMouseEntered

    private void overviewsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_overviewsMouseEntered
        // TODO add your handling code here:
        setHoverBg(pOverviews);
        setHoverFont(overviews);
    }//GEN-LAST:event_overviewsMouseEntered

    private void servicesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_servicesMouseEntered
        // TODO add your handling code here:
        setHoverBg(pServices);
        setHoverFont(services);
    }//GEN-LAST:event_servicesMouseEntered

    private void storagesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storagesMouseEntered
        // TODO add your handling code here:
        setHoverBg(pStorages);
        setHoverFont(storages);
    }//GEN-LAST:event_storagesMouseEntered

    private void overviewsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_overviewsMouseExited
        // TODO add your handling code here:
        resetHoverBg(pOverviews);
        resetHoverFont(overviews);
    }//GEN-LAST:event_overviewsMouseExited

    private void servicesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_servicesMouseExited
        // TODO add your handling code here:
        resetHoverBg(pServices);
        resetHoverFont(services);
    }//GEN-LAST:event_servicesMouseExited

    private void storagesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storagesMouseExited
        // TODO add your handling code here:
        resetHoverBg(pStorages);
        resetHoverFont(storages);
    }//GEN-LAST:event_storagesMouseExited

    private void overviewsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_overviewsMouseClicked
        // TODO add your handling code here:
<<<<<<< HEAD
        setHoverBg(pServices);
        setHoverFont(services);
        resetHoverBg(pStorages);
        resetHoverFont(storages);
        resetHoverBg(pOverviews);
        resetHoverFont(overviews);
=======
        setHoverBg(pOverviews);
        setHoverFont(overviews);
        resetHoverBg(pStorages);
        resetHoverFont(storages);
        resetHoverBg(pServices);
        resetHoverFont(services);
>>>>>>> e1d7d28d522932fbb57ef6914b03cf87fe0fa0a1
        this.l1.setVisible(true);
        this.l2.setVisible(false);
        this.l3.setVisible(false);
    }//GEN-LAST:event_overviewsMouseClicked

    private void servicesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_servicesMouseClicked
        // TODO add your handling code here:
        setHoverBg(pServices);
        setHoverFont(services);
        resetHoverBg(pStorages);
        resetHoverFont(storages);
        resetHoverBg(pOverviews);
        resetHoverFont(overviews);
        this.l1.setVisible(false);
        this.l2.setVisible(true);
        this.l3.setVisible(false);
        
    }//GEN-LAST:event_servicesMouseClicked

    private void storagesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storagesMouseClicked
        // TODO add your handling code here:
        setHoverBg(pStorages);
        setHoverFont(storages);
        resetHoverBg(pServices);
        resetHoverFont(services);
        resetHoverBg(pOverviews);
        resetHoverFont(overviews);
        this.l1.setVisible(false);
        this.l2.setVisible(false);
        this.l3.setVisible(true);
        
    }//GEN-LAST:event_storagesMouseClicked

    private void overviewsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_overviewsMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_overviewsMousePressed

    private void servicesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_servicesMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_servicesMousePressed

    private void storagesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storagesMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_storagesMousePressed
    
    
    
    private void setHoverBg(JPanel jp){
        jp.setBackground(new Color(255,204,51));
    }
    
    private void resetHoverBg(JPanel jp){
        jp.setBackground(new Color(58,68,88));
    }
    
    private void setHoverFont(JLabel jl){
        jl.setForeground(new Color(58,68,88));
    }
    
    private void resetHoverFont(JLabel jl){
        jl.setForeground(new Color(255,255,255));
    }
    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() { 
                new mainframe(l1, l2, l3).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel overviews;
    private javax.swing.JPanel pOverviews;
    private javax.swing.JPanel pServices;
    private javax.swing.JPanel pStorages;
    private javax.swing.JPanel panelLayout;
    private javax.swing.JLabel services;
    private javax.swing.JPanel side;
    private javax.swing.JLabel storages;
    private javax.swing.JLabel txt_overviews;
    // End of variables declaration//GEN-END:variables
}
