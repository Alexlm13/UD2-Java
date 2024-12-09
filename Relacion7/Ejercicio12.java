/*Escribe un programa que pida 20 números enteros (o que los genere de forma aleatoria). Estos
números se deben introducir en un array bidimensional de 4 filas por 5 columnas. El programa
mostrará las sumas parciales de filas y columnas igual que si de una hoja de cálculo se tratara. La suma
total debe aparecer en la esquina inferior derecha. */

package Relacion7;

public class Ejercicio12 {
    public static void main(String[] args) {
        int[][] numeros=new int[4][5];
        int[] sumaFilas=new int[4];
        int[] sumaColmn=new int[5];
        int sumaTotal=0;

        for (int i = 0; i < numeros.length; i++) {
            for(int j=0; j < numeros[i].length; j++){
            numeros[i][j]=(int)(Math.random()*100);
                
                sumaFilas[i]+=numeros[i][j];
                sumaColmn[j]+=numeros[i][j];
                sumaTotal+=numeros[i][j];
            }
        }

        System.out.println("La tabla es:");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j]+" ");
            }
            System.out.println("|"+sumaFilas[i]+"|"+" Suma fila");
        }

       System.err.println("---------------------------------");
        for (int j = 0; j < sumaColmn.length; j++) {
            
            System.out.print(sumaColmn[j]+" ");
        }
        System.err.print("|"+sumaTotal+"| Suma total");
    }
}
