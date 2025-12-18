/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete7;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Problema07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    
        double[][] matriz = new double[3][3];
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        
        System.out.println("\nIngrese los valores de la matriz (3x3):");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = entrada.nextDouble();    
            }   
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
               /* int x = matriz[i][j];
                A[i][j] = (x + 1) * (x + 1);
                B[i][j] = x * x + 2 * x + 1; */
            }
        }
        // s 
}
}
