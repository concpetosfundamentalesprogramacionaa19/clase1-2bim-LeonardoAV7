/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo31 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Random aleatorios = new Random();
        int[] datos = new int[6];
        String[] rangos = {"0-8", "8.1-12", "12.1-16", "16.1-19", "19.1-20",
            "20.1-adelante"};
        // declaracion de variables
        boolean bandera = true;
        String condicion;
        double nota;
        // inicio del bucle de notas
        while (bandera){
            // solicitamos la nota
            System.out.println("Ingrese la nota: ");
            nota = entrada.nextDouble();
            // clasificamos cada nota en su intervalo correspodiente
            if(nota <=8){
            datos[0] = datos[0] + 1;
            }else{
                if(nota>=8.1 && nota <=12){
                 datos[1] = datos[1] + 1;
                }else{
                    if (nota >= 12.1 && nota <= 16){
                        datos[2] = datos[2] + 1;
                   }else{
                       if (nota >= 16.1 && nota <= 19){
                          datos[3] = datos[3] + 1;
                      }else{
                          if (nota >= 19.1 && nota <=20){
                             datos[4] = datos[4] + 1;
                            }else{
                                datos[5] = datos[5] + 1;
                            }
                        }
                    }
                }
            }
            // preguntamos si se desea seguir o no ingresando notas
            entrada.nextLine();
            System.out.println("Si desea salir ingrese 'n', para continuar "
                    + "ingrese cualquier otra letra");
            condicion = entrada.nextLine();
            // si no desea cambiamos la bandera para que salga del bucle
            if (condicion.equals("n")){
                bandera = false;
            }
        }
         
        
        
        System.out.println("Resultados");
        // visualizamos el menu de resultados
        for(int i = 0; i<datos.length; i++){
            System.out.printf("Ventas en %s - %d\n", rangos[i], datos[i]);
        }
        


    }
}
