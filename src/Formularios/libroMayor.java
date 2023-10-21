/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Formularios;

import Conexiones.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juann
 */
public class libroMayor extends javax.swing.JPanel {

    /**
     * Creates new form libroMayor
     */
    public libroMayor() {
        initComponents();
        mostrarCuentas();
        sumarCuentaCaja();
        sumarCuentaIvaCredito();
        sumarCuentaDebito();
        sumaCuentaVentas();
        sumarCuentaCompras();
        
    }

    public void mostrarCuentas() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();

        //CUENTA CAJA
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cuenta,cargo,abono FROM transacciones WHERE codigo='1101'");
            ResultSet resultado = pst.executeQuery();
            DefaultTableModel modeloTabla = new DefaultTableModel();
            //modeloTabla.addColumn("Cuenta");
            modeloTabla.addColumn("Debe");
            modeloTabla.addColumn("Haber");
            while (resultado.next()) {
                //String cuenta = resultado.getString("Cuenta");
                String cargo = resultado.getString("cargo");
                String abono = resultado.getString("abono");

                modeloTabla.addRow(new Object[]{cargo, abono});//si se agrega la cuenta quedaria (cuenta,cargo,abono);
                jTableCaja.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        //CUENTA IVA-CREDITO FISCAL
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='1107'");
            ResultSet resultado = pst.executeQuery();
            DefaultTableModel modeloTabla = new DefaultTableModel();
            //modeloTabla.addColumn("Cuenta");
            modeloTabla.addColumn("Debe");
            modeloTabla.addColumn("Haber");
            while (resultado.next()) {
                //String cuenta = resultado.getString("Cuenta");
                String cargo = resultado.getString("Cargo");
                String abono = resultado.getString("Abono");

                modeloTabla.addRow(new Object[]{cargo, abono});//si se agrega la cuenta quedaria (cuenta,cargo,abono);
                jTableCredito.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        //CUENTA IVA-DEBITO FISCAL
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='2107'");
            ResultSet resultado = pst.executeQuery();
            DefaultTableModel modeloTabla = new DefaultTableModel();
            //modeloTabla.addColumn("Cuenta");
            modeloTabla.addColumn("Debe");
            modeloTabla.addColumn("Haber");
            while (resultado.next()) {
                //String cuenta = resultado.getString("Cuenta");
                String cargo = resultado.getString("Cargo");
                String abono = resultado.getString("Abono");

                modeloTabla.addRow(new Object[]{cargo, abono});//si se agrega la cuenta quedaria (cuenta,cargo,abono);
                jTableDebito.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        //CUENTA VENTAS
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='5101'");
            ResultSet resultado = pst.executeQuery();
            DefaultTableModel modeloTabla = new DefaultTableModel();
            //modeloTabla.addColumn("Cuenta");
            modeloTabla.addColumn("Debe");
            modeloTabla.addColumn("Haber");
            while (resultado.next()) {
                //String cuenta = resultado.getString("Cuenta");
                String cargo = resultado.getString("Cargo");
                String abono = resultado.getString("Abono");

                modeloTabla.addRow(new Object[]{cargo, abono});//si se agrega la cuenta quedaria (cuenta,cargo,abono);
                jTableVentas.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        //CUENTA COMPRAS
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='4101'");
            ResultSet resultado = pst.executeQuery();
            DefaultTableModel modeloTabla = new DefaultTableModel();
            //modeloTabla.addColumn("Cuenta");
            modeloTabla.addColumn("Debe");
            modeloTabla.addColumn("Haber");
            while (resultado.next()) {
                //String cuenta = resultado.getString("Cuenta");
                String cargo = resultado.getString("Cargo");
                String abono = resultado.getString("Abono");

                modeloTabla.addRow(new Object[]{cargo, abono});//si se agrega la cuenta quedaria (cuenta,cargo,abono);
                jTableCompras.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }

    public void sumarCuentaCaja() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();

        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableCaja.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCajaCargo.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaCajaAbono.setText(String.valueOf(sumaAbono));

            if (sumaCargo > sumaAbono) {
                double total = sumaCargo - sumaAbono;
                jTextFieldSumaTotalCaja.setText(String.valueOf(total));

                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET total = ? WHERE codigo = '1101'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a=pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            }
        } catch (Exception e) {
        }
    }

    public void sumarCuentaIvaCredito() {
        DefaultTableModel modelo = (DefaultTableModel) jTableCredito.getModel();
        int rowCount = modelo.getRowCount();
        double sumaCargo = 0.0;
        double sumaAbono = 0.0;
        //sumamos la columna del debe
        for (int i = 0; i < rowCount; i++) {
            sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
        }
        //mostramos la suma del debe en el textbox
        jTextFieldSumaIvaCreditoCargo.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
        for (int i = 0; i < rowCount; i++) {
            sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
        }
        jTextFieldSumaIvaCreditoAbono.setText(String.valueOf(sumaAbono));

        if (sumaCargo > sumaAbono) {
            double total = sumaCargo - sumaAbono;
            jTextFieldSumaIvaCreditoTotal.setText(String.valueOf(total));
        }
    }

    public void sumarCuentaDebito() {
        DefaultTableModel modelo = (DefaultTableModel) jTableDebito.getModel();
        int rowCount = modelo.getRowCount();
        double sumaCargo = 0.0;
        double sumaAbono = 0.0;
        //sumamos la columna del debe
        for (int i = 0; i < rowCount; i++) {
            sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
        }
        //mostramos la suma del debe en el textbox
        jTextFieldSumaCargoDebito.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
        for (int i = 0; i < rowCount; i++) {
            sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
        }
        jTextFieldSumaAbonoDebito.setText(String.valueOf(sumaAbono));

        if (sumaAbono > sumaCargo) {
            double total = sumaAbono - sumaCargo;
            jTextFieldSumaTotalDebito.setText(String.valueOf(total));
        }
    }

    public void sumaCuentaVentas() {
        DefaultTableModel modelo = (DefaultTableModel) jTableVentas.getModel();
        int rowCount = modelo.getRowCount();
        double sumaCargo = 0.0;
        double sumaAbono = 0.0;
        //sumamos la columna del debe
        for (int i = 0; i < rowCount; i++) {
            sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
        }
        //mostramos la suma del debe en el textbox
        jTextFieldSumaCargoVentas.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
        for (int i = 0; i < rowCount; i++) {
            sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
        }
        jTextFieldSumaAbonoVentas.setText(String.valueOf(sumaAbono));

        if (sumaAbono > sumaCargo) {
            double total = sumaAbono - sumaCargo;
            jTextFieldSumaTotalVentas.setText(String.valueOf(total));
        }
    }

    public void sumarCuentaCompras() {
        DefaultTableModel modelo = (DefaultTableModel) jTableCompras.getModel();
        int rowCount = modelo.getRowCount();
        double sumaCargo = 0.0;
        double sumaAbono = 0.0;
        //sumamos la columna del debe
        for (int i = 0; i < rowCount; i++) {
            sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
        }
        //mostramos la suma del debe en el textbox
        jTextFieldSumaCargoCompras.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
        for (int i = 0; i < rowCount; i++) {
            sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
        }
        jTextFieldSumaAbonoCompras.setText(String.valueOf(sumaAbono));

        if (sumaCargo > sumaAbono) {
            double total = sumaCargo - sumaAbono;
            jTextFieldSumaTotalCompras.setText(String.valueOf(total));
        }
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCaja = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCredito = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldSumaCajaAbono = new javax.swing.JTextField();
        jTextFieldSumaCajaCargo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldSumaTotalCaja = new javax.swing.JTextField();
        jTextFieldSumaIvaCreditoCargo = new javax.swing.JTextField();
        jTextFieldSumaIvaCreditoAbono = new javax.swing.JTextField();
        jTextFieldSumaIvaCreditoTotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableDebito = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldSumaTotalVentas = new javax.swing.JTextField();
        jTextFieldSumaAbonoDebito = new javax.swing.JTextField();
        jTextFieldSumaTotalDebito = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableVentas = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldSumaCargoDebito = new javax.swing.JTextField();
        jTextFieldSumaCargoVentas = new javax.swing.JTextField();
        jTextFieldSumaAbonoVentas = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableCompras = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldSumaCargoCompras = new javax.swing.JTextField();
        jTextFieldSumaAbonoCompras = new javax.swing.JTextField();
        jTextFieldSumaTotalCompras = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        jLabel1.setText("LIBRO MAYOR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, -1));

        jTableCaja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableCaja);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 150, 180));

        jLabel2.setText("CAJA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jTableCredito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableCredito);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 150, 180));

        jLabel3.setText("COMPRAS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, -1, -1));
        jPanel1.add(jTextFieldSumaCajaAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 70, -1));
        jPanel1.add(jTextFieldSumaCajaCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 70, -1));

        jLabel4.setText("TOTAL");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 290, -1, 20));
        jPanel1.add(jTextFieldSumaTotalCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 70, -1));
        jPanel1.add(jTextFieldSumaIvaCreditoCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 70, -1));
        jPanel1.add(jTextFieldSumaIvaCreditoAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 70, -1));
        jPanel1.add(jTextFieldSumaIvaCreditoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 70, -1));

        jLabel6.setText("TOTAL");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, 20));

        jTableDebito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTableDebito);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 150, 180));

        jLabel5.setText("IVA - CREDITO FISCAL");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));
        jPanel1.add(jTextFieldSumaTotalVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoDebito, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 70, -1));
        jPanel1.add(jTextFieldSumaTotalDebito, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 70, -1));

        jLabel7.setText("TOTAL");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, -1, 20));

        jTableVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jTableVentas);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 150, 180));

        jLabel8.setText("IVA - DEBITO FISCAL");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));
        jPanel1.add(jTextFieldSumaCargoDebito, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 70, -1));
        jPanel1.add(jTextFieldSumaCargoVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 70, -1));

        jLabel9.setText("TOTAL");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, 20));

        jTableCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(jTableCompras);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 150, 180));

        jLabel10.setText("VENTAS");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, -1, -1));
        jPanel1.add(jTextFieldSumaCargoCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 260, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 260, 70, -1));
        jPanel1.add(jTextFieldSumaTotalCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 290, 70, -1));

        jLabel11.setText("TOTAL");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTableCaja;
    private javax.swing.JTable jTableCompras;
    private javax.swing.JTable jTableCredito;
    private javax.swing.JTable jTableDebito;
    private javax.swing.JTable jTableVentas;
    private javax.swing.JTextField jTextFieldSumaAbonoCompras;
    private javax.swing.JTextField jTextFieldSumaAbonoDebito;
    private javax.swing.JTextField jTextFieldSumaAbonoVentas;
    private javax.swing.JTextField jTextFieldSumaCajaAbono;
    private javax.swing.JTextField jTextFieldSumaCajaCargo;
    private javax.swing.JTextField jTextFieldSumaCargoCompras;
    private javax.swing.JTextField jTextFieldSumaCargoDebito;
    private javax.swing.JTextField jTextFieldSumaCargoVentas;
    private javax.swing.JTextField jTextFieldSumaIvaCreditoAbono;
    private javax.swing.JTextField jTextFieldSumaIvaCreditoCargo;
    private javax.swing.JTextField jTextFieldSumaIvaCreditoTotal;
    private javax.swing.JTextField jTextFieldSumaTotalCaja;
    private javax.swing.JTextField jTextFieldSumaTotalCompras;
    private javax.swing.JTextField jTextFieldSumaTotalDebito;
    private javax.swing.JTextField jTextFieldSumaTotalVentas;
    // End of variables declaration//GEN-END:variables
}
