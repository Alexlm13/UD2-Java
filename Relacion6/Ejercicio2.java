
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        String cadena;
        String subcadena;
        boolean comprobar;
        System.out.println("Introduzca la cadena.");
        cadena= entrada.nextLine();
        System.out.println("Introduzca una subcadena");
        subcadena= entrada.nextLine();

        comprobar=cadena.startsWith(subcadena);
        if (comprobar==true) {

            System.out.println("La subcadena es correcta!");
        } else {
            System.out.println("La subcadena no pertenece a la cadena");
        }
        entrada.close();
    }
}
