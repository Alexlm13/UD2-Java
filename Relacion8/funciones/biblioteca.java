package funciones;
import java.util.*;
public class biblioteca {
    /*Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo
    y máximo) se indica como parámetro*/
    public static int[] generaArrayInt(int n, int max, int min){
        int[]numeros=new int[n];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=(int)(Math.random()*(max-min+1))+min;
        }
        
        return numeros;
    }

    /*Devuelve el minimo del array*/
    public static int minimoArrayInt(int[] minimo){
        int min= minimo[0];

        for (int i = 0; i < minimo.length; i++) {
            if (minimo[i]<i){
                min=minimo[i];
            }
        }
        return min;
    }

    /*Devuelve el maximo*/
    public static int maximoArrayInt(int[] maximo){
        int max= maximo[0];

        for (int i = 0; i < maximo.length; i++) {
            if (maximo[i]>i){
                max=maximo[i];
            }
        }
        return max;
    }

    /*Media del array */
    public static double mediaArrayInt (int[]media){
        int sumaTotal=0;
        for (int i = 0; i < media.length; i++) {
            sumaTotal=media[i];
        }

        System.out.println("La media de su array es: ");
        return (double) sumaTotal/media.length;
    }

    /*Comprobar si el número dado esta en el array */
    public static boolean estaEnArrayInt(int[]confirma, int num){
        for (int i = 0; i < confirma.length; i++) {
            if(confirma[i]==num){
                System.out.println("Tu número está en el array");
                return true;
            }
        }
        System.out.println("Tu número no está en el array");
        return false;
    }

    /*Buscar la posicion del número en un array */
    public static int posicionEnArray(int[]posicion, int num){
        for (int i = 0; i < posicion.length; i++) {
            if(posicion[i]==num){
                return i;
            }
        }
        return -1;
    }

    /*Darle la vuelta a un Array */
    public static int[] volteaArrayInt(int[] vuelta){
        int[] invertido=new int[vuelta.length];

        for (int i = 0; i < vuelta.length; i++) {
            invertido[i]=vuelta[vuelta.length-1-i];
        }
        return invertido;
    }

    /*Rota numero de posiciones a la derecha de un array */
    public static int [] rotaDerechaArrayInt(int[]PosDerecha, int numeros){
        int longitud = PosDerecha.length;
        int[] rotacion=new int[longitud];

        numeros=numeros%longitud;

        for (int i = 0; i < numeros; i++) {
            rotacion[i]=PosDerecha[longitud-numeros+i];
        }
        for (int i = numeros; i < longitud; i++) {
            rotacion[i]=PosDerecha[i-numeros];
        }
        return rotacion;
    }

    /*Rota numero de posiciones a la izquierda de un array */
    public static int[] rotaIzquierdaArrayInt(int[] PosIzquierda, int numeros) {
        int longitud = PosIzquierda.length;
        int[] rotacion = new int[longitud];
    
        numeros = numeros % longitud;
    
        for (int i = 0; i < longitud - numeros; i++) {
            rotacion[i] = PosIzquierda[i + numeros];
        }
        for (int i = longitud - numeros; i < longitud; i++) {
            rotacion[i] = PosIzquierda[i - (longitud - numeros)];
        }
    
        return rotacion;
    }
}
