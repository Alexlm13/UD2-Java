/*Crea una función con la siguiente cabecera:
public String convierteEnPalabras(int n)
Esta función convierte los dígitos del número n en las correspondientes palabras y lo devuelve todo en
una cadena de caracteres. Por ejemplo, el 470213 convertido a palabras sería:
cuatro, siete, cero, dos, uno, tres
Utiliza esta función en un programa para comprobar que funciona bien. Desde la función no se debe
mostrar nada por pantalla, solo se debe usar print desde el programa principal. Fíjate que hay una
coma detrás de cada palabra salvo al final */
import java.util.*;

public class Ejercicio2 {

    //FUNCION
    static String convierteEnPalabra(int n){

        char cifra;
        String palabras="";
        String[] num={"cero","uno","dos","tres","cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        String convertir=String.valueOf(n);

        for (int i = 0; i < convertir.length(); i++) {
            cifra= convertir.charAt(i);
            //palabras=palabras.concat(num[(int)cifra-48]);

            if(i==convertir.length()-1){
                palabras=palabras+num[(int)cifra-48]+".";
            }else palabras=palabras+num[(int)cifra-48]+", ";
                
            }
        

        return palabras;
    }

    //MAIN
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        int num;

        System.out.println("Escriba su número para convertirlo a palabras.");
        num=entrada.nextInt();

        System.out.println("Su número es: "+convierteEnPalabra(num));

        entrada.close();
    }
}
