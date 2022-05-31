/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10;

import Entidades.Entidades;
import ServicioGeneral.ServicioGeneral;

/**
 *
 * @author famil
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioGeneral C2 = new ServicioGeneral();
        Entidades C1 = C2.Entrada();
        C2.b(C1);
        C2.mostrar(C1);
        
    }
    
}
