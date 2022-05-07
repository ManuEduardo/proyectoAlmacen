/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.grupocuatro.proyectoalmacen.vista.ventanas;

/**
 *
 * @author manue
 */
public class RetirarStock extends javax.swing.JFrame {

    /**
     * Creates new form RetirarProducto
     */
    public RetirarStock() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        seleccionarProductoLabel = new javax.swing.JLabel();
        productosCombo = new javax.swing.JComboBox<>();
        cantidadSpinner = new javax.swing.JSpinner();
        seleccionarCantidadLabel = new javax.swing.JLabel();
        retirarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(450, 330));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(242, 174, 48));

        tituloLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(217, 11, 49));
        tituloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLabel.setText("RETIRAR STOCK");
        tituloLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        seleccionarProductoLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        seleccionarProductoLabel.setText("SELECCIONE EL PRODUCTO");

        productosCombo.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        productosCombo.setMaximumRowCount(100);
        productosCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        productosCombo.setBorder(null);
        productosCombo.setFocusable(false);
        productosCombo.setPreferredSize(new java.awt.Dimension(290, 30));
        productosCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productosComboActionPerformed(evt);
            }
        });

        cantidadSpinner.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        cantidadSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10000, 1));
        cantidadSpinner.setBorder(null);
        cantidadSpinner.setFocusable(false);
        cantidadSpinner.setMinimumSize(new java.awt.Dimension(60, 30));
        cantidadSpinner.setPreferredSize(new java.awt.Dimension(60, 30));
        cantidadSpinner.setRequestFocusEnabled(false);

        seleccionarCantidadLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        seleccionarCantidadLabel.setText("SELECCIONE LA CANTIDAD");

        retirarButton.setBackground(new java.awt.Color(158, 191, 36));
        retirarButton.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        retirarButton.setForeground(new java.awt.Color(255, 255, 255));
        retirarButton.setText("RETIRAR");
        retirarButton.setBorder(null);
        retirarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        retirarButton.setFocusable(false);
        retirarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                retirarButtonMouseClicked(evt);
            }
        });
        retirarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retirarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(seleccionarProductoLabel)
                        .addGap(31, 31, 31)
                        .addComponent(productosCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(seleccionarCantidadLabel)
                        .addGap(33, 33, 33)
                        .addComponent(cantidadSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(retirarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(tituloLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tituloLabel)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seleccionarProductoLabel)
                    .addComponent(productosCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seleccionarCantidadLabel)
                    .addComponent(cantidadSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(retirarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productosComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productosComboActionPerformed

    private void retirarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retirarButtonMouseClicked

    }//GEN-LAST:event_retirarButtonMouseClicked

    private void retirarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retirarButtonActionPerformed

    }//GEN-LAST:event_retirarButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(RetirarStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RetirarStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RetirarStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RetirarStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RetirarStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JSpinner cantidadSpinner;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JComboBox<String> productosCombo;
    public javax.swing.JButton retirarButton;
    private javax.swing.JLabel seleccionarCantidadLabel;
    private javax.swing.JLabel seleccionarProductoLabel;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
