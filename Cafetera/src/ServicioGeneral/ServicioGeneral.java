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
        Entidades C1 = new Entidades();

        System.out.println("ingrese la cantidad actual");
        C1.setActual(leer.nextDouble());
        C1.setMaxima(C1.getActual());
        return C1;
    }

    public void servirTaza(Entidades C1) {
        System.out.println("tamaño de la taza");
        int tazav = leer.nextInt();
        if (tazav < C1.getActual()) {
            int tazaL = tazav;
            C1.setActual(C1.getActual() - tazav);
            System.out.println("se lleno la taza");
        } else if (tazav > C1.getActual()) {
            int tazaL = tazav;
            C1.setActual(C1.getActual());
            System.out.println("su taza no se lleno " + C1.getActual());
        }
    }

    public void vaciar(Entidades C1) {
        C1.setActual(0);
    }

    public void agregar(Entidades C1) {
        System.out.println("ingrese cantidad de cafe ");
        int cafe = leer.nextInt();
        if (cafe + C1.getActual() > C1.getMaxima()) {
            System.out.println("ha alcazado la cantidad maxima");
            C1.setActual(C1.getMaxima());
        }else if(cafe + C1.getActual() < C1.getMaxima()){
            C1.setActual(cafe+C1.getActual());
        }
    }
}
