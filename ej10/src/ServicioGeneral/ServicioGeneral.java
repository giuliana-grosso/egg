/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioGeneral;

import Entidades.Entidades;
import java.util.Arrays;

/**
 *
 * @author famil
 */
public class ServicioGeneral {
 
    public Entidades Entrada() {
        //innstanncio el objeto 
        Entidades C1 = new Entidades();
        C1.A = new double[50];
        C1.B = new double[20];
Math.asin(0)
        for (int i = 0; i < C1.A.length; i++) {
            C1.A[i] = Math.random() * 100;
        }
        System.out.println("VECTOR: ");
        for (int i = 0; i < C1.A.length; i++) {
            System.out.println(C1.A[i]);
            
        }
        System.out.println(" ");
        Arrays.sort(C1.A);

        return C1;
    }

    public void b(Entidades C1) {
        System.arraycopy(C1.A, 0, C1.B, 0, 10);
         for (int i = 10; i < C1.B.length; i++) {
            C1.B[i]=0.5;
        }
         
    }
    
    public void mostrar(Entidades C1){
          System.out.println("ORDENADO: "); 
        for (int i = 0; i < C1.A.length; i++) {
            System.out.println(C1.A[i]);
           
        }
          System.out.println(" ");
          System.out.println("VECTOR 2: ");
          for (int i = 0; i < C1.B.length; i++) {
            System.out.println(C1.B[i]);
         
        }
    }
}
