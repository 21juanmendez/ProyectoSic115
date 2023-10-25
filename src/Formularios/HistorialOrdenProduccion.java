/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Formularios;

import java.util.Date;

/**
 *
 * @author Lenovo_T460s
 */
public class HistorialOrdenProduccion {
    private int id;
    private Date fechaExpedicion;
    private String producto;
    private String cliente;
    private Date fechaInicio;
    private Date fechaFin;
    private double costosDirectos;
    private double manoObra;
    private double costosIndirectos;
    private double CostoTotal;
    private double precioVenta;

    public HistorialOrdenProduccion(Date fechaExpedicion, String producto, String cliente, Date fechaInicio, Date fechaFin, double costosDirectos, double manoObra, double costosIndirectos, double CostoTotal, double precioVenta) {
        this.fechaExpedicion = fechaExpedicion;
        this.producto = producto;
        this.cliente = cliente;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costosDirectos = costosDirectos;
        this.manoObra = manoObra;
        this.costosIndirectos = costosIndirectos;
        this.CostoTotal = CostoTotal;
        this.precioVenta = precioVenta;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(Date fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getCostosDirectos() {
        return costosDirectos;
    }

    public void setCostosDirectos(double costosDirectos) {
        this.costosDirectos = costosDirectos;
    }

    public double getManoObra() {
        return manoObra;
    }

    public void setManoObra(double manoObra) {
        this.manoObra = manoObra;
    }

    public double getCostosIndirectos() {
        return costosIndirectos;
    }

    public void setCostosIndirectos(double costosIndirectos) {
        this.costosIndirectos = costosIndirectos;
    }

    public double getCostoTotal() {
        return CostoTotal;
    }

    public void setCostoTotal(double CostoTotal) {
        this.CostoTotal = CostoTotal;
    }
}
