//Crea un programa que reciba un Array de Strings y muestre el String más largo
package Relacion7;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        String palabras[]=new String[3];
        int mayor = 0;
        int longitud;
        int posMayor;

        palabras[0]="Hola";
        palabras[1]="Mundo";
        palabras[2]="Bienvenido";

        for (int i = 0; i < palabras.length; i++) {
            longitud=palabras[i].length();
            if (longitud>mayor) {
                mayor=palabras[i].length();
                posMayor=i;
            }
        }
        System.out.println("El string más largo es: "+mayor);
        entrada.close();
    }
}
