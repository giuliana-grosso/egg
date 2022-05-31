/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro1;

import Libro2.Libro;
import Servicio.ServicioGeneral;

/**
 *
 * @author famil
 */
public class Libro1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioGeneral li = new ServicioGeneral();
        Libro l1 = li.entrada();
        System.out.println(l1);
     }
       }
    


