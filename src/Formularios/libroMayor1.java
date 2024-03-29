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
public class libroMayor1 extends javax.swing.JPanel {

    /**
     * Creates new form libroMayor1
     */
    public libroMayor1() {
        initComponents();
        mostrarCuentas();
        //credito iva
        sumarCuentaCreditoIVA();
        //propiedades
        sumarCuentaPropiedades();
        //edificio
        sumarCuentaEdificio();
        //equipo computo
        sumarCuentaEquipoComputo();
        //mobiliario
        sumarCuentaMobiliario();
        //intangibles
        sumarCuentaIntangibles();
        //marcas
        sumarCuentaMarcas();
        //prestamos
        sumarCuentaPrestamos();
        //CUENTAS x pagar
        sumarCuentasXPagar();
        //documentos x pagar
        sumarCuentasDocumentos();
        //alquileres
        sumarCuentasAlquileres();
        //retenciones x pagar
        sumarCuentasRetenciones();
        //ISSS
        sumarCuentasISSS();
        //AFP
        sumarCuentasAFP();
        //planillas
        sumarCuentasPlanillas();
        //comisiones
        sumarCuentasComisiones();
    }
    public void mostrarCuentas(){
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();

        //CUENTA CREDITO IVA FISCAL
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='1105'");
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
            jTableCreditoIVA.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
         //CUENTA PROPIEDADES PLANTAS Y EQUIPOS
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='1201'");
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
            jTablePropiedades.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
         //CUENTA EDIFICIO
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='120101'");
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
            jTableEdificio.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
        //CUENTA EQUIPO DE COMPUTO
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='120102'");
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
            jTableEquipoComputo.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
         //CUENTA MOBILIARIO Y EQUIPO DE OFICINA
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='120103'");
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
            jTableMobiliario.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
        //CUENTA INTANGIBLES
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='1202'");
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
            jTableIntangibles.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
         //CUENTA MARCAS Y PATENTES
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='120201'");
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
            jTableMarcas.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
        //CUENTA prestamos y giros bancarios
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='2101'");
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
            jTablePrestamos.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
        //CUENTA CUENTAS X PAGAR
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='2102'");
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
            jTableCuentasXPagar.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
        //CUENTA documentos x pagar
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='2103'");
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
            jTableDocumentos.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
            //CUENTA alquileres
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='2104'");
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
            jTableAlquileres.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
        //CUENTA retenciones x pagar
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='2105'");
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
            jTableRetenciones.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
        //CUENTA retenciones ISSS
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='210501'");
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
            jTableISSS.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
        //CUENTA retenciones AFP
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='210502'");
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
            jTableAFP.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
            //CUENTA PLANILLAS POR PAGAR
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='2107'");
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
            jTablePlanillas.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
         //CUENTA comisiones
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='210701'");
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
            jTableComisiones.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
    }
    
     public void sumarCuentaCreditoIVA() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableCreditoIVA.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoCreditoIVA.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoCreditoIVA.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe = ? WHERE codigo = '1105'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            
            jTextFieldSumaTotalCreditoIVA.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void sumarCuentaPropiedades() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTablePropiedades.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoPropiedades.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoPropiedades.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe = ? WHERE codigo = '1201'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            
            jTextFieldSumaTotalPropiedades.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void sumarCuentaEdificio() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableEdificio.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoEdificio.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoEdificio.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe = ? WHERE codigo = '120101'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            
            jTextFieldSumaTotalEdificio.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
      public void sumarCuentaEquipoComputo() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableEquipoComputo.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoEquipoComputo.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoEquipoComputo.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe = ? WHERE codigo = '120102'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            
            jTextFieldSumaTotalEquipoComputo.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
     public void sumarCuentaMobiliario() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableMobiliario.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoMobiliario.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoMobiliario.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe = ? WHERE codigo = '120103'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            
            jTextFieldSumaTotalMobiliario.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void sumarCuentaIntangibles() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableIntangibles.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoIntangibles.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonontangibles.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe = ? WHERE codigo = '1202'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            
            jTextFieldSumaTotalIntangibles.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void sumarCuentaMarcas() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableMarcas.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoMarcas.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoMarcas.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe = ? WHERE codigo = '120201'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            
            jTextFieldSumaTotalMarcas.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void sumarCuentaPrestamos() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTablePrestamos.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoPrestamos.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoPrestamos.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            
                total = sumaAbono - sumaCargo;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalHaber = ? WHERE codigo = '2101'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            
            jTextFieldSumaTotalPrestamos.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
      public void sumarCuentasXPagar() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableCuentasXPagar.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoCuentas.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoCuentas.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            
                total = sumaAbono - sumaCargo;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalHaber = ? WHERE codigo = '2102'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            
            jTextFieldSumaTotalCuentas.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void sumarCuentasDocumentos() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableDocumentos.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoDocumentos.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoDocumentos.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            
                total = sumaAbono - sumaCargo;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalHaber = ? WHERE codigo = '2103'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            
            jTextFieldSumaTotalDocumentos.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void sumarCuentasAlquileres() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableAlquileres.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoAlquileres.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoAlquileres.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            
                total = sumaAbono - sumaCargo;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalHaber = ? WHERE codigo = '2104'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            
            jTextFieldSumaTotalAlquileres.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void sumarCuentasRetenciones() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableRetenciones.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoRetenciones.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoRetenciones.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            
                total = sumaAbono - sumaCargo;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalHaber = ? WHERE codigo = '2105'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            
            jTextFieldSumaTotalRetenciones.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void sumarCuentasISSS() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableISSS.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoISSS.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoISSS.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            
                total = sumaAbono - sumaCargo;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalHaber = ? WHERE codigo = '210501'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            
            jTextFieldSumaTotalISSS.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
        public void sumarCuentasAFP() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableAFP.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoAFP.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoAFP.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            
                total = sumaAbono - sumaCargo;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalHaber = ? WHERE codigo = '210502'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            
            jTextFieldSumaTotalAFP.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
        public void sumarCuentasPlanillas() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTablePlanillas.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoPlanillas.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoPlanillas.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
           
                total = sumaAbono - sumaCargo;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalHaber = ? WHERE codigo = '2107'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            
            jTextFieldSumaTotalPlanillas.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
         public void sumarCuentasComisiones() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableComisiones.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoComisiones.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoComisiones.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            
                total = sumaAbono - sumaCargo;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalHaber = ? WHERE codigo = '210701'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            
            jTextFieldSumaTotalComisiones.setText(String.valueOf(total));
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
        jTableCreditoIVA = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePropiedades = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldSumaAbonoCreditoIVA = new javax.swing.JTextField();
        jTextFieldSumaCargoCreditoIVA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldSumaTotalCreditoIVA = new javax.swing.JTextField();
        jTextFieldSumaCargoPropiedades = new javax.swing.JTextField();
        jTextFieldSumaAbonoPropiedades = new javax.swing.JTextField();
        jTextFieldSumaTotalPropiedades = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableIntangibles = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldSumaAbonontangibles = new javax.swing.JTextField();
        jTextFieldSumaTotalIntangibles = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldSumaCargoIntangibles = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableEdificio = new javax.swing.JTable();
        jTextFieldSumaCargoEdificio = new javax.swing.JTextField();
        jTextFieldSumaAbonoEdificio = new javax.swing.JTextField();
        jTextFieldSumaTotalEdificio = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableMarcas = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldSumaCargoMarcas = new javax.swing.JTextField();
        jTextFieldSumaAbonoMarcas = new javax.swing.JTextField();
        jTextFieldSumaTotalMarcas = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTableEquipoComputo = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTableMobiliario = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        jTextFieldSumaAbonoEquipoComputo = new javax.swing.JTextField();
        jTextFieldSumaTotalEquipoComputo = new javax.swing.JTextField();
        jTextFieldSumaCargoEquipoComputo = new javax.swing.JTextField();
        jTextFieldSumaCargoMobiliario = new javax.swing.JTextField();
        jTextFieldSumaAbonoMobiliario = new javax.swing.JTextField();
        jTextFieldSumaTotalMobiliario = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTablePrestamos = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableCuentasXPagar = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTableDocumentos = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTableAlquileres = new javax.swing.JTable();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTableRetenciones = new javax.swing.JTable();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTablePlanillas = new javax.swing.JTable();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTableAFP = new javax.swing.JTable();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTableISSS = new javax.swing.JTable();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTableComisiones = new javax.swing.JTable();
        jTextFieldSumaAbonoPrestamos = new javax.swing.JTextField();
        jTextFieldSumaTotalPrestamos = new javax.swing.JTextField();
        jTextFieldSumaCargoCuentas = new javax.swing.JTextField();
        jTextFieldSumaCargoPrestamos = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldSumaTotalComisiones = new javax.swing.JTextField();
        jTextFieldSumaAbonoCuentas = new javax.swing.JTextField();
        jTextFieldSumaTotalCuentas = new javax.swing.JTextField();
        jTextFieldSumaCargoDocumentos = new javax.swing.JTextField();
        jTextFieldSumaAbonoDocumentos = new javax.swing.JTextField();
        jTextFieldSumaTotalDocumentos = new javax.swing.JTextField();
        jTextFieldSumaCargoRetenciones = new javax.swing.JTextField();
        jTextFieldSumaAbonoRetenciones = new javax.swing.JTextField();
        jTextFieldSumaTotalRetenciones = new javax.swing.JTextField();
        jTextFieldSumaCargoAlquileres = new javax.swing.JTextField();
        jTextFieldSumaAbonoAlquileres = new javax.swing.JTextField();
        jTextFieldSumaTotalAlquileres = new javax.swing.JTextField();
        jTextFieldSumaCargoISSS = new javax.swing.JTextField();
        jTextFieldSumaAbonoISSS = new javax.swing.JTextField();
        jTextFieldSumaTotalISSS = new javax.swing.JTextField();
        jTextFieldSumaCargoAFP = new javax.swing.JTextField();
        jTextFieldSumaAbonoAFP = new javax.swing.JTextField();
        jTextFieldSumaTotalAFP = new javax.swing.JTextField();
        jTextFieldSumaCargoPlanillas = new javax.swing.JTextField();
        jTextFieldSumaAbonoPlanillas = new javax.swing.JTextField();
        jTextFieldSumaTotalPlanillas = new javax.swing.JTextField();
        jTextFieldSumaCargoComisiones = new javax.swing.JTextField();
        jTextFieldSumaAbonoComisiones = new javax.swing.JTextField();
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

        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 680));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Pagina 2");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

        jTableCreditoIVA.setBackground(new java.awt.Color(153, 255, 255));
        jTableCreditoIVA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableCreditoIVA);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 140, 180));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel2.setText("COMISIONES POR PAGAR A PERSONAL");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 350, -1, 10));

        jTablePropiedades.setBackground(new java.awt.Color(204, 255, 255));
        jTablePropiedades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTablePropiedades);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 140, 180));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel3.setText("EDIFICIO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));
        jPanel1.add(jTextFieldSumaAbonoCreditoIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 70, -1));
        jPanel1.add(jTextFieldSumaCargoCreditoIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 70, -1));

        jLabel4.setText("TOTAL");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 290, -1, 20));
        jPanel1.add(jTextFieldSumaTotalCreditoIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 70, -1));
        jPanel1.add(jTextFieldSumaCargoPropiedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoPropiedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 70, -1));
        jPanel1.add(jTextFieldSumaTotalPropiedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 70, -1));

        jLabel6.setText("TOTAL");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, 20));

        jTableIntangibles.setBackground(new java.awt.Color(204, 255, 255));
        jTableIntangibles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTableIntangibles);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 80, 140, 180));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel5.setText("PROPIEDADES,PLANTAS Y EQUIPOS");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));
        jPanel1.add(jTextFieldSumaAbonontangibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 260, 70, -1));
        jPanel1.add(jTextFieldSumaTotalIntangibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, 70, -1));

        jLabel7.setText("TOTAL");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel8.setText("INTANGIBLES");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 60, -1, 10));
        jPanel1.add(jTextFieldSumaCargoIntangibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 260, 70, -1));

        jLabel9.setText("TOTAL");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 290, -1, 20));

        jTableEdificio.setBackground(new java.awt.Color(204, 255, 255));
        jTableEdificio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(jTableEdificio);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 140, 180));
        jPanel1.add(jTextFieldSumaCargoEdificio, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoEdificio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 70, -1));
        jPanel1.add(jTextFieldSumaTotalEdificio, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 70, -1));

        jTableMarcas.setBackground(new java.awt.Color(204, 255, 255));
        jTableMarcas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(jTableMarcas);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 80, 140, 180));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel12.setText("PRESTAMOS Y SOBREGIROS BANCARIOS ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 60, -1, -1));
        jPanel1.add(jTextFieldSumaCargoMarcas, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 260, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoMarcas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 260, 70, -1));
        jPanel1.add(jTextFieldSumaTotalMarcas, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 290, 70, -1));

        jLabel13.setText("TOTAL");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 580, -1, 20));

        jLabel17.setText("TOTAL");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 290, -1, 20));

        jTableEquipoComputo.setBackground(new java.awt.Color(204, 255, 255));
        jTableEquipoComputo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane10.setViewportView(jTableEquipoComputo);

        jPanel1.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 140, 180));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel20.setText("EQUIPO DE COMPUTO");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        jTableMobiliario.setBackground(new java.awt.Color(204, 255, 255));
        jTableMobiliario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane11.setViewportView(jTableMobiliario);

        jPanel1.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 140, 180));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel21.setText("MOBILIARIO Y EQUIPO DE OFICINA");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, -1, -1));
        jPanel1.add(jTextFieldSumaAbonoEquipoComputo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 70, -1));
        jPanel1.add(jTextFieldSumaTotalEquipoComputo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 70, -1));
        jPanel1.add(jTextFieldSumaCargoEquipoComputo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 70, -1));
        jPanel1.add(jTextFieldSumaCargoMobiliario, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoMobiliario, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 260, 70, -1));
        jPanel1.add(jTextFieldSumaTotalMobiliario, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 70, -1));

        jLabel23.setText("TOTAL");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, -1, 20));

        jTablePrestamos.setBackground(new java.awt.Color(255, 153, 153));
        jTablePrestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jTablePrestamos);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 80, 140, 180));

        jTableCuentasXPagar.setBackground(new java.awt.Color(255, 153, 153));
        jTableCuentasXPagar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(jTableCuentasXPagar);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 140, 180));

        jTableDocumentos.setBackground(new java.awt.Color(255, 153, 153));
        jTableDocumentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane8.setViewportView(jTableDocumentos);

        jPanel1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 140, 180));

        jTableAlquileres.setBackground(new java.awt.Color(255, 153, 153));
        jTableAlquileres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane9.setViewportView(jTableAlquileres);

        jPanel1.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 140, 180));

        jTableRetenciones.setBackground(new java.awt.Color(255, 153, 153));
        jTableRetenciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane12.setViewportView(jTableRetenciones);

        jPanel1.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 140, 180));

        jTablePlanillas.setBackground(new java.awt.Color(255, 153, 153));
        jTablePlanillas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane13.setViewportView(jTablePlanillas);

        jPanel1.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 370, 140, 180));

        jTableAFP.setBackground(new java.awt.Color(255, 153, 153));
        jTableAFP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane14.setViewportView(jTableAFP);

        jPanel1.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 370, 140, 180));

        jTableISSS.setBackground(new java.awt.Color(255, 153, 153));
        jTableISSS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane15.setViewportView(jTableISSS);

        jPanel1.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 140, 180));

        jTableComisiones.setBackground(new java.awt.Color(255, 153, 153));
        jTableComisiones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane16.setViewportView(jTableComisiones);

        jPanel1.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 370, 140, 180));
        jPanel1.add(jTextFieldSumaAbonoPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 260, 70, -1));
        jPanel1.add(jTextFieldSumaTotalPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 290, 70, -1));
        jPanel1.add(jTextFieldSumaCargoCuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 70, -1));
        jPanel1.add(jTextFieldSumaCargoPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 260, 70, -1));

        jLabel10.setText("TOTAL");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 290, -1, 20));
        jPanel1.add(jTextFieldSumaTotalComisiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 580, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoCuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, 70, -1));
        jPanel1.add(jTextFieldSumaTotalCuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 580, 70, -1));
        jPanel1.add(jTextFieldSumaCargoDocumentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 550, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoDocumentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, 70, -1));
        jPanel1.add(jTextFieldSumaTotalDocumentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 580, 70, -1));
        jPanel1.add(jTextFieldSumaCargoRetenciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 550, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoRetenciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 550, 70, -1));
        jPanel1.add(jTextFieldSumaTotalRetenciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 580, 70, -1));
        jPanel1.add(jTextFieldSumaCargoAlquileres, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoAlquileres, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, 70, -1));
        jPanel1.add(jTextFieldSumaTotalAlquileres, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 580, 70, -1));
        jPanel1.add(jTextFieldSumaCargoISSS, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 550, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoISSS, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 550, 70, -1));
        jPanel1.add(jTextFieldSumaTotalISSS, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 580, 70, -1));
        jPanel1.add(jTextFieldSumaCargoAFP, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 550, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoAFP, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 550, 70, -1));
        jPanel1.add(jTextFieldSumaTotalAFP, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 580, 70, -1));
        jPanel1.add(jTextFieldSumaCargoPlanillas, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 550, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoPlanillas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 550, 70, -1));
        jPanel1.add(jTextFieldSumaTotalPlanillas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 580, 70, -1));
        jPanel1.add(jTextFieldSumaCargoComisiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 550, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoComisiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 550, 70, -1));

        jLabel14.setText("TOTAL");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, 20));

        jLabel15.setText("TOTAL");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, -1, 20));

        jLabel16.setText("TOTAL");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, -1, 20));

        jLabel18.setText("TOTAL");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 580, -1, 20));

        jLabel19.setText("TOTAL");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 580, -1, 20));

        jLabel22.setText("TOTAL");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 580, -1, 20));

        jLabel24.setText("TOTAL");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 580, -1, 20));

        jLabel25.setText("TOTAL");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 580, -1, 20));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 50, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel26.setText("MARCAS Y PATENTES");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 60, -1, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel27.setText("CREDITO IVA-FISCAL");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel28.setText("CUENTAS POR PAGAR");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel29.setText("DOCUMENTO POR PAGAR");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel30.setText("ALQUILERES");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel31.setText("RETENCIONES POR PAGAR");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, -1, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel32.setText("RETENCIONES ISSS");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 350, -1, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel33.setText("RETENCIONES AFP");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 350, -1, -1));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel34.setText("PLANILLAS POR PAGAR");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 350, -1, 10));

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
    private javax.swing.JTable jTableAFP;
    private javax.swing.JTable jTableAlquileres;
    private javax.swing.JTable jTableComisiones;
    private javax.swing.JTable jTableCreditoIVA;
    private javax.swing.JTable jTableCuentasXPagar;
    private javax.swing.JTable jTableDocumentos;
    private javax.swing.JTable jTableEdificio;
    private javax.swing.JTable jTableEquipoComputo;
    private javax.swing.JTable jTableISSS;
    private javax.swing.JTable jTableIntangibles;
    private javax.swing.JTable jTableMarcas;
    private javax.swing.JTable jTableMobiliario;
    private javax.swing.JTable jTablePlanillas;
    private javax.swing.JTable jTablePrestamos;
    private javax.swing.JTable jTablePropiedades;
    private javax.swing.JTable jTableRetenciones;
    private javax.swing.JTextField jTextFieldSumaAbonoAFP;
    private javax.swing.JTextField jTextFieldSumaAbonoAlquileres;
    private javax.swing.JTextField jTextFieldSumaAbonoComisiones;
    private javax.swing.JTextField jTextFieldSumaAbonoCreditoIVA;
    private javax.swing.JTextField jTextFieldSumaAbonoCuentas;
    private javax.swing.JTextField jTextFieldSumaAbonoDocumentos;
    private javax.swing.JTextField jTextFieldSumaAbonoEdificio;
    private javax.swing.JTextField jTextFieldSumaAbonoEquipoComputo;
    private javax.swing.JTextField jTextFieldSumaAbonoISSS;
    private javax.swing.JTextField jTextFieldSumaAbonoMarcas;
    private javax.swing.JTextField jTextFieldSumaAbonoMobiliario;
    private javax.swing.JTextField jTextFieldSumaAbonoPlanillas;
    private javax.swing.JTextField jTextFieldSumaAbonoPrestamos;
    private javax.swing.JTextField jTextFieldSumaAbonoPropiedades;
    private javax.swing.JTextField jTextFieldSumaAbonoRetenciones;
    private javax.swing.JTextField jTextFieldSumaAbonontangibles;
    private javax.swing.JTextField jTextFieldSumaCargoAFP;
    private javax.swing.JTextField jTextFieldSumaCargoAlquileres;
    private javax.swing.JTextField jTextFieldSumaCargoComisiones;
    private javax.swing.JTextField jTextFieldSumaCargoCreditoIVA;
    private javax.swing.JTextField jTextFieldSumaCargoCuentas;
    private javax.swing.JTextField jTextFieldSumaCargoDocumentos;
    private javax.swing.JTextField jTextFieldSumaCargoEdificio;
    private javax.swing.JTextField jTextFieldSumaCargoEquipoComputo;
    private javax.swing.JTextField jTextFieldSumaCargoISSS;
    private javax.swing.JTextField jTextFieldSumaCargoIntangibles;
    private javax.swing.JTextField jTextFieldSumaCargoMarcas;
    private javax.swing.JTextField jTextFieldSumaCargoMobiliario;
    private javax.swing.JTextField jTextFieldSumaCargoPlanillas;
    private javax.swing.JTextField jTextFieldSumaCargoPrestamos;
    private javax.swing.JTextField jTextFieldSumaCargoPropiedades;
    private javax.swing.JTextField jTextFieldSumaCargoRetenciones;
    private javax.swing.JTextField jTextFieldSumaTotalAFP;
    private javax.swing.JTextField jTextFieldSumaTotalAlquileres;
    private javax.swing.JTextField jTextFieldSumaTotalComisiones;
    private javax.swing.JTextField jTextFieldSumaTotalCreditoIVA;
    private javax.swing.JTextField jTextFieldSumaTotalCuentas;
    private javax.swing.JTextField jTextFieldSumaTotalDocumentos;
    private javax.swing.JTextField jTextFieldSumaTotalEdificio;
    private javax.swing.JTextField jTextFieldSumaTotalEquipoComputo;
    private javax.swing.JTextField jTextFieldSumaTotalISSS;
    private javax.swing.JTextField jTextFieldSumaTotalIntangibles;
    private javax.swing.JTextField jTextFieldSumaTotalMarcas;
    private javax.swing.JTextField jTextFieldSumaTotalMobiliario;
    private javax.swing.JTextField jTextFieldSumaTotalPlanillas;
    private javax.swing.JTextField jTextFieldSumaTotalPrestamos;
    private javax.swing.JTextField jTextFieldSumaTotalPropiedades;
    private javax.swing.JTextField jTextFieldSumaTotalRetenciones;
    // End of variables declaration//GEN-END:variables
}
