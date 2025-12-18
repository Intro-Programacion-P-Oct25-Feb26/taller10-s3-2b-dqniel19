/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {
        boolean[][] sensores = {
            {true, true, true, true, true, true},
            {true, false, true, false, true, false},
            {false, false, false, false, false, false},
            {true, true, false, true, true, false}
        };
        
        int[] funciones = new int[4];
        
        int suma;
        String sensoresFallando = "";
        String sensoresFuncionales = "";
        
        for (int j = 0; j < sensores.length; j++) {
            suma = 0;
            for (int k = 0; k < sensores[j].length; k++) {
                if (sensores[j][k]== false) {
                    suma = suma + 1;
                }
            }
            funciones[j] = suma;
        }
        for (int d = 0; d < funciones.length; d++) {
            if (funciones[d] > 0) {
                sensoresFallando = String.format("%sEl sensor %d ha tenido %d "
                        + "falla(s)\n", sensoresFallando, d + 1, funciones[d]);
            } else {
                sensoresFuncionales = String.format("%s%s, ", 
                        sensoresFuncionales, d + 1);
            }
        }
        
        System.out.printf("Reporte de sensores\n-------------------------\n"
                + "%s-----------------\nEl sensor %s no ha(n) fallado "
                + "ninguna vez\n", sensoresFallando, sensoresFuncionales);
        
        }
    }

