/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioGeneral;

import Entidades.Entidades;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

/**
 *
 * @author famil
 */
public class ServicioGeneral {

    public Entidades Entrada() {
        //innstanncio el objeto 
        Entidades C1 = new Entidades();
        //atributos
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese su dia, mes y año");
        C1.setDia(leer.nextInt());
        C1.setMes(leer.nextInt());
        C1.setAño(leer.nextInt());
        
        return C1;
    }
   public void LocalDate (Entidades C1){
       // fecha objeto
      LocalDate fecha = LocalDate.of(C1.getAño(), C1.getMes(), C1.getDia());
       System.out.println(fecha);
        //variable de hoy
        LocalDate hoy = LocalDate.now();
        System.out.println(hoy);
        
        int diferencia= hoy.getYear()-fecha.getYear();
        System.out.println("la diferencia de años es de: "+diferencia);
   }
}
