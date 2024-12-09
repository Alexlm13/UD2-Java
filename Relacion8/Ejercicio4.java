/*Define la función convierteArrayEnString con la siguiente cabecera:
public static String convierteArrayEnString(int[] a)
Esta función toma como parámetro un array que contiene números y devuelve una cadena de
caracteres con esos números. Por ejemplo, si a = { }, convierteArrayEnString(a) devuelve “”; si a = { 8 },
convierteArrayEnString(a) devuelve “8”; si a = { 6, 2, 5, 0, 1 }, convierteArrayEnString(a) devuelve
“62501” */

import java.util.*;

public class Ejercicio4 {
    
    public static String convierteArrayEnString(int[] a) {
        StringBuilder conversion = new StringBuilder();

        for (int num : a) {
            conversion.append(num);  // Agrega cada número al StringBuilder
        }

        return conversion.toString(); // Devuelve la cadena resultante
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dime de cuánto quieres que sea el array.");
        int numero = entrada.nextInt();

        int[] array = new int[numero];

        System.out.println("Dame tantos números como el tamaño del array");
        for (int i = 0; i < array.length; i++) {
            array[i] = entrada.nextInt();
        }

        // Llamada a la función y muestra del resultado
        String resultado = convierteArrayEnString(array);
        System.out.println("El array convertido en cadena es: " + resultado);

        entrada.close();
    }
}
