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
import java.sql.SQLException;
/**
 *
 * @author juann
 */
public class cierreContable extends javax.swing.JPanel {

    /**
     * Creates new form cierreContable
     */
    public cierreContable() {
       initComponents();
       mostrarResultado();
       mostrarResultado2();
       mostrarResultado3();
       mostrarResultado4();
      
       
       
    }
    
    
  public void mostrarResultado() {
    ConexionDB db = new ConexionDB();
    Connection cn = db.conectar();

    try {
        // Consultas SQL para obtener los datos de diferentes códigos de la tabla mayorizacion
        String consultaCodigo1 = "SELECT totalHaber FROM mayorizacion WHERE codigo = '51'";
        String consultaCodigo2 = "SELECT totalHaber FROM mayorizacion WHERE codigo = '5103'";
        String consultaCodigo3 = "SELECT totalDebe FROM mayorizacion WHERE codigo = '410104'";
        String consultaCodigo4 = "SELECT totalDebe FROM mayorizacion WHERE codigo = '410103'";

        // Ejecutar las consultas y obtener los resultados
        PreparedStatement pstConsulta1 = cn.prepareStatement(consultaCodigo1);
        PreparedStatement pstConsulta2 = cn.prepareStatement(consultaCodigo2);
        PreparedStatement pstConsulta3 = cn.prepareStatement(consultaCodigo3);
        PreparedStatement pstConsulta4 = cn.prepareStatement(consultaCodigo4);

        ResultSet rs1 = pstConsulta1.executeQuery();
        ResultSet rs2 = pstConsulta2.executeQuery();
        ResultSet rs3 = pstConsulta3.executeQuery();
        ResultSet rs4 = pstConsulta4.executeQuery();
        

        // Mueve el cursor al primer resultado para cada consulta
        rs1.next();
        rs2.next();
        rs3.next();
        rs4.next();

        // Obtiene los valores de totalHaber de cada consulta
        double total1 = rs1.getDouble("totalHaber");
        double total2 = rs2.getDouble("totalHaber");
        double total3 = rs3.getDouble("totalDebe");
        double total4 = rs4.getDouble("totalDebe");

        // Obtiene el modelo de la tabla
        DefaultTableModel modelo = (DefaultTableModel) tablaVentas.getModel();

        // Establece los valores en las filas y columnas correspondientes
        modelo.setValueAt(total1, 0, 0); // totalHaber del código 51 en la primera fila y primera columna
        modelo.setValueAt(total2, 0, 1); // totalHaber del código 52 en la primera fila y segunda columna
        modelo.setValueAt(total3, 0, 2); // totalHaber del código 53 en la primera fila y tercera columna
        modelo.setValueAt(total4, 0, 3);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    public void mostrarResultado2() {
    ConexionDB db = new ConexionDB();
    Connection cn = db.conectar();

    try {
        // Consultas SQL para obtener los datos de diferentes códigos de la tabla mayorizacion
        String consultaCodigo1 = "SELECT totalDebe FROM mayorizacion WHERE codigo = '4101'";
        String consultaCodigo2 = "SELECT totalDebe FROM mayorizacion WHERE codigo = '410102'";
        String consultaCodigo3 = "SELECT totalDebe FROM mayorizacion WHERE codigo = '410106'";
        String consultaCodigo4 = "SELECT totalDebe FROM mayorizacion WHERE codigo = '410113'";
        String consultaCodigo5 = "SELECT totalDebe FROM mayorizacion WHERE codigo = '410114'";
        String consultaCodigo6 = "SELECT totalDebe FROM mayorizacion WHERE codigo = '410120'";
        String consultaCodigo7 = "SELECT totalDebe FROM mayorizacion WHERE codigo = '410119'";
        String consultaCodigo8 = "SELECT totalDebe FROM mayorizacion WHERE codigo = '410107'";
        

        // Ejecutar las consultas y obtener los resultados
        PreparedStatement pstConsulta1 = cn.prepareStatement(consultaCodigo1);
        PreparedStatement pstConsulta2 = cn.prepareStatement(consultaCodigo2);
        PreparedStatement pstConsulta3 = cn.prepareStatement(consultaCodigo3);
        PreparedStatement pstConsulta4 = cn.prepareStatement(consultaCodigo4);
        PreparedStatement pstConsulta5 = cn.prepareStatement(consultaCodigo5);
        PreparedStatement pstConsulta6 = cn.prepareStatement(consultaCodigo6);
        PreparedStatement pstConsulta7 = cn.prepareStatement(consultaCodigo7);
        PreparedStatement pstConsulta8 = cn.prepareStatement(consultaCodigo8);

        ResultSet rs1 = pstConsulta1.executeQuery();
        ResultSet rs2 = pstConsulta2.executeQuery();
        ResultSet rs3 = pstConsulta3.executeQuery();
        ResultSet rs4 = pstConsulta4.executeQuery();
        ResultSet rs5 = pstConsulta5.executeQuery();
        ResultSet rs6 = pstConsulta6.executeQuery();
        ResultSet rs7 = pstConsulta7.executeQuery();
        ResultSet rs8 = pstConsulta8.executeQuery();
        

        // Mueve el cursor al primer resultado para cada consulta
        rs1.next();
        rs2.next();
        rs3.next();
        rs4.next();
        rs5.next();
        rs6.next();
        rs7.next();
        rs8.next();
        

        // Obtiene los valores de totalHaber de cada consulta
        double total1 = rs1.getDouble("totalDebe");
        double total2 = rs2.getDouble("totalDebe");
        double total3 = rs3.getDouble("totalDebe");
        double total4 = rs4.getDouble("totalDebe");
        double total5 = rs5.getDouble("totalDebe");
        double total6 = rs6.getDouble("totalDebe");
        double total7 = rs7.getDouble("totalDebe");
        double total8 = rs8.getDouble("totalDebe");

        // Obtiene el modelo de la tabla
        DefaultTableModel modelo = (DefaultTableModel) jtableTablaComprasTotales.getModel();

        // Establece los valores en las filas y columnas correspondientes
        modelo.setValueAt(total1, 0, 0); // totalHaber del código 51 en la primera fila y primera columna
        modelo.setValueAt(total2, 0, 1); // totalHaber del código 52 en la primera fila y segunda columna
        modelo.setValueAt(total3, 0, 2); // totalHaber del código 53 en la primera fila y tercera columna
        modelo.setValueAt(total4, 0, 3);
        modelo.setValueAt(total5, 0, 4); // totalHaber del código 51 en la primera fila y primera columna
        modelo.setValueAt(total6, 0, 5); // totalHaber del código 52 en la primera fila y segunda columna
        modelo.setValueAt(total7, 0, 6); // totalHaber del código 53 en la primera fila y tercera columna
        modelo.setValueAt(total8, 0, 7);
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    public void mostrarResultado3() {
    ConexionDB db = new ConexionDB();
    Connection cn = db.conectar();

    try {
        // Consultas SQL para obtener los datos de diferentes códigos de la tabla mayorizacion
        String consultaCodigo1 = "SELECT totalHaber FROM mayorizacion WHERE codigo = '5101'";
        String consultaCodigo2 = "SELECT totalHaber FROM mayorizacion WHERE codigo = '5102'";
 

        // Ejecutar las consultas y obtener los resultados
        PreparedStatement pstConsulta1 = cn.prepareStatement(consultaCodigo1);
        PreparedStatement pstConsulta2 = cn.prepareStatement(consultaCodigo2);
       

        ResultSet rs1 = pstConsulta1.executeQuery();
        ResultSet rs2 = pstConsulta2.executeQuery();
       
        

        // Mueve el cursor al primer resultado para cada consulta
        rs1.next();
        rs2.next();
        

        // Obtiene los valores de totalHaber de cada consulta
        double total1 = rs1.getDouble("totalHaber");
        double total2 = rs2.getDouble("totalHaber");
       

        // Obtiene el modelo de la tabla
        DefaultTableModel modelo = (DefaultTableModel) tablaComprasNetas.getModel();

        // Establece los valores en las filas y columnas correspondientes
        modelo.setValueAt(total1, 0, 1); // totalHaber del código 51 en la primera fila y primera columna
        modelo.setValueAt(total2, 0, 2); // totalHaber del código 52 en la primera fila y segunda columna
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    public void mostrarResultado4() {
    ConexionDB db = new ConexionDB();
    Connection cn = db.conectar();

    try {
        // Consultas SQL para obtener los datos de diferentes códigos de la tabla mayorizacion
        String consultaCodigo1 = "SELECT totalDebe FROM mayorizacion WHERE codigo = '1103'";
        
        // Ejecutar las consultas y obtener los resultados
        PreparedStatement pstConsulta1 = cn.prepareStatement(consultaCodigo1);
      
        ResultSet rs1 = pstConsulta1.executeQuery();
        // Mueve el cursor al primer resultado para cada consulta
        rs1.next();
       
        

        // Obtiene los valores de totalHaber de cada consulta
        double total1 = rs1.getDouble("totalDebe");
        

        // Obtiene el modelo de la tabla
        DefaultTableModel modelo = (DefaultTableModel) jtableTablaMercanciasDispo.getModel();

        // Establece los valores en las filas y columnas correspondientes
        modelo.setValueAt(total1, 0, 1); // totalHaber del código 51 en la primera fila y primera columna
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    
    public double obtenerTotal(String codigo) {
    ConexionDB db = new ConexionDB();
    Connection cn = db.conectar();
    double total = 0;

    try {
        String consulta = "SELECT totalDebe FROM mayorizacion WHERE codigo = ?";
        PreparedStatement pstConsulta = cn.prepareStatement(consulta);
        pstConsulta.setString(1, codigo);
        ResultSet rs = pstConsulta.executeQuery();

        if (rs.next()) {
            total = rs.getDouble("totalDebe");
        }
    } catch (SQLException e) {
        // Manejar la excepción si ocurre algún error durante la consulta
       JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } 
    
    return total;
}
     public double obtenerTotalDos(String codigo) {
    ConexionDB db = new ConexionDB();
    Connection cn = db.conectar();
    double total = 0;

    try {
        String consulta = "SELECT totalHaber FROM mayorizacion WHERE codigo = ?";
        PreparedStatement pstConsulta = cn.prepareStatement(consulta);
        pstConsulta.setString(1, codigo);
        ResultSet rs = pstConsulta.executeQuery();

        if (rs.next()) {
            total = rs.getDouble("totalHaber");
        }
    } catch (SQLException e) {
        // Manejar la excepción si ocurre algún error durante la consulta
       JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } 
    
    return total;
}
    
     public void actualizarCuentas() {
    ConexionDB db = new ConexionDB();
    Connection cn = db.conectar();

    try {
        // Consultas SQL para actualizar los valores a cero en la tabla mayorizacion
        String updateCodigo1 = "UPDATE mayorizacion SET totalHaber = 0 WHERE codigo = '51'";
        String updateCodigo2 = "UPDATE mayorizacion SET totalHaber = 0 WHERE codigo = '5103'";
        String updateCodigo3 = "UPDATE mayorizacion SET totalDebe = 0 WHERE codigo = '410104'";
        String updateCodigo4 = "UPDATE mayorizacion SET totalDebe = 0 WHERE codigo = '410103'";
        String updateCodigo5 = "UPDATE mayorizacion SET totalDebe = 0 WHERE codigo = '4101'";
        String updateCodigo6 = "UPDATE mayorizacion SET totalDebe = 0 WHERE codigo = '410102'";
        String updateCodigo7 = "UPDATE mayorizacion SET totalDebe = 0 WHERE codigo = '410106'";
        String updateCodigo8 = "UPDATE mayorizacion SET totalDebe = 0 WHERE codigo = '410113'";
        String updateCodigo9 = "UPDATE mayorizacion SET totalDebe = 0 WHERE codigo = '410114'";
        String updateCodigo10 = "UPDATE mayorizacion SET totalDebe = 0 WHERE codigo = '410120'";
        String updateCodigo11 = "UPDATE mayorizacion SET totalDebe = 0 WHERE codigo = '410119'";
        String updateCodigo12= "UPDATE mayorizacion SET totalDebe = 0 WHERE codigo = '410107'";
        String updateCodigo13 = "UPDATE mayorizacion SET totalHaber = 0 WHERE codigo = '5101'";
        String updateCodigo14 = "UPDATE mayorizacion SET totalHaber = 0 WHERE codigo = '5102'";
        String updateCodigo15 = "UPDATE mayorizacion SET totalHaber = 0 WHERE codigo = '1103'";
        
        
        

        // Ejecutar las consultas de actualización
        PreparedStatement pstUpdate1 = cn.prepareStatement(updateCodigo1);
        PreparedStatement pstUpdate2 = cn.prepareStatement(updateCodigo2);
        PreparedStatement pstUpdate3 = cn.prepareStatement(updateCodigo3);
        PreparedStatement pstUpdate4 = cn.prepareStatement(updateCodigo4);
        PreparedStatement pstUpdate5 = cn.prepareStatement(updateCodigo5);
        PreparedStatement pstUpdate6 = cn.prepareStatement(updateCodigo6);
        PreparedStatement pstUpdate7 = cn.prepareStatement(updateCodigo7);
        PreparedStatement pstUpdate8 = cn.prepareStatement(updateCodigo8);
        PreparedStatement pstUpdate9 = cn.prepareStatement(updateCodigo9);
        PreparedStatement pstUpdate10 = cn.prepareStatement(updateCodigo10);
        PreparedStatement pstUpdate11 = cn.prepareStatement(updateCodigo11);
        PreparedStatement pstUpdate12 = cn.prepareStatement(updateCodigo12);
        PreparedStatement pstUpdate13 = cn.prepareStatement(updateCodigo13);
        PreparedStatement pstUpdate14 = cn.prepareStatement(updateCodigo14);
        PreparedStatement pstUpdate15 = cn.prepareStatement(updateCodigo15);
        

        pstUpdate1.executeUpdate();
        pstUpdate2.executeUpdate();
        pstUpdate3.executeUpdate();
        pstUpdate4.executeUpdate();
        pstUpdate5.executeUpdate();
        pstUpdate6.executeUpdate();
        pstUpdate7.executeUpdate();
        pstUpdate8.executeUpdate();
        pstUpdate9.executeUpdate();
        pstUpdate10.executeUpdate();
        pstUpdate11.executeUpdate();
        pstUpdate12.executeUpdate();
        pstUpdate13.executeUpdate();
        pstUpdate14.executeUpdate();
        pstUpdate15.executeUpdate();
        
        
        

        // Notificar al usuario que las cuentas han sido actualizadas
        JOptionPane.showMessageDialog(null, "Cuentas actualizadas correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
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
        btnCierre = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaComprasNetas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtVentasNetas = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtableTablaMercanciasDispo = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtComprasTotales = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtableTablaUtilidad = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtComprasNetas = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtCostoVenta = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtableTablaCostoVenta = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtUtilidad = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtableTablaComprasTotales = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtMercaDispo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("CIERRE CONTABLE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, -1, -1));

        btnCierre.setText("CIERRE");
        btnCierre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCierreActionPerformed(evt);
            }
        });
        jPanel1.add(btnCierre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 150, 30));

        tablaComprasNetas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Compras Totales", "Descuento/Compra", "Devoluciones/Compra"
            }
        ));
        tablaComprasNetas.setShowVerticalLines(true);
        jScrollPane1.setViewportView(tablaComprasNetas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 470, 70));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ventas Netas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 170, -1));

        txtVentasNetas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtVentasNetas.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtVentasNetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, 110, 30));

        jtableTablaMercanciasDispo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Compras Netas", "Inventario Inicial"
            }
        ));
        jtableTablaMercanciasDispo.setShowVerticalLines(true);
        jScrollPane2.setViewportView(jtableTablaMercanciasDispo);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 310, 70));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Compras Totales");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 120, 150, -1));

        txtComprasTotales.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtComprasTotales, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 170, 110, 30));

        jtableTablaUtilidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Ventas Netas", "Costo de Venta"
            }
        ));
        jtableTablaUtilidad.setShowVerticalLines(true);
        jScrollPane3.setViewportView(jtableTablaUtilidad);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, 310, 70));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Compras Netas");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, -1, -1));

        txtComprasNetas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtComprasNetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 260, 110, 30));

        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Ventas Software", "Servicio Consultoría", "Devoluciones", "Descuento"
            }
        ));
        tablaVentas.setShowVerticalLines(true);
        jScrollPane4.setViewportView(tablaVentas);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 470, 70));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Costo de Ventas");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, -1, -1));

        txtCostoVenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtCostoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 430, 110, 30));

        jtableTablaCostoVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Mercancías Disponibles", "Inventario Final"
            }
        ));
        jScrollPane5.setViewportView(jtableTablaCostoVenta);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 310, 70));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Utilidad Bruta del Ejercicio");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, -1, -1));

        txtUtilidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtUtilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 510, 100, 30));

        jtableTablaComprasTotales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Compras", "Gasto sobre Compras", "Gastos por servivios Básicos", "Gasto por papeleria y útiles", "Gasto de Consultoría", "Gasto del desarrollo del sistema", "Costo de instalación", "Gasto de publicidad y marketing"
            }
        ));
        jtableTablaComprasTotales.setMinimumSize(new java.awt.Dimension(45, 40));
        jtableTablaComprasTotales.setShowVerticalLines(true);
        jScrollPane6.setViewportView(jtableTablaComprasTotales);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 940, 70));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Mercancías Disponibles");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, -1, -1));

        txtMercaDispo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtMercaDispo, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, 110, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("$");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 260, 20, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("$");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 20, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("$");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 170, 20, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("$");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 510, 20, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("$");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 20, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("$");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, 20, -1));

        btnActualizar.setText("Actualizar Balance");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCierreActionPerformed
    double devolucionesSobreVentas = obtenerTotal("410103");
    double descuentosSobreVentas = obtenerTotal("410104");
    double ventas = obtenerTotalDos("51");
    double consultoria = obtenerTotalDos("5103");
    
    double totalDevolucionesDescuentos = devolucionesSobreVentas + descuentosSobreVentas;
    double totalIngresos = ventas + consultoria;
    double ventasNetas = totalIngresos - totalDevolucionesDescuentos;
    
    txtVentasNetas.setToolTipText(null);
    txtVentasNetas.setText(String.valueOf(ventasNetas));
    txtVentasNetas.setEditable(false);
    DefaultTableModel modelo5 = (DefaultTableModel)jtableTablaUtilidad.getModel();
    modelo5.setValueAt(ventasNetas, 0, 0);
   
    
    double compras = obtenerTotal("4101");
    double gastosSobreCompra = obtenerTotal("410102");
    double gastoServiciosBasicos = obtenerTotal("410106");
    double gastosPapeleria= obtenerTotal("410113");
    double gastoPublicidad = obtenerTotal("410114");
    double gastoConsultoria = obtenerTotal("410120");
    double costoDesarrollo = obtenerTotal("410119");
    double costoInstalacion = obtenerTotal("410107");
    double comprasTotales = compras + gastosSobreCompra + gastoServiciosBasicos + gastosPapeleria + gastoPublicidad + gastoConsultoria + costoDesarrollo + costoInstalacion;
    
    
    txtComprasTotales.setToolTipText(null);
    txtComprasTotales.setText(String.valueOf(comprasTotales));
    txtComprasTotales.setEditable(false);
    DefaultTableModel modelo = (DefaultTableModel) tablaComprasNetas.getModel();
    modelo.setValueAt(comprasTotales, 0, 0);
    
    double descuentoSobreCompras = obtenerTotalDos("5101");
    double devolucionesSobreCompras = obtenerTotalDos("5102");
    double totalDevoluDesc = descuentoSobreCompras + devolucionesSobreCompras;
    double comprasNetas = comprasTotales - totalDevoluDesc;
    
    txtComprasNetas.setToolTipText(null);
    txtComprasNetas.setText(String.valueOf(comprasNetas));
    txtComprasNetas.setEditable(false);
    DefaultTableModel modelo1 = (DefaultTableModel) jtableTablaMercanciasDispo.getModel();
    modelo1.setValueAt(comprasNetas, 0, 0);
    
    double inventarioInicial = obtenerTotal("1103");
    double mercaDispo = comprasNetas + inventarioInicial;
    txtMercaDispo.setToolTipText(null);
    txtMercaDispo.setText(String.valueOf(mercaDispo));
    txtMercaDispo.setEditable(false);
    DefaultTableModel modelo2 = (DefaultTableModel)jtableTablaCostoVenta.getModel();
    modelo2.setValueAt(mercaDispo, 0, 0);
    
    
    //double inventarioFinal = inventarioInicial + (comprasNetas-ventasNetas);
    double inventarioFinal = 0.0;
    DefaultTableModel modelo3 = (DefaultTableModel)jtableTablaCostoVenta.getModel();
    double inventarioFinalPositivo = Math.abs(inventarioFinal); 
    modelo3.setValueAt(inventarioFinalPositivo, 0, 1);
    double costoVenta = mercaDispo - inventarioFinal;
    txtCostoVenta.setToolTipText(null);
    txtCostoVenta.setText(String.valueOf(costoVenta));
    txtCostoVenta.setEditable(false);
    DefaultTableModel modelo4 = (DefaultTableModel)jtableTablaUtilidad.getModel();
    modelo4.setValueAt(costoVenta, 0, 1);
    
     double utilidad = ventasNetas - costoVenta;
     txtUtilidad.setToolTipText(null);
     txtUtilidad.setText(String.valueOf(utilidad));
     txtUtilidad.setEditable(false);
    
     
    ConexionDB db = new ConexionDB();
    Connection cn = db.conectar();
     try {
    // Resto de tu código para las consultas de actualización...
    
    String updateUtilidad = "UPDATE mayorizacion SET totalHaber = ? WHERE codigo = '3103'";
    PreparedStatement pstUpdateUtilidad = cn.prepareStatement(updateUtilidad);
    pstUpdateUtilidad.setDouble(1, utilidad);
    pstUpdateUtilidad.executeUpdate();

    // Resto de tu código para las consultas de actualización...

    JOptionPane.showMessageDialog(null, "Cierre contable realizado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}
   
    
    
    
       
    }//GEN-LAST:event_btnCierreActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizarCuentas();
    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCierre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jtableTablaComprasTotales;
    private javax.swing.JTable jtableTablaCostoVenta;
    private javax.swing.JTable jtableTablaMercanciasDispo;
    private javax.swing.JTable jtableTablaUtilidad;
    private javax.swing.JTable tablaComprasNetas;
    private javax.swing.JTable tablaVentas;
    private javax.swing.JTextField txtComprasNetas;
    private javax.swing.JTextField txtComprasTotales;
    private javax.swing.JTextField txtCostoVenta;
    private javax.swing.JTextField txtMercaDispo;
    private javax.swing.JTextField txtUtilidad;
    private javax.swing.JTextField txtVentasNetas;
    // End of variables declaration//GEN-END:variables
}
