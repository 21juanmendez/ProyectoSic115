/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JPanel;

/**
 *
 * @author juann
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(this);
        // TODO add your handling code here:

        Bienvenida bienvenida = new Bienvenida();
        bienvenida.setSize(1280, 660);
        bienvenida.setLocation(0, 0);
        jPanelInicio.removeAll();
        jPanelInicio.add(bienvenida, BorderLayout.CENTER);
        jPanelInicio.revalidate();
        jPanelInicio.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jPanelInicio = new javax.swing.JPanel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenuInicio = new javax.swing.JMenu();
        jMenuItemInicio = new javax.swing.JMenuItem();
        jMenuCatalogo = new javax.swing.JMenu();
        jMenuItemCatalogo = new javax.swing.JMenuItem();
        jMenuManoObra = new javax.swing.JMenu();
        jMenuItemManoObra = new javax.swing.JMenuItem();
        jMenuTransaccion = new javax.swing.JMenu();
        jMenuItemTransaccion = new javax.swing.JMenuItem();
        jMenuLibroMayor = new javax.swing.JMenu();
        jMenuItemLibroMayor = new javax.swing.JMenuItem();
        jMenuCierreContable = new javax.swing.JMenu();
        jMenuItemCierreContable = new javax.swing.JMenuItem();
        jMenuBalanceComprobacion = new javax.swing.JMenu();
        jMenuItemBalanceComprobacion = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu2.setText("jMenu2");

        jMenu4.setText("jMenu4");

        jMenu5.setText("jMenu5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AGORA S.A");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1280, 660));

        jPanelInicio.setToolTipText("");
        jPanelInicio.setPreferredSize(new java.awt.Dimension(1280, 660));

        javax.swing.GroupLayout jPanelInicioLayout = new javax.swing.GroupLayout(jPanelInicio);
        jPanelInicio.setLayout(jPanelInicioLayout);
        jPanelInicioLayout.setHorizontalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        jPanelInicioLayout.setVerticalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        jMenuInicio.setText(" Inicio ");
        jMenuInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuInicioActionPerformed(evt);
            }
        });

        jMenuItemInicio.setText("Inicio");
        jMenuItemInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInicioActionPerformed(evt);
            }
        });
        jMenuInicio.add(jMenuItemInicio);

        jMenuBar2.add(jMenuInicio);

        jMenuCatalogo.setText("| Catalogo de Cuentas |");
        jMenuCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCatalogoActionPerformed(evt);
            }
        });

        jMenuItemCatalogo.setText("Catalogo de Cuentas");
        jMenuItemCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCatalogoActionPerformed(evt);
            }
        });
        jMenuCatalogo.add(jMenuItemCatalogo);

        jMenuBar2.add(jMenuCatalogo);

        jMenuManoObra.setText(" Mano de Obra ");

        jMenuItemManoObra.setText("Mano de Obra");
        jMenuItemManoObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemManoObraActionPerformed(evt);
            }
        });
        jMenuManoObra.add(jMenuItemManoObra);

        jMenuBar2.add(jMenuManoObra);

        jMenuTransaccion.setText("| Transaccion |");

        jMenuItemTransaccion.setText("Transaccion");
        jMenuItemTransaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTransaccionActionPerformed(evt);
            }
        });
        jMenuTransaccion.add(jMenuItemTransaccion);

        jMenuBar2.add(jMenuTransaccion);

        jMenuLibroMayor.setText(" Libro Mayor ");

        jMenuItemLibroMayor.setText("Libro Mayor");
        jMenuItemLibroMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLibroMayorActionPerformed(evt);
            }
        });
        jMenuLibroMayor.add(jMenuItemLibroMayor);

        jMenuBar2.add(jMenuLibroMayor);

        jMenuCierreContable.setText("| Cierre Contable |");

        jMenuItemCierreContable.setText("Cierre Contable");
        jMenuItemCierreContable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCierreContableActionPerformed(evt);
            }
        });
        jMenuCierreContable.add(jMenuItemCierreContable);

        jMenuBar2.add(jMenuCierreContable);

        jMenuBalanceComprobacion.setText("Balance de comprobacion");

        jMenuItemBalanceComprobacion.setText("Balance de comprobacion");
        jMenuItemBalanceComprobacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBalanceComprobacionActionPerformed(evt);
            }
        });
        jMenuBalanceComprobacion.add(jMenuItemBalanceComprobacion);

        jMenuBar2.add(jMenuBalanceComprobacion);

        jMenu3.setText("| Hoja de Trabajo |");

        jMenuItem3.setText("Hoja de Trabajo");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuInicioActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenuInicioActionPerformed

    private void jMenuItemInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInicioActionPerformed
        // TODO add your handling code here:
        Bienvenida bienvenida = new Bienvenida();
        bienvenida.setSize(1280, 660);
        bienvenida.setLocation(0, 0);
        jPanelInicio.removeAll();
        jPanelInicio.add(bienvenida, BorderLayout.CENTER);
        jPanelInicio.revalidate();
        jPanelInicio.repaint();
    }//GEN-LAST:event_jMenuItemInicioActionPerformed

    private void jMenuCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCatalogoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenuCatalogoActionPerformed

    private void jMenuItemCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCatalogoActionPerformed
        // TODO add your handling code here:
        catalogoCuenta catalogo = new catalogoCuenta();
        catalogo.setSize(1280, 660);
        catalogo.setLocation(0, 0);
        jPanelInicio.removeAll();
        jPanelInicio.add(catalogo, BorderLayout.CENTER);
        jPanelInicio.revalidate();
        jPanelInicio.repaint();
    }//GEN-LAST:event_jMenuItemCatalogoActionPerformed

    private void jMenuItemLibroMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLibroMayorActionPerformed
        // TODO add your handling code here:
        LibroMayor libroMayor = new LibroMayor();
        libroMayor.setSize(1280, 660);
        libroMayor.setLocation(0, 0);
        jPanelInicio.removeAll();
        jPanelInicio.add(libroMayor, BorderLayout.CENTER);
        jPanelInicio.revalidate();
        jPanelInicio.repaint();
    }//GEN-LAST:event_jMenuItemLibroMayorActionPerformed

    private void jMenuItemManoObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemManoObraActionPerformed
        // TODO add your handling code here:
        manoDeObra mano = new manoDeObra();
        mano.setSize(1280, 660);
        mano.setLocation(0, 0);
        jPanelInicio.removeAll();
        jPanelInicio.add(mano, BorderLayout.CENTER);
        jPanelInicio.revalidate();
        jPanelInicio.repaint();
    }//GEN-LAST:event_jMenuItemManoObraActionPerformed

    private void jMenuItemTransaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTransaccionActionPerformed

        transaccion transaccion = new transaccion();
        transaccion.setSize(1280, 660);
        transaccion.setLocation(0, 0);
        jPanelInicio.removeAll();
        jPanelInicio.add(transaccion, BorderLayout.CENTER);
        jPanelInicio.revalidate();
        jPanelInicio.repaint();
    }//GEN-LAST:event_jMenuItemTransaccionActionPerformed

    private void jMenuItemBalanceComprobacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBalanceComprobacionActionPerformed
        // TODO add your handling code here:
        balanceDeComprobacion balanceDeComprobacion = new balanceDeComprobacion();
        balanceDeComprobacion.setSize(1280, 660);
        balanceDeComprobacion.setLocation(0, 0);
        jPanelInicio.removeAll();
        jPanelInicio.add(balanceDeComprobacion, BorderLayout.CENTER);
        jPanelInicio.revalidate();
        jPanelInicio.repaint();
    }//GEN-LAST:event_jMenuItemBalanceComprobacionActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        hojaDeTrabajo hojaDeTrabajo = new hojaDeTrabajo();
        hojaDeTrabajo.setSize(1280, 660);
        hojaDeTrabajo.setLocation(0, 0);
        jPanelInicio.removeAll();
        jPanelInicio.add(hojaDeTrabajo, BorderLayout.CENTER);
        jPanelInicio.revalidate();
        jPanelInicio.repaint();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItemCierreContableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCierreContableActionPerformed
        // TODO add your handling code here:
        cierreContable cierreContable = new cierreContable();
        cierreContable.setSize(1280, 660);
        cierreContable.setLocation(0, 0);
        jPanelInicio.removeAll();
        jPanelInicio.add(cierreContable, BorderLayout.CENTER);
        jPanelInicio.revalidate();
        jPanelInicio.repaint();
    }//GEN-LAST:event_jMenuItemCierreContableActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenuBalanceComprobacion;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu jMenuCatalogo;
    private javax.swing.JMenu jMenuCierreContable;
    private javax.swing.JMenu jMenuInicio;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemBalanceComprobacion;
    private javax.swing.JMenuItem jMenuItemCatalogo;
    private javax.swing.JMenuItem jMenuItemCierreContable;
    private javax.swing.JMenuItem jMenuItemInicio;
    private javax.swing.JMenuItem jMenuItemLibroMayor;
    private javax.swing.JMenuItem jMenuItemManoObra;
    private javax.swing.JMenuItem jMenuItemTransaccion;
    private javax.swing.JMenu jMenuLibroMayor;
    private javax.swing.JMenu jMenuManoObra;
    private javax.swing.JMenu jMenuTransaccion;
    private javax.swing.JPanel jPanelInicio;
    // End of variables declaration//GEN-END:variables
}
