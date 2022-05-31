/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Libro2.Libro;
import java.util.Scanner;

/**
 *
 * @author famil
 */
public class ServicioGeneral {
    
    public Libro entrada() {
        //instannciar u objeto
        Libro l1 = new Libro();
        //llear los atributos
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su IsBN");
        l1.setISBN(leer.nextInt());
        System.out.println("Ingrese su Titulo");
        l1.setTitulo(leer.next());
        System.out.println("Ingrese su Autor");
        l1.setAutor(leer.next());
         System.out.println("Ingrese su numero de paginas");
        l1.setNumeroDePaginas(leer.nextInt());
        return l1;
        
    }
        
}
