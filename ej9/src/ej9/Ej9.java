/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej9;

import Entidades.Entidades;
import ServicioGeneral.ServicioGeneral;

/**
 *
 * @author famil
 */
public class Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioGeneral C2 = new ServicioGeneral();
        Entidades C1 = C2.Entrada();
        C2.Mayor(C1);
        C2.Potencia(C1);
        C2.raiz(C1);
    }
    
}
