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
public class libroMayor2 extends javax.swing.JPanel {

    /**
     * Creates new form libroMayor2
     */
    public libroMayor2() {
        initComponents();
        mostrarCuentas();
        //vacaciones
        sumarCuentaVacaciones();
        //aguinaldos
        sumarCuentaAguinaldos();
        //IVA DEBITO
        sumarCuentaDebitoIVA();
        //impuestis
        sumarCuentaImpuestos();
        //pago a cuentas
        sumarCuentaPrestamosBancarios();
        //indemnizaciones
        sumarCuentaIndemnizaciones();
        //capital contable
        sumarCuentaCapitalContable();
        //capital social
        sumarCuentaCapitalSocial();
        //utilidades acumuladas
        sumarCuentaUtilidadesAcumuladas();
        //utilidad ejercicio
        sumarCuentaUtilidadEjercicio();
        //gastos y costos
        sumarCuentaGastosYCostos();
        //compra software
        sumarCuentaCompraSoftware();
        //gastos de compras
        sumarCuentaGastoDeCompras();
        //gastos sobre compras
        sumarCuentaGastoSobreCompras();
        //descuentos sobre ventas
        sumarCuentaDescuentoSobreVenta();
        //devolucion sobre ventas
        sumarCuentaDevolucionSobreVenta();

    }

    public void mostrarCuentas() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();

        //CUENTA VACACIONES POR PAGAR A PERSONAL
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='210703'");
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
            jTableVacaciones.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        //CUENTA AGUINALDOS
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='210704'");
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
            jTableAguinaldos.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        //CUENTA debito iva- fiscal
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='2108'");
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
            jTableDebito.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        //CUENTA impuestos
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='2109'");
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
            jTableImpuestos.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        //CUENTA PRESTAMOS BANCARIOS A LARGO PLAZO
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='2201'");
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
            jTablePrestamosBancarios.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        //CUENTA INDEMNIZACIONES POR PAGAR
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='2202'");
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
            jTableIndemnizaciones.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        //CUENTA CAPITAL CONTABLE
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='31'");
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
            jTableCapitalContable.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        //CUENTA CAPITAL SOCIAL
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='3101'");
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
            jTableCapitalSocial.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        //CUENTA utilidades acumuladas
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='3102'");
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
            jTableUtilidadesAcumuladas.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        //CUENTA utilidades del ejercicio
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='3103'");
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
            jTableUtilidadEjercicio.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        //CUENTA GASTOS Y COSTOS
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='41'");
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
            jTableGastosYCostos.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        //CUENTA compras de software
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='4101'");
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
            jTableComprasSoftware.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        //CUENTA gastos de compras
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='410101'");
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
            jTableIGastosDeCompras.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        //CUENTA gastos sobre compras
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='410102'");
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
            jTableGastoSobreCompras.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        //DESCUENTOS SOBRE VENTAS
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='410103'");
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
            jTableDescuentosSobreVentas.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
        
        //DEvolucion sobre ventas
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='410104'");
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
            jTableDevolucionSobreVenyas.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

    }

    public void sumarCuentaVacaciones() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableVacaciones.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoVacaciones.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoVacaciones.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            if (sumaAbono > sumaCargo) {
                total = sumaAbono - sumaCargo;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalHaber = ? WHERE codigo = '210703'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            }
            jTextFieldSumaTotalVacaciones.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sumarCuentaAguinaldos() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableAguinaldos.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoAguinaldos.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoAguinaldos.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            if (sumaAbono > sumaCargo) {
                total = sumaAbono - sumaCargo;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalHaber = ? WHERE codigo = '210704'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            }
            jTextFieldSumaTotalAguinaldos.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sumarCuentaDebitoIVA() {
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
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            if (sumaAbono > sumaCargo) {
                total = sumaAbono - sumaCargo;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalHaber = ? WHERE codigo = '2108'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            }
            jTextFieldSumaTotalDebito.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sumarCuentaImpuestos() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableImpuestos.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoImpuestos.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoImpuestos.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            if (sumaAbono > sumaCargo) {
                total = sumaAbono - sumaCargo;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalHaber = ? WHERE codigo = '2109'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            }
            jTextFieldSumaTotalImpuestos.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sumarCuentaPrestamosBancarios() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTablePrestamosBancarios.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoPrestamosBancarios.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoPrestamosBancarios.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            if (sumaAbono > sumaCargo) {
                total = sumaAbono - sumaCargo;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalHaber = ? WHERE codigo = '2201'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            }
            jTextFieldSumaTotalPrestamosBancarios.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sumarCuentaIndemnizaciones() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableIndemnizaciones.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoIndemnizaciones.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoIndemnizaciones.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            if (sumaAbono > sumaCargo) {
                total = sumaAbono - sumaCargo;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalHaber = ? WHERE codigo = '2202'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            }
            jTextFieldSumaTotalIndemnizaciones.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sumarCuentaCapitalContable() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableCapitalContable.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoCapitalContable.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoCapitalContable.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            if (sumaAbono > sumaCargo) {
                total = sumaAbono - sumaCargo;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalHaber = ? WHERE codigo = '31'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            }
            jTextFieldSumaTotalCapitalContable.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sumarCuentaCapitalSocial() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableCapitalSocial.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoCapitalSocial.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoCapitalSocial.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            if (sumaAbono > sumaCargo) {
                total = sumaAbono - sumaCargo;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalHaber = ? WHERE codigo = '3101'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            }
            jTextFieldSumaTotalCapitalSocial.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sumarCuentaUtilidadesAcumuladas() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableUtilidadesAcumuladas.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoUtilidadesAcumuladas.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoUtilidadesAcumuladas.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            if (sumaAbono > sumaCargo) {
                total = sumaAbono - sumaCargo;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalHaber = ? WHERE codigo = '3102'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            }
            jTextFieldSumaTotalUtilidadesAcumuladas.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sumarCuentaUtilidadEjercicio() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableUtilidadEjercicio.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoUtilidadEjercicio.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoUtilidadEjercicio.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            if (sumaAbono > sumaCargo) {
                total = sumaAbono - sumaCargo;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalHaber = ? WHERE codigo = '3103'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            }
            jTextFieldSumaTotalUtilidadEjercicio.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sumarCuentaGastosYCostos() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableGastosYCostos.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoGastosYCostos.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoGastosYCostos.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            if (sumaCargo > sumaAbono) {
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe = ? WHERE codigo = '41'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            }
            jTextFieldSumaTotalGastosYCostos.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sumarCuentaCompraSoftware() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableComprasSoftware.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoCompraSoftware.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoCompraSoftware.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            if (sumaCargo > sumaAbono) {
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe = ? WHERE codigo = '4101'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            }
            jTextFieldSumaTotalCompraSoftware.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sumarCuentaGastoDeCompras() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableIGastosDeCompras.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoGastosDeCompras.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoGastosDeCompras.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            if (sumaCargo > sumaAbono) {
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe = ? WHERE codigo = '410101'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            }
            jTextFieldSumaTotalGastosDeCompras.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sumarCuentaGastoSobreCompras() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableGastoSobreCompras.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoGastoSobreCompras.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoGastoSobreCompras.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            if (sumaCargo > sumaAbono) {
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe = ? WHERE codigo = '410102'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            }
            jTextFieldSumaTotalGastoSobreCompras.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
       public void sumarCuentaDescuentoSobreVenta() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableDescuentosSobreVentas.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoDescuentoSobreVentas.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoDescuentoSobreVentas.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            if (sumaCargo > sumaAbono) {
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe = ? WHERE codigo = '410103'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            }
            jTextFieldSumaTotalDescuentoSobreVentas.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
       
        public void sumarCuentaDevolucionSobreVenta() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableDevolucionSobreVenyas.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoDevolucionSobreVentas.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoDevolucionSobreVentas.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            if (sumaCargo > sumaAbono) {
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe = ? WHERE codigo = '410104'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            }
            jTextFieldSumaTotalDevolucionSobreVentas.setText(String.valueOf(total));
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
        jTableVacaciones = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAguinaldos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldSumaAbonoVacaciones = new javax.swing.JTextField();
        jTextFieldSumaCargoVacaciones = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldSumaTotalVacaciones = new javax.swing.JTextField();
        jTextFieldSumaCargoAguinaldos = new javax.swing.JTextField();
        jTextFieldSumaAbonoAguinaldos = new javax.swing.JTextField();
        jTextFieldSumaTotalAguinaldos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableIndemnizaciones = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldSumaAbonoIndemnizaciones = new javax.swing.JTextField();
        jTextFieldSumaTotalIndemnizaciones = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldSumaCargoIndemnizaciones = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableDebito = new javax.swing.JTable();
        jTextFieldSumaCargoDebito = new javax.swing.JTextField();
        jTextFieldSumaAbonoDebito = new javax.swing.JTextField();
        jTextFieldSumaTotalDebito = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableCapitalContable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldSumaCargoCapitalContable = new javax.swing.JTextField();
        jTextFieldSumaAbonoCapitalContable = new javax.swing.JTextField();
        jTextFieldSumaTotalCapitalContable = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTableImpuestos = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTablePrestamosBancarios = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        jTextFieldSumaAbonoImpuestos = new javax.swing.JTextField();
        jTextFieldSumaTotalImpuestos = new javax.swing.JTextField();
        jTextFieldSumaCargoImpuestos = new javax.swing.JTextField();
        jTextFieldSumaCargoPrestamosBancarios = new javax.swing.JTextField();
        jTextFieldSumaAbonoPrestamosBancarios = new javax.swing.JTextField();
        jTextFieldSumaTotalPrestamosBancarios = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableCapitalSocial = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableUtilidadesAcumuladas = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTableUtilidadEjercicio = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTableGastosYCostos = new javax.swing.JTable();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTableComprasSoftware = new javax.swing.JTable();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTableDevolucionSobreVenyas = new javax.swing.JTable();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTableDescuentosSobreVentas = new javax.swing.JTable();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTableIGastosDeCompras = new javax.swing.JTable();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTableGastoSobreCompras = new javax.swing.JTable();
        jTextFieldSumaAbonoCapitalSocial = new javax.swing.JTextField();
        jTextFieldSumaTotalCapitalSocial = new javax.swing.JTextField();
        jTextFieldSumaCargoUtilidadesAcumuladas = new javax.swing.JTextField();
        jTextFieldSumaCargoCapitalSocial = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldSumaTotalGastoSobreCompras = new javax.swing.JTextField();
        jTextFieldSumaAbonoUtilidadesAcumuladas = new javax.swing.JTextField();
        jTextFieldSumaTotalUtilidadesAcumuladas = new javax.swing.JTextField();
        jTextFieldSumaCargoUtilidadEjercicio = new javax.swing.JTextField();
        jTextFieldSumaAbonoUtilidadEjercicio = new javax.swing.JTextField();
        jTextFieldSumaTotalUtilidadEjercicio = new javax.swing.JTextField();
        jTextFieldSumaCargoCompraSoftware = new javax.swing.JTextField();
        jTextFieldSumaAbonoCompraSoftware = new javax.swing.JTextField();
        jTextFieldSumaTotalCompraSoftware = new javax.swing.JTextField();
        jTextFieldSumaCargoGastosYCostos = new javax.swing.JTextField();
        jTextFieldSumaAbonoGastosYCostos = new javax.swing.JTextField();
        jTextFieldSumaTotalGastosYCostos = new javax.swing.JTextField();
        jTextFieldSumaCargoGastosDeCompras = new javax.swing.JTextField();
        jTextFieldSumaAbonoGastosDeCompras = new javax.swing.JTextField();
        jTextFieldSumaTotalGastosDeCompras = new javax.swing.JTextField();
        jTextFieldSumaCargoDescuentoSobreVentas = new javax.swing.JTextField();
        jTextFieldSumaAbonoDescuentoSobreVentas = new javax.swing.JTextField();
        jTextFieldSumaTotalDescuentoSobreVentas = new javax.swing.JTextField();
        jTextFieldSumaCargoDevolucionSobreVentas = new javax.swing.JTextField();
        jTextFieldSumaAbonoDevolucionSobreVentas = new javax.swing.JTextField();
        jTextFieldSumaTotalDevolucionSobreVentas = new javax.swing.JTextField();
        jTextFieldSumaCargoGastoSobreCompras = new javax.swing.JTextField();
        jTextFieldSumaAbonoGastoSobreCompras = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1280, 680));

        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 680));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Pagina 3");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

        jTableVacaciones.setBackground(new java.awt.Color(255, 153, 153));
        jTableVacaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableVacaciones);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 140, 180));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel2.setText("GASTOS SOBRE COMPRAS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 350, -1, 10));

        jScrollPane2.setBackground(new java.awt.Color(255, 153, 153));

        jTableAguinaldos.setBackground(new java.awt.Color(255, 153, 153));
        jTableAguinaldos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableAguinaldos);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 140, 180));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel3.setText("DEBITO FISCAL - IVA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));
        jPanel1.add(jTextFieldSumaAbonoVacaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 70, -1));
        jPanel1.add(jTextFieldSumaCargoVacaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 70, -1));

        jLabel4.setText("TOTAL");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 290, -1, 20));
        jPanel1.add(jTextFieldSumaTotalVacaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 70, -1));
        jPanel1.add(jTextFieldSumaCargoAguinaldos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoAguinaldos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 70, -1));
        jPanel1.add(jTextFieldSumaTotalAguinaldos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 70, -1));

        jLabel6.setText("TOTAL");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, 20));

        jTableIndemnizaciones.setBackground(new java.awt.Color(255, 204, 204));
        jTableIndemnizaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTableIndemnizaciones);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 80, 140, 180));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel5.setText("AGUINALDOS POR PAGAR A PERSONAL");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));
        jPanel1.add(jTextFieldSumaAbonoIndemnizaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 260, 70, -1));
        jPanel1.add(jTextFieldSumaTotalIndemnizaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 290, 70, -1));

        jLabel7.setText("TOTAL");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel8.setText("INDEMNIZACIONES POR PAGAR");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 60, -1, 10));
        jPanel1.add(jTextFieldSumaCargoIndemnizaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 260, 70, -1));

        jLabel9.setText("TOTAL");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 290, -1, 20));

        jTableDebito.setBackground(new java.awt.Color(255, 153, 153));
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
        jScrollPane5.setViewportView(jTableDebito);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 140, 180));
        jPanel1.add(jTextFieldSumaCargoDebito, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoDebito, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 70, -1));
        jPanel1.add(jTextFieldSumaTotalDebito, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 70, -1));

        jTableCapitalContable.setBackground(new java.awt.Color(153, 255, 153));
        jTableCapitalContable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(jTableCapitalContable);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 80, 140, 180));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel12.setText("CAPITAL SOCIAL");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 60, -1, -1));
        jPanel1.add(jTextFieldSumaCargoCapitalContable, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 260, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoCapitalContable, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 260, 70, -1));
        jPanel1.add(jTextFieldSumaTotalCapitalContable, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 290, 70, -1));

        jLabel13.setText("TOTAL");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 580, -1, 20));

        jLabel17.setText("TOTAL");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, -1, 20));

        jTableImpuestos.setBackground(new java.awt.Color(255, 153, 153));
        jTableImpuestos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane10.setViewportView(jTableImpuestos);

        jPanel1.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 140, 180));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel20.setText("IMPUESTOS MUNICIPALES");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

        jTablePrestamosBancarios.setBackground(new java.awt.Color(255, 204, 204));
        jTablePrestamosBancarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane11.setViewportView(jTablePrestamosBancarios);

        jPanel1.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 140, 180));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel21.setText("PRESTAMOS BANCARIOS A LARGO PLAZO");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, -1, -1));
        jPanel1.add(jTextFieldSumaAbonoImpuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 70, -1));
        jPanel1.add(jTextFieldSumaTotalImpuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 70, -1));
        jPanel1.add(jTextFieldSumaCargoImpuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 70, -1));
        jPanel1.add(jTextFieldSumaCargoPrestamosBancarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoPrestamosBancarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 260, 70, -1));
        jPanel1.add(jTextFieldSumaTotalPrestamosBancarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, 70, -1));

        jLabel23.setText("TOTAL");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, -1, 20));

        jTableCapitalSocial.setBackground(new java.awt.Color(153, 255, 153));
        jTableCapitalSocial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jTableCapitalSocial);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 80, 140, 180));

        jTableUtilidadesAcumuladas.setBackground(new java.awt.Color(153, 255, 153));
        jTableUtilidadesAcumuladas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(jTableUtilidadesAcumuladas);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 140, 180));

        jTableUtilidadEjercicio.setBackground(new java.awt.Color(153, 255, 153));
        jTableUtilidadEjercicio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane8.setViewportView(jTableUtilidadEjercicio);

        jPanel1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 140, 180));

        jTableGastosYCostos.setBackground(new java.awt.Color(255, 255, 153));
        jTableGastosYCostos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane9.setViewportView(jTableGastosYCostos);

        jPanel1.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 140, 180));

        jTableComprasSoftware.setBackground(new java.awt.Color(255, 255, 153));
        jTableComprasSoftware.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane12.setViewportView(jTableComprasSoftware);

        jPanel1.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 140, 180));

        jTableDevolucionSobreVenyas.setBackground(new java.awt.Color(255, 255, 153));
        jTableDevolucionSobreVenyas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane13.setViewportView(jTableDevolucionSobreVenyas);

        jPanel1.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 370, 140, 180));

        jTableDescuentosSobreVentas.setBackground(new java.awt.Color(255, 255, 153));
        jTableDescuentosSobreVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane14.setViewportView(jTableDescuentosSobreVentas);

        jPanel1.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 370, 140, 180));

        jTableIGastosDeCompras.setBackground(new java.awt.Color(255, 255, 153));
        jTableIGastosDeCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane15.setViewportView(jTableIGastosDeCompras);

        jPanel1.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 140, 180));

        jTableGastoSobreCompras.setBackground(new java.awt.Color(255, 255, 153));
        jTableGastoSobreCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane16.setViewportView(jTableGastoSobreCompras);

        jPanel1.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 370, 140, 180));
        jPanel1.add(jTextFieldSumaAbonoCapitalSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 260, 70, -1));
        jPanel1.add(jTextFieldSumaTotalCapitalSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 290, 70, -1));
        jPanel1.add(jTextFieldSumaCargoUtilidadesAcumuladas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 70, -1));
        jPanel1.add(jTextFieldSumaCargoCapitalSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 260, 70, -1));

        jLabel10.setText("TOTAL");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 290, -1, 20));
        jPanel1.add(jTextFieldSumaTotalGastoSobreCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 580, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoUtilidadesAcumuladas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, 70, -1));
        jPanel1.add(jTextFieldSumaTotalUtilidadesAcumuladas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 580, 70, -1));
        jPanel1.add(jTextFieldSumaCargoUtilidadEjercicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 550, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoUtilidadEjercicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, 70, -1));
        jPanel1.add(jTextFieldSumaTotalUtilidadEjercicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 580, 70, -1));
        jPanel1.add(jTextFieldSumaCargoCompraSoftware, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 550, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoCompraSoftware, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 550, 70, -1));
        jPanel1.add(jTextFieldSumaTotalCompraSoftware, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 580, 70, -1));
        jPanel1.add(jTextFieldSumaCargoGastosYCostos, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoGastosYCostos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, 70, -1));
        jPanel1.add(jTextFieldSumaTotalGastosYCostos, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 580, 70, -1));
        jPanel1.add(jTextFieldSumaCargoGastosDeCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 550, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoGastosDeCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 550, 70, -1));
        jPanel1.add(jTextFieldSumaTotalGastosDeCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 580, 70, -1));
        jPanel1.add(jTextFieldSumaCargoDescuentoSobreVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 550, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoDescuentoSobreVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 550, 70, -1));
        jPanel1.add(jTextFieldSumaTotalDescuentoSobreVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 580, 70, -1));
        jPanel1.add(jTextFieldSumaCargoDevolucionSobreVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 550, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoDevolucionSobreVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 550, 70, -1));
        jPanel1.add(jTextFieldSumaTotalDevolucionSobreVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 580, 70, -1));
        jPanel1.add(jTextFieldSumaCargoGastoSobreCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 550, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoGastoSobreCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 550, 70, -1));

        jLabel14.setText("TOTAL");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, -1, 20));

        jLabel15.setText("TOTAL");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, -1, 20));

        jLabel16.setText("TOTAL");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, -1, 20));

        jLabel18.setText("TOTAL");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 580, -1, 20));

        jLabel19.setText("TOTAL");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 580, -1, 20));

        jLabel22.setText("TOTAL");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 580, -1, 20));

        jLabel24.setText("TOTAL");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 580, -1, 20));

        jLabel25.setText("TOTAL");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 580, -1, 20));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 50, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel26.setText("CAPITAL CONTABLE");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 60, -1, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel27.setText("VACIONES POR PAGAR A PERSONAL");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel28.setText("UTILIDADES ACUMULADAS");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel29.setText("UTILIDAD DEL EJERCICIO");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel30.setText("GASTOS Y COSTOS");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, -1, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel31.setText("COMPRAS DE SOFTWARE Y SERVICIOS");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, -1, 10));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel32.setText("GASTOS DE COMPRAS");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, -1, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel33.setText("DESCUENTOS SOBRE VENTAS");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 350, -1, -1));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel34.setText("DEVOLUCION SOBRE VENTAS");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 350, -1, 10));

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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
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
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTableAguinaldos;
    private javax.swing.JTable jTableCapitalContable;
    private javax.swing.JTable jTableCapitalSocial;
    private javax.swing.JTable jTableComprasSoftware;
    private javax.swing.JTable jTableDebito;
    private javax.swing.JTable jTableDescuentosSobreVentas;
    private javax.swing.JTable jTableDevolucionSobreVenyas;
    private javax.swing.JTable jTableGastoSobreCompras;
    private javax.swing.JTable jTableGastosYCostos;
    private javax.swing.JTable jTableIGastosDeCompras;
    private javax.swing.JTable jTableImpuestos;
    private javax.swing.JTable jTableIndemnizaciones;
    private javax.swing.JTable jTablePrestamosBancarios;
    private javax.swing.JTable jTableUtilidadEjercicio;
    private javax.swing.JTable jTableUtilidadesAcumuladas;
    private javax.swing.JTable jTableVacaciones;
    private javax.swing.JTextField jTextFieldSumaAbonoAguinaldos;
    private javax.swing.JTextField jTextFieldSumaAbonoCapitalContable;
    private javax.swing.JTextField jTextFieldSumaAbonoCapitalSocial;
    private javax.swing.JTextField jTextFieldSumaAbonoCompraSoftware;
    private javax.swing.JTextField jTextFieldSumaAbonoDebito;
    private javax.swing.JTextField jTextFieldSumaAbonoDescuentoSobreVentas;
    private javax.swing.JTextField jTextFieldSumaAbonoDevolucionSobreVentas;
    private javax.swing.JTextField jTextFieldSumaAbonoGastoSobreCompras;
    private javax.swing.JTextField jTextFieldSumaAbonoGastosDeCompras;
    private javax.swing.JTextField jTextFieldSumaAbonoGastosYCostos;
    private javax.swing.JTextField jTextFieldSumaAbonoImpuestos;
    private javax.swing.JTextField jTextFieldSumaAbonoIndemnizaciones;
    private javax.swing.JTextField jTextFieldSumaAbonoPrestamosBancarios;
    private javax.swing.JTextField jTextFieldSumaAbonoUtilidadEjercicio;
    private javax.swing.JTextField jTextFieldSumaAbonoUtilidadesAcumuladas;
    private javax.swing.JTextField jTextFieldSumaAbonoVacaciones;
    private javax.swing.JTextField jTextFieldSumaCargoAguinaldos;
    private javax.swing.JTextField jTextFieldSumaCargoCapitalContable;
    private javax.swing.JTextField jTextFieldSumaCargoCapitalSocial;
    private javax.swing.JTextField jTextFieldSumaCargoCompraSoftware;
    private javax.swing.JTextField jTextFieldSumaCargoDebito;
    private javax.swing.JTextField jTextFieldSumaCargoDescuentoSobreVentas;
    private javax.swing.JTextField jTextFieldSumaCargoDevolucionSobreVentas;
    private javax.swing.JTextField jTextFieldSumaCargoGastoSobreCompras;
    private javax.swing.JTextField jTextFieldSumaCargoGastosDeCompras;
    private javax.swing.JTextField jTextFieldSumaCargoGastosYCostos;
    private javax.swing.JTextField jTextFieldSumaCargoImpuestos;
    private javax.swing.JTextField jTextFieldSumaCargoIndemnizaciones;
    private javax.swing.JTextField jTextFieldSumaCargoPrestamosBancarios;
    private javax.swing.JTextField jTextFieldSumaCargoUtilidadEjercicio;
    private javax.swing.JTextField jTextFieldSumaCargoUtilidadesAcumuladas;
    private javax.swing.JTextField jTextFieldSumaCargoVacaciones;
    private javax.swing.JTextField jTextFieldSumaTotalAguinaldos;
    private javax.swing.JTextField jTextFieldSumaTotalCapitalContable;
    private javax.swing.JTextField jTextFieldSumaTotalCapitalSocial;
    private javax.swing.JTextField jTextFieldSumaTotalCompraSoftware;
    private javax.swing.JTextField jTextFieldSumaTotalDebito;
    private javax.swing.JTextField jTextFieldSumaTotalDescuentoSobreVentas;
    private javax.swing.JTextField jTextFieldSumaTotalDevolucionSobreVentas;
    private javax.swing.JTextField jTextFieldSumaTotalGastoSobreCompras;
    private javax.swing.JTextField jTextFieldSumaTotalGastosDeCompras;
    private javax.swing.JTextField jTextFieldSumaTotalGastosYCostos;
    private javax.swing.JTextField jTextFieldSumaTotalImpuestos;
    private javax.swing.JTextField jTextFieldSumaTotalIndemnizaciones;
    private javax.swing.JTextField jTextFieldSumaTotalPrestamosBancarios;
    private javax.swing.JTextField jTextFieldSumaTotalUtilidadEjercicio;
    private javax.swing.JTextField jTextFieldSumaTotalUtilidadesAcumuladas;
    private javax.swing.JTextField jTextFieldSumaTotalVacaciones;
    // End of variables declaration//GEN-END:variables
}
