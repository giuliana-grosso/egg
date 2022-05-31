/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Entidades;
import java.util.Scanner;

/**
 *
 * @author famil
 */
public class general {

    public Entidades Entrada()  {
        //instanciacio del objeto
        Entidades N1 = new Entidades();
        //relleo los atributos 
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese sus dos numeros ");
        N1.setNumero1(leer.nextDouble());
        N1.setNumero2(leer.nextDouble());
        return N1;
    }


public double sumar(double numero1,double numero2){
return numero1+numero2;
}

public double resta (double numero1,double numero2){
return numero1-numero2;
}

public double multiplicar (double numero1,double numero2){
if (numero1==0 || numero2==0){
    return 0;         
}else
    return numero1*numero2;
}

public double dividir (double numero1,double numero2){
if (numero1==0 || numero2==0){
    return 0;         
}else
    return numero1/numero2;
}

}
