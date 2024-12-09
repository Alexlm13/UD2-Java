/*Escribe un programa que rellene un array de 20 elementos con números enteros aleatorios
comprendidos entre 0 y 400 (ambos incluidos). A continuación el programa mostrará el array y
preguntará si el usuario quiere resaltar los múltiplos de 5 o los múltiplos de 7. Seguidamente se
volverá a mostrar el array escribiendo los números que se quieren resaltar entre corchetes*/

package Relacion7;
import java.util.*;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        int[] numeros=new int[20];
        
        System.out.println("Los 20 números aleatorios entre 0 y 400 son: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=(int)Math.round(Math.random()*400+0);
            System.out.print(numeros[i]+" ");
        }
        System.out.println();
        System.out.println("Indique qué números son los que quiere resaltar");
        System.out.println("1: Multiplos de 5");
        System.out.println("2: Multiplos de 7");
        int opcion=entrada.nextInt();

        for (int sucesion:numeros) {
            if ((opcion==1 && sucesion%5==0) || (opcion==2 && sucesion%7==0))  {
                System.out.print("["+sucesion+"] ");
            }else{
                System.out.print(sucesion+" ");
            }
        }
    entrada.close();
    }
}
