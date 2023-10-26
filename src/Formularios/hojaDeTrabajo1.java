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
import Conexiones.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juann
 */
public class hojaDeTrabajo1 extends javax.swing.JPanel {

    /**
     * Creates new form hojaDeTrabajo1
     */
    public hojaDeTrabajo1() {
        initComponents();
        reset();
        mostrarEstadoResultado();
        mostrarEstadoCapital();
        mostrarBalanceGeneral();
        sumarBalanceGeneral();

        jLabelUtilidaes.setEnabled(false);
        jLabelCapital.setEnabled(false);
    }

    public void reset() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT * FROM transacciones");

            pst.executeUpdate();
            pst.close();
            cn.close();
            actualizarTabla();
            mostrarEstadoCapital();
            mostrarBalanceGeneral();
            mostrarEstadoResultado();
        } catch (Exception e) {

        }
    }

    public void mostrarEstadoResultado() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();

        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cuenta, totalDebe, totalHaber FROM mayorizacion WHERE codigo='41'"
                    + "OR codigo='4101' OR codigo='410101' OR codigo='410102' OR codigo='410103' OR codigo='410104' OR codigo='410105'"
                    + "OR codigo='410106' OR codigo='410107' OR codigo='410108' OR codigo='410109' OR codigo='410110' OR codigo='410111'"
                    + "OR codigo='410112' OR codigo='410113' OR codigo='410114' OR codigo='410115' OR codigo='410116' OR codigo='410117'"
                    + "OR codigo='410118' OR codigo='410119' OR codigo='410120' OR codigo='410121' OR codigo='51' OR codigo='5101'"
                    + "OR codigo='5102' OR codigo='5103'");
            ResultSet resultado = pst.executeQuery();

            DefaultTableModel modeloTabla = new DefaultTableModel();
            modeloTabla.addColumn("Cuenta");
            modeloTabla.addColumn("Debe");
            modeloTabla.addColumn("Haber");

            while (resultado.next()) {
                String cuenta = resultado.getString("cuenta");
                double cargo = Double.parseDouble(resultado.getString("totalDebe"));
                double abono = Double.parseDouble(resultado.getString("totalHaber"));
                modeloTabla.addRow(new Object[]{cuenta, cargo, abono});
            }
            jTableEstadoDeResultados.setModel(modeloTabla);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }

    public void sumarEstadoResultado() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableEstadoDeResultados.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoEstadoResultado.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 2).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoEstadoResultado.setText(String.valueOf(sumaAbono));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void mostrarEstadoCapital() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();

        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cuenta, totalDebe, totalHaber FROM mayorizacion WHERE codigo='31'"
                    + "OR codigo='3101' OR codigo='3102' OR codigo='3103'");
            ResultSet resultado = pst.executeQuery();

            DefaultTableModel modeloTabla = new DefaultTableModel();
            modeloTabla.addColumn("Cuenta");
            modeloTabla.addColumn("Debe");
            modeloTabla.addColumn("Haber");

            while (resultado.next()) {
                String cuenta = resultado.getString("cuenta");
                double cargo = Double.parseDouble(resultado.getString("totalDebe"));
                double abono = Double.parseDouble(resultado.getString("totalHaber"));
                modeloTabla.addRow(new Object[]{cuenta, cargo, abono});
            }
            jTableEstadoCapital.setModel(modeloTabla);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }

    public void sumarEstadoCapital() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableEstadoCapital.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoEstadoCapital.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 2).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoEstadoCapital.setText(String.valueOf(sumaAbono));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void mostrarBalanceGeneral() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();

        try {
            PreparedStatement pst = cn.prepareStatement("SELECT cuenta, totalDebe, totalHaber FROM mayorizacion WHERE codigo='1101'"
                    + "OR codigo='110101' OR codigo='110102' OR codigo='110103' OR codigo='1102' OR codigo='110201'"
                    + "OR codigo='110202' OR codigo='1103' OR codigo='1104' OR codigo='110401' OR codigo='110402'"
                    + "OR codigo='110403' OR codigo='110404' OR codigo='110405' OR codigo='110406' OR codigo='110407'"
                    + "OR codigo='1105' OR codigo='1201' OR codigo='120101' OR codigo='120102' OR codigo='120103' OR codigo='1202'"
                    + "OR codigo='120201' OR codigo='2101' OR codigo='2102' OR codigo='2103' OR codigo='2104' OR codigo='2105'"
                    + "OR codigo='210501' OR codigo='210502' OR codigo='2106' OR codigo='2107' OR codigo='210701' OR codigo='210703'"
                    + "OR codigo='210704' OR codigo='2108' OR codigo='2109' OR codigo='2201' OR codigo='2202' OR codigo=3101");
            ResultSet resultado = pst.executeQuery();

            DefaultTableModel modeloTabla = new DefaultTableModel();
            modeloTabla.addColumn("Cuenta");
            modeloTabla.addColumn("Debe");
            modeloTabla.addColumn("Haber");

            while (resultado.next()) {
                String cuenta = resultado.getString("cuenta");
                double cargo = Double.parseDouble(resultado.getString("totalDebe"));
                double abono = Double.parseDouble(resultado.getString("totalHaber"));
                modeloTabla.addRow(new Object[]{cuenta, cargo, abono});
            }
            jTableBalanceGeneral.setModel(modeloTabla);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }

    public void sumarBalanceGeneral() {
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableBalanceGeneral.getModel();
            int rowCount = modelo.getRowCount();
            double sumaCargo = 0.0;
            double sumaAbono = 0.0;
            //sumamos la columna del debe
            for (int i = 0; i < rowCount; i++) {
                sumaCargo += Double.parseDouble(modelo.getValueAt(i, 1).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            //mostramos la suma del debe en el textbox
            jTextFieldSumaCargoBalance.setText(String.valueOf(sumaCargo)); // Establece el resultado de la suma en el JTextField.
            for (int i = 0; i < rowCount; i++) {
                sumaAbono += Double.parseDouble(modelo.getValueAt(i, 2).toString()); // Suma los valores de la columna 2 (índice 1).
            }
            jTextFieldSumaAbonoBalance.setText(String.valueOf(sumaAbono));

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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEstadoDeResultados = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldSumaCargoEstadoResultado = new javax.swing.JTextField();
        jTextFieldSumaAbonoEstadoResultado = new javax.swing.JTextField();
        jButtonUtilidades = new javax.swing.JButton();
        jLabelUtilidaes = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEstadoCapital = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldSumaAbonoEstadoCapital = new javax.swing.JTextField();
        jTextFieldSumaCargoEstadoCapital = new javax.swing.JTextField();
        jButtonCapital = new javax.swing.JButton();
        jLabelCapital = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableBalanceGeneral = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldSumaAbonoBalance = new javax.swing.JTextField();
        jTextFieldSumaCargoBalance = new javax.swing.JTextField();
        jButtonBalance = new javax.swing.JButton();
        jLabelBalance = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1280, 680));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("HOJA DE TRABAJO");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, -1, -1));

        jTableEstadoDeResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableEstadoDeResultados);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 320, 420));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Estado de Resultados");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));
        add(jTextFieldSumaCargoEstadoResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 100, -1));
        add(jTextFieldSumaAbonoEstadoResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 100, -1));

        jButtonUtilidades.setText("Utilidades");
        jButtonUtilidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUtilidadesActionPerformed(evt);
            }
        });
        add(jButtonUtilidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, 220, -1));

        jLabelUtilidaes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelUtilidaes.setText("                            ");
        jLabelUtilidaes.setEnabled(false);
        add(jLabelUtilidaes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 320, -1));

        jTableEstadoCapital.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableEstadoCapital);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 320, 420));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Estado de Capital");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, -1, -1));
        add(jTextFieldSumaAbonoEstadoCapital, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 500, 100, -1));
        add(jTextFieldSumaCargoEstadoCapital, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 500, 100, -1));

        jButtonCapital.setText("Capital");
        jButtonCapital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCapitalActionPerformed(evt);
            }
        });
        add(jButtonCapital, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 530, 220, -1));

        jLabelCapital.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelCapital.setText("                            ");
        jLabelCapital.setEnabled(false);
        add(jLabelCapital, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 570, 320, -1));

        jTableBalanceGeneral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTableBalanceGeneral);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 80, 310, 420));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Balance General");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 50, -1, -1));
        add(jTextFieldSumaAbonoBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 500, 90, -1));
        add(jTextFieldSumaCargoBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 500, 90, -1));

        jButtonBalance.setText("Balance General");
        jButtonBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBalanceActionPerformed(evt);
            }
        });
        add(jButtonBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 530, 200, -1));

        jLabelBalance.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelBalance.setText("                                      ");
        add(jLabelBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 570, 300, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUtilidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUtilidadesActionPerformed
        // TODO add your handling code here:
        sumarEstadoResultado();
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        // Obtener los valores de los JTextField
        String debe = jTextFieldSumaCargoEstadoResultado.getText();
        String haber = jTextFieldSumaAbonoEstadoResultado.getText();
        double suma = 0.0;

        try {
            // Convertir los valores a números (en este caso, a double)
            double cargo = Double.parseDouble(debe);
            double abono = Double.parseDouble(haber);

            // Realizar la comparación
            if (cargo > abono) {
                suma = cargo - abono;
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe=?, totalHaber=? WHERE codigo='3103'");
                pst.setDouble(1, suma);
                pst.setDouble(2, 0);
                pst.executeUpdate();
                pst.close();
                cn.close();
                actualizarTabla();
                jLabelUtilidaes.setText("Las utilidades son: $ " + suma);
            } else {
                suma = abono - cargo;
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalHaber=?, totalDebe=? WHERE codigo='3103'");
                pst.setDouble(1, suma);
                pst.setDouble(2, 0);
                pst.executeUpdate();
                pst.close();
                cn.close();
                actualizarTabla();
                jLabelUtilidaes.setText("Las utilidades son: $ " + suma);
            }
            actualizarTabla();
        } catch (Exception e) {
            System.err.println("Error: Ingresa números válidos en ambos campos.");
        }
        jLabelUtilidaes.setEnabled(true);
    }//GEN-LAST:event_jButtonUtilidadesActionPerformed

    private void jButtonCapitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCapitalActionPerformed
        // TODO add your handling code here:
        sumarEstadoCapital();
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        // Obtener los valores de los JTextField
        String debe = jTextFieldSumaCargoEstadoCapital.getText();
        String haber = jTextFieldSumaAbonoEstadoCapital.getText();
        double suma = 0.0;

        try {
            // Convertir los valores a números (en este caso, a double)
            double cargo = Double.parseDouble(debe);
            double abono = Double.parseDouble(haber);

            // Realizar la comparación
            if (cargo > abono) {
                suma = cargo - abono;
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalDebe=?, totalHaber=? WHERE codigo='3101'");
                pst.setDouble(1, suma);
                pst.setDouble(2, 0);
                pst.executeUpdate();
                pst.close();
                cn.close();
                jLabelCapital.setText("El estado de capital es: " + suma);
            } else {
                suma = abono - cargo;
                PreparedStatement pst = cn.prepareStatement("UPDATE mayorizacion SET totalHaber=?, totalDebe=? WHERE codigo='3101'");
                pst.setDouble(1, suma);
                pst.setDouble(2, 0);
                pst.executeUpdate();
                pst.close();
                cn.close();
                jLabelCapital.setText("El estado de capital es: $ " + suma);
            }
            actualizarTabla();
        } catch (Exception e) {
            System.err.println("Error: Ingresa números válidos en ambos campos.");
        }
        jLabelCapital.setEnabled(true);

    }//GEN-LAST:event_jButtonCapitalActionPerformed

    private void jButtonBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBalanceActionPerformed
        // TODO add your handling code here:
        sumarBalanceGeneral();
        ConexionDB db = new ConexionDB();
        Connection cn = db.conectar();
        // Obtener los valores de los JTextField
        String debe = jTextFieldSumaCargoBalance.getText();
        String haber = jTextFieldSumaAbonoBalance.getText();
        double suma = 0.0;

        try {
            // Convertir los valores a números (en este caso, a double)
            double cargo = Double.parseDouble(debe);
            double abono = Double.parseDouble(haber);

            // Realizar la comparación
            if (cargo == abono) {
                jLabelBalance.setText("El Balance General es: " + cargo);
            } else {

            }
            actualizarTabla();
        } catch (Exception e) {
            System.err.println("Error: Ingresa números válidos en ambos campos.");
        }
    }//GEN-LAST:event_jButtonBalanceActionPerformed
    private void actualizarTabla() {

        // Recarga los datos de la tabla después de la actualización en la base de datos
        DefaultTableModel model = (DefaultTableModel) jTableEstadoCapital.getModel();
        DefaultTableModel model1 = (DefaultTableModel) jTableBalanceGeneral.getModel();
        model.setRowCount(0);  // Limpia el modelo de la tabla
        model1.setRowCount(0);  // Limpia el modelo de la tabla
        mostrarEstadoCapital();
        mostrarBalanceGeneral();

        // Vuelve a llenar la tabla con los datos actualizados desde la base de datos
        // Aquí deberías agregar el código para obtener los datos desde la base de datos
        // y agregarlos al modelo de la tabla
        // Después de llenar la tabla, puedes llamar a repaint() o revalidate() si es necesario.
        jTableEstadoCapital.repaint();
        jTableBalanceGeneral.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBalance;
    private javax.swing.JButton jButtonCapital;
    private javax.swing.JButton jButtonUtilidades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelBalance;
    private javax.swing.JLabel jLabelCapital;
    private javax.swing.JLabel jLabelUtilidaes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableBalanceGeneral;
    private javax.swing.JTable jTableEstadoCapital;
    private javax.swing.JTable jTableEstadoDeResultados;
    private javax.swing.JTextField jTextFieldSumaAbonoBalance;
    private javax.swing.JTextField jTextFieldSumaAbonoEstadoCapital;
    private javax.swing.JTextField jTextFieldSumaAbonoEstadoResultado;
    private javax.swing.JTextField jTextFieldSumaCargoBalance;
    private javax.swing.JTextField jTextFieldSumaCargoEstadoCapital;
    private javax.swing.JTextField jTextFieldSumaCargoEstadoResultado;
    // End of variables declaration//GEN-END:variables
}
