/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo;

import Entidades.Entidades;
import ServicioGeneral.ServicioGeneral;

/**
 *
 * @author famil
 */
public class Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    ServicioGeneral R2 = new ServicioGeneral();
    Entidades R1 = R2.entrada();
        System.out.println("su base y altura eran: "+R1.toString());
        System.out.println("su superficie: "+R2.Superficie(R1.getAltura(),R1.getBase()));
        System.out.println("su perimetro: "+R2.Perimetro(R1.getAltura(), R1.getBase()));
        R2.Diujar(R1.getAltura(), R1.getBase());
         
        
    }
    
}
