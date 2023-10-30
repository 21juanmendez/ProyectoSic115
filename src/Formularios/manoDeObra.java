/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Formularios;

import Conexiones.ConexionDB;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author juann
 */
public class manoDeObra extends javax.swing.JPanel {

    /**
     * Creates new form manoDeObra
     */
    public manoDeObra() {
        initComponents();
        tablemodelo();
        valoresIniciales();
    }

    public void valoresIniciales() {
        txtNombre.setText("");
        txtPuesto.setText("");
        txtSalario.setText("0");
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(true);
        jButtonLimpiar.setEnabled(false);
        lblID.setText("");
        lblTotal.setText("");
        jLabel5.setVisible(false);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPuesto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaManoObra = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnTotal = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Mano de Obra");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nombre:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 22, -1, -1));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 480, -1));

        jLabel3.setText("Puesto:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, -1, -1));

        txtPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPuestoActionPerformed(evt);
            }
        });
        jPanel2.add(txtPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 160, -1));

        jLabel4.setText("Salario:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, -1, -1));
        jPanel2.add(txtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, 140, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, -1, -1));

        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 1180, 100));

        tablaManoObra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaManoObra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaManoObraMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaManoObra);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 1180, 280));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Total del costo real de mano de obra:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, -1, -1));

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTotal.setText("Aqui va el valor");
        jPanel1.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 530, -1, -1));

        btnTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTotal.setText("Ver Total");
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });
        jPanel1.add(btnTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, 130, -1));

        lblID.setEnabled(false);
        jPanel1.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 90, 30));

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

    private void txtPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPuestoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nombre = txtNombre.getText();
        String puesto = txtPuesto.getText();
        double salario = Double.parseDouble(txtSalario.getText());
        double septimo = Double.parseDouble(txtSalario.getText()) * 7;
        septimo = Math.round(septimo * 100) / 100d;
        double vacaciones = Double.parseDouble(txtSalario.getText()) * 15 * (1.3) / 52;
        vacaciones = Math.round(vacaciones * 100) / 100d;
        double salariocancelado = septimo + vacaciones;
        double aguinaldo = Double.parseDouble(txtSalario.getText()) * 18 / 52;
        aguinaldo = Math.round(aguinaldo * 100) / 100d;
        double isss = salariocancelado * 0.075;
        isss = Math.round(isss * 100) / 100d;
        double afp = salariocancelado * 0.0775;
        afp = Math.round(afp * 100) / 100d;
        double insaforp = salariocancelado * 0.01;
        insaforp = Math.round(insaforp * 100) / 100d;
        double costoreal = salariocancelado + aguinaldo + isss + afp + insaforp;

        ClaseManoObra MDO = new ClaseManoObra(nombre, puesto, salario, septimo, vacaciones, salariocancelado, aguinaldo, isss, afp, insaforp, costoreal);

        ConexionDB objetoConexion = new ConexionDB();

        String consulta = "insert into manodeobra (nombre,puesto,pago_al_dia,septimo_dia,vacaciones,salario_cancelado,aguinaldo,isss,afp,insaforp,costo_real) values (?,?,?,?,?,?,?,?,?,?,?);";
        try {

            CallableStatement cs = objetoConexion.conectar().prepareCall(consulta);
            cs.setString(1, MDO.getNombre());
            cs.setString(2, MDO.getPuesto());
            cs.setDouble(3, MDO.getSalario());
            cs.setDouble(4, MDO.getSeptimo());
            cs.setDouble(5, MDO.getVacaciones());
            cs.setDouble(6, MDO.getSalariocancelado());
            cs.setDouble(7, MDO.getAguinaldo());
            cs.setDouble(8, MDO.getIsss());
            cs.setDouble(9, MDO.getAfp());
            cs.setDouble(10, MDO.getInsaforp());
            cs.setDouble(11, MDO.getCostoreal());

            cs.execute();
            JOptionPane.showMessageDialog(null, "El Nuevo Empleado se ha ingresado correctamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.toString());
        }
        tablemodelo();
        txtNombre.setText("");
        txtPuesto.setText("");
        txtSalario.setText("0");
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tablaManoObraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaManoObraMouseClicked
        int filaSeleccionada = tablaManoObra.getSelectedRow();

        if (filaSeleccionada >= 0) {
            int id = Integer.parseInt(tablaManoObra.getValueAt(filaSeleccionada, 0).toString());
            String nombre = tablaManoObra.getValueAt(filaSeleccionada, 1).toString();
            String puesto = tablaManoObra.getValueAt(filaSeleccionada, 2).toString();
            String salario = tablaManoObra.getValueAt(filaSeleccionada, 3).toString();
            // Actualiza los campos de texto y otros componentes con los valores de la fila seleccionada
            txtNombre.setText(nombre);
            txtPuesto.setText(puesto);
            txtSalario.setText(salario);
            btnModificar.setEnabled(true);
            btnEliminar.setEnabled(true);
            btnGuardar.setEnabled(false);
            jButtonLimpiar.setEnabled(true);
            lblID.setText(String.valueOf(id));
            lblID.setVisible(true);
        }
    }//GEN-LAST:event_tablaManoObraMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int id = Integer.parseInt(lblID.getText());
        String nombre = txtNombre.getText();
        String puesto = txtPuesto.getText();
        double salario = Double.parseDouble(txtSalario.getText());
        double septimo = Double.parseDouble(txtSalario.getText()) * 7;
        septimo = Math.round(septimo * 100) / 100d;
        double vacaciones = Double.parseDouble(txtSalario.getText()) * 15 * (1.3) / 52;
        vacaciones = Math.round(vacaciones * 100) / 100d;
        double salariocancelado = septimo + vacaciones;
        double aguinaldo = Double.parseDouble(txtSalario.getText()) * 18 / 52;
        aguinaldo = Math.round(aguinaldo * 100) / 100d;
        double isss = salariocancelado * 0.075;
        isss = Math.round(isss * 100) / 100d;
        double afp = salariocancelado * 0.0775;
        afp = Math.round(afp * 100) / 100d;
        double insaforp = salariocancelado * 0.01;
        insaforp = Math.round(insaforp * 100) / 100d;
        double costoreal = salariocancelado + aguinaldo + isss + afp + insaforp;

        ClaseManoObra MDO = new ClaseManoObra(nombre, puesto, salario, septimo, vacaciones, salariocancelado, aguinaldo, isss, afp, insaforp, costoreal);

        ConexionDB objetoConexion = new ConexionDB();

        String consulta = String.format("UPDATE manodeobra SET nombre='%s'," + "puesto='%s'," + "pago_al_dia='%f'," + "septimo_dia='%f'," + "vacaciones='%f'," + "salario_cancelado='%f'," + "aguinaldo='%f'," + "isss='%f'," + "afp='%f'," + "insaforp='%f'," + "costo_real='%f' WHERE manodeobra.id=%d", nombre, puesto, salario, septimo, vacaciones, salariocancelado, aguinaldo, isss, afp, insaforp, costoreal, id);

        try {

            CallableStatement cs = objetoConexion.conectar().prepareCall(consulta);

            cs.execute();
            JOptionPane.showMessageDialog(null, "El registro se ha MODIFICADO correctamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.toString());
        }
        tablemodelo();
        valoresIniciales();

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int id = Integer.parseInt(lblID.getText());
        ConexionDB objetoConexion = new ConexionDB();

        String consulta = String.format("DELETE FROM manodeobra WHERE manodeobra.id=%d", id);
        try {

            CallableStatement cs = objetoConexion.conectar().prepareCall(consulta);

            cs.execute();
            JOptionPane.showMessageDialog(null, "El registro se ELIMINADO correctamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.toString());
        }
        tablemodelo();
        valoresIniciales();

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
        double t = 0;
        double p = 0;
        if (tablaManoObra.getRowCount() > 0) {
            for (int i = 0; i < tablaManoObra.getRowCount(); i++) {
                p = Double.parseDouble(tablaManoObra.getValueAt(i, 11).toString());
                t += p;
            }
            t = Math.round(t * 100) / 100d;
            lblTotal.setText("$ " + t);
            jLabel5.setVisible(true);
            btnGuardar.setEnabled(true);
            btnModificar.setEnabled(false);
            btnEliminar.setEnabled(false);
            jButtonLimpiar.setEnabled(false);
            tablaManoObra.clearSelection();
            txtNombre.setText("");
            txtPuesto.setText("");
            txtSalario.setText("");

        }
    }//GEN-LAST:event_btnTotalActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        // TODO add your handling code here:
        valoresIniciales();
        jButtonLimpiar.setEnabled(false);
        tablaManoObra.clearSelection();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed
    public void tablemodelo() {
        ConexionDB objetoConexion = new ConexionDB();

        DefaultTableModel modelo = new DefaultTableModel();

        String sql = "";
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Puesto de Trabajo");
        modelo.addColumn("Pago Diario");
        modelo.addColumn("Septimo dia");
        modelo.addColumn("Vacaciones Anuales");
        modelo.addColumn("Salario Cancelado");
        modelo.addColumn("Aguinaldo");
        modelo.addColumn("ISSS");
        modelo.addColumn("AFP");
        modelo.addColumn("INSAFORP");
        modelo.addColumn("Costo Real Empleado");

        tablaManoObra.setModel(modelo);

        sql = "select id, nombre,puesto,pago_al_dia,septimo_dia,vacaciones,salario_cancelado,aguinaldo,isss,afp,insaforp,costo_real from manodeobra;";

        String[] datos = new String[12];

        Statement st;

        try {

            st = objetoConexion.conectar().createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                datos[9] = rs.getString(10);
                datos[10] = rs.getString(11);
                datos[11] = rs.getString(12);

                modelo.addRow(datos);

            }

            tablaManoObra.setModel(modelo);
            TableColumnModel columnModel = tablaManoObra.getColumnModel();
            TableColumn columna = columnModel.getColumn(0);
            TableColumn columna1 = columnModel.getColumn(1);
            columna.setPreferredWidth(25);
            columna1.setPreferredWidth(200);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error:" + e.toString());

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnTotal;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tablaManoObra;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPuesto;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
