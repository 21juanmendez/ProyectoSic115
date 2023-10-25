/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Formularios;

import Conexiones.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juann
 */
public class libroMayor4 extends javax.swing.JPanel {

    /**
     * Creates new form libroMayor4
     */
    public libroMayor4() {
        initComponents();
        mostrarCuentas();
        sumarCuentaGastoCertificacion();
        sumarCuentaVentaSoftware();
        sumarCuentaDescuentoCompras();
        sumarCuentaDevolucionesCompras();
        sumarCuentaServicioConsultoria();
    }

    public void mostrarCuentas() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();

        //CUENTA gasto de certificacion
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='410121'");
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
            }
            jTableGastoCerificacion.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        //CUENTA venta de software
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='51'");
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
            }
            jTableVentaSoftware.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
             //CUENTA descuento sobre compra
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='5101'");
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
            }
            jTableDescuentoCompras.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
            //CUENTA devoluciones sobre compra
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='5102'");
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
            }
            jTableDevolucionesCompras.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
            //CUENTA servicio de consultoria
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='5103'");
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
            }
            jTableServicio.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
    }

    public void sumarCuentaGastoCertificacion() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableGastoCerificacion.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoGastoCerificacion.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoGastoCerificacion.setText(String.valueOf(sumaAbono));
            //Ya que es como activo cargo tiene que ser mayor para que la resta no quede negativa
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe = ? WHERE codigo = '410121'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            jTextFieldSumaTotalGastoCerificacion.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sumarCuentaVentaSoftware() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableVentaSoftware.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoVentaSoftware.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoVentaSoftware.setText(String.valueOf(sumaAbono));
            
            //Ya que es como pasivo abono tiene que ser mayor para que la resta no quede negativa
                total =sumaAbono - sumaCargo;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalHaber = ? WHERE codigo = '51'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            
            jTextFieldSumaTotalVentaSoftware.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void sumarCuentaDescuentoCompras() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableDescuentoCompras.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoDescuentoCompras.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoDescuentoCompras.setText(String.valueOf(sumaAbono));
            
            //Ya que es como pasivo abono tiene que ser mayor para que la resta no quede negativa
                total =sumaAbono - sumaCargo;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalHaber = ? WHERE codigo = '5101'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            
            jTextFieldSumaTotalDescuentoCompras.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
     public void sumarCuentaDevolucionesCompras() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableDevolucionesCompras.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoDevolucionesCompras.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoDevolucionesCompras.setText(String.valueOf(sumaAbono));
            
            //Ya que es como pasivo abono tiene que ser mayor para que la resta no quede negativa
                total =sumaAbono - sumaCargo;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalHaber = ? WHERE codigo = '5102'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            
            jTextFieldSumaTotalDevolucionesCompras.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
        public void sumarCuentaServicioConsultoria() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableServicio.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoServicio.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoServicio.setText(String.valueOf(sumaAbono));
            
            //Ya que es como pasivo abono tiene que ser mayor para que la resta no quede negativa
                total =sumaAbono - sumaCargo;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalHaber = ? WHERE codigo = '5103'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            
            jTextFieldSumaTotalServicio.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
        jTableGastoCerificacion = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableVentaSoftware = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldSumaAbonoGastoCerificacion = new javax.swing.JTextField();
        jTextFieldSumaCargoGastoCerificacion = new javax.swing.JTextField();
        jTextFieldSumaTotalGastoCerificacion = new javax.swing.JTextField();
        jTextFieldSumaCargoVentaSoftware = new javax.swing.JTextField();
        jTextFieldSumaAbonoVentaSoftware = new javax.swing.JTextField();
        jTextFieldSumaTotalVentaSoftware = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableDescuentoCompras = new javax.swing.JTable();
        jTextFieldSumaCargoDescuentoCompras = new javax.swing.JTextField();
        jTextFieldSumaAbonoDescuentoCompras = new javax.swing.JTextField();
        jTextFieldSumaTotalDescuentoCompras = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTableDevolucionesCompras = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTableServicio = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        jTextFieldSumaAbonoDevolucionesCompras = new javax.swing.JTextField();
        jTextFieldSumaTotalDevolucionesCompras = new javax.swing.JTextField();
        jTextFieldSumaCargoDevolucionesCompras = new javax.swing.JTextField();
        jTextFieldSumaCargoServicio = new javax.swing.JTextField();
        jTextFieldSumaAbonoServicio = new javax.swing.JTextField();
        jTextFieldSumaTotalServicio = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1280, 680));

        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 680));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Pagina 5");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

        jTableGastoCerificacion.setBackground(new java.awt.Color(255, 255, 153));
        jTableGastoCerificacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableGastoCerificacion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 140, 180));

        jScrollPane2.setBackground(new java.awt.Color(255, 153, 153));

        jTableVentaSoftware.setBackground(new java.awt.Color(204, 204, 255));
        jTableVentaSoftware.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableVentaSoftware);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 140, 180));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel3.setText("DESCUENTOS SOBRE COMPRAS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));
        jPanel1.add(jTextFieldSumaAbonoGastoCerificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 70, -1));
        jPanel1.add(jTextFieldSumaCargoGastoCerificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 70, -1));
        jPanel1.add(jTextFieldSumaTotalGastoCerificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 70, -1));
        jPanel1.add(jTextFieldSumaCargoVentaSoftware, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoVentaSoftware, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 70, -1));
        jPanel1.add(jTextFieldSumaTotalVentaSoftware, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 70, -1));

        jLabel6.setText("TOTAL");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel5.setText("VENTAS DE SOFTWARE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        jLabel7.setText("TOTAL");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, 20));

        jTableDescuentoCompras.setBackground(new java.awt.Color(204, 204, 255));
        jTableDescuentoCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(jTableDescuentoCompras);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 140, 180));
        jPanel1.add(jTextFieldSumaCargoDescuentoCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoDescuentoCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 70, -1));
        jPanel1.add(jTextFieldSumaTotalDescuentoCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 70, -1));

        jLabel17.setText("TOTAL");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, -1, 20));

        jTableDevolucionesCompras.setBackground(new java.awt.Color(204, 204, 255));
        jTableDevolucionesCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane10.setViewportView(jTableDevolucionesCompras);

        jPanel1.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 140, 180));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel20.setText("DEVOLUCIONES SOBRE COMPRAS");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, -1, -1));

        jTableServicio.setBackground(new java.awt.Color(204, 204, 255));
        jTableServicio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane11.setViewportView(jTableServicio);

        jPanel1.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 140, 180));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel21.setText("SERVICIO DE CONSULTORIA");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, -1, -1));
        jPanel1.add(jTextFieldSumaAbonoDevolucionesCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 70, -1));
        jPanel1.add(jTextFieldSumaTotalDevolucionesCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 70, -1));
        jPanel1.add(jTextFieldSumaCargoDevolucionesCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 70, -1));
        jPanel1.add(jTextFieldSumaCargoServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 260, 70, -1));
        jPanel1.add(jTextFieldSumaTotalServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, 70, -1));

        jLabel23.setText("TOTAL");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, -1, 20));

        jLabel14.setText("TOTAL");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, -1, 20));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 50, -1, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel27.setText("GASTO DE CERTIFICACION");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTableDescuentoCompras;
    private javax.swing.JTable jTableDevolucionesCompras;
    private javax.swing.JTable jTableGastoCerificacion;
    private javax.swing.JTable jTableServicio;
    private javax.swing.JTable jTableVentaSoftware;
    private javax.swing.JTextField jTextFieldSumaAbonoDescuentoCompras;
    private javax.swing.JTextField jTextFieldSumaAbonoDevolucionesCompras;
    private javax.swing.JTextField jTextFieldSumaAbonoGastoCerificacion;
    private javax.swing.JTextField jTextFieldSumaAbonoServicio;
    private javax.swing.JTextField jTextFieldSumaAbonoVentaSoftware;
    private javax.swing.JTextField jTextFieldSumaCargoDescuentoCompras;
    private javax.swing.JTextField jTextFieldSumaCargoDevolucionesCompras;
    private javax.swing.JTextField jTextFieldSumaCargoGastoCerificacion;
    private javax.swing.JTextField jTextFieldSumaCargoServicio;
    private javax.swing.JTextField jTextFieldSumaCargoVentaSoftware;
    private javax.swing.JTextField jTextFieldSumaTotalDescuentoCompras;
    private javax.swing.JTextField jTextFieldSumaTotalDevolucionesCompras;
    private javax.swing.JTextField jTextFieldSumaTotalGastoCerificacion;
    private javax.swing.JTextField jTextFieldSumaTotalServicio;
    private javax.swing.JTextField jTextFieldSumaTotalVentaSoftware;
    // End of variables declaration//GEN-END:variables
}
