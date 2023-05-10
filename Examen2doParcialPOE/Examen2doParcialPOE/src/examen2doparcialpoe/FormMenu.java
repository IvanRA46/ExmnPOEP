/*
 López Rosales Jesús Alejandro
 22110104       3°O        POE
 */
package examen2doparcialpoe;

import javax.swing.JOptionPane;

public class FormMenu extends javax.swing.JFrame {

    private final Pila pila;

    public FormMenu() {
        initComponents();
        pila = new Pila();
        pila.push("Playa del Carmen", "Quintana Roo", 200, 1000, true, "Mariscos Juan");
        pila.push("Nuevo Vallarta", "Jalisco", 100, 500, true, "Delicias Mony");
        pila.push("Barra de navidad", "Jalisco", 50, 500, false, "Cocos locos");

    }

    public FormMenu(Pila playa) {
        initComponents();
        pila = playa;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        menuTurismo = new javax.swing.JMenu();
        itemPush = new javax.swing.JMenuItem();
        itemBuscar = new javax.swing.JMenuItem();
        itemRecorrerPila = new javax.swing.JMenuItem();
        itemPop = new javax.swing.JMenuItem();
        menuNoticias = new javax.swing.JMenu();
        itemPublicacion = new javax.swing.JMenuItem();
        menuNosotros = new javax.swing.JMenu();
        itemAcerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitulo.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Menú de opciones");

        menu.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N

        menuTurismo.setText("Turismo");
        menuTurismo.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N

        itemPush.setText("Push");
        itemPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPushActionPerformed(evt);
            }
        });
        menuTurismo.add(itemPush);

        itemBuscar.setText("Buscar");
        itemBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBuscarActionPerformed(evt);
            }
        });
        menuTurismo.add(itemBuscar);

        itemRecorrerPila.setText("Recorrer");
        itemRecorrerPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRecorrerPilaActionPerformed(evt);
            }
        });
        menuTurismo.add(itemRecorrerPila);

        itemPop.setText("Pop");
        itemPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPopActionPerformed(evt);
            }
        });
        menuTurismo.add(itemPop);

        menu.add(menuTurismo);

        menuNoticias.setText("Noticias");
        menuNoticias.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N

        itemPublicacion.setText("Publicación");
        itemPublicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPublicacionActionPerformed(evt);
            }
        });
        menuNoticias.add(itemPublicacion);

        menu.add(menuNoticias);

        menuNosotros.setText("Nosotros");
        menuNosotros.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N

        itemAcerca.setText("Acerca");
        itemAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAcercaActionPerformed(evt);
            }
        });
        menuNosotros.add(itemAcerca);

        menu.add(menuNosotros);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPushActionPerformed
        // TODO add your handling code here:
        FormPila registro = new FormPila(pila);
        registro.setVisible(true);
        registro.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_itemPushActionPerformed

    private void itemRecorrerPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRecorrerPilaActionPerformed
        // TODO add your handling code here:
        pila.recorrerPila();
    }//GEN-LAST:event_itemRecorrerPilaActionPerformed

    private void itemPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPopActionPerformed
        // TODO add your handling code here:
        pila.pop();
    }//GEN-LAST:event_itemPopActionPerformed

    private void itemPublicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPublicacionActionPerformed
        // TODO add your handling code here:
        int respuesta = JOptionPane.showConfirmDialog(null,
                "¿Evaluación completa?",
                "Publicación de noticias",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (respuesta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Noticia publicada correctamente", "Bien", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cancelaste la publicación de noticias", "Mal", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_itemPublicacionActionPerformed

    private void itemAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAcercaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,
                "Evaluación segundo parcial",
                "Acerca de",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_itemAcercaActionPerformed

    private void itemBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBuscarActionPerformed
        // TODO add your handling code here:
        pila.buscar();
    }//GEN-LAST:event_itemBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemAcerca;
    private javax.swing.JMenuItem itemBuscar;
    private javax.swing.JMenuItem itemPop;
    private javax.swing.JMenuItem itemPublicacion;
    private javax.swing.JMenuItem itemPush;
    private javax.swing.JMenuItem itemRecorrerPila;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuNosotros;
    private javax.swing.JMenu menuNoticias;
    private javax.swing.JMenu menuTurismo;
    // End of variables declaration//GEN-END:variables
}
