/*Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre por pantalla
separados por espacios. El programa pedirá entonces por teclado dos valores y a continuación
cambiará todas las ocurrencias del primer valor por el segundo en la lista generada anteriormente*/

package Relacion7;
import java.util.*;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        int[] numeros=new int[100];

        System.err.println("Números generados del 0 al 20: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=(int)Math.round(Math.random()*20+0);
            System.err.print(numeros[i]+" ");
        }
        
        System.err.println();
        System.err.println("Añada dos números, el primero ha de ser mayor que el segundo");

        int num1=entrada.nextInt();
        int num2=entrada.nextInt();

        for (int i : numeros) {
            numeros[i]=(int)Math.round(Math.random()*num1+num2);
            System.err.print(numeros[i]+" ");
        }

        entrada.close();
    }
}
