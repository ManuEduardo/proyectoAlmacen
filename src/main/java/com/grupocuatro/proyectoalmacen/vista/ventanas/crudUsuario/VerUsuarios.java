/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.grupocuatro.proyectoalmacen.vista.ventanas.crudUsuario;

/**
 *
 * @author manue
 */
public class VerUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form VerUsuarios
     */
    public VerUsuarios() {
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

        fondoJPanel = new javax.swing.JPanel();
        tituloJLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usuariosJTable = new javax.swing.JTable();
        crearButton = new javax.swing.JButton();
        actualizarButton = new javax.swing.JButton();
        eliminarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 700));

        fondoJPanel.setBackground(new java.awt.Color(246, 79, 68));
        fondoJPanel.setPreferredSize(new java.awt.Dimension(900, 500));
        fondoJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloJLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 50)); // NOI18N
        tituloJLabel.setForeground(new java.awt.Color(255, 255, 255));
        tituloJLabel.setText("USUARIOS");
        fondoJPanel.add(tituloJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, -1, -1));

        usuariosJTable.setBackground(new java.awt.Color(242, 242, 242));
        usuariosJTable.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        usuariosJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "TIPO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        usuariosJTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        usuariosJTable.setRowHeight(30);
        usuariosJTable.setSelectionBackground(new java.awt.Color(153, 153, 153));
        usuariosJTable.setSelectionForeground(new java.awt.Color(255, 204, 153));
        usuariosJTable.setShowGrid(true);
        jScrollPane1.setViewportView(usuariosJTable);

        fondoJPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 880, 420));

        crearButton.setBackground(new java.awt.Color(158, 191, 36));
        crearButton.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        crearButton.setForeground(new java.awt.Color(255, 255, 255));
        crearButton.setText("CREAR USUARIO");
        crearButton.setBorder(null);
        crearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crearButton.setFocusable(false);
        crearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearButtonMouseClicked(evt);
            }
        });
        fondoJPanel.add(crearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 160, 50));

        actualizarButton.setBackground(new java.awt.Color(158, 191, 36));
        actualizarButton.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        actualizarButton.setForeground(new java.awt.Color(255, 255, 255));
        actualizarButton.setText("ACTUALIZAR");
        actualizarButton.setBorder(null);
        actualizarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        actualizarButton.setFocusable(false);
        actualizarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizarButtonMouseClicked(evt);
            }
        });
        actualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarButtonActionPerformed(evt);
            }
        });
        fondoJPanel.add(actualizarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, 160, 50));

        eliminarButton.setBackground(new java.awt.Color(217, 11, 49));
        eliminarButton.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        eliminarButton.setForeground(new java.awt.Color(255, 255, 255));
        eliminarButton.setText("ELIMINAR USUARIO");
        eliminarButton.setBorder(null);
        eliminarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarButton.setFocusable(false);
        eliminarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarButtonMouseClicked(evt);
            }
        });
        fondoJPanel.add(eliminarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 500, 200, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondoJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondoJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearButtonMouseClicked

    }//GEN-LAST:event_crearButtonMouseClicked

    private void actualizarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarButtonMouseClicked

    private void actualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarButtonActionPerformed

    private void eliminarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarButtonMouseClicked

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
            java.util.logging.Logger.getLogger(VerUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton actualizarButton;
    public javax.swing.JButton crearButton;
    public javax.swing.JButton eliminarButton;
    private javax.swing.JPanel fondoJPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tituloJLabel;
    public javax.swing.JTable usuariosJTable;
    // End of variables declaration//GEN-END:variables
}
