/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej11;

import Entidades.Entidades;
import ServicioGeneral.ServicioGeneral;

import java.util.Scanner;

/**
 *
 * @author famil
 */
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    ServicioGeneral C2 = new ServicioGeneral();
        Entidades C1 = C2.Entrada();
        C2.LocalDate(C1);
    
    }    
}
