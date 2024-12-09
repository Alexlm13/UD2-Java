//Crea un programa que dado un Array de enteros y un valor entero, muestre la cantidad de veces que
//aparece el entero en el Array.

package Relacion7;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        int numero;
        int lista[]=new int[5];
        int contador=0;

        lista[0]= 2;
        lista[1]= 2;
        lista[2]= 2;
        lista[3]= 6;
        lista[4]= 6;

        System.out.println("Dame un número");
        numero=entrada.nextInt();

        for (int i = 0; i < lista.length; i++) {
            if (lista[i]==numero){
                contador++;
            }
        }

        System.out.println("Su número se repite: "+contador+" veces");
        entrada.close();
    }
}
