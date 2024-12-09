/*Crea una función con la siguiente cabecera:
public static String convierteEnPalotes(int n)
Esta función convierte el número n al sistema de palotes y lo devuelve en una cadena de caracteres.
Por ejemplo, el 470213 en decimal convertido al sistema palotes es:
| | | | - | | | | | | | - - | | - | - | | |
Utiliza esta función en un programa para comprobar que funciona correctamente. Desde la función no
se debe mostrar nada por pantalla, solo se debe usar print desde el programa principal */
import java.util.*;
public class Ejercicio1 {
    static String convierteEnPalotes(int n){
        
        String conversion=String.valueOf(n);
        String frase="";

        for (int i = 0; i < conversion.length(); i++) {
            int num=conversion.charAt(i)-48;

            for (int j = 0; j < num; j++) {
                frase+="|";
            }
            if (i<conversion.length()-1) {
                frase+="-";
            }
        }



        return frase;
    }
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        System.out.println("Introduce un número");
        int numero=entrada.nextInt();

        System.out.println("El número convertido en palotes: ");
        System.out.println(convierteEnPalotes(numero));
            
        entrada.close();
    }
}