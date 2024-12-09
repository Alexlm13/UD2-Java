//Crea un programa que reciba dos Arrays, y devuelva un Array con los valores máximos en cada una de
//las posiciones. Se debe tener en cuenta que los Arrays podrán ser de tamaños distintos
package Relacion7;
import java.util.*;
public class Ejercicio4 {
    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);

        int [] array1={4, 8, 15, 1};
        int [] array2={7, 2, 11, 18};
        int [] arrayFin= new int [4];

        for (int i = 0; i < array2.length; i++) {
            if (array2[i] < array1[i]) {
                arrayFin[i]=array1[i];
            }else{ arrayFin[i]=array2[i]; }
        }

        for (int i = 0; i < arrayFin.length; i++) {
            System.out.println("El array final es: "+arrayFin[i]);
        }
        
        entrada.close();
    }
}
