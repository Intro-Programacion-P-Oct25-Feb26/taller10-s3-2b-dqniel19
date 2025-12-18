/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double numero; 
        double[][] matriz = new double[5][6];
        double[][] resultante = new double[5][6];

        
        System.out.print("Ingrese un número (entero o real): "); // Se ingresa el numero por 
        numero = entrada.nextDouble();                           // el que se multiplicará el resto de valores

        
        System.out.println("\nIngrese los valores de la matriz (5x6):");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = entrada.nextDouble();

                
                resultante[i][j] = matriz[i][j] * numero; // Se multiplica el valor ingresado en x posicion 
            }                                             // por el valor ingresado al principio
        }

        
        System.out.println("\nMatriz original:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }

        
        System.out.println("\nMatriz resultante (multiplicada por " + numero + "):");
        for (int i = 0; i < resultante.length; i++) {
            for (int j = 0; j < resultante[i].length; j++) {
                System.out.print(resultante[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
