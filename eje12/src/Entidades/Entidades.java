/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;



/**
 *
 * @author famil
 */
public class Entidades {
    public int dia;
    public int mes;
    public int año;
    private String nombre;

    public Entidades() {
    }

    public Entidades(int dia, int mes, int año, String nombre) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.nombre = nombre;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Entidades{" + "dia=" + dia + ", mes=" + mes + ", a\u00f1o=" + año + ", nombre=" + nombre + '}';
    }

    
    
}
