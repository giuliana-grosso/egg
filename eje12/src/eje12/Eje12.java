/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje12;

import Entidades.Entidades;
import ServicioGeneral.ServicioGeneral;

/**
 *
 * @author famil
 */
public class Eje12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ServicioGeneral C2 = new ServicioGeneral();
        Entidades C1 = C2.Entrada();
        C2.crear(C1);
        C2.menor(C1);
        C2.perso(C1);
    }
    
}
