/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena;

import Entidades.Entidades;
import ServicioGeneral.ServicioGeneral;
import java.util.Scanner;

/**
 *
 * @author famil
 */
public class Cadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        ServicioGeneral C2= new ServicioGeneral();
        Entidades C1 = C2.Entrada();
      C2.vocales(C1);
      C2.invertir(C1);
      C2.repetir(C1);
      C2.comparar(C1);
      C2.unir(C1);
      C2.reempla(C1);
      C2.conti(C1);
      
    }
         
    }
     
    
