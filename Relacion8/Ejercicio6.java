import funciones.biblioteca;
import java.util.*;

public class Ejercicio6 {
    public static void imprimirArray(int[]array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void imprimirArray(double[]array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
    // Crear un array de tamaño 10 con números aleatorios entre 1 y 100
    int[] array = funciones.biblioteca.generaArrayInt(10, 100, 1);
        
    // Mostrar el array original
    System.out.print("Array original: ");
    imprimirArray(array);
    
    // Llamar a la función minimoArrayInt
    int minimo = funciones.biblioteca.minimoArrayInt(array);
    System.out.println("Mínimo del array: " + minimo);
    
    // Llamar a la función mediaArrayInt
    double media = funciones.biblioteca.mediaArrayInt(array);
    System.out.println("Media del array: " + media);
    
    // Llamar a la función estaEnArrayInt
    int numeroBuscar = 50;
    boolean esta = funciones.biblioteca.estaEnArrayInt(array, numeroBuscar);
    System.out.println("¿Está el número " + numeroBuscar + " en el array? " + esta);
    
    // Llamar a la función posicionEnArray
    int posicion = funciones.biblioteca.posicionEnArray(array, numeroBuscar);
    System.out.println("Posición del número " + numeroBuscar + " en el array: " + (posicion != -1 ? posicion : "No encontrado"));
    
    // Llamar a la función volteaArrayInt
    int[] arrayInvertido = funciones.biblioteca.volteaArrayInt(array);
    System.out.print("Array invertido: ");
    imprimirArray(arrayInvertido);
    
    // Llamar a la función rotaDerechaArrayInt
    int nDerecha = 3;
    int[] arrayRotadoDerecha = funciones.biblioteca.rotaDerechaArrayInt(array, nDerecha);
    System.out.print("Array rotado a la derecha " + nDerecha + " posiciones: ");
    imprimirArray(arrayRotadoDerecha);
    
    // Llamar a la función rotaIzquierdaArrayInt
    int nIzquierda = 3;
    int[] arrayRotadoIzquierda = funciones.biblioteca.rotaIzquierdaArrayInt(array, nIzquierda);
    System.out.print("Array rotado a la izquierda " + nIzquierda + " posiciones: ");
    imprimirArray(arrayRotadoIzquierda);
    }       
}
