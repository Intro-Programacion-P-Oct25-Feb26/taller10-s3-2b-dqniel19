/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {
        int[][] edades = {
            {5, 12, 35, 40},
            {8, 15, 33, 38},
            {6, 10, 30, 36}
        };

        int mayores[] = new int[3];
        int menores = 0;
        String msj = "";

        for (int i = 0; i < edades.length; i++) {
            for (int g = 0; g < edades[i].length; g++) {
                if (edades[i][g] < 18) {
                menores = menores + 1;
                } else {
                    mayores[i]++;
                }
            }  
        }
        
        for (int n = 0; n < 3; n++) { // no se usó .length debido a que se debia imprimir "familia 1"
            msj = String.format("%sMayores de edad en la familia %d: %d\n", 
                    msj, n + 1, mayores[n]);
        }
        System.out.printf("Reporte de edades\n---------------------------\n"
                + "Total de menores de edad en todas las familias: %d\n"
                + "%s",
                menores, msj);
    }
}
