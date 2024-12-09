/*Calcular la media de una serie de números que se leen por teclado. Leer por teclado 10 números
enteros y guardarlos en un array. A continuación calcula y muestra por separado la media de los
valores positivos y la de los valores negativos*/

package Relacion7;
import java.util.*;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        int[]serie=new int[10];
        double positivos=0;
        double negativos=0;
        int Contnegativos=0;
        int Contpositivos=0;

        System.out.println("Introduce números, por favor, pueden ser tanto negativos como positivos.");
        for (int i = 0; i < serie.length; i++) {
            serie[i]=entrada.nextInt();
        
            if (serie[i]<0) {
                Contnegativos++;
                negativos=serie[i]+negativos;
                
            }else   {Contpositivos++;
                    positivos=serie[i]+positivos;
                }

            
        }   System.out.println("La media de la suma de sus números negativos es: "+(negativos/Contnegativos));
            System.out.println("La media de la suma de sus números positivos es: "+(positivos/Contpositivos));
            
        entrada.close();
    }
}