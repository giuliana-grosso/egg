/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author famil
 */
public class eje2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner leer = new Scanner(System.in);
       
      int [][] matriz=new int [3][3];
      int [] filas=new int [3];
      int [] columnas=new int [3];
      int [] diagonal= new int [3];
      int [] tdiagonal= new int [3];
      int num,sum,sum2,sum3,sum4;
      String aux;
    sum=0;
    sum2=0;
    sum3=0;
    sum4=0;
    //hago la matriz
      System.out.println("ingrese los numeros de su matriz (3x3)");
       for (int fila=0; fila<3; fila++){
          for (int columna=0;columna<3;columna++)  {
            do  {
                 matriz [fila][columna]=leer.nextInt();
            }while(0>matriz [fila][columna] || 10<matriz [fila][columna]); 
          }
      }
       //la imprimo
     for (int[] fil: matriz) {
            aux="";
          for (int elemento: fil){
              aux+=" "+elemento;
          }
          System.out.println(aux);
      }
     //filas
        for (int fila=0; fila<3; fila++){
          for (int columna=0;columna<3;columna++) {
           sum=sum+matriz [fila][columna];
          }
          filas[fila]=sum;
          sum=0;
      }
   
         //columnnas
        for (int columna=0;columna<3;columna++){
          for (int fila=0; fila<3; fila++) {
           sum2=sum2+matriz [fila][columna];
          }
         columnas[columna]=sum2;
          sum2=0;
      }
  
        //diagonal
         for (int fila=0; fila<3; fila++){
          for (int columna=0;columna<3;columna++){
           if(fila==columna) {
            sum3=sum3+matriz [fila][columna];   
           }
          }
          diagonal[fila]=sum3;
      }
         int diago=diagonal[2];

         //transpuesta diagonal
         int columna=3-1;
         for (int fila=0; fila<3; fila++) {
            sum4=sum4+matriz [fila][columna];      
          tdiagonal[fila]=sum4;
          columna=columna-1;    
      }
         int tdiago=tdiagonal[2];
   
     
     //verdadero o falso
         boolean fov = false; 
         for (int fila=0;fila<3;fila++) {
             if (tdiago == diago && filas[fila] == columnas[fila] )
             { fov=true;
             }else
             { fov=false;
             }
         }
            if (fov == false) {
                System.out.println("no es magica");
            }else {
                System.out.println("es magica");
            }
    
      }
    }
      
    
    

