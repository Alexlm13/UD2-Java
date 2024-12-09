/*Programa que lee por teclado la nota de los alumnos de una clase y calcula la nota media del grupo.
También muestra los alumnos con notas superiores a la media. El número de alumnos se lee por
teclado*/


package Relacion7;
import java.util.*;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        System.out.println("¿Cuántos alumnos hay en clase?");
        int tamaño=entrada.nextInt();
        int[] Notasclase=new int[tamaño];
        int notaMedia=0;

        System.out.println("Por favor, indique las notas de los alumnos");

            for (int i = 0; i < Notasclase.length; i++) {
                
                Notasclase[i]=entrada.nextInt();
                notaMedia+=Notasclase[i];

                
            }
            System.out.println("La media de las notas de los alumnos es: "+(notaMedia)/tamaño);
            entrada.close();
    }
}
