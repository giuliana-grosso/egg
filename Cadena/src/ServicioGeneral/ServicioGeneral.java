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

    public Entidades Entrada() {
        // instanncio el objeto
        Entidades C1 = new Entidades();
        // le doy atributos
        System.out.println("ingrese su frase");
        Scanner leer = new Scanner(System.in);
        C1.setFrase(leer.nextLine());
        C1.setLongitud(C1.getFrase().length());
        return C1;
    }

    public void vocales(Entidades C1) {
        int vocales = 0;

        for (int i = 0; i < C1.getLongitud(); i++) {
            if (C1.getFrase().substring(i, i + 1).equalsIgnoreCase("a") || C1.getFrase().substring(i, i + 1).equalsIgnoreCase("e") || C1.getFrase().substring(i, i + 1).equalsIgnoreCase("i") || C1.getFrase().substring(i, i + 1).equalsIgnoreCase("o") || C1.getFrase().substring(i, i + 1).equalsIgnoreCase("u")) {
                vocales = vocales + 1;
            }
        }
        System.out.println(vocales);
    }

    public void invertir(Entidades C1) {
        String inv;
        StringBuilder dest = new StringBuilder();
        for (int i = (C1.getLongitud() - 1); i >= 0; i--) {
            dest.append(C1.getFrase().charAt(i));
        }
        System.out.println(dest);
    }

    public void repetir(Entidades C1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese letra a buscar");
        String buscar = leer.next();
        int cont = 0;
        for (int i = 0; i < C1.getLongitud(); i++) {
            if (C1.getFrase().substring(i, i + 1).equalsIgnoreCase(buscar)) {
                cont++;
            }
        }
        System.out.println(cont);
    }

    public void comparar(Entidades C1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese nueva frase");
        String frase = leer.nextLine();
        int num = frase.length();
        if (num > C1.getLongitud()) {
            System.out.println("la frase ingresada es mayor que la original");
        } else {
            System.out.println("la frase original es mayor que la ingresada");
        }
    }

    public void unir(Entidades C1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese nueva frase");
        String frase = leer.nextLine();
        System.out.println(" " + C1.getFrase().concat(frase));
    }

    public void reempla(Entidades C1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese su caracter");
        String carac = leer.next();
        System.out.println(C1.getFrase().replace("a", carac));
    }

    public void conti(Entidades C1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese su caracter");
        String carac = leer.next();
        for (int i = 0; i < C1.getLongitud(); i++) {
            if (C1.getFrase().substring(i, i + 1).equalsIgnoreCase(carac)) {
                System.out.println("verdadero");
            }else{
                System.out.println("falso");
            }
        }
    }
}
