/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.grupocuatro.proyectoalmacen.vista.ventanas.crudUsuario;

import java.awt.Color;

/**
 *
 * @author manue
 */
public class CrearUsuario extends javax.swing.JFrame {

    /**
     * Creates new form CrearUsuario
     */
    public CrearUsuario() {
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

        tipoSpinner = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        nombreSeparator = new javax.swing.JSeparator();
        contrasenaSeparator = new javax.swing.JSeparator();
        contrasenaField = new javax.swing.JPasswordField();
        contrasenaLabel = new javax.swing.JLabel();
        presioLabel = new javax.swing.JLabel();
        crearButton = new javax.swing.JButton();
        tipoSpinner1 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(435, 420));
        setResizable(false);
        setSize(new java.awt.Dimension(435, 420));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tipoSpinner.setBackground(new java.awt.Color(242, 174, 48));
        tipoSpinner.setMaximumSize(new java.awt.Dimension(435, 420));
        tipoSpinner.setMinimumSize(new java.awt.Dimension(435, 420));

        tituloLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(217, 11, 49));
        tituloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLabel.setText("CREAR USUARIO");
        tituloLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        nombreLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        nombreLabel.setText("Ingrese el Nombre");

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

        nombreSeparator.setForeground(new java.awt.Color(0, 0, 0));

        contrasenaSeparator.setForeground(new java.awt.Color(0, 0, 0));

        contrasenaField.setBackground(new java.awt.Color(242, 174, 48));
        contrasenaField.setForeground(new java.awt.Color(153, 153, 153));
        contrasenaField.setText("contrasena");
        contrasenaField.setBorder(null);
        contrasenaField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contrasenaFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                contrasenaFieldFocusLost(evt);
            }
        });
        contrasenaField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contrasenaFieldMousePressed(evt);
            }
        });

        contrasenaLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        contrasenaLabel.setForeground(new java.awt.Color(255, 255, 255));
        contrasenaLabel.setText("Contraseña");

        presioLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        presioLabel.setText("Seleccione tipo de Usuario");

        crearButton.setBackground(new java.awt.Color(158, 191, 36));
        crearButton.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        crearButton.setForeground(new java.awt.Color(255, 255, 255));
        crearButton.setText("CREAR");
        crearButton.setBorder(null);
        crearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crearButton.setFocusable(false);
        crearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearButtonMouseClicked(evt);
            }
        });
        crearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearButtonActionPerformed(evt);
            }
        });

        tipoSpinner1.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        tipoSpinner1.setModel(new javax.swing.SpinnerListModel(new String[] {""}));
        tipoSpinner1.setBorder(null);
        tipoSpinner1.setFocusable(false);
        tipoSpinner1.setMinimumSize(new java.awt.Dimension(60, 30));
        tipoSpinner1.setPreferredSize(new java.awt.Dimension(60, 30));
        tipoSpinner1.setRequestFocusEnabled(false);

        javax.swing.GroupLayout tipoSpinnerLayout = new javax.swing.GroupLayout(tipoSpinner);
        tipoSpinner.setLayout(tipoSpinnerLayout);
        tipoSpinnerLayout.setHorizontalGroup(
            tipoSpinnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tipoSpinnerLayout.createSequentialGroup()
                .addGroup(tipoSpinnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tipoSpinnerLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(tituloLabel))
                    .addGroup(tipoSpinnerLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(tipoSpinnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(crearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tipoSpinnerLayout.createSequentialGroup()
                                .addGroup(tipoSpinnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(tipoSpinnerLayout.createSequentialGroup()
                                        .addComponent(nombreLabel)
                                        .addGap(25, 25, 25)
                                        .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(tipoSpinnerLayout.createSequentialGroup()
                                        .addComponent(presioLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tipoSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tipoSpinnerLayout.createSequentialGroup()
                                        .addComponent(contrasenaLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(contrasenaSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(tipoSpinnerLayout.createSequentialGroup()
                                        .addGap(170, 170, 170)
                                        .addGroup(tipoSpinnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(contrasenaField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nombreSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(25, 25, 25)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        tipoSpinnerLayout.setVerticalGroup(
            tipoSpinnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tipoSpinnerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tituloLabel)
                .addGap(18, 18, 18)
                .addGroup(tipoSpinnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tipoSpinnerLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(nombreLabel))
                    .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(nombreSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(tipoSpinnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contrasenaLabel)
                    .addGroup(tipoSpinnerLayout.createSequentialGroup()
                        .addComponent(contrasenaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contrasenaSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(tipoSpinnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(presioLabel)
                    .addComponent(tipoSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(crearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        getContentPane().add(tipoSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 435, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void nombreFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreFieldMousePressed

    }//GEN-LAST:event_nombreFieldMousePressed

    private void nombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreFieldActionPerformed

    private void contrasenaFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contrasenaFieldFocusGained
        if(String.valueOf(contrasenaField.getPassword()).equals("contrasena")){
            contrasenaField.setText("");
            contrasenaField.setForeground(Color.black);
        }
    }//GEN-LAST:event_contrasenaFieldFocusGained

    private void contrasenaFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contrasenaFieldFocusLost
        if(String.valueOf(contrasenaField.getPassword()).equals("contrasena")||String.valueOf(contrasenaField.getPassword()).equals("")){
            contrasenaField.setText("contrasena");
            contrasenaField.setForeground(Color.gray);
        }
    }//GEN-LAST:event_contrasenaFieldFocusLost

    private void contrasenaFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contrasenaFieldMousePressed

    }//GEN-LAST:event_contrasenaFieldMousePressed

    private void crearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearButtonMouseClicked

    }//GEN-LAST:event_crearButtonMouseClicked

    private void crearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearButtonActionPerformed

    }//GEN-LAST:event_crearButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPasswordField contrasenaField;
    private javax.swing.JLabel contrasenaLabel;
    private javax.swing.JSeparator contrasenaSeparator;
    public javax.swing.JButton crearButton;
    public javax.swing.JTextField nombreField;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JSeparator nombreSeparator;
    private javax.swing.JLabel presioLabel;
    private javax.swing.JPanel tipoSpinner;
    public javax.swing.JSpinner tipoSpinner1;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
