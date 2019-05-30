/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

/**
 *
 * @author reroes
 */
public class ArregloUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] c = new int[5];
        
        c [3] = 20;
        c [1+1] = 5+6;
        c [4] = 10;
        //c [5] = 100;
        
        System.out.printf("%d + %d = %d\n", c[1], c[4], c[1] + c[4]);
        System.out.printf("El tamaño del arreglo es %d ", c.length);
    }
    
}












