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
        //efectivo y equivalentes
        sumarCuentaEfectivoYEquivalentes();
        //caja
        sumarCuentaCaja();
        //banco
        sumarCuentaBanco();
        //cuenta corriente
        sumarCuentaCorriente();
        //cuentas y documentos por pagar
        sumarCuentaCuentasYDocumentosPorCobrar();
        //cuentas por cobrar
        sumarCuentaCuentasPorCobrar();
        //documentos por cobrar
        sumarCuentaDocumentosPorCobrar();
        //inventario de software
        sumarCuentaInventarioDeSoftware();

    }

    public void mostrarCuentas() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();

        //CUENTA EFECTIVO Y EQUIVALENTES DE EFECTIVO
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='1101'");
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
            jTableEfectivoYEquivalentes.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        //CUENTA CAJA
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='110101'");
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
            jTableCAJA.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        //CUENTA BANCO
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='110102'");
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
            jTableBanco.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        //CUENTA- CUENTA CORRIENTE
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='110103'");
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
            jTableCuentaCorriente.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        //CUENTA - CUENTAS Y DOCUMENTOS POR COBRAR
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='1102'");
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
            jTableCuentasYDocumentosPorCobrar.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        //CUENTA - CUENTAS POR COBRAR
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='110201'");
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
            jTableCuentasXCobrar.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        //CUENTA - DOCUMENTOS POR COBRAR
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='110202'");
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
            jTableDocumentosXCobrar.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        //CUENTA INVENTARIO DE SOFTWARE
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='1103'");
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
            jTableInventarioSoftware.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

    }

    public void sumarCuentaEfectivoYEquivalentes() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableEfectivoYEquivalentes.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoEfectivo.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoEfectivo.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            if (sumaCargo > sumaAbono) {
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe = ? WHERE codigo = '1101'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            }
            jTextFieldSumaTotalEfectivo.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sumarCuentaCaja() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableCAJA.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoCaja.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoCaja.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            if (sumaCargo > sumaAbono) {
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe = ? WHERE codigo = '110101'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            }
            jTextFieldSumaTotalCaja.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sumarCuentaBanco() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableBanco.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoBanco.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoBanco.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            if (sumaCargo > sumaAbono) {
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe = ? WHERE codigo = '110102'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            }
            jTextFieldSumaTotalBanco.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sumarCuentaCorriente() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableCuentaCorriente.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoCuentaCorriente.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoCuentaCorriente.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            if (sumaCargo > sumaAbono) {
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe = ? WHERE codigo = '110103'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            }
            jTextFieldSumaTotalCuentaCorriente.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sumarCuentaCuentasYDocumentosPorCobrar() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableCuentasYDocumentosPorCobrar.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoCuentasYDocumentos.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoCuentasYDocumentos.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            if (sumaCargo > sumaAbono) {
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe = ? WHERE codigo = '1102'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            }
            jTextFieldSumaTotalCuentasYDocumentos.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sumarCuentaCuentasPorCobrar() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableCuentasXCobrar.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoCuentasXCobrar.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoCuentasXCobrar.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            if (sumaCargo > sumaAbono) {
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe = ? WHERE codigo = '110201'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            }
            jTextFieldSumaTotalCuentasXCobrar.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sumarCuentaDocumentosPorCobrar() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableDocumentosXCobrar.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoDocumentosXCobrar.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoDocumentosXCobrar.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            if (sumaCargo > sumaAbono) {
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe = ? WHERE codigo = '110202'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            }
            jTextFieldSumaTotalDocumentosXCobrar.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }   
    }

    public void sumarCuentaInventarioDeSoftware() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableInventarioSoftware.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoInventarioSoftware.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoInventarioSoftware.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            if (sumaCargo > sumaAbono) {
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe = ? WHERE codigo = '1103'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            }
            jTextFieldSumaTotalInventarioSoftware.setText(String.valueOf(total));
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
        jTableEfectivoYEquivalentes = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCAJA = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldSumaAbonoEfectivo = new javax.swing.JTextField();
        jTextFieldSumaCargoEfectivo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldSumaTotalEfectivo = new javax.swing.JTextField();
        jTextFieldSumaCargoCaja = new javax.swing.JTextField();
        jTextFieldSumaAbonoCaja = new javax.swing.JTextField();
        jTextFieldSumaTotalCaja = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableCuentasXCobrar = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldSumaTotalGastosPagados = new javax.swing.JTextField();
        jTextFieldSumaAbonoCuentasXCobrar = new javax.swing.JTextField();
        jTextFieldSumaTotalCuentasXCobrar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableGastosPagadosXAnticipado = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldSumaCargoCuentasXCobrar = new javax.swing.JTextField();
        jTextFieldSumaCargoGastosPagados = new javax.swing.JTextField();
        jTextFieldSumaAbonoGastosPagados = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableBanco = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldSumaCargoBanco = new javax.swing.JTextField();
        jTextFieldSumaAbonoBanco = new javax.swing.JTextField();
        jTextFieldSumaTotalBanco = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableDocumentosXCobrar = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldSumaCargoDocumentosXCobrar = new javax.swing.JTextField();
        jTextFieldSumaAbonoDocumentosXCobrar = new javax.swing.JTextField();
        jTextFieldSumaTotalDocumentosXCobrar = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableInventarioSoftware = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldSumaTotalInventarioSoftware = new javax.swing.JTextField();
        jTextFieldSumaCargoInventarioSoftware = new javax.swing.JTextField();
        jTextFieldSumaAbonoInventarioSoftware = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTableSegurosPagados = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldSumaAbonoSegurosPagados = new javax.swing.JTextField();
        jTextFieldSumaTotalSegurosPagados = new javax.swing.JTextField();
        jTextFieldSumaCargoSegurosPagados = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTableServicioALquileresPagados = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldSumaAbonoAlquileresPagados = new javax.swing.JTextField();
        jTextFieldSumaTotalAlquileresPagados = new javax.swing.JTextField();
        jTextFieldSumaCargoAlquileresPagados = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTableCuentaCorriente = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTableCuentasYDocumentosPorCobrar = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        jTextFieldSumaAbonoCuentaCorriente = new javax.swing.JTextField();
        jTextFieldSumaTotalCuentaCorriente = new javax.swing.JTextField();
        jTextFieldSumaCargoCuentaCorriente = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextFieldSumaCargoCuentasYDocumentos = new javax.swing.JTextField();
        jTextFieldSumaAbonoCuentasYDocumentos = new javax.swing.JTextField();
        jTextFieldSumaTotalCuentasYDocumentos = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Activo Corriente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, -1, -1));

        jTableEfectivoYEquivalentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableEfectivoYEquivalentes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 140, 180));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel2.setText("EFECTIVO Y EQUIVALENTES DE EFECTIVO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jTableCAJA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableCAJA);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 140, 180));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel3.setText("BANCO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));
        jPanel1.add(jTextFieldSumaAbonoEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 70, -1));
        jPanel1.add(jTextFieldSumaCargoEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 70, -1));

        jLabel4.setText("TOTAL");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 290, -1, 20));
        jPanel1.add(jTextFieldSumaTotalEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 70, -1));
        jPanel1.add(jTextFieldSumaCargoCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 70, -1));
        jPanel1.add(jTextFieldSumaTotalCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 70, -1));

        jLabel6.setText("TOTAL");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, 20));

        jTableCuentasXCobrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTableCuentasXCobrar);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 80, 140, 180));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel5.setText("CAJA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));
        jPanel1.add(jTextFieldSumaTotalGastosPagados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoCuentasXCobrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 260, 70, -1));
        jPanel1.add(jTextFieldSumaTotalCuentasXCobrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, 70, -1));

        jLabel7.setText("TOTAL");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, 20));

        jTableGastosPagadosXAnticipado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jTableGastosPagadosXAnticipado);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 140, 180));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel8.setText("CUENTAS POR COBRAR");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 60, -1, -1));
        jPanel1.add(jTextFieldSumaCargoCuentasXCobrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 260, 70, -1));
        jPanel1.add(jTextFieldSumaCargoGastosPagados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoGastosPagados, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, 70, -1));

        jLabel9.setText("TOTAL");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 290, -1, 20));

        jTableBanco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(jTableBanco);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 140, 180));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel10.setText("GASTOS PAGADOS POR ANTICIPADO");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, 10));
        jPanel1.add(jTextFieldSumaCargoBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 70, -1));
        jPanel1.add(jTextFieldSumaTotalBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 70, -1));

        jLabel11.setText("TOTAL");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 290, -1, 20));

        jTableDocumentosXCobrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(jTableDocumentosXCobrar);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 80, 140, 180));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel12.setText("DOCUMENTOS POR COBRAR");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 60, -1, -1));
        jPanel1.add(jTextFieldSumaCargoDocumentosXCobrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 260, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoDocumentosXCobrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 260, 70, -1));
        jPanel1.add(jTextFieldSumaTotalDocumentosXCobrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 290, 70, -1));

        jLabel13.setText("TOTAL");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, 20));

        jTableInventarioSoftware.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(jTableInventarioSoftware);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 80, 140, 180));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel14.setText("INVENTARIO DE SOFTWARE");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 60, -1, 10));
        jPanel1.add(jTextFieldSumaTotalInventarioSoftware, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 290, 70, -1));
        jPanel1.add(jTextFieldSumaCargoInventarioSoftware, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 260, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoInventarioSoftware, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 260, 70, -1));

        jLabel15.setText("TOTAL");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 580, -1, 20));

        jTableSegurosPagados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane8.setViewportView(jTableSegurosPagados);

        jPanel1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 140, 180));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel16.setText("SEGUROS PAGADOS POR ANTICIPADO");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, -1, -1));
        jPanel1.add(jTextFieldSumaAbonoSegurosPagados, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, 70, -1));
        jPanel1.add(jTextFieldSumaTotalSegurosPagados, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 580, 70, -1));
        jPanel1.add(jTextFieldSumaCargoSegurosPagados, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, 70, -1));

        jLabel17.setText("TOTAL");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 290, -1, 20));

        jTableServicioALquileresPagados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane9.setViewportView(jTableServicioALquileresPagados);

        jPanel1.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 140, 180));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel18.setText("ALQUILERES PAGADOS POR ANTICIPADO");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));
        jPanel1.add(jTextFieldSumaAbonoAlquileresPagados, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, 70, -1));
        jPanel1.add(jTextFieldSumaTotalAlquileresPagados, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 580, 70, -1));
        jPanel1.add(jTextFieldSumaCargoAlquileresPagados, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 550, 70, -1));

        jLabel19.setText("TOTAL");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 580, -1, 20));

        jTableCuentaCorriente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane10.setViewportView(jTableCuentaCorriente);

        jPanel1.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 140, 180));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel20.setText("CUENTA CORRIENTE");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        jTableCuentasYDocumentosPorCobrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane11.setViewportView(jTableCuentasYDocumentosPorCobrar);

        jPanel1.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 140, 180));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel21.setText("CUENTAS Y DOCUMENTOS POR COBRAR");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, -1, -1));
        jPanel1.add(jTextFieldSumaAbonoCuentaCorriente, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 70, -1));
        jPanel1.add(jTextFieldSumaTotalCuentaCorriente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 70, -1));
        jPanel1.add(jTextFieldSumaCargoCuentaCorriente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 70, -1));

        jLabel22.setText("TOTAL");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 580, -1, 20));
        jPanel1.add(jTextFieldSumaCargoCuentasYDocumentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoCuentasYDocumentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 260, 70, -1));
        jPanel1.add(jTextFieldSumaTotalCuentasYDocumentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 70, -1));

        jLabel23.setText("TOTAL");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, -1, 20));

        jButton1.setBackground(new java.awt.Color(0, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("SIGUIENTE -->");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 10, 140, -1));

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
    private javax.swing.JButton jButton1;
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
    private javax.swing.JTable jTableBanco;
    private javax.swing.JTable jTableCAJA;
    private javax.swing.JTable jTableCuentaCorriente;
    private javax.swing.JTable jTableCuentasXCobrar;
    private javax.swing.JTable jTableCuentasYDocumentosPorCobrar;
    private javax.swing.JTable jTableDocumentosXCobrar;
    private javax.swing.JTable jTableEfectivoYEquivalentes;
    private javax.swing.JTable jTableGastosPagadosXAnticipado;
    private javax.swing.JTable jTableInventarioSoftware;
    private javax.swing.JTable jTableSegurosPagados;
    private javax.swing.JTable jTableServicioALquileresPagados;
    private javax.swing.JTextField jTextFieldSumaAbonoAlquileresPagados;
    private javax.swing.JTextField jTextFieldSumaAbonoBanco;
    private javax.swing.JTextField jTextFieldSumaAbonoCaja;
    private javax.swing.JTextField jTextFieldSumaAbonoCuentaCorriente;
    private javax.swing.JTextField jTextFieldSumaAbonoCuentasXCobrar;
    private javax.swing.JTextField jTextFieldSumaAbonoCuentasYDocumentos;
    private javax.swing.JTextField jTextFieldSumaAbonoDocumentosXCobrar;
    private javax.swing.JTextField jTextFieldSumaAbonoEfectivo;
    private javax.swing.JTextField jTextFieldSumaAbonoGastosPagados;
    private javax.swing.JTextField jTextFieldSumaAbonoInventarioSoftware;
    private javax.swing.JTextField jTextFieldSumaAbonoSegurosPagados;
    private javax.swing.JTextField jTextFieldSumaCargoAlquileresPagados;
    private javax.swing.JTextField jTextFieldSumaCargoBanco;
    private javax.swing.JTextField jTextFieldSumaCargoCaja;
    private javax.swing.JTextField jTextFieldSumaCargoCuentaCorriente;
    private javax.swing.JTextField jTextFieldSumaCargoCuentasXCobrar;
    private javax.swing.JTextField jTextFieldSumaCargoCuentasYDocumentos;
    private javax.swing.JTextField jTextFieldSumaCargoDocumentosXCobrar;
    private javax.swing.JTextField jTextFieldSumaCargoEfectivo;
    private javax.swing.JTextField jTextFieldSumaCargoGastosPagados;
    private javax.swing.JTextField jTextFieldSumaCargoInventarioSoftware;
    private javax.swing.JTextField jTextFieldSumaCargoSegurosPagados;
    private javax.swing.JTextField jTextFieldSumaTotalAlquileresPagados;
    private javax.swing.JTextField jTextFieldSumaTotalBanco;
    private javax.swing.JTextField jTextFieldSumaTotalCaja;
    private javax.swing.JTextField jTextFieldSumaTotalCuentaCorriente;
    private javax.swing.JTextField jTextFieldSumaTotalCuentasXCobrar;
    private javax.swing.JTextField jTextFieldSumaTotalCuentasYDocumentos;
    private javax.swing.JTextField jTextFieldSumaTotalDocumentosXCobrar;
    private javax.swing.JTextField jTextFieldSumaTotalEfectivo;
    private javax.swing.JTextField jTextFieldSumaTotalGastosPagados;
    private javax.swing.JTextField jTextFieldSumaTotalInventarioSoftware;
    private javax.swing.JTextField jTextFieldSumaTotalSegurosPagados;
    // End of variables declaration//GEN-END:variables
}
