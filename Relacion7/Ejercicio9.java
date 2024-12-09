/*Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los almacene en
un array. El programa debe ser capaz de pasar todos los números pares a las primeras posiciones del
array (del 0 en adelante) y todos los números impares a las celdas restantes. Utiliza arrays auxiliares si
es necesario*/

package Relacion7;

public class Ejercicio9 {
    public static void main(String[] args) {
        
        int[] numeros=new int[20];
        int[] pares=new int[20];
        int[] impares=new int[20];
        
        int ContPares=0;
        int ContImpares=0;

        System.out.println("Estos son tus números aleatorios del 0 al 100:");
        
        //genero los 20 números
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=(int)Math.round(Math.random()*100+0);
            System.out.print(numeros[i]+" ");
        }
        
        //separo pares de impares
        System.err.println();
        for (int numero:numeros) {
            if (numero%2==0) {
                pares[ContPares++]=numero;
            }
            else {impares[ContImpares++]=numero;
            }
        }
        
        //añadimos los pares y luego impares al array principal
        int cadenaOrg=0;
        System.out.println("Los números ordenados por pares y luego a impares son: ");
        for (int i = 0; i < ContPares; i++) {
            numeros[cadenaOrg++]=pares[i];
        }
        for (int i = 0; i < ContImpares; i++) {
            numeros[cadenaOrg++]=impares[i];
        }
        for (int numero:numeros) {
            System.out.print(numero+" ");
        }
    }
}
