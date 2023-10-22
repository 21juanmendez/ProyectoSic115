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
import javax.swing.JPanel;
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
        sumarCuentaDescuentosCompras();
        sumarCuentaDevolucionesCompras();
        sumarCuentasPorPagar();
        sumarServicioConsultoria();
        sumarDescuentosVentas();
        sumarDevolucionesVentas();
       
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
            }
            jTableCaja.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
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
            }
            jTableCredito.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.
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
            }
            jTableDebito.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.
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
            }
            jTableVentas.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.
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
            }
            jTableCompras.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        //CUENTA DESCUENTOS/COMPRAS
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='5102'");
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
            }
            jTableDescuentosCompras.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        //CUENTA DEVOLUCIONES/COMPRAS
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='5103'");
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
            }
            jTableDevolucionesCompras.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        //CUENTA CUENTAS POR PAGAR
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo=''");
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
            }
            jTableCuentasPagar.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        //CUENTA SERVICIOS DE CONSULTORIA
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='5104'");
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
            }
            jTableServicioConsultoria.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        //CUENTA DESCUENTOS SOBRE VENTAS
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='4102'");
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
            }
            jTableDescuentosVentas.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
        //CUENTA DEVOLUCIONES SOBRE VENTAS
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='4103'");
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
            }
            jTableDevolucionesVentas.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.
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
            double total = 0.0;
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
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            if (sumaCargo > sumaAbono) {
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET total = ? WHERE codigo = '1101'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            }
            jTextFieldSumaTotalCaja.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sumarCuentaIvaCredito() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableCredito.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
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
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            if (sumaCargo > sumaAbono) {
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET total = ? WHERE codigo = '1107'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            }
            jTextFieldSumaIvaCreditoTotal.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sumarCuentaDebito() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableDebito.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
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
            //Ya que es pasivo abono tiene que ser mayor para que la resta no quede negativa
            if (sumaAbono > sumaCargo) {
                total = sumaAbono - sumaCargo;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET total = ? WHERE codigo = '2107'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            }
            jTextFieldSumaTotalDebito.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sumaCuentaVentas() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableVentas.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
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
            //Ya que es pasivo abono tiene que ser mayor para que la resta no quede negativa
            if (sumaAbono > sumaCargo) {
                total = sumaAbono - sumaCargo;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET total = ? WHERE codigo = '5101'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            }
            jTextFieldSumaTotalVentas.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sumarCuentaCompras() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableCompras.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
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
            //Ya que es gastos y costos (casi igual que activo) cargo tiene que ser mayor para que la resta no quede negativa
            if (sumaCargo > sumaAbono) {
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET total = ? WHERE codigo = '4101'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            }
            jTextFieldSumaTotalCompras.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sumarCuentaDescuentosCompras() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableDescuentosCompras.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoDescuentosCompras.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoDescuentosCompras.setText(String.valueOf(sumaAbono));
            //Ya que es de ingresos (casi igual que pasivo) abono tiene que ser mayor para que la resta no quede negativa
            if (sumaAbono > sumaCargo) {
                total = sumaAbono - sumaCargo;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET total = ? WHERE codigo = '5102'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            }
            jTextFieldSumaTotalDesCompras.setText(String.valueOf(total));
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
            jTextFieldSumaCargoDevolucionesCompra.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoDevolucionesCompra.setText(String.valueOf(sumaAbono));
            //Ya que es de ingresos (casi igual que pasivo) abono tiene que ser mayor para que la resta no quede negativa
            if (sumaAbono > sumaCargo) {
                total = sumaAbono - sumaCargo;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET total = ? WHERE codigo = '5103'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            }
            jTextFieldSumaTotalDevolucionesCompras.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sumarCuentasPorPagar() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableCuentasPagar.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoCuentasPagar.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoCuentasPagar.setText(String.valueOf(sumaAbono));
            //Ya que es de ingresos (casi igual que pasivo) abono tiene que ser mayor para que la resta no quede negativa
            if (sumaAbono > sumaCargo) {
                total = sumaAbono - sumaCargo;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET total = ? WHERE codigo = ''");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            }
            jTextFieldSumaTotalCuentasPagar.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sumarServicioConsultoria() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableServicioConsultoria.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoConsultoria.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoConsultoria.setText(String.valueOf(sumaAbono));
            //Ya que es de ingresos (casi igual que pasivo) abono tiene que ser mayor para que la resta no quede negativa
            if (sumaAbono > sumaCargo) {
                total = sumaAbono - sumaCargo;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET total = ? WHERE codigo = '5104'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            }
            jTextFieldSumaTotalConsultoria.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sumarDescuentosVentas() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableDescuentosVentas.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoDescuentosVentas.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoDescuentosVentas.setText(String.valueOf(sumaAbono));
            //Ya que es de ingresos (casi igual que pasivo) abono tiene que ser mayor para que la resta no quede negativa
            if (sumaCargo > sumaAbono) {
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET total = ? WHERE codigo = '4102'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            }
            jTextFieldSumaTotalDescuentosVentas.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
     public void sumarDevolucionesVentas(){
            ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableDevolucionesVentas.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoDevolucionesVentas.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoDevolucionesVentas.setText(String.valueOf(sumaAbono));
            //Ya que es de ingresos (casi igual que pasivo) abono tiene que ser mayor para que la resta no quede negativa
            if (sumaCargo > sumaAbono) {
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET total = ? WHERE codigo = '4103'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            }
            jTextFieldSumaTotalDevolucionesVentas.setText(String.valueOf(total));
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
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableDescuentosCompras = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldSumaCargoDescuentosCompras = new javax.swing.JTextField();
        jTextFieldSumaAbonoDescuentosCompras = new javax.swing.JTextField();
        jTextFieldSumaTotalDesCompras = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableDevolucionesCompras = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldSumaTotalDevolucionesCompras = new javax.swing.JTextField();
        jTextFieldSumaCargoDevolucionesCompra = new javax.swing.JTextField();
        jTextFieldSumaAbonoDevolucionesCompra = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTableCuentasPagar = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldSumaAbonoCuentasPagar = new javax.swing.JTextField();
        jTextFieldSumaTotalCuentasPagar = new javax.swing.JTextField();
        jTextFieldSumaCargoCuentasPagar = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTableServicioConsultoria = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldSumaAbonoConsultoria = new javax.swing.JTextField();
        jTextFieldSumaTotalConsultoria = new javax.swing.JTextField();
        jTextFieldSumaCargoConsultoria = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTableDescuentosVentas = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTableDevolucionesVentas = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        jTextFieldSumaAbonoDescuentosVentas = new javax.swing.JTextField();
        jTextFieldSumaTotalDescuentosVentas = new javax.swing.JTextField();
        jTextFieldSumaCargoDescuentosVentas = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextFieldSumaCargoDevolucionesVentas = new javax.swing.JTextField();
        jTextFieldSumaAbonoDevolucionesVentas = new javax.swing.JTextField();
        jTextFieldSumaTotalDevolucionesVentas = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();

        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("LIBRO MAYOR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, -1, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 140, 180));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel2.setText("CAJA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 140, 180));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel3.setText("COMPRAS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));
        jPanel1.add(jTextFieldSumaCajaAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 70, -1));
        jPanel1.add(jTextFieldSumaCajaCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 70, -1));

        jLabel4.setText("TOTAL");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 570, -1, 20));
        jPanel1.add(jTextFieldSumaTotalCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 70, -1));
        jPanel1.add(jTextFieldSumaIvaCreditoCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 70, -1));
        jPanel1.add(jTextFieldSumaIvaCreditoAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 70, -1));
        jPanel1.add(jTextFieldSumaIvaCreditoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 70, -1));

        jLabel6.setText("TOTAL");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, 20));

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

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 140, 180));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel5.setText("IVA - CREDITO FISCAL");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));
        jPanel1.add(jTextFieldSumaTotalVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 570, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoDebito, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, 70, -1));
        jPanel1.add(jTextFieldSumaTotalDebito, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, 70, -1));

        jLabel7.setText("TOTAL");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, 20));

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

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 140, 180));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel8.setText("IVA - DEBITO FISCAL");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));
        jPanel1.add(jTextFieldSumaCargoDebito, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 70, -1));
        jPanel1.add(jTextFieldSumaCargoVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 540, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 540, 70, -1));

        jLabel9.setText("TOTAL");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, 20));

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

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 140, 180));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel10.setText("VENTAS");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, -1, -1));
        jPanel1.add(jTextFieldSumaCargoCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 70, -1));
        jPanel1.add(jTextFieldSumaTotalCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 70, -1));

        jLabel11.setText("TOTAL");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 570, -1, 20));

        jTableDescuentosCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(jTableDescuentosCompras);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 140, 180));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel12.setText("DESCUENTOS/COMPRAS");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));
        jPanel1.add(jTextFieldSumaCargoDescuentosCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 540, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoDescuentosCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 540, 70, -1));
        jPanel1.add(jTextFieldSumaTotalDesCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 570, 70, -1));

        jLabel13.setText("TOTAL");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, 20));

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
        jScrollPane7.setViewportView(jTableDevolucionesCompras);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 140, 180));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel14.setText("DEVOLUCIONES/COMPRAS");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, -1, -1));
        jPanel1.add(jTextFieldSumaTotalDevolucionesCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 570, 70, -1));
        jPanel1.add(jTextFieldSumaCargoDevolucionesCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoDevolucionesCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, 70, -1));

        jLabel15.setText("TOTAL");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 570, -1, 20));

        jTableCuentasPagar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane8.setViewportView(jTableCuentasPagar);

        jPanel1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 360, 140, 180));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel16.setText("CUENTAS POR PAGAR");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 340, -1, -1));
        jPanel1.add(jTextFieldSumaAbonoCuentasPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 540, 70, -1));
        jPanel1.add(jTextFieldSumaTotalCuentasPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 570, 70, -1));
        jPanel1.add(jTextFieldSumaCargoCuentasPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 540, 70, -1));

        jLabel17.setText("TOTAL");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 290, -1, 20));

        jTableServicioConsultoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane9.setViewportView(jTableServicioConsultoria);

        jPanel1.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, 140, 180));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel18.setText("SERVICIOS DE CONSULTORIA");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 340, -1, -1));
        jPanel1.add(jTextFieldSumaAbonoConsultoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 540, 70, -1));
        jPanel1.add(jTextFieldSumaTotalConsultoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 570, 70, -1));
        jPanel1.add(jTextFieldSumaCargoConsultoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 540, 70, -1));

        jLabel19.setText("TOTAL");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 570, -1, 20));

        jTableDescuentosVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane10.setViewportView(jTableDescuentosVentas);

        jPanel1.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 140, 180));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel20.setText("DESCUENTOS/VENTAS");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        jTableDevolucionesVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane11.setViewportView(jTableDevolucionesVentas);

        jPanel1.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 140, 180));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel21.setText("DEVOLUCIONES/VENTAS");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, -1, -1));
        jPanel1.add(jTextFieldSumaAbonoDescuentosVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 70, -1));
        jPanel1.add(jTextFieldSumaTotalDescuentosVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 70, -1));
        jPanel1.add(jTextFieldSumaCargoDescuentosVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 70, -1));

        jLabel22.setText("TOTAL");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 570, -1, 20));
        jPanel1.add(jTextFieldSumaCargoDevolucionesVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoDevolucionesVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 260, 70, -1));
        jPanel1.add(jTextFieldSumaTotalDevolucionesVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 70, -1));

        jLabel23.setText("TOTAL");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTableCaja;
    private javax.swing.JTable jTableCompras;
    private javax.swing.JTable jTableCredito;
    private javax.swing.JTable jTableCuentasPagar;
    private javax.swing.JTable jTableDebito;
    private javax.swing.JTable jTableDescuentosCompras;
    private javax.swing.JTable jTableDescuentosVentas;
    private javax.swing.JTable jTableDevolucionesCompras;
    private javax.swing.JTable jTableDevolucionesVentas;
    private javax.swing.JTable jTableServicioConsultoria;
    private javax.swing.JTable jTableVentas;
    private javax.swing.JTextField jTextFieldSumaAbonoCompras;
    private javax.swing.JTextField jTextFieldSumaAbonoConsultoria;
    private javax.swing.JTextField jTextFieldSumaAbonoCuentasPagar;
    private javax.swing.JTextField jTextFieldSumaAbonoDebito;
    private javax.swing.JTextField jTextFieldSumaAbonoDescuentosCompras;
    private javax.swing.JTextField jTextFieldSumaAbonoDescuentosVentas;
    private javax.swing.JTextField jTextFieldSumaAbonoDevolucionesCompra;
    private javax.swing.JTextField jTextFieldSumaAbonoDevolucionesVentas;
    private javax.swing.JTextField jTextFieldSumaAbonoVentas;
    private javax.swing.JTextField jTextFieldSumaCajaAbono;
    private javax.swing.JTextField jTextFieldSumaCajaCargo;
    private javax.swing.JTextField jTextFieldSumaCargoCompras;
    private javax.swing.JTextField jTextFieldSumaCargoConsultoria;
    private javax.swing.JTextField jTextFieldSumaCargoCuentasPagar;
    private javax.swing.JTextField jTextFieldSumaCargoDebito;
    private javax.swing.JTextField jTextFieldSumaCargoDescuentosCompras;
    private javax.swing.JTextField jTextFieldSumaCargoDescuentosVentas;
    private javax.swing.JTextField jTextFieldSumaCargoDevolucionesCompra;
    private javax.swing.JTextField jTextFieldSumaCargoDevolucionesVentas;
    private javax.swing.JTextField jTextFieldSumaCargoVentas;
    private javax.swing.JTextField jTextFieldSumaIvaCreditoAbono;
    private javax.swing.JTextField jTextFieldSumaIvaCreditoCargo;
    private javax.swing.JTextField jTextFieldSumaIvaCreditoTotal;
    private javax.swing.JTextField jTextFieldSumaTotalCaja;
    private javax.swing.JTextField jTextFieldSumaTotalCompras;
    private javax.swing.JTextField jTextFieldSumaTotalConsultoria;
    private javax.swing.JTextField jTextFieldSumaTotalCuentasPagar;
    private javax.swing.JTextField jTextFieldSumaTotalDebito;
    private javax.swing.JTextField jTextFieldSumaTotalDesCompras;
    private javax.swing.JTextField jTextFieldSumaTotalDescuentosVentas;
    private javax.swing.JTextField jTextFieldSumaTotalDevolucionesCompras;
    private javax.swing.JTextField jTextFieldSumaTotalDevolucionesVentas;
    private javax.swing.JTextField jTextFieldSumaTotalVentas;
    // End of variables declaration//GEN-END:variables
}
