/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioGeneral;

import Entidades.Entidades;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author famil
 */
public class ServicioGeneral {

    public Entidades Entrada() {
        Scanner leer = new Scanner(System.in);
        //instacio el objeto
        Entidades C1 = new Entidades();
        //atributos
        System.out.println("ingrese su nombre y el dia, mes y año de cumpleaños");
        C1.setNombre(leer.nextLine());
        C1.setDia(leer.nextInt());
        C1.setMes(leer.nextInt());
        C1.setAño(leer.nextInt());
        return C1;

        // Period p = Period.between(fecha1,fecha2)
    }

    public void crear(Entidades C1) {
        LocalDate fecha = LocalDate.of(C1.getAño(), C1.getMes(), C1.getDia());
        System.out.println(fecha);
        LocalDate hoy = LocalDate.now();
        System.out.println(hoy);
        Period p = Period.between(fecha, hoy);
        System.out.println("usted tiene: " + p.getYears() + " años con " + p.getMonths() + " meces y " + p.getDays() + " dias ");

    }

    public void menor(Entidades C1) {
        System.out.println("ingrese una edad ");
        Scanner leer = new Scanner(System.in);
        int edad2 = leer.nextInt();
        LocalDate fecha = LocalDate.of(C1.getAño(), C1.getMes(), C1.getDia());
        LocalDate hoy = LocalDate.now();
        Period p = Period.between(fecha, hoy);
        if (p.getYears()<edad2)
      {System.out.println("verdadero");
        } else {
            System.out.println("falso");
        }

    }
    public void perso (Entidades C1){
        System.out.println(C1.toString());
    }
    

}
