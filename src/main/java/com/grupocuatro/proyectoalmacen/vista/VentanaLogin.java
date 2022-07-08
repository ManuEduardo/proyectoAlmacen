/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.grupocuatro.proyectoalmacen.vista;

import java.awt.Color;

/**
 *
 * @author manue
 */
public class VentanaLogin extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public VentanaLogin() {
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

        fondoPanel = new javax.swing.JPanel();
        fondoFormLogin = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        loginLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        usuarioField = new javax.swing.JTextField();
        usuarioSeparator = new javax.swing.JSeparator();
        contrasenaLabel = new javax.swing.JLabel();
        contrasenaSeparator = new javax.swing.JSeparator();
        contrasenaField = new javax.swing.JPasswordField();
        entrarBoton = new javax.swing.JButton();
        recuperarLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        setSize(new java.awt.Dimension(320, 500));

        fondoPanel.setBackground(new java.awt.Color(242, 174, 48));
        fondoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondoFormLogin.setBackground(new java.awt.Color(242, 157, 53));

        titleLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 45)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("HEART FOOD");

        loginLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        loginLabel.setText("LOGIN");

        userLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        userLabel.setForeground(new java.awt.Color(255, 255, 255));
        userLabel.setText("Usuario");

        usuarioField.setBackground(new java.awt.Color(242, 157, 53));
        usuarioField.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        usuarioField.setForeground(new java.awt.Color(153, 153, 153));
        usuarioField.setText("Ingrese su usuario");
        usuarioField.setBorder(null);
        usuarioField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usuarioFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usuarioFieldFocusLost(evt);
            }
        });
        usuarioField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usuarioFieldMousePressed(evt);
            }
        });
        usuarioField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioFieldActionPerformed(evt);
            }
        });

        usuarioSeparator.setForeground(new java.awt.Color(0, 0, 0));

        contrasenaLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        contrasenaLabel.setForeground(new java.awt.Color(255, 255, 255));
        contrasenaLabel.setText("Contraseña");

        contrasenaSeparator.setForeground(new java.awt.Color(0, 0, 0));

        contrasenaField.setBackground(new java.awt.Color(242, 157, 53));
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

        entrarBoton.setBackground(new java.awt.Color(246, 79, 68));
        entrarBoton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        entrarBoton.setForeground(new java.awt.Color(255, 255, 255));
        entrarBoton.setText("ENTRAR");
        entrarBoton.setBorder(null);
        entrarBoton.setBorderPainted(false);
        entrarBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrarBoton.setFocusable(false);

        recuperarLabel.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        recuperarLabel.setForeground(new java.awt.Color(102, 102, 102));
        recuperarLabel.setText("Recuperar Contraseña");
        recuperarLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout fondoFormLoginLayout = new javax.swing.GroupLayout(fondoFormLogin);
        fondoFormLogin.setLayout(fondoFormLoginLayout);
        fondoFormLoginLayout.setHorizontalGroup(
            fondoFormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoFormLoginLayout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoFormLoginLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(fondoFormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(fondoFormLoginLayout.createSequentialGroup()
                        .addComponent(recuperarLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(entrarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, fondoFormLoginLayout.createSequentialGroup()
                        .addComponent(loginLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, fondoFormLoginLayout.createSequentialGroup()
                        .addGroup(fondoFormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondoFormLoginLayout.createSequentialGroup()
                                .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(contrasenaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fondoFormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(contrasenaSeparator, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(usuarioSeparator)
                            .addComponent(usuarioField)
                            .addComponent(contrasenaField))))
                .addGap(16, 16, 16))
        );
        fondoFormLoginLayout.setVerticalGroup(
            fondoFormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoFormLoginLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(titleLabel)
                .addGroup(fondoFormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoFormLoginLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(usuarioSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoFormLoginLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(loginLabel)
                        .addGap(92, 92, 92)
                        .addGroup(fondoFormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userLabel)
                            .addComponent(usuarioField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(63, 63, 63)
                .addGroup(fondoFormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoFormLoginLayout.createSequentialGroup()
                        .addComponent(contrasenaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(contrasenaSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(contrasenaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(fondoFormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entrarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recuperarLabel))
                .addGap(44, 44, 44))
        );

        fondoPanel.add(fondoFormLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 310, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioFieldActionPerformed

    private void usuarioFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioFieldMousePressed
        
    }//GEN-LAST:event_usuarioFieldMousePressed

    private void contrasenaFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contrasenaFieldMousePressed
        
    }//GEN-LAST:event_contrasenaFieldMousePressed

    private void usuarioFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usuarioFieldFocusGained
        if(usuarioField.getText().equals("Ingrese su usuario")){
        usuarioField.setText("");
        usuarioField.setForeground(Color.black);
        }
    }//GEN-LAST:event_usuarioFieldFocusGained

    private void usuarioFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usuarioFieldFocusLost
        if(usuarioField.getText().equals("Ingrese su usuario")||usuarioField.getText().equals("")){
        usuarioField.setText("Ingrese su usuario");
        usuarioField.setForeground(Color.gray);
        }
    }//GEN-LAST:event_usuarioFieldFocusLost

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
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPasswordField contrasenaField;
    private javax.swing.JLabel contrasenaLabel;
    private javax.swing.JSeparator contrasenaSeparator;
    public javax.swing.JButton entrarBoton;
    private javax.swing.JPanel fondoFormLogin;
    private javax.swing.JPanel fondoPanel;
    private javax.swing.JLabel loginLabel;
    public javax.swing.JLabel recuperarLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel userLabel;
    public javax.swing.JTextField usuarioField;
    private javax.swing.JSeparator usuarioSeparator;
    // End of variables declaration//GEN-END:variables
}
