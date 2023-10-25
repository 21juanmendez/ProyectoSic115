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
public class libroMayor3 extends javax.swing.JPanel {

    /**
     * Creates new form libroMayor3
     */
    public libroMayor3() {
        initComponents();
        mostrarCuentas();
        sumarCuentaCostoDeVentas();
        sumarCuentaGastoServicios();
        sumarCuentaCostoInstalacion();
        sumarCuentaSueldoYSalarios();
        sumarCuentaIncapacidades();
        sumarCuentaIndemnizaciones();
        sumarCuentaComisiones();
        sumarCuentaViaticos();
        sumarCuentaPapeleria();
        sumarCuentaPublicidad();
        sumarCuentaMantenimiento();
        sumarCuentaMantenimientoHardware();
        sumarCuentaArticulos();
        sumarCuentaComunicacion();
        sumarCuentaCostoDesarrollo();
        sumarCuentaGastoConsultoria();

    }

    public void mostrarCuentas() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();

        //CUENTA costo de ventas
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='410105'");
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
            jTableCostoDeVentas.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        //CUENTA gastos por servicios basicos
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='410106'");
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
            jTableGastosServicios.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        //CUENTA costo de instalacion
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='410107'");
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
            jTableCostoInstalacion.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        //CUENTA sueldos y salarios
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='410108'");
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
            jTableSueldosYSalarios.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        //CUENTA incapacidades
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='410109'");
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
            jTableIncapacidades.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        //CUENTA indemnizaciones
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='410110'");
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
        //CUENTA comisiones
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='410111'");
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
        //CUENTA viaticos
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='410112'");
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
            jTableViaticos.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        //CUENTA papeleria y utiles
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='410113'");
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
            jTablePapeleria.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        //CUENTA publicidad y marketing
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='410114'");
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
            jTablePublicidad.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        //CUENTA mantenimiento de locales
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='410115'");
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
            jTableMantenimiento.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
         //CUENTA mantenimiento de hardware y software
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='410116'");
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
            jTableMantenimientoHardware.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
          //CUENTA articulos de aseo y limpieza
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='410117'");
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
            jTableIArticulos.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
           //CUENTA gastos de comunicacion
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='410118'");
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
            jTableGastosComunicacion.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
          //CUENTA costos de desarrollo
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='410119'");
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
            jTableCostoDesarrollo.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
               //CUENTA gastos de consultoria
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cargo,abono FROM transacciones WHERE codigo='410120'");
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
            jTableGastoConsultoria.setModel(modeloTabla); // Reemplaza "jTable1" con el nombre de tu JTable.          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }

    public void sumarCuentaCostoDeVentas() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableCostoDeVentas.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoCostoDeVentas.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoCostoDeVentas.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe = ? WHERE codigo = '410105'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            
            jTextFieldSumaTotalCostoDeVentas.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sumarCuentaGastoServicios() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableGastosServicios.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoGastoServicios.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoGastoServicios.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe = ? WHERE codigo = '410106'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            
            jTextFieldSumaTotalGastoServicios.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sumarCuentaCostoInstalacion() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableCostoInstalacion.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoCostoInstalacion.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoCostoInstalacion.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe = ? WHERE codigo = '410107'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            
            jTextFieldSumaTotalCostoInstalacion.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sumarCuentaSueldoYSalarios() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableSueldosYSalarios.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoSueldosYSalarios.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoSueldosYSalarios.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe = ? WHERE codigo = '410108'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            
            jTextFieldSumaTotalSueldosYSalarios.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sumarCuentaIncapacidades() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableIncapacidades.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoIncapacidades.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoIncapacidades.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe = ? WHERE codigo = '410109'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            
            jTextFieldSumaTotalIncapacidades.setText(String.valueOf(total));
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
            
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe = ? WHERE codigo = '410110'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            
            jTextFieldSumaTotalIndemnizaciones.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sumarCuentaComisiones() {
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
            
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe = ? WHERE codigo = '410111'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            
            jTextFieldSumaTotalComisiones.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sumarCuentaViaticos() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableViaticos.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoViaticos.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoViaticos.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe = ? WHERE codigo = '410112'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            
            jTextFieldSumaTotalViaticos.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sumarCuentaPapeleria() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTablePapeleria.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoPapeleria.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoPapeleria.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe = ? WHERE codigo = '410113'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            
            jTextFieldSumaTotalPapeleria.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sumarCuentaPublicidad() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTablePublicidad.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoPublicidad.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoPublicidad.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe = ? WHERE codigo = '410114'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            
            jTextFieldSumaTotalPublicidad.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sumarCuentaMantenimiento() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableMantenimiento.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoMantenimiento.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoMantenimiento.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe = ? WHERE codigo = '410115'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            
            jTextFieldSumaTotalMantenimiento.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void sumarCuentaMantenimientoHardware() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableMantenimientoHardware.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoMantenimientoHardware.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoMantenimientoHardware.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe = ? WHERE codigo = '410116'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            
            jTextFieldSumaTotalMantenimientoHardware.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void sumarCuentaArticulos() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableIArticulos.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoArticulos.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoArticulos.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe = ? WHERE codigo = '410117'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            
            jTextFieldSumaTotalArticulos.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void sumarCuentaComunicacion() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableGastosComunicacion.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoGastosComunicacion.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoGastosComunicacion.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe = ? WHERE codigo = '410118'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            
            jTextFieldSumaTotalGastosComunicacion.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void sumarCuentaCostoDesarrollo() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableCostoDesarrollo.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoCostoDesarrollo.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoCostoDesarrollo.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe = ? WHERE codigo = '410119'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            
            jTextFieldSumaTotalCostoDesarrollo.setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
        public void sumarCuentaGastoConsultoria() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableGastoConsultoria.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            double total = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 0).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoGastoConsultoria.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoGastoConsultoria.setText(String.valueOf(sumaAbono));
            //Ya que es activo cargo tiene que ser mayor para que la resta no quede negativa
            
                total = sumaCargo - sumaAbono;
                // Actualizamos el valor de 'total' en la tabla 'mayorizacion'
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe = ? WHERE codigo = '410120'");
                pst.setDouble(1, total); // Establecemos el valor de 'total' en la sentencia SQL.
                double a = pst.executeUpdate();// Ejecuta la sentencia y guarda el resultado
            
            jTextFieldSumaTotalGastoConsultoria.setText(String.valueOf(total));
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
        jTableCostoDeVentas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableGastosServicios = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldSumaAbonoCostoDeVentas = new javax.swing.JTextField();
        jTextFieldSumaCargoCostoDeVentas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldSumaTotalCostoDeVentas = new javax.swing.JTextField();
        jTextFieldSumaCargoGastoServicios = new javax.swing.JTextField();
        jTextFieldSumaAbonoGastoServicios = new javax.swing.JTextField();
        jTextFieldSumaTotalGastoServicios = new javax.swing.JTextField();
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
        jTableCostoInstalacion = new javax.swing.JTable();
        jTextFieldSumaCargoCostoInstalacion = new javax.swing.JTextField();
        jTextFieldSumaAbonoCostoInstalacion = new javax.swing.JTextField();
        jTextFieldSumaTotalCostoInstalacion = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableComisiones = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldSumaCargoComisiones = new javax.swing.JTextField();
        jTextFieldSumaAbonoComisiones = new javax.swing.JTextField();
        jTextFieldSumaTotalComisiones = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTableSueldosYSalarios = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTableIncapacidades = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        jTextFieldSumaAbonoSueldosYSalarios = new javax.swing.JTextField();
        jTextFieldSumaTotalSueldosYSalarios = new javax.swing.JTextField();
        jTextFieldSumaCargoSueldosYSalarios = new javax.swing.JTextField();
        jTextFieldSumaCargoIncapacidades = new javax.swing.JTextField();
        jTextFieldSumaAbonoIncapacidades = new javax.swing.JTextField();
        jTextFieldSumaTotalIncapacidades = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableViaticos = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTablePapeleria = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTablePublicidad = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTableMantenimiento = new javax.swing.JTable();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTableMantenimientoHardware = new javax.swing.JTable();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTableGastoConsultoria = new javax.swing.JTable();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTableCostoDesarrollo = new javax.swing.JTable();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTableIArticulos = new javax.swing.JTable();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTableGastosComunicacion = new javax.swing.JTable();
        jTextFieldSumaAbonoViaticos = new javax.swing.JTextField();
        jTextFieldSumaTotalViaticos = new javax.swing.JTextField();
        jTextFieldSumaCargoPapeleria = new javax.swing.JTextField();
        jTextFieldSumaCargoViaticos = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldSumaTotalGastosComunicacion = new javax.swing.JTextField();
        jTextFieldSumaAbonoPapeleria = new javax.swing.JTextField();
        jTextFieldSumaTotalPapeleria = new javax.swing.JTextField();
        jTextFieldSumaCargoPublicidad = new javax.swing.JTextField();
        jTextFieldSumaAbonoPublicidad = new javax.swing.JTextField();
        jTextFieldSumaTotalPublicidad = new javax.swing.JTextField();
        jTextFieldSumaCargoMantenimientoHardware = new javax.swing.JTextField();
        jTextFieldSumaAbonoMantenimientoHardware = new javax.swing.JTextField();
        jTextFieldSumaTotalMantenimientoHardware = new javax.swing.JTextField();
        jTextFieldSumaCargoMantenimiento = new javax.swing.JTextField();
        jTextFieldSumaAbonoMantenimiento = new javax.swing.JTextField();
        jTextFieldSumaTotalMantenimiento = new javax.swing.JTextField();
        jTextFieldSumaCargoArticulos = new javax.swing.JTextField();
        jTextFieldSumaAbonoArticulos = new javax.swing.JTextField();
        jTextFieldSumaTotalArticulos = new javax.swing.JTextField();
        jTextFieldSumaCargoCostoDesarrollo = new javax.swing.JTextField();
        jTextFieldSumaAbonoCostoDesarrollo = new javax.swing.JTextField();
        jTextFieldSumaTotalCostoDesarrollo = new javax.swing.JTextField();
        jTextFieldSumaCargoGastoConsultoria = new javax.swing.JTextField();
        jTextFieldSumaAbonoGastoConsultoria = new javax.swing.JTextField();
        jTextFieldSumaTotalGastoConsultoria = new javax.swing.JTextField();
        jTextFieldSumaCargoGastosComunicacion = new javax.swing.JTextField();
        jTextFieldSumaAbonoGastosComunicacion = new javax.swing.JTextField();
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
        jLabel1.setText("Pagina 4");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

        jTableCostoDeVentas.setBackground(new java.awt.Color(255, 255, 153));
        jTableCostoDeVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableCostoDeVentas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 140, 180));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel2.setText("GASTOS DE COMUNICACION");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 350, -1, 10));

        jScrollPane2.setBackground(new java.awt.Color(255, 153, 153));

        jTableGastosServicios.setBackground(new java.awt.Color(255, 255, 153));
        jTableGastosServicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableGastosServicios);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 140, 180));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel3.setText("COSTOS DE INSTALACION");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));
        jPanel1.add(jTextFieldSumaAbonoCostoDeVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 70, -1));
        jPanel1.add(jTextFieldSumaCargoCostoDeVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 70, -1));

        jLabel4.setText("TOTAL");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 290, -1, 20));
        jPanel1.add(jTextFieldSumaTotalCostoDeVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 70, -1));
        jPanel1.add(jTextFieldSumaCargoGastoServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoGastoServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 70, -1));
        jPanel1.add(jTextFieldSumaTotalGastoServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 70, -1));

        jLabel6.setText("TOTAL");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, 20));

        jTableIndemnizaciones.setBackground(new java.awt.Color(255, 255, 153));
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
        jLabel5.setText("GASTOS POR SERVICIOS BASICOS");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));
        jPanel1.add(jTextFieldSumaAbonoIndemnizaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 260, 70, -1));
        jPanel1.add(jTextFieldSumaTotalIndemnizaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, 70, -1));

        jLabel7.setText("TOTAL");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel8.setText("INDEMNIZACIONES");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 60, -1, 10));
        jPanel1.add(jTextFieldSumaCargoIndemnizaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 260, 70, -1));

        jLabel9.setText("TOTAL");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 290, -1, 20));

        jTableCostoInstalacion.setBackground(new java.awt.Color(255, 255, 153));
        jTableCostoInstalacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(jTableCostoInstalacion);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 140, 180));
        jPanel1.add(jTextFieldSumaCargoCostoInstalacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoCostoInstalacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 70, -1));
        jPanel1.add(jTextFieldSumaTotalCostoInstalacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 70, -1));

        jTableComisiones.setBackground(new java.awt.Color(255, 255, 153));
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
        jScrollPane6.setViewportView(jTableComisiones);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 80, 140, 180));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel12.setText("VIATICOS");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 60, -1, -1));
        jPanel1.add(jTextFieldSumaCargoComisiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 260, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoComisiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 260, 70, -1));
        jPanel1.add(jTextFieldSumaTotalComisiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 290, 70, -1));

        jLabel13.setText("TOTAL");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 580, -1, 20));

        jLabel17.setText("TOTAL");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 290, -1, 20));

        jTableSueldosYSalarios.setBackground(new java.awt.Color(255, 255, 153));
        jTableSueldosYSalarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane10.setViewportView(jTableSueldosYSalarios);

        jPanel1.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 140, 180));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel20.setText("SUELDOS Y SALARIOS");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

        jTableIncapacidades.setBackground(new java.awt.Color(255, 255, 153));
        jTableIncapacidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane11.setViewportView(jTableIncapacidades);

        jPanel1.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 140, 180));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel21.setText("INCAPACIDADES");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, -1, -1));
        jPanel1.add(jTextFieldSumaAbonoSueldosYSalarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 70, -1));
        jPanel1.add(jTextFieldSumaTotalSueldosYSalarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 70, -1));
        jPanel1.add(jTextFieldSumaCargoSueldosYSalarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 70, -1));
        jPanel1.add(jTextFieldSumaCargoIncapacidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoIncapacidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 260, 70, -1));
        jPanel1.add(jTextFieldSumaTotalIncapacidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 70, -1));

        jLabel23.setText("TOTAL");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, -1, 20));

        jTableViaticos.setBackground(new java.awt.Color(255, 255, 153));
        jTableViaticos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jTableViaticos);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 80, 140, 180));

        jTablePapeleria.setBackground(new java.awt.Color(255, 255, 153));
        jTablePapeleria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(jTablePapeleria);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 140, 180));

        jTablePublicidad.setBackground(new java.awt.Color(255, 255, 153));
        jTablePublicidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane8.setViewportView(jTablePublicidad);

        jPanel1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 140, 180));

        jTableMantenimiento.setBackground(new java.awt.Color(255, 255, 153));
        jTableMantenimiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane9.setViewportView(jTableMantenimiento);

        jPanel1.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 140, 180));

        jTableMantenimientoHardware.setBackground(new java.awt.Color(255, 255, 153));
        jTableMantenimientoHardware.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane12.setViewportView(jTableMantenimientoHardware);

        jPanel1.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 140, 180));

        jTableGastoConsultoria.setBackground(new java.awt.Color(255, 255, 153));
        jTableGastoConsultoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane13.setViewportView(jTableGastoConsultoria);

        jPanel1.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 370, 140, 180));

        jTableCostoDesarrollo.setBackground(new java.awt.Color(255, 255, 153));
        jTableCostoDesarrollo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane14.setViewportView(jTableCostoDesarrollo);

        jPanel1.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 370, 140, 180));

        jTableIArticulos.setBackground(new java.awt.Color(255, 255, 153));
        jTableIArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane15.setViewportView(jTableIArticulos);

        jPanel1.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 140, 180));

        jTableGastosComunicacion.setBackground(new java.awt.Color(255, 255, 153));
        jTableGastosComunicacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane16.setViewportView(jTableGastosComunicacion);

        jPanel1.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 370, 140, 180));
        jPanel1.add(jTextFieldSumaAbonoViaticos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 260, 70, -1));
        jPanel1.add(jTextFieldSumaTotalViaticos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 290, 70, -1));
        jPanel1.add(jTextFieldSumaCargoPapeleria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 70, -1));
        jPanel1.add(jTextFieldSumaCargoViaticos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 260, 70, -1));

        jLabel10.setText("TOTAL");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 290, -1, 20));
        jPanel1.add(jTextFieldSumaTotalGastosComunicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 580, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoPapeleria, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, 70, -1));
        jPanel1.add(jTextFieldSumaTotalPapeleria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 70, -1));
        jPanel1.add(jTextFieldSumaCargoPublicidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 550, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoPublicidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, 70, -1));
        jPanel1.add(jTextFieldSumaTotalPublicidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 580, 70, -1));
        jPanel1.add(jTextFieldSumaCargoMantenimientoHardware, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 550, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoMantenimientoHardware, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 550, 70, -1));
        jPanel1.add(jTextFieldSumaTotalMantenimientoHardware, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 580, 70, -1));
        jPanel1.add(jTextFieldSumaCargoMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, 70, -1));
        jPanel1.add(jTextFieldSumaTotalMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 580, 70, -1));
        jPanel1.add(jTextFieldSumaCargoArticulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 550, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoArticulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 550, 70, -1));
        jPanel1.add(jTextFieldSumaTotalArticulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 580, 70, -1));
        jPanel1.add(jTextFieldSumaCargoCostoDesarrollo, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 550, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoCostoDesarrollo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 550, 70, -1));
        jPanel1.add(jTextFieldSumaTotalCostoDesarrollo, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 580, 70, -1));
        jPanel1.add(jTextFieldSumaCargoGastoConsultoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 550, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoGastoConsultoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 550, 70, -1));
        jPanel1.add(jTextFieldSumaTotalGastoConsultoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 580, 70, -1));
        jPanel1.add(jTextFieldSumaCargoGastosComunicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 550, 70, -1));
        jPanel1.add(jTextFieldSumaAbonoGastosComunicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 550, 70, -1));

        jLabel14.setText("TOTAL");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, 20));

        jLabel15.setText("TOTAL");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 580, -1, 20));

        jLabel16.setText("TOTAL");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 580, -1, 20));

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
        jLabel26.setText("COMISIONES");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 60, -1, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel27.setText("COSTO DE VENTA");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel28.setText("GASTOS POR PAPELERIA Y UTILES");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel29.setText("GASTOS DE PUBLICIDAD Y MARKETING");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel30.setText("MANTENIMIENTOS LOCALES");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel31.setText("MANTENIMIENTO DE HARDWARE Y SISTEMA");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, -1, 10));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel32.setText("ARTICULOS DE ASEO Y LIMPIEZA");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, -1, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel33.setText("COSTO DEL DESARROLLO DEL SISTEMA");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 350, -1, -1));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel34.setText("GASTO DE CONSULTORIA");
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
    private javax.swing.JTable jTableComisiones;
    private javax.swing.JTable jTableCostoDeVentas;
    private javax.swing.JTable jTableCostoDesarrollo;
    private javax.swing.JTable jTableCostoInstalacion;
    private javax.swing.JTable jTableGastoConsultoria;
    private javax.swing.JTable jTableGastosComunicacion;
    private javax.swing.JTable jTableGastosServicios;
    private javax.swing.JTable jTableIArticulos;
    private javax.swing.JTable jTableIncapacidades;
    private javax.swing.JTable jTableIndemnizaciones;
    private javax.swing.JTable jTableMantenimiento;
    private javax.swing.JTable jTableMantenimientoHardware;
    private javax.swing.JTable jTablePapeleria;
    private javax.swing.JTable jTablePublicidad;
    private javax.swing.JTable jTableSueldosYSalarios;
    private javax.swing.JTable jTableViaticos;
    private javax.swing.JTextField jTextFieldSumaAbonoArticulos;
    private javax.swing.JTextField jTextFieldSumaAbonoComisiones;
    private javax.swing.JTextField jTextFieldSumaAbonoCostoDeVentas;
    private javax.swing.JTextField jTextFieldSumaAbonoCostoDesarrollo;
    private javax.swing.JTextField jTextFieldSumaAbonoCostoInstalacion;
    private javax.swing.JTextField jTextFieldSumaAbonoGastoConsultoria;
    private javax.swing.JTextField jTextFieldSumaAbonoGastoServicios;
    private javax.swing.JTextField jTextFieldSumaAbonoGastosComunicacion;
    private javax.swing.JTextField jTextFieldSumaAbonoIncapacidades;
    private javax.swing.JTextField jTextFieldSumaAbonoIndemnizaciones;
    private javax.swing.JTextField jTextFieldSumaAbonoMantenimiento;
    private javax.swing.JTextField jTextFieldSumaAbonoMantenimientoHardware;
    private javax.swing.JTextField jTextFieldSumaAbonoPapeleria;
    private javax.swing.JTextField jTextFieldSumaAbonoPublicidad;
    private javax.swing.JTextField jTextFieldSumaAbonoSueldosYSalarios;
    private javax.swing.JTextField jTextFieldSumaAbonoViaticos;
    private javax.swing.JTextField jTextFieldSumaCargoArticulos;
    private javax.swing.JTextField jTextFieldSumaCargoComisiones;
    private javax.swing.JTextField jTextFieldSumaCargoCostoDeVentas;
    private javax.swing.JTextField jTextFieldSumaCargoCostoDesarrollo;
    private javax.swing.JTextField jTextFieldSumaCargoCostoInstalacion;
    private javax.swing.JTextField jTextFieldSumaCargoGastoConsultoria;
    private javax.swing.JTextField jTextFieldSumaCargoGastoServicios;
    private javax.swing.JTextField jTextFieldSumaCargoGastosComunicacion;
    private javax.swing.JTextField jTextFieldSumaCargoIncapacidades;
    private javax.swing.JTextField jTextFieldSumaCargoIndemnizaciones;
    private javax.swing.JTextField jTextFieldSumaCargoMantenimiento;
    private javax.swing.JTextField jTextFieldSumaCargoMantenimientoHardware;
    private javax.swing.JTextField jTextFieldSumaCargoPapeleria;
    private javax.swing.JTextField jTextFieldSumaCargoPublicidad;
    private javax.swing.JTextField jTextFieldSumaCargoSueldosYSalarios;
    private javax.swing.JTextField jTextFieldSumaCargoViaticos;
    private javax.swing.JTextField jTextFieldSumaTotalArticulos;
    private javax.swing.JTextField jTextFieldSumaTotalComisiones;
    private javax.swing.JTextField jTextFieldSumaTotalCostoDeVentas;
    private javax.swing.JTextField jTextFieldSumaTotalCostoDesarrollo;
    private javax.swing.JTextField jTextFieldSumaTotalCostoInstalacion;
    private javax.swing.JTextField jTextFieldSumaTotalGastoConsultoria;
    private javax.swing.JTextField jTextFieldSumaTotalGastoServicios;
    private javax.swing.JTextField jTextFieldSumaTotalGastosComunicacion;
    private javax.swing.JTextField jTextFieldSumaTotalIncapacidades;
    private javax.swing.JTextField jTextFieldSumaTotalIndemnizaciones;
    private javax.swing.JTextField jTextFieldSumaTotalMantenimiento;
    private javax.swing.JTextField jTextFieldSumaTotalMantenimientoHardware;
    private javax.swing.JTextField jTextFieldSumaTotalPapeleria;
    private javax.swing.JTextField jTextFieldSumaTotalPublicidad;
    private javax.swing.JTextField jTextFieldSumaTotalSueldosYSalarios;
    private javax.swing.JTextField jTextFieldSumaTotalViaticos;
    // End of variables declaration//GEN-END:variables
}
