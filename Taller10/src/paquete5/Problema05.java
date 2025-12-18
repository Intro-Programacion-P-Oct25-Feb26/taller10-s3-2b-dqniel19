/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author reroes
 */
public class Problema05 {

    public static void main(String[] args) {

        String[][] estudiantes
                = {{"Sarah Ward", "Philip Payne"},
                {"Carrie Burton", "Lauren Rice"},
                {"Emma Escobar", "Lori Flores"},
                {"Steven West", "Toni Martin"}
                };
        String[][] inicial = new String[4][2];

        String msj = "";

        for (int i = 0; i < estudiantes.length; i++) {
            for (int f = 0; f < estudiantes[f].length; f++) {
                inicial[i][f] = estudiantes[i][f].substring(0, 1);
            }
        }

        for (int s = 0; s < inicial.length; s++) {
            for (int c = 0; c < inicial[s].length; c++) {
                if (inicial[s][c].equals("S")) {
                    msj = String.format("%s-%s\n", msj, estudiantes[s][c]);
                } else if (inicial[s][c].equals("P")) {
                    msj = String.format("%s-%s\n", msj, estudiantes[s][c]);
                } else if (inicial[s][c].equals("T")) {
                    msj = String.format("%s-%s\n", msj, estudiantes[s][c]);
                }
            }
        }
        
        System.out.printf("Reporte de estudiantes con iniciales específicas"
                + "\n------------------\n%s", msj);
        
    }
}
