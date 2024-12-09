/*Realiza un programa que calcule la estatura media, mínima y máxima en centímetros de personas de
diferentes países. El array que contiene los nombres de los países es el siguiente: país = {“España”,
“Rusia”, “Japón”, “Australia”}. Los datos sobre las estaturas se deben simular mediante un array de 4
filas por 10 columnas con números aleatorios generados al azar entre 140 y 210. Los decimales de la
media se pueden despreciar. Los nombres de los países se deben mostrar utilizando el array de países
(no se pueden escribir directamente).*/

package Relacion7;

public class Ejercicio13 {
    public static void main(String[] args) {
        
        String[] pais={"España", "Rusia", "Japón", "Australia"};
        int[][] estatura=new int[4][10];

        for (int i = 0; i < estatura.length; i++) {
            for (int j = 0; j < estatura[i].length; j++) {
                estatura[i][j]=(int)(Math.random()*70+140);

            }
        }
    
        for (int i = 0;i<estatura.length;i++) {
            int suma = 0;
            int max = 0;
            int min = 300;
            System.out.print(pais[i]+ ": ");
            for (int j = 0;j<estatura[i].length;j++) {
                System.out.print(estatura[i][j] + "|\t");
                suma += estatura[i][j];
                if (max < estatura [i][j]) {
                    max = estatura[i][j];
                }
                if (min > estatura[i][j]) {
                    min = estatura[i][j];
                }
            }
            System.out.print(" Media: " + suma/10 + " Max: " + max + " Min: " + min);
            System.out.println();
       }
    }
}
