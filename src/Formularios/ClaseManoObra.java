/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Formularios;

/**
 *
 * @author Lenovo_T460s
 */
public class ClaseManoObra {
  private int idMano;
    private String nombre;  
    private String puesto;
    private double salario;
    private double septimo;
    private double vacaciones;
    private double salariocancelado;
    private double aguinaldo;
    private double isss;
    private double afp;
    private double insaforp;
    private double costoreal;

    public int getIdMano() {
        return idMano;
    }

    public void setIdMano(int idMano) {
        this.idMano = idMano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSeptimo() {
        return septimo;
    }

    public void setSeptimo(double septimo) {
        this.septimo = septimo;
    }

    public double getVacaciones() {
        return vacaciones;
    }

    public void setVacaciones(double vacaciones) {
        this.vacaciones = vacaciones;
    }

    public double getSalariocancelado() {
        return salariocancelado;
    }

    public void setSalariocancelado(double salariocancelado) {
        this.salariocancelado = salariocancelado;
    }

    public double getAguinaldo() {
        return aguinaldo;
    }

    public void setAguinaldo(double aguinaldo) {
        this.aguinaldo = aguinaldo;
    }

    public double getIsss() {
        return isss;
    }

    public void setIsss(double isss) {
        this.isss = isss;
    }

    public double getAfp() {
        return afp;
    }

    public void setAfp(double afp) {
        this.afp = afp;
    }

    public double getInsaforp() {
        return insaforp;
    }

    public void setInsaforp(double insaforp) {
        this.insaforp = insaforp;
    }

    public double getCostoreal() {
        return costoreal;
    }

    public void setCostoreal(double costoreal) {
        this.costoreal = costoreal;
    }

    public ClaseManoObra(String nombre, String puesto, double salario, double septimo, double vacaciones, double salariocancelado, double aguinaldo, double isss, double afp, double insaforp, double costoreal) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        this.septimo = septimo;
        this.vacaciones = vacaciones;
        this.salariocancelado = salariocancelado;
        this.aguinaldo = aguinaldo;
        this.isss = isss;
        this.afp = afp;
        this.insaforp = insaforp;
        this.costoreal = costoreal;
    }  
}
