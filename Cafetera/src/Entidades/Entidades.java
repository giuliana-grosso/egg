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
    private double Maxima;
    private double Actual;

    public Entidades() {
    }

    public Entidades(double Maxima, double Actual) {
        this.Maxima = Maxima;
        this.Actual = Actual;
    }

    public double getMaxima() {
        return Maxima;
    }

    public double getActual() {
        return Actual;
    }

    public void setMaxima(double Maxima) {
        this.Maxima = Maxima;
    }

    public void setActual(double Actual) {
        this.Actual = Actual;
    }

    @Override
    public String toString() {
        return "Entidades{" + "Maxima=" + Maxima + ", Actual=" + Actual + '}';
    }
    
    
    
    
}
