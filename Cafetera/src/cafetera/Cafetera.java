/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafetera;

import Entidades.Entidades;
import ServicioGeneral.ServicioGeneral;

/**
 *
 * @author famil
 */
public class Cafetera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioGeneral C2 = new ServicioGeneral();
        Entidades C1 = C2.Entrada();
        C2.servirTaza(C1);
        C2.vaciar(C1);
        C2.agregar(C1);

    }

}
