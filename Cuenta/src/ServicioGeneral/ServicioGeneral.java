/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioGeneral;

import Entidades.Entidades;
import java.util.Scanner;

/**
 *
 * @author famil
 */
public class ServicioGeneral {

    Scanner leer = new Scanner(System.in);

    public Entidades Entrada() {
        //instanciacion de un objeto
        Entidades C1 = new Entidades();
        //le asignamos valor
        System.out.println("ingrese su numero de cuenta");
        C1.setNumeroCuenta(leer.nextInt());
        System.out.println("ingrese su DNI");
        C1.setDNI(leer.nextLong());
        System.out.println("ingrese su saldo actual");
        C1.setSaldo(leer.nextDouble());
        return C1;
    }

    public void ingresar(Entidades C1) {
        System.out.println("cantidad de dinero a ingresar");
        int ingresar = leer.nextInt();
        C1.setSaldo(C1.getSaldo() + ingresar);
        System.out.println(C1.getSaldo());
    }

    public void retirar(Entidades C1) {
        System.out.println("cantidad a retirar ");
        double retirar = leer.nextDouble();
        if (retirar > C1.getSaldo()) {
            C1.setSaldo(0);
        } else {
            C1.setSaldo(C1.getSaldo() - retirar);
        }
        System.out.println(C1.getSaldo());
    }

    public void extraccionRapida(Entidades C1) {
        double exrap = C1.getSaldo() * 0.20;
        System.out.println("usted extrajo "+exrap);
    }

    public void consultar(Entidades C1) {
        System.out.println("quiere ver su saldo? SI/NO");
        String res = leer.next();
        if (res.toUpperCase().equals("SI")) {
            System.out.println(C1.getSaldo());
        }
        }
    
    public void datos (Entidades C1) {
        System.out.println("quiere ver sus datos? SI/NO");
        String res = leer.next();
        if (res.toUpperCase().equals("SI")) {
            System.out.println(C1.toString());
        }
   }

}
