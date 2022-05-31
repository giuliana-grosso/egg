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
    public double []A;
    public double []B;

    public Entidades() {
    }

    public Entidades(double[] A, double[] B) {
        this.A = A;
        this.B = B;
    }

    public double[] getA() {
        return A;
    }

    public double[] getB() {
        return B;
    }

    public void setA(double[] A) {
        this.A = A;
    }

    public void setB(double[] B) {
        this.B = B;
    }

    @Override
    public String toString() {
        return "Entidades{" + "A=" + A + ", B=" + B + '}';
    }
    
    
}
