/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Circuferecia2.Circuferecia2;
import java.util.Scanner;

/**
 *
 * @author famil
 */
public class ServicioGeneral {

    public Circuferecia2 entrada() { //metodo 1
        //  insatciar u objeto
        Circuferecia2 C1 = new Circuferecia2 ();
        //llear los atributos con set
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su radio");
        C1.setRadio(leer.nextInt());
        return C1;
    }
    public double Area (double Radio) {
        return Math.PI *Math.pow(Radio,2); // pow mwtodo para la potencia
    }
    
    public double perimetro (double Radio){
        return 2*Math.PI*Radio;
    }
}
