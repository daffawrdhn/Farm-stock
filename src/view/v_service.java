package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class v_service extends javax.swing.JPanel {

    public v_service() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabledistribute = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableload = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        loadcekbox = new javax.swing.JCheckBox();
        distributecekbox = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        BtnLoad = new javax.swing.JButton();
        editload = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        BtnDistribute = new javax.swing.JButton();
        editdistribute = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        btnbarang = new javax.swing.JButton();
        editbrang = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        btnpemasok = new javax.swing.JButton();
        editpmasok = new javax.swing.JButton();
        jPanel29 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        btnpenerima = new javax.swing.JButton();
        editpenerima = new javax.swing.JButton();
        prntdistri = new javax.swing.JButton();
        prntload = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setPreferredSize(new java.awt.Dimension(906, 875));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));

        jLabel11.setBackground(new java.awt.Color(58, 68, 88));
        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(58, 68, 88));
        jLabel11.setText("SERVICE");

        jPanel9.setBackground(new java.awt.Color(255, 184, 51));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(313, 313, 313)
                .addComponent(jLabel11)
                .addGap(0, 557, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 50));

        tabledistribute.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama barang", "Jenis barang", "Banyak barang", "Satuan", "Tujuan", "Penerima", "Keterangan"
            }
        ));
        jScrollPane2.setViewportView(tabledistribute);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 840, 230));

        tableload.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama barang", "Jenis barang", "Banyak barang", "Satuan", "Gudang", "Keterangan", "Pemasok"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableload);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 840, 230));

        jPanel6.setBackground(new java.awt.Color(240, 245, 240));
        jPanel6.setPreferredSize(new java.awt.Dimension(870, 680));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 204, 51));

        jLabel12.setBackground(new java.awt.Color(58, 68, 88));
        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(58, 68, 88));
        jLabel12.setText("SERVICE");

        jPanel10.setBackground(new java.awt.Color(255, 184, 51));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(313, 313, 313)
                .addComponent(jLabel12)
                .addGap(0, 557, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 50));

        jPanel8.setBackground(new java.awt.Color(255, 204, 51));

        jLabel7.setText("Loading");

        loadcekbox.setSelected(true);
        loadcekbox.setText("Running...");
        loadcekbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadcekboxActionPerformed(evt);
            }
        });

        distributecekbox.setSelected(true);
        distributecekbox.setText("Running...");
        distributecekbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distributecekboxActionPerformed(evt);
            }
        });

        jLabel10.setText("Distribute");

        jPanel11.setBackground(new java.awt.Color(255, 184, 51));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loadcekbox, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(distributecekbox, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(94, 94, 94))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(loadcekbox))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(distributecekbox))
                .addGap(25, 25, 25))
        );

        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 100));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama barang", "Jenis barang", "Banyak barang", "Satuan", "Tujuan", "Penerima", "Keterangan"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        jPanel6.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 840, 230));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama barang", "Jenis barang", "Banyak barang", "Satuan", "Gudang", "Keterangan", "Pemasok"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable5);

        jPanel6.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 840, 230));

        jLabel15.setText("Load - Event");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 90, -1));

        jLabel16.setText("Distribute - Event");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 100, -1));

        jPanel12.setBackground(new java.awt.Color(255, 204, 51));

        jLabel17.setText("Load");

        BtnLoad.setBackground(new java.awt.Color(255, 204, 51));
        BtnLoad.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        BtnLoad.setText("+");
        BtnLoad.setBorderPainted(false);
        BtnLoad.setOpaque(false);
        BtnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoadActionPerformed(evt);
            }
        });

        editload.setBackground(new java.awt.Color(255, 204, 51));
        editload.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        editload.setText("Edit");
        editload.setBorderPainted(false);
        editload.setOpaque(false);
        editload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editloadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnLoad)
                    .addComponent(editload, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addComponent(BtnLoad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(11, 11, 11)
                .addComponent(editload, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 60, 130));

        jPanel5.setBackground(new java.awt.Color(255, 204, 51));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel6.setText("Distribute");

        BtnDistribute.setBackground(new java.awt.Color(255, 204, 51));
        BtnDistribute.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        BtnDistribute.setText("+");
        BtnDistribute.setBorderPainted(false);
        BtnDistribute.setOpaque(false);
        BtnDistribute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDistributeActionPerformed(evt);
            }
        });

        editdistribute.setBackground(new java.awt.Color(255, 204, 51));
        editdistribute.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        editdistribute.setText("Edit");
        editdistribute.setBorderPainted(false);
        editdistribute.setOpaque(false);
        editdistribute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editdistributeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnDistribute)
                    .addComponent(editdistribute, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(BtnDistribute)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(12, 12, 12)
                .addComponent(editdistribute, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 60, 130));

        jPanel13.setBackground(new java.awt.Color(255, 204, 51));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel18.setText("barang");

        btnbarang.setBackground(new java.awt.Color(255, 204, 51));
        btnbarang.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnbarang.setText("+");
        btnbarang.setBorderPainted(false);
        btnbarang.setOpaque(false);
        btnbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbarangActionPerformed(evt);
            }
        });

        editbrang.setBackground(new java.awt.Color(255, 204, 51));
        editbrang.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        editbrang.setText("Edit");
        editbrang.setBorderPainted(false);
        editbrang.setOpaque(false);
        editbrang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbrangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnbarang)
                    .addComponent(editbrang, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addComponent(btnbarang)
                .addGap(7, 7, 7)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editbrang, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 60, 130));

        jPanel28.setBackground(new java.awt.Color(255, 204, 51));

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel37.setText("pemasok");

        btnpemasok.setBackground(new java.awt.Color(255, 204, 51));
        btnpemasok.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnpemasok.setText("+");
        btnpemasok.setBorderPainted(false);
        btnpemasok.setOpaque(false);
        btnpemasok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpemasokActionPerformed(evt);
            }
        });

        editpmasok.setBackground(new java.awt.Color(255, 204, 51));
        editpmasok.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        editpmasok.setText("Edit");
        editpmasok.setBorderPainted(false);
        editpmasok.setOpaque(false);
        editpmasok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editpmasokActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel37)
                .addContainerGap())
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnpemasok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editpmasok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addComponent(btnpemasok)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editpmasok, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, 60, 130));

        jPanel29.setBackground(new java.awt.Color(255, 204, 51));

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel38.setText("Penerima");

        btnpenerima.setBackground(new java.awt.Color(255, 204, 51));
        btnpenerima.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnpenerima.setText("+");
        btnpenerima.setBorderPainted(false);
        btnpenerima.setOpaque(false);
        btnpenerima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpenerimaActionPerformed(evt);
            }
        });

        editpenerima.setBackground(new java.awt.Color(255, 204, 51));
        editpenerima.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        editpenerima.setText("Edit");
        editpenerima.setBorderPainted(false);
        editpenerima.setOpaque(false);
        editpenerima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editpenerimaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addComponent(btnpenerima)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editpenerima, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel38)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addComponent(btnpenerima)
                .addGap(7, 7, 7)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editpenerima, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 60, 130));

        prntdistri.setBackground(new java.awt.Color(255, 204, 51));
        prntdistri.setText("Print Distribute");
        prntdistri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prntdistriActionPerformed(evt);
            }
        });
        jPanel6.add(prntdistri, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 110, 30));

        prntload.setBackground(new java.awt.Color(255, 204, 51));
        prntload.setText("Print Load");
        prntload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prntloadActionPerformed(evt);
            }
        });
        jPanel6.add(prntload, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 110, 30));

        jLabel8.setText("Load - Event");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 90, -1));

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnDistribute() {
        return BtnDistribute;
    }

    public JButton getBtnLoad() {
        return BtnLoad;
    }

    public JButton getBtnbarang() {
        return btnbarang;
    }

    public JButton getBtnpemasok() {
        return btnpemasok;
    }

    public JCheckBox getDistributecekbox() {
        return distributecekbox;
    }

    public JCheckBox getLoadcekbox() {
        return loadcekbox;
    }

    
    public JButton getBtnpenerima() {
        return btnpenerima;
    }
    
    public void setTabel(JTable t, DefaultTableModel tabel) {
        t.setModel(tabel);
    }

    public JTable getTabledistribute() {
        return tabledistribute;
    }

    public void setTabledistribute(JTable tabledistribute) {
        this.tabledistribute = tabledistribute;
    }

    public JTable getTableload() {
        return tableload;
    }

    public void setTableload(JTable tableload) {
        this.tableload = tableload;
    }

    public JButton getEditbrang() {
        return editbrang;
    }

    public JButton getEditdistribute() {
        return editdistribute;
    }

    public JButton getEditload() {
        return editload;
    }

    public JButton getEditpenerima() {
        return editpenerima;
    }

    public JButton getEditpmasok() {
        return editpmasok;
    }

    public JButton getPrntdistri() {
        return prntdistri;
    }

    public JButton getPrntload() {
        return prntload;
    }

    
    

    private void BtnDistributeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDistributeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnDistributeActionPerformed

    private void loadcekboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadcekboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadcekboxActionPerformed

    private void distributecekboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distributecekboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_distributecekboxActionPerformed

    private void BtnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoadActionPerformed

    }//GEN-LAST:event_BtnLoadActionPerformed

    private void btnbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbarangActionPerformed

    private void btnpemasokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpemasokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnpemasokActionPerformed

    private void btnpenerimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpenerimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnpenerimaActionPerformed

    private void editpmasokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editpmasokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editpmasokActionPerformed

    private void editpenerimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editpenerimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editpenerimaActionPerformed

    private void editbrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbrangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editbrangActionPerformed

    private void editloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editloadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editloadActionPerformed

    private void editdistributeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editdistributeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editdistributeActionPerformed

    private void prntdistriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prntdistriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prntdistriActionPerformed

    private void prntloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prntloadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prntloadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDistribute;
    private javax.swing.JButton BtnLoad;
    private javax.swing.JButton btnbarang;
    private javax.swing.JButton btnpemasok;
    private javax.swing.JButton btnpenerima;
    private javax.swing.JCheckBox distributecekbox;
    private javax.swing.JButton editbrang;
    private javax.swing.JButton editdistribute;
    private javax.swing.JButton editload;
    private javax.swing.JButton editpenerima;
    private javax.swing.JButton editpmasok;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JCheckBox loadcekbox;
    private javax.swing.JButton prntdistri;
    private javax.swing.JButton prntload;
    private javax.swing.JTable tabledistribute;
    private javax.swing.JTable tableload;
    // End of variables declaration//GEN-END:variables

}
