/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacion;

import Entidades.Entidades;
import Servicio.general;

/**
 *
 * @author famil
 */
public class Operacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        general N2 = new general ();
        Entidades N1 = N2.Entrada();
        System.out.println("sus numeros eran: "+N1.toString());
        System.out.println("su suma: "+N2.sumar(N1.getNumero1(),N1.getNumero2()));
        System.out.println("su resta: "+N2.resta(N1.getNumero1(),N1.getNumero2()));
        if (N2.multiplicar(N1.getNumero1(),N1.getNumero2())== 0){
            System.out.println("es incorrecto el valor: "+N2.multiplicar(N1.getNumero1(),N1.getNumero2()));
        }else 
            System.out.println("su multiplicacion es de: "+N2.multiplicar(N1.getNumero1(),N1.getNumero2()));
       
        if (N2.dividir(N1.getNumero1(),N1.getNumero2())== 0){
            System.out.println("es incorrecto el valor: "+N2.dividir(N1.getNumero1(),N1.getNumero2()));
        }else 
            System.out.println("su division es de: "+N2.dividir(N1.getNumero1(),N1.getNumero2()));
        
        
        
    }
    
}
