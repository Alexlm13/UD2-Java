/*Define la función concatena con la siguiente cabecera:
public static int[] concatena(int[] a, int[] b)
Esta función toma dos arrays como parámetros y devuelve un array que es el resultado de concatenar
ambos. Por ej. si a = { 8, 9, 0 } y b = { 1, 2, 3 }, concatena(a, b) devuelve { 8, 9, 0, 1, 2, 3 }*/


public class Ejercicio5 {

    static int[] concatena(int[] a, int[] b){

        int[] numeros= new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            numeros[i]=a[i];
        }
        for (int i = 0; i < b.length; i++) {
            numeros[a.length+i]=b[i];
        }

        return numeros;
    }
    public static void main(String[] args) {

        int[]SerieNumero1= {8,9,0};
        int[]SerieNumero2= {1,2,3};

        int[] resultado= concatena(SerieNumero1, SerieNumero2);

        System.out.println("El array concatenado es: ");
        for (int i : resultado) {
            System.out.print(i+" ");
        }
    }

}
