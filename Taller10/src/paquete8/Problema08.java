/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete8;

/**
 *
 * @author AsusRog
 */
public class Problema08 {

    public static void main(String[] args) {
        // Creación de arreglo bidimensionales

        double[][] dato1 = {{1, 2, 3}, {6, 8, 9}};
        double[][] dato2 = {{10, 1, 2}, {10, 9, 1}};
        // En función de los arreglos dados, genere
        // un arreglo que tenga los siguientes valores
        /*
            1   1   2
            6   8   1
         */
        double[][] menor = new double[2][3];

        // Comparación de valores
        for (int i = 0; i < dato1.length; i++) {
            for (int j = 0; j < dato1[i].length; j++) {

                if (dato1[i][j] < dato2[i][j]) { // Si el valor de la matriz 1 es menor al de la matriz 2
                    menor[i][j] = dato1[i][j];   // la matriz menor adquirirá dicho valor
                } else {                         // Si no lo es, automaticamente tomará el valor de 
                    menor[i][j] = dato2[i][j];   // la matriz 2
                }
            }
        }

        for (int f = 0; f < menor.length; f++) {
            for (int g = 0; g < menor[f].length; g++) {
            System.out.print(menor[f][g] + "\t");
            }
            System.out.println("");
        }
        
    }
}
