/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.grupocuatro.proyectoalmacen.vista.ventanas;

import java.awt.Color;

/**
 *
 * @author manue
 */
public class RegistrarProducto extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public RegistrarProducto() {
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
        descripcionLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        registrabutton = new javax.swing.JButton();
        puntoLabel = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        nombreSeparator = new javax.swing.JSeparator();
        presioLabel = new javax.swing.JLabel();
        descripcionScrollPane = new javax.swing.JScrollPane();
        descripcionTextArea = new javax.swing.JTextArea();
        precioSpinner = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(242, 157, 53));
        setMinimumSize(new java.awt.Dimension(400, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 450));

        jPanel1.setBackground(new java.awt.Color(242, 174, 48));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(217, 11, 49));
        tituloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLabel.setText("REGISTRAR PRODUCTO");
        tituloLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(tituloLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        descripcionLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        descripcionLabel.setText("Descipción del Producto");
        jPanel1.add(descripcionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        nombreLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        nombreLabel.setText("Ingrese el Nombre");
        jPanel1.add(nombreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        registrabutton.setBackground(new java.awt.Color(158, 191, 36));
        registrabutton.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        registrabutton.setForeground(new java.awt.Color(255, 255, 255));
        registrabutton.setText("REGISTRAR");
        registrabutton.setBorder(null);
        registrabutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrabutton.setFocusable(false);
        registrabutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrabuttonMouseClicked(evt);
            }
        });
        registrabutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrabuttonActionPerformed(evt);
            }
        });
        jPanel1.add(registrabutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 160, 40));

        puntoLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        puntoLabel.setText("(.)");
        jPanel1.add(puntoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        nombreField.setBackground(new java.awt.Color(242, 174, 48));
        nombreField.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        nombreField.setForeground(new java.awt.Color(153, 153, 153));
        nombreField.setText("Nombre del Producto");
        nombreField.setBorder(null);
        nombreField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreFieldFocusLost(evt);
            }
        });
        nombreField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombreFieldMousePressed(evt);
            }
        });
        nombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFieldActionPerformed(evt);
            }
        });
        jPanel1.add(nombreField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 180, 40));

        nombreSeparator.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(nombreSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 190, 20));

        presioLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        presioLabel.setText("Seleccione el Precio");
        jPanel1.add(presioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        descripcionScrollPane.setBorder(null);

        descripcionTextArea.setBackground(new java.awt.Color(242, 157, 53));
        descripcionTextArea.setColumns(20);
        descripcionTextArea.setForeground(new java.awt.Color(153, 153, 153));
        descripcionTextArea.setRows(5);
        descripcionTextArea.setText("Descripcion");
        descripcionTextArea.setBorder(null);
        descripcionTextArea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                descripcionTextAreaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                descripcionTextAreaFocusLost(evt);
            }
        });
        descripcionTextArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                descripcionTextAreaMousePressed(evt);
            }
        });
        descripcionScrollPane.setViewportView(descripcionTextArea);

        jPanel1.add(descripcionScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 290, 100));

        precioSpinner.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        precioSpinner.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(1.0f), Float.valueOf(1.0f), Float.valueOf(10000.0f), Float.valueOf(0.5f)));
        precioSpinner.setBorder(null);
        precioSpinner.setFocusable(false);
        precioSpinner.setMinimumSize(new java.awt.Dimension(60, 30));
        precioSpinner.setPreferredSize(new java.awt.Dimension(60, 30));
        precioSpinner.setRequestFocusEnabled(false);
        jPanel1.add(precioSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrabuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrabuttonMouseClicked

    }//GEN-LAST:event_registrabuttonMouseClicked

    private void registrabuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrabuttonActionPerformed

    }//GEN-LAST:event_registrabuttonActionPerformed

    private void nombreFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreFieldMousePressed

    }//GEN-LAST:event_nombreFieldMousePressed

    private void nombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreFieldActionPerformed

    private void descripcionTextAreaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descripcionTextAreaMousePressed

    }//GEN-LAST:event_descripcionTextAreaMousePressed

    private void nombreFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreFieldFocusGained
        if(nombreField.getText().equals("Nombre del Producto")){
            nombreField.setText("");
            nombreField.setForeground(Color.black);
            }
    }//GEN-LAST:event_nombreFieldFocusGained

    private void nombreFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreFieldFocusLost
        if(nombreField.getText().equals("Nombre del Producto")||nombreField.getText().equals("")){
            nombreField.setText("Nombre del Producto");
            nombreField.setForeground(Color.gray);
        }
    }//GEN-LAST:event_nombreFieldFocusLost

    private void descripcionTextAreaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descripcionTextAreaFocusGained
        if(String.valueOf(descripcionTextArea.getText()).equals("Descripcion")){
            descripcionTextArea.setText("");
            descripcionTextArea.setForeground(Color.black);
        }
    }//GEN-LAST:event_descripcionTextAreaFocusGained

    private void descripcionTextAreaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descripcionTextAreaFocusLost
        if(String.valueOf(descripcionTextArea.getText()).equals("Descripcion")||String.valueOf(descripcionTextArea.getText()).equals("")){
            descripcionTextArea.setText("Descripcion");
            descripcionTextArea.setForeground(Color.gray);
        }
    }//GEN-LAST:event_descripcionTextAreaFocusLost

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
            java.util.logging.Logger.getLogger(RegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel descripcionLabel;
    public javax.swing.JScrollPane descripcionScrollPane;
    public javax.swing.JTextArea descripcionTextArea;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField nombreField;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JSeparator nombreSeparator;
    public javax.swing.JSpinner precioSpinner;
    private javax.swing.JLabel presioLabel;
    private javax.swing.JLabel puntoLabel;
    public javax.swing.JButton registrabutton;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
