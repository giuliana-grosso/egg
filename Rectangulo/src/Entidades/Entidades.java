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
    private int Base;
    private int Altura;

    public Entidades() {
    }

    public Entidades(int Base, int Altura) {
        this.Base = Base;
        this.Altura = Altura;
    }

    public int getBase() {
        return Base;
    }

    public int getAltura() {
        return Altura;
    }

    public void setBase(int Base) {
        this.Base = Base;
    }

    public void setAltura(int Altura) {
        this.Altura = Altura;
    }

    @Override
    public String toString() {
        return "Entidades{" + "Base=" + Base + ", Altura=" + Altura + '}';
    }
    
}
