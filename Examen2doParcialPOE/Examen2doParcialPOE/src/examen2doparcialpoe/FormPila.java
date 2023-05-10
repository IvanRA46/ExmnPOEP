/*
 López Rosales Jesús Alejandro
 22110104       3°O        POE
 */
package examen2doparcialpoe;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class FormPila extends javax.swing.JFrame {

    Pila pila;

    public FormPila(Pila playa) {
        initComponents();
        pila = playa;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lbNumero = new javax.swing.JLabel();
        btnPush = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        lbTitulo = new javax.swing.JLabel();
        lbNumero1 = new javax.swing.JLabel();
        txtPlaya = new javax.swing.JTextField();
        lbNumero2 = new javax.swing.JLabel();
        txtUbicacion = new javax.swing.JTextField();
        lbNumero3 = new javax.swing.JLabel();
        txtEntrada = new javax.swing.JTextField();
        lbNumero4 = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JTextField();
        lbNumero5 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        chSi = new javax.swing.JCheckBox();
        chNo = new javax.swing.JCheckBox();
        cbRestaurante = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbNumero.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbNumero.setText("Restaurante:");

        btnPush.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnPush.setText("Push");
        btnPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushActionPerformed(evt);
            }
        });

        btnRegresar.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        lbTitulo.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Registro de playas");

        lbNumero1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbNumero1.setText("Nombre de la playa:");

        txtPlaya.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N

        lbNumero2.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbNumero2.setText("Ubicación de la playa:");

        txtUbicacion.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N

        lbNumero3.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbNumero3.setText("Costro de entrada:");

        txtEntrada.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        txtEntrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEntradaKeyTyped(evt);
            }
        });

        lbNumero4.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbNumero4.setText("Capacidad Máxima:");

        txtCapacidad.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        txtCapacidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCapacidadKeyTyped(evt);
            }
        });

        lbNumero5.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbNumero5.setText("Tiene sombrillas?");

        btnLimpiar.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        buttonGroup1.add(chSi);
        chSi.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        chSi.setText("Si");

        buttonGroup1.add(chNo);
        chNo.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        chNo.setText("No");

        cbRestaurante.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mariscos Toño", "Delicias Mony", "Juan el camarón", "El filete de oro", "Cocos Locos", "Pulpo Martín" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                    .addComponent(txtPlaya)
                    .addComponent(txtUbicacion)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPush)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegresar))
                    .addComponent(txtEntrada)
                    .addComponent(txtCapacidad)
                    .addComponent(cbRestaurante, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNumero1)
                            .addComponent(lbNumero2)
                            .addComponent(lbNumero3)
                            .addComponent(lbNumero4)
                            .addComponent(lbNumero)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbNumero5)
                                .addGap(18, 18, 18)
                                .addComponent(chSi)
                                .addGap(18, 18, 18)
                                .addComponent(chNo)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addGap(18, 18, 18)
                .addComponent(lbNumero1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPlaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbNumero2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNumero5)
                    .addComponent(chNo)
                    .addComponent(chSi))
                .addGap(18, 18, 18)
                .addComponent(lbNumero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbNumero3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbNumero4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPush)
                    .addComponent(btnRegresar)
                    .addComponent(btnLimpiar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        FormMenu menu = new FormMenu(pila);
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPushActionPerformed
        // TODO add your handling code here:
        this.agregar();
    }//GEN-LAST:event_btnPushActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtCapacidad.setText("");
        txtEntrada.setText("");
        txtPlaya.setText("");
        chNo.setSelected(false);
        chSi.setSelected(false);
        cbRestaurante.setSelectedIndex(0);
        txtUbicacion.setText("");
        txtPlaya.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtEntradaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEntradaKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if (caracter == KeyEvent.VK_ENTER) {
            this.agregar();
        } else {
            if (!Character.isDigit(caracter)) {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "Solo números", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtEntradaKeyTyped

    private void txtCapacidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCapacidadKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if (caracter == KeyEvent.VK_ENTER) {
            this.agregar();
        } else {
            if (!Character.isDigit(caracter)) {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "Solo números", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtCapacidadKeyTyped

    private void agregar() {
        if (txtPlaya.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar el nombre de la playa", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtUbicacion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar la ubicación de la playa", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtEntrada.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar el costo de entrada de la playa", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtCapacidad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar la capacidad máxima de la playa", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!chSi.isSelected() && !chNo.isSelected()) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar si la playa tiene sombrillas o no", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (cbRestaurante.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar si la playa tiene restaurante o no", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String nombre = txtPlaya.getText();
        String ubicacion = txtUbicacion.getText();
        double costoEntrada = Double.parseDouble(txtEntrada.getText());
        int capacidadMaxima = Integer.parseInt(txtCapacidad.getText());
        boolean tieneSombrillas = false;
        if (chNo.isSelected()) {
            tieneSombrillas = false;
        }
        if (chSi.isSelected()) {
            tieneSombrillas = true;
        }

        String restaurante = cbRestaurante.getSelectedItem().toString();
        pila.push(nombre, ubicacion, costoEntrada, capacidadMaxima, tieneSombrillas, restaurante);
    }

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnPush;
    private javax.swing.JButton btnRegresar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbRestaurante;
    private javax.swing.JCheckBox chNo;
    private javax.swing.JCheckBox chSi;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbNumero1;
    private javax.swing.JLabel lbNumero2;
    private javax.swing.JLabel lbNumero3;
    private javax.swing.JLabel lbNumero4;
    private javax.swing.JLabel lbNumero5;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtEntrada;
    private javax.swing.JTextField txtPlaya;
    private javax.swing.JTextField txtUbicacion;
    // End of variables declaration//GEN-END:variables
}
