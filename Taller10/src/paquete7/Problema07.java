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

        double[][] X = new double[3][3];
        double[][] A = new double[3][3];
        double[][] B = new double[3][3];

        System.out.println("\nIngrese los valores de la matriz (3x3):");
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                X[i][j] = entrada.nextDouble();
            }
        }

        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                double x = X[i][j];
                A[i][j] = (x + 1) * (x + 1); // 1ra funcion para matriz A
                B[i][j] = x * x + 2 * x + 1; // 2da funcion para matriz B
            }
        }

        boolean cumple = true;

        // Comparacion entre A y B
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (A[i][j] != B[i][j]) {
                    cumple = false;
                } // Si los valores en las posiciones correspondientes coincides
            }     // cumple se mantendrá true y se entrará de nuevo al condicional
        }         // de lo contrario, cumple se volverá false y saldrá del condicional

        if (cumple) {
            System.out.println("La identidad algebraica SE CUMPLE");
        } else {
            System.out.println("La identidad algebraica NO SE CUMPLE");
        }
        
        entrada.nextLine();
        
        String rta; // Se pregunta al usuario si desea visualizar las matrices calculadas
        System.out.println("Desea ver las matrices A y B? (S/N)");
        rta = entrada.nextLine();
        rta = rta.toLowerCase();
        if (rta.equals("s")) {
            System.out.println("\nMatriz A:"); // Se imprime A
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[i].length; j++) {
                    System.out.print(A[i][j] + "\t");
                }
                System.out.println("");
            }
            System.out.println("\nMatriz B:"); // Se imprime B
            for (int i = 0; i < B.length; i++) {
                for (int j = 0; j < B[i].length; j++) {
                    System.out.print(B[i][j] + "\t");
                }
                System.out.println("");
            }
        } 
    }
}
