/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] A = new int[3][2];
        int[][] B = new int[3][2];

        System.out.println("Ingrese los valores de la matriz A:"); // Leer matriz A
        for (int i = 0; i < A.length; i++) { // Filas
            for (int j = 0; j < A[i].length; j++) { // Columnas
                System.out.printf("A[%d][%d]: ", i, j);
                A[i][j] = entrada.nextInt();
            }
        }

        System.out.println("\nIngrese los valores de la matriz B:"); // Leer matriz B
        for (int i = 0; i < B.length; i++) { // Filas
            for (int j = 0; j < B[i].length; j++) { // Columnas
                System.out.printf("B[%d][%d]: ", i, j);
                B[i][j] = entrada.nextInt();
            }
        }

        // Mostrar matriz A
        System.out.println("\nMatriz A:");
        for (int i = 0; i < A.length; i++) { // Filas
            for (int j = 0; j < A[i].length; j++) { // Columnas
                System.out.print(A[i][j] + "\t");
            }
            System.out.println(""); // Se usa println para que las matrices se acoplen de manera correcta 
            // 0    0
            // 0    1...
        }

        // Mostrar matriz B
        System.out.println("\nMatriz B:"); // Filas
        for (int i = 0; i < B.length; i++) { // Columnas
            for (int j = 0; j < B[i].length; j++) {
                System.out.print(B[i][j] + "\t");
            }
            System.out.println("");
        }

        // Comparación
        boolean mayoroIgual = true;
        boolean hayMayor = false;

        for (int i = 0; i < A.length; i++) { // Se empieza a comparar valor por valor
            for (int j = 0; j < A[i].length; j++) {

                if (A[i][j] < B[i][j]) {
                    mayoroIgual = false;
                }

                if (A[i][j] > B[i][j]) {
                    hayMayor = true;
                }
            }
        }

        if (mayoroIgual && hayMayor) {
            System.out.println("\nLa matriz A es mayor que la matriz B");
        } else {
            System.out.println("\nLa matriz A no es mayor que la matriz B");
        }
    }
}
