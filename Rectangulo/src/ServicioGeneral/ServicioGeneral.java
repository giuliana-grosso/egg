/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioGeneral;

import Entidades.Entidades;
import java.util.Scanner;

/**
 *
 * @author famil
 */
public class ServicioGeneral {
    public Entidades entrada()   {
        //instanciacion de un objeto
        Entidades R1 = new Entidades();
        //le asignamos valor
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese su base y luego su altura");
        R1.setBase(leer.nextInt());
        R1.setAltura(leer.nextInt());
        return R1;
    }
    public double Superficie(int Altura, int Base) {
return Base*Altura;
    }
public double Perimetro(int Altura, int Base){
    return (Base+Altura)*2; 
}
public void Diujar (int Altura, int Base){
    for (int i = 1; i <= Altura; i++) {
            for (int j = 1; j <= Base; j++) {
                if ((i > 1 && i < Altura) && (j > 1 && j < Base)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
}
}
