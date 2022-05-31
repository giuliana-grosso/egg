/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circuferecia;

import Circuferecia2.Circuferecia2;
import Servicio.ServicioGeneral;

/**
 *
 * @author famil
 */
public class Circuferecia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioGeneral C2 = new ServicioGeneral();
         Circuferecia2 C1 = C2.entrada();
         System.out.println("su radio era: "+C1.getRadio());
        System.out.println(" el area es: "+C2.Area(C1.getRadio()));
        System.out.println(" el perimetro es: "+C2.perimetro(C1.getRadio()));
        
    }
    
}
