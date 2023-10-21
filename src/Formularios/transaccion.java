/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Formularios;

import Conexiones.ConexionDB;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JTable;

/**
 *
 * @author juann
 */
public class transaccion extends javax.swing.JPanel {

    double sumaCargo = 0, sumaAbono = 0;

    /**
     * Creates new form transaccion
     */
    public transaccion() {
        initComponents();
        JcomboboxCuentas();
        libroDIario();
        valoresIniciales();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTransacciones = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxCatalogo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldFecha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCheckBoxCredito = new javax.swing.JCheckBox();
        jCheckBoxDebito = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldConcepto = new javax.swing.JTextField();
        jTextFieldCargo = new javax.swing.JTextField();
        jTextFieldAbono = new javax.swing.JTextField();
        jButtonGuardarTransaccion = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jButtonEditarTransaccion = new javax.swing.JButton();
        jButtonEliminarTransaccion = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLibroDiario = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1ID = new javax.swing.JLabel();

        jPanelTransacciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ink Free", 0, 24)); // NOI18N
        jLabel1.setText("Registro de Transacciones");
        jPanelTransacciones.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Cuenta:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jComboBoxCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCatalogoActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxCatalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 890, -1));

        jLabel4.setText("Fecha:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));
        jPanel1.add(jTextFieldFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 140, -1));

        jLabel5.setText("Cargo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));

        jLabel6.setText("Abono:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, -1, -1));

        jCheckBoxCredito.setText("Agregar IVA - Credito Fiscal");
        jPanel1.add(jCheckBoxCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 190, -1));

        jCheckBoxDebito.setText("Agregar IVA - Debito Fiscal");
        jPanel1.add(jCheckBoxDebito, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 70, 190, -1));

        jLabel7.setText("Concepto:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jTextFieldConcepto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextFieldConcepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldConceptoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldConcepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 1070, 60));
        jPanel1.add(jTextFieldCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 90, -1));
        jPanel1.add(jTextFieldAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 90, -1));

        jButtonGuardarTransaccion.setText("Guardar");
        jButtonGuardarTransaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarTransaccionActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGuardarTransaccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 90, -1));

        jLabel10.setText("Codigo:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 30, -1, -1));

        jTextFieldCodigo.setEnabled(false);
        jPanel1.add(jTextFieldCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 30, 90, -1));

        jButtonEditarTransaccion.setText("Modificar");
        jButtonEditarTransaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarTransaccionActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEditarTransaccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 90, -1));

        jButtonEliminarTransaccion.setText("Eliminar");
        jButtonEliminarTransaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarTransaccionActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEliminarTransaccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 90, -1));

        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, 90, -1));

        jPanelTransacciones.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 1200, 230));

        jTableLibroDiario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableLibroDiario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableLibroDiarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableLibroDiario);

        jPanelTransacciones.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 1200, 280));

        jLabel2.setFont(new java.awt.Font("Ink Free", 0, 24)); // NOI18N
        jLabel2.setText("Libro Diario");
        jPanelTransacciones.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, -1, -1));
        jPanelTransacciones.add(jLabel1ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 60, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTransacciones, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTransacciones, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldConceptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldConceptoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldConceptoActionPerformed

    private void jComboBoxCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCatalogoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCatalogoActionPerformed
    public void valoresIniciales() {
        jComboBoxCatalogo.setVisible(true);
        jTextFieldCodigo.setText("");
        jTextFieldFecha.setText("");
        jTextFieldCargo.setText("0");
        jTextFieldAbono.setText("0");
        jCheckBoxCredito.setVisible(true);
        jCheckBoxDebito.setVisible(true);
    }

    private void jButtonGuardarTransaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarTransaccionActionPerformed
        // TODO add your handling code here:  

        String fecha = jTextFieldFecha.getText();
        String codigo = jTextFieldCodigo.getText();
        String cuenta = (String) jComboBoxCatalogo.getSelectedItem();
        String concepto = jTextFieldConcepto.getText();
        double cargo = Double.parseDouble(jTextFieldCargo.getText());
        double abono = Double.parseDouble(jTextFieldAbono.getText());
        claseTransaccion transaccion = new claseTransaccion(fecha, codigo, cuenta, concepto, cargo, abono);
        try {
            ConexionDB db = new ConexionDB();
            Connection cn = db.conectar();
            PreparedStatement pst = cn.prepareStatement("INSERT INTO transacciones (fecha, codigo, cuenta, concepto, cargo, abono) "
                    + "VALUES (?, ?, ?, ?, ?, ?)");
            pst.setString(1, transaccion.getFecha());
            pst.setString(2, transaccion.getCodigo());
            pst.setString(3, transaccion.getCuenta());
            pst.setString(4, transaccion.getConcepto());
            pst.setDouble(5, transaccion.getCargo());
            pst.setDouble(6, transaccion.getAbono());
            sumaCargo += transaccion.getCargo();
            sumaAbono += transaccion.getAbono();
            // LIMPIA LOS DATOS INGRESADOS
            jTextFieldFecha.setText("");
            jTextFieldConcepto.setText("");
            jTextFieldCargo.setText("");
            jTextFieldAbono.setText("");
            pst.executeUpdate();
            pst.close();
            cn.close();
            //Muestra mensaje de exito
            JOptionPane.showMessageDialog(null, "Transacción guardada con éxito.");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al guardar el Transaccion.");
        }

        //CALCULO DE IVA - CREDITO FISCAL
        if (jCheckBoxCredito.isSelected()) {
            try {
                ConexionDB db = new ConexionDB();
                Connection cn = db.conectar();
                PreparedStatement pst = cn.prepareStatement("INSERT INTO transacciones (fecha, codigo, cuenta, concepto, cargo, abono) "
                        + "VALUES (?, ?, ?, ?, ?, ?)");
                pst.setString(1, transaccion.getFecha());
                pst.setString(2, "1107");
                pst.setString(3, "IVA-CREDITO FISCAL");
                pst.setString(4, transaccion.getConcepto());
                double ivaCreditoCargo = transaccion.getCargo() * 0.13;
                pst.setDouble(5, ivaCreditoCargo);
                sumaCargo += ivaCreditoCargo;
                double ivaCreditoAbono = transaccion.getAbono() * 0.13;
                pst.setDouble(6, ivaCreditoAbono);
                sumaAbono += ivaCreditoAbono;
                // LIMPIA LOS DATOS INGRESADOS
                jTextFieldFecha.setText("");
                jTextFieldConcepto.setText("");
                jTextFieldCargo.setText("");
                jTextFieldAbono.setText("");
                pst.executeUpdate();
//                pst.close();
//                cn.close();
                //ACTUALIZAMOS LA TABLA
                libroDIario();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error:" + e.toString());
            }
    }//GEN-LAST:event_jButtonGuardarTransaccionActionPerformed

        //CALCULO DE IVA - DEBITO FISCAL
        if (jCheckBoxDebito.isSelected()) {
            try {
                ConexionDB db = new ConexionDB();
                Connection cn = db.conectar();
                PreparedStatement pst = cn.prepareStatement("INSERT INTO transacciones (fecha, codigo, cuenta, concepto, cargo, abono) "
                        + "VALUES (?, ?, ?, ?, ?, ?)");
                pst.setString(1, transaccion.getFecha());
                pst.setString(2, "2107");
                pst.setString(3, "IVA-DEBITO FISCAL");
                pst.setString(4, transaccion.getConcepto());
                double ivaDebitoCargo = transaccion.getCargo() * 0.13;
                pst.setDouble(5, ivaDebitoCargo);
                sumaCargo += ivaDebitoCargo;
                double ivaDebitoAbono = transaccion.getAbono() * 0.13;
                pst.setDouble(6, ivaDebitoAbono);
                sumaAbono += ivaDebitoAbono;
                // LIMPIA LOS DATOS INGRESADOS
                jTextFieldFecha.setText("");
                jTextFieldConcepto.setText("");
                jTextFieldCargo.setText("");
                jTextFieldAbono.setText("");
                pst.executeUpdate();
                pst.close();
                cn.close();
                //ACTUALIZAMOS LA TABLA
                libroDIario();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error:" + e.toString());
            }
        }

        //AGREGA A LA CUENTA CAJA LA SUMA DE LAS 2 ANTERIORES
        try {
            ConexionDB db = new ConexionDB();
            Connection cn = db.conectar();
            PreparedStatement pst = cn.prepareStatement("INSERT INTO transacciones (fecha, codigo, cuenta, concepto, cargo, abono) "
                    + "VALUES (?, ?, ?, ?, ?, ?)");
            if (sumaCargo != 0) {
                pst.setString(1, transaccion.getFecha());
                pst.setString(2, "1101");
                pst.setString(3, "CAJA");
                pst.setString(4, transaccion.getConcepto());
                pst.setDouble(5, 0);
                pst.setDouble(6, sumaCargo);
                // LIMPIA LOS DATOS INGRESADOS
                jTextFieldFecha.setText("");
                jTextFieldConcepto.setText("");
                jTextFieldCargo.setText("");
                jTextFieldAbono.setText("");
                pst.executeUpdate();
                pst.close();
                cn.close();
                //ACTUALIZAMOS LA TABLA
                libroDIario();
            } else {
                pst.setString(1, transaccion.getFecha());
                pst.setString(2, "1101");
                pst.setString(3, "CAJA");
                pst.setString(4, transaccion.getConcepto());
                pst.setDouble(5, sumaAbono);
                pst.setDouble(6, 0);
                // LIMPIA LOS DATOS INGRESADOS
                jTextFieldFecha.setText("");
                jTextFieldConcepto.setText("");
                jTextFieldCargo.setText("");
                jTextFieldAbono.setText("");
                pst.executeUpdate();
                pst.close();
                cn.close();
                //ACTUALIZAMOS LA TABLA
                libroDIario();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al guardar el Transaccion.");
        }
        jCheckBoxCredito.setSelected(false);
        jCheckBoxDebito.setSelected(false);
    }
    private void jButtonEditarTransaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarTransaccionActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(jLabel1ID.getText());
        String fecha = jTextFieldFecha.getText();
        String codigo = jTextFieldCodigo.getText();
        String cuenta = (String) jComboBoxCatalogo.getSelectedItem();
        String concepto = jTextFieldConcepto.getText();
        double cargo = Double.parseDouble(jTextFieldCargo.getText());
        double abono = Double.parseDouble(jTextFieldAbono.getText());

        try {
            ConexionDB db = new ConexionDB();
            Connection cn = db.conectar();
            PreparedStatement pst = cn.prepareStatement("UPDATE transacciones SET fecha=?, codigo=?, cuenta=?, concepto=?, cargo=?, abono=? WHERE id=?");

            pst.setString(1, fecha);
            pst.setString(2, codigo);
            pst.setString(3, cuenta);
            pst.setString(4, concepto);
            pst.setDouble(5, cargo);
            pst.setDouble(6, abono);
            pst.setInt(7, id);

            pst.executeUpdate();
            pst.close();
            cn.close();
            //ACTUALIZAMOS LA TABLA
            libroDIario();
            // Muestra mensaje de éxito
            JOptionPane.showMessageDialog(null, "Transacción modificada con éxito.");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al modificar la Transacción.");
        }

    }//GEN-LAST:event_jButtonEditarTransaccionActionPerformed

    private void jTableLibroDiarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableLibroDiarioMouseClicked
        // TODO add your handling code here:
        int filaSeleccionada = jTableLibroDiario.getSelectedRow();

        if (filaSeleccionada >= 0) {
            int id = (int) jTableLibroDiario.getValueAt(filaSeleccionada, 0);
            String fecha = jTableLibroDiario.getValueAt(filaSeleccionada, 1).toString();
            String codigo = jTableLibroDiario.getValueAt(filaSeleccionada, 2).toString();
            String cuenta = jTableLibroDiario.getValueAt(filaSeleccionada, 3).toString();
            String concepto = jTableLibroDiario.getValueAt(filaSeleccionada, 4).toString();
            String cargo = jTableLibroDiario.getValueAt(filaSeleccionada, 5).toString();
            String abono = jTableLibroDiario.getValueAt(filaSeleccionada, 6).toString();

            // Actualiza los campos de texto y otros componentes con los valores de la fila seleccionada
            jLabel1ID.setText(String.valueOf(id));
            jTextFieldFecha.setText(fecha);
            jTextFieldCodigo.setText(codigo);
            jComboBoxCatalogo.setSelectedItem(cuenta);
            jTextFieldConcepto.setText(concepto);
            jTextFieldCargo.setText(cargo);
            jTextFieldAbono.setText(abono);
            jLabel1ID.setVisible(false);
            jButtonGuardarTransaccion.setEnabled(false);
        }

    }//GEN-LAST:event_jTableLibroDiarioMouseClicked

    private void jButtonEliminarTransaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarTransaccionActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(jLabel1ID.getText());
        String fecha = jTextFieldFecha.getText();
        String codigo = jTextFieldCodigo.getText();
        String cuenta = (String) jComboBoxCatalogo.getSelectedItem();
        String concepto = jTextFieldConcepto.getText();
        double cargo = Double.parseDouble(jTextFieldCargo.getText());
        double abono = Double.parseDouble(jTextFieldAbono.getText());

        try {
            ConexionDB db = new ConexionDB();
            Connection cn = db.conectar();
            PreparedStatement pst = cn.prepareStatement("DELETE FROM transacciones WHERE id=?");
            pst.setInt(1, id);// Asignar el valor del id al marcador de posición
            pst.executeUpdate();
            pst.close();
            cn.close();
            //ACTUALIZAMOS LA TABLA
            libroDIario();
            // Muestra mensaje de éxito
            JOptionPane.showMessageDialog(null, "Transacción eliminada con éxito.");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al eliminar la Transacción.");
        }
        
    }//GEN-LAST:event_jButtonEliminarTransaccionActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    //MUESTRA LOS VALORES DE LA CUENTA EN EL COMBOBOS Y DEL CODIGO EN EL TEXTBOX
    public void JcomboboxCuentas() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();

        try {
            PreparedStatement pst = cn.prepareStatement("SELECT codigo, cuenta FROM catalogocuentas");
            ResultSet resultado = pst.executeQuery();

            // Crea una lista para almacenar los elementos de la base de datos.
            ArrayList<String> items = new ArrayList<>();
            HashMap<String, String> codigoCuentaMap = new HashMap<>(); // Para mapear códigos y cuentas.

            while (resultado.next()) {
                String cuenta = resultado.getString("cuenta");
                String codigo = resultado.getString("codigo");
                items.add(cuenta);

                // Mapea la cuenta con su código.
                codigoCuentaMap.put(cuenta, codigo);
            }

            for (String item : items) {
                jComboBoxCatalogo.addItem(item);
            }

            // Agrega un ItemListener al JComboBox para manejar la selección.
            jComboBoxCatalogo.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        String cuentaSeleccionada = (String) jComboBoxCatalogo.getSelectedItem();
                        String codigoCorrespondiente = codigoCuentaMap.get(cuentaSeleccionada);

                        if (codigoCorrespondiente != null) {
                            jTextFieldCodigo.setText(codigoCorrespondiente);
                        } else {
                            jTextFieldCodigo.setText(""); // Limpiar el JTextField si no se encuentra un código.
                        }
                    }
                }
            });

            cn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void libroDIario() {
        valoresIniciales();
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT * FROM transacciones");
            ResultSet resultado = pst.executeQuery();
            DefaultTableModel modeloTabla = new DefaultTableModel();
            modeloTabla.addColumn("ID");
            modeloTabla.addColumn("Fecha");
            modeloTabla.addColumn("Codigo");
            modeloTabla.addColumn("Cuenta");
            modeloTabla.addColumn("Concepto");
            modeloTabla.addColumn("Cargo");
            modeloTabla.addColumn("Abono");
            while (resultado.next()) {
                int id = resultado.getInt("ID");
                String fecha = resultado.getString("Fecha");
                String codigo = resultado.getString("Codigo");
                String cuenta = resultado.getString("Cuenta");
                String concepto = resultado.getString("Concepto");
                String cargo = resultado.getString("Cargo");
                String abono = resultado.getString("Abono");

                modeloTabla.addRow(new Object[]{id, fecha, codigo, cuenta, concepto, cargo, abono});
                jTableLibroDiario.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditarTransaccion;
    private javax.swing.JButton jButtonEliminarTransaccion;
    private javax.swing.JButton jButtonGuardarTransaccion;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JCheckBox jCheckBoxCredito;
    private javax.swing.JCheckBox jCheckBoxDebito;
    private javax.swing.JComboBox<String> jComboBoxCatalogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel1ID;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelTransacciones;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLibroDiario;
    private javax.swing.JTextField jTextFieldAbono;
    private javax.swing.JTextField jTextFieldCargo;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldConcepto;
    private javax.swing.JTextField jTextFieldFecha;
    // End of variables declaration//GEN-END:variables
}
