/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioGeneral;

import Entidades.Entidades;

/**
 *
 * @author famil
 */
public class ServicioGeneral {

    public Entidades Entrada() {
        Entidades C1 = new Entidades();
        //atributos
        C1.setNum1(Math.random());
        C1.setNum2(Math.random());
        return C1;
    }

    public void Mayor(Entidades C1) {
        System.out.println(Math.max(C1.getNum1(), C1.getNum2()));
    }

    public void Potencia(Entidades C1) {

        double mas = (Math.max(Math.round(C1.getNum1()), (Math.round(C1.getNum2()))));
        double min = (Math.min(Math.round(C1.getNum1()), (Math.round(C1.getNum2()))));
        double poten = Math.pow(mas, min);
        System.out.println(poten);
    }

    public void raiz(Entidades C1) {
 double min = (Math.min(Math.abs(C1.getNum1()), (Math.abs(C1.getNum2()))));
    double raiz = Math.sqrt(min);
            System.out.println(raiz);
    }
    
}
