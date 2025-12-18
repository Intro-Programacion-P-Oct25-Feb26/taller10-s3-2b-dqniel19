/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean[][] asistencia = 
          { {true, true, true, true, true},
            {true, false, false, true, false},
            {true, true, true, true, true},
            {false, true, true, false, true}  };
        
        String[] estudiantes = {"Ana", "Luis", "Carlos", "María"};
        
        int[] diasAsistidos = new int[5];
        
        int suma;
        String msj = "";
        String asistCompleta = "";
        
        for (int i = 0; i < asistencia.length; i++) {
            suma = 0;
            for (int j = 0; j < asistencia[i].length; j++) {
                if (asistencia[i][j] == true) {
                    suma = suma + 1;
                }
            }
            diasAsistidos[i] = suma;
            msj = String.format("%sEstudiante: %s ha asistido %d días\n", 
                    msj, estudiantes[i], diasAsistidos[i]);
        }
        
        for (int g = 0; g < asistencia.length; g++) {
            if (diasAsistidos[g] >= 5) {
            asistCompleta = String.format("%s%s, ", 
                    asistCompleta, estudiantes[g]);
            }
        }
        msj = String.format("Reporte de Asistencia\n%s"
                + "--------------------\nAsistencias completas\n%s "
                + "ha(n) asistido a todas las clases\n", msj, asistCompleta);
        
        System.out.printf("%s", msj);
    }
    
}
