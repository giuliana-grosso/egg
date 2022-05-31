/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;

import Entidades.Entidades;
import ServicioGeneral.ServicioGeneral;

/**
 *
 * @author famil
 */
public class Cuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  ServicioGeneral C2 = new ServicioGeneral();
    Entidades C1 = C2.Entrada();
        C2.ingresar(C1);
        C2.retirar(C1);
        C2.extraccionRapida(C1);
        C2.consultar(C1);
        C2.datos(C1);
       
    }
    
}
